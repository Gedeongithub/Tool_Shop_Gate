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
## Question 4:
```bash
Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (dev)
$ git switch -c test
Switched to a new branch 'test'

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (test)
$ git commit -m"Adding question 4"
[test 44ce301] Adding question 4
 1 file changed, 49 insertions(+)

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (test)
$  git push --set-upstream origin test
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 4 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 1.21 KiB | 1.21 MiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
remote: 
remote: Create a pull request for 'test' on GitHub by visiting:
remote:      https://github.com/Gedeongithub/Tool_Shop/pull/new/test
remote: 
To https://github.com/Gedeongithub/Tool_Shop.git
 * [new branch]      test -> test
branch 'test' set up to track 'origin/test'.

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (test)
$ 
```
### Merging Test to dev branch to get latest change to dev
```bash
Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (test)
$ git switch dev
Switched to branch 'dev'
Your branch is up to date with 'origin/dev'.

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (dev)
$ git merge test
Updating 96d3f0e..4ad1a01
Fast-forward
 README.md | 75 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 1 file changed, 75 insertions(+)

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (dev)
$ git status
On branch dev
Your branch is ahead of 'origin/dev' by 2 commits.
  (use "git push" to publish your local commits)

nothing to commit, working tree clean

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (dev)
$ 
```

## Question 5
```bash
Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (dev)
$ git branch -d test
warning: not deleting branch 'test' that is not yet merged to
         'refs/remotes/origin/test', even though it is merged to HEAD
error: the branch 'test' is not fully merged
hint: If you are sure you want to delete it, run 'git branch -D test'
hint: Disable this message with "git config set advice.forceDeleteBranch false"

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (dev)
$ git branch --merged
* dev
  main
  test

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (dev)
$ git branch
* dev
  main
  test

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (dev)
$ git branch -D test
Deleted branch test (was 4ad1a01).

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (dev)
$ git push origin dev
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 4 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 620 bytes | 620.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/Gedeongithub/Tool_Shop.git
   96d3f0e..4ad1a01  dev -> dev

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (dev)
$ git push origin --delete test
To https://github.com/Gedeongithub/Tool_Shop.git
 - [deleted]         test

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (dev)
$ git branch
* dev
  main

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (dev)
$ 
```
## Question 5 [ft/setup] creation
```bash
Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (dev)
$ git switch -c ft/setup
Switched to a new branch 'ft/setup'
Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (ft/setup)

```

## Question 6:
```bash
Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (ft/setup)
$ touch Test.java

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (ft/setup)
$ git add .

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (ft/setup)
$ git status
On branch ft/setup
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   .gitignore
        new file:   .idea/encodings.xml
        modified:   .idea/misc.xml
        deleted:    .idea/modules.xml
        modified:   README.md
        new file:   pom.xml
        new file:   src/main/java/org/example/Main.java
        new file:   src/test/java/Test.java

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (ft/setup)
$ git commit -m"feat: add basic Test class with simple name validation logic"
[ft/setup a867027] feat: add basic Test class with simple name validation logic
 8 files changed, 86 insertions(+), 8 deletions(-)
 create mode 100644 .gitignore
 create mode 100644 .idea/encodings.xml
 delete mode 100644 .idea/modules.xml
 create mode 100644 pom.xml
 create mode 100644 src/main/java/org/example/Main.java
 create mode 100644 src/test/java/Test.java

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (ft/setup)
```
## Question 7:
```bash
Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (ft/setup)
$ git status
On branch ft/setup
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   src/test/java/Test.java

no changes added to commit (use "git add" and/or "git commit -a")

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (ft/setup)
$ git stash
Saved working directory and index state WIP on ft/setup: d01ecb1 Add the command history of question 5

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (ft/setup)
$ 
```

## Question 8:

```bash
Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (ft/setup)
$ git stash list
stash@{0}: WIP on ft/setup: d01ecb1 Add the command history of question 5

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (ft/setup)
$ git stash apply stash{0}
error: stash{0} is not a valid reference

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (ft/setup)
$ git stash apply stash@{0}
On branch ft/setup
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   README.md
        modified:   src/test/java/Test.java

no changes added to commit (use "git add" and/or "git commit -a")

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (ft/setup)
$ 
```
## Question 9:

```bash
Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (ft/setup)
$ git status
On branch ft/setup
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   README.md
        modified:   src/test/java/Test.java

no changes added to commit (use "git add" and/or "git commit -a")

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (ft/setup)
$ git add .

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (ft/setup)
$ git commit -m"feat:add else logic to Test class"
[ft/setup 769c85d] feat:add else logic to Test class
 2 files changed, 50 insertions(+)

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (ft/setup)
$ git push
fatal: The current branch ft/setup has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin ft/setup

To have this happen automatically for branches without a tracking
upstream, see 'push.autoSetupRemote' in 'git help config'.


Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (ft/setup)
$ git push --set-upstream origin ft/setup
Enumerating objects: 31, done.
Counting objects: 100% (31/31), done.
Delta compression using up to 4 threads
Compressing objects: 100% (18/18), done.
Writing objects: 100% (27/27), 3.48 KiB | 508.00 KiB/s, done.
Total 27 (delta 6), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (6/6), completed with 1 local object.
remote: 
remote: Create a pull request for 'ft/setup' on GitHub by visiting:
remote:      https://github.com/Gedeongithub/Tool_Shop/pull/new/ft/setup
remote: 
To https://github.com/Gedeongithub/Tool_Shop.git
 * [new branch]      ft/setup -> ft/setup
branch 'ft/setup' set up to track 'origin/ft/setup'.

Gedeon@DESKTOP-V5U1KDO MINGW64 ~/Desktop/Tool_Shop (ft/setup)
$ 
```
