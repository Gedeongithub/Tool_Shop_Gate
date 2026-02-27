package sorting_functionality;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.LoadState;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class SortProductsTest {

    static Playwright playwright;
    static Browser browser;
    BrowserContext browserContext;
    Page page;
    static final String Url = "https://practicesoftwaretesting.com/";

    @BeforeAll
    static void browserLauncher(){
        playwright = Playwright.create();
        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions()
                        .setHeadless(true)
                        .setArgs(Arrays.asList(
                                "--no-sandbox",
                                "--disable-setuid-sandbox",
                                "--disable-dev-shm-usage",
                                "--disable-gpu"
                        ))
        );
    }

    @BeforeEach
    void createContext(){
        browserContext = browser.newContext(
                new Browser.NewContextOptions()
                        .setUserAgent(
                                "Mozilla/5.0 (Windows NT 10.0; Win64; x64) " +
                                        "AppleWebKit/537.36 (KHTML, like Gecko) " +
                                        "Chrome/120.0.0.0 Safari/537.36"
                        )
        );
        page = browserContext.newPage();
        page.setDefaultTimeout(60000);
    }

    @AfterEach
    void closeContext() {
        browserContext.close();
    }

    @AfterAll
    static void closeBrowser() {
        browser.close();
        playwright.close();
    }
    @Test
    void verifySorting() {
        List<String> expectedProducts = List.of(
                "Wood Saw",
                "Wood Carving Chisels",
                "Washers",
                "Tool Cabinet",
                "Thor Hammer",
                "Tape Measure 7.5m",
                "Tape Measure 5m",
                "Swiss Woodcarving Chisels",
                "Super-thin Protection Gloves"
        );


            page.navigate(Url);

            page.waitForSelector("[data-test='product-name']");

            page.locator("[data-test='sort']").selectOption("name,desc");

            page.waitForTimeout(20000);

//            //Attention
            page.locator("(//h5[normalize-space()='Tool Cabinet'])[1]").textContent();
            // Get all product names
            List<String> actualProducts = page.locator("[data-test='product-name']")
                    .allTextContents()
                    .stream()
                    .map(String::trim)
                    .toList();

            // now let's print to verify
            actualProducts.forEach(System.out::println);

            // now let's Compare lists (exact order)
            assertThat(actualProducts).isEqualTo(expectedProducts);

//            page.waitForTimeout(5000);

    }
}