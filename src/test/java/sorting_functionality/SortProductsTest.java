package sorting_functionality;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class SortProductsTest {

    @Test
    void verifySorting() {
        List<String> expectedProducts = List.of(
                " Wood Saw ",
                " Wood Carving Chisels ",
                " Washers ",
                " Tool Cabinet ",
                " Thor Hammer ",
                " Tape Measure 7.5m ",
                " Tape Measure 5m ",
                " Swiss Woodcarving Chisels ",
                " Super-thin Protection Gloves "
        );

        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions().setHeadless(false)
            );

            BrowserContext context = browser.newContext();
            Page page = context.newPage();

            page.navigate("https://practicesoftwaretesting.com/");

            // Choose Z-A
            page.locator("[data-test='sort']").selectOption("name,desc");
            //Attention
            page.locator("(//h5[normalize-space()='Tool Cabinet'])[1]").textContent();
            // Get all product names
            List<String> actualProducts = page.locator("[data-test='product-name']")
                    .allTextContents();

            // now let's print to verify
            actualProducts.forEach(System.out::println);

            // now let's Compare lists (exact order)
            assertThat(actualProducts).isEqualTo(expectedProducts);

            page.waitForTimeout(5000);
        }
    }
}