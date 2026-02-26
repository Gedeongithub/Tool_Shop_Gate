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


```
## Question 2:
```bash
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

## Question 3:
```bash
## Question 3:
```bash
Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (main)
$ git checkout -b dev
Switched to a new branch 'dev'
Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (dev)
$ git commit -m"created dev branch"
On branch dev
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   README.md

no changes added to commit (use "git add" and/or "git commit -a")

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (dev)
$ git add .

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (dev)
$ git commit -m"created dev branch"
[dev 96d3f0e] created dev branch
 1 file changed, 15 insertions(+)

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (dev)
$ git push
fatal: The current branch dev has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin dev

To have this happen automatically for branches without a tracking
upstream, see 'push.autoSetupRemote' in 'git help config'.


Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (dev)
$ git push --set-upstream origin dev
Enumerating objects: 14, done.
Counting objects: 100% (14/14), done.
Delta compression using up to 4 threads
Compressing objects: 100% (11/11), done.
Writing objects: 100% (12/12), 1.90 KiB | 647.00 KiB/s, done.
Total 12 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), done.
remote: 
remote: Create a pull request for 'dev' on GitHub by visiting:
remote:      https://github.com/Gedeongithub/Tool_Shop/pull/new/dev
remote: 
To https://github.com/Gedeongithub/Tool_Shop.git
 * [new branch]      dev -> dev
branch 'dev' set up to track 'origin/dev'.

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (dev)
$ 
```
