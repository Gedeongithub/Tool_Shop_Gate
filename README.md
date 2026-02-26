# Git answers of each Question
## Question 1:
```bash
Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (main)
$ git init
Reinitialized existing Git repository in C:/Users/Gedeon/Desktop/Tool_Shop/.git/
[main (root-commit) 7da2fe9] first commit
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 README.md
 Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop_Gate (master)
$ touch README.md

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop_Gate (master)
$ git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Gedeongithub/Tool_Shop_Gate.git
[master (root-commit) 9d58802] first commit
 6 files changed, 79 insertions(+)
 create mode 100644 .gitignore
 create mode 100644 .idea/.gitignore
 create mode 100644 .idea/misc.xml
 create mode 100644 .idea/vcs.xml
 create mode 100644 README.md
 create mode 100644 pom.xml

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop_Gate (main)
$ git push -u origin main
Enumerating objects: 9, done.
Counting objects: 100% (9/9), done.
Delta compression using up to 4 threads
Compressing objects: 100% (7/7), done.
Writing objects: 100% (9/9), 1.50 KiB | 385.00 KiB/s, done.
Total 9 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/Gedeongithub/Tool_Shop_Gate.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop_Gate (main)
$ 
```