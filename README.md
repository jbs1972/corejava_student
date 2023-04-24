# corejava_student
jayantabsen@OFFICE MINGW64 ~/eclipse_core_proj/dynamic_method_dispatch
$ echo "# corejava_student" >> README.md

jayantabsen@OFFICE MINGW64 ~/eclipse_core_proj/dynamic_method_dispatch
$ git init
Initialized empty Git repository in C:/Users/jayantabsen/eclipse_core_proj/dynamic_method_dispatch/.git/

jayantabsen@OFFICE MINGW64 ~/eclipse_core_proj/dynamic_method_dispatch (master)
$ git add README.md
warning: in the working copy of 'README.md', LF will be replaced by CRLF the next time Git touches it

jayantabsen@OFFICE MINGW64 ~/eclipse_core_proj/dynamic_method_dispatch (master)
$ git commit -m "first commit"
Author identity unknown

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: unable to auto-detect email address (got 'jayantabsen@OFFICE.(none)')

jayantabsen@OFFICE MINGW64 ~/eclipse_core_proj/dynamic_method_dispatch (master)
$ git config --global user.email "<your.user@email.id>"

jayantabsen@OFFICE MINGW64 ~/eclipse_core_proj/dynamic_method_dispatch (master)
$ git config --global user.name "<your_gitHub_user_name"

jayantabsen@OFFICE MINGW64 ~/eclipse_core_proj/dynamic_method_dispatch (master)
$ git commit -m "first commit"
[master (root-commit) fc7ccb8] first commit
 1 file changed, 1 insertion(+)
 create mode 100644 README.md

jayantabsen@OFFICE MINGW64 ~/eclipse_core_proj/dynamic_method_dispatch (master)
$ git branch
* master

jayantabsen@OFFICE MINGW64 ~/eclipse_core_proj/dynamic_method_dispatch (master)
$ git remote add origin <your cloning https url>

jayantabsen@OFFICE MINGW64 ~/eclipse_core_proj/dynamic_method_dispatch (master)
$ git push -u origin master
Enumerating objects: 3, done.
Counting objects: 100% (3/3), done.
Writing objects: 100% (3/3), 228 bytes | 228.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
To https://github.com/jbs1972/corejava_student.git
 * [new branch]      master -> master
branch 'master' set up to track 'origin/master'.

jayantabsen@OFFICE MINGW64 ~/eclipse_core_proj/dynamic_method_dispatch (master)
$ git status
On branch master
Your branch is up to date with 'origin/master'.

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        .classpath
        .project
        .settings/
        bin/
        src/

nothing added to commit but untracked files present (use "git add" to track)

jayantabsen@OFFICE MINGW64 ~/eclipse_core_proj/dynamic_method_dispatch (master)
$ git add -A

jayantabsen@OFFICE MINGW64 ~/eclipse_core_proj/dynamic_method_dispatch (master)
$ git commit -m "second commit"
[master afabde2] second commit
 13 files changed, 229 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 .settings/org.eclipse.jdt.core.prefs
 create mode 100644 bin/model/Clerk.class
 create mode 100644 bin/model/Employee.class
 create mode 100644 bin/model/Manager.class
 create mode 100644 bin/model/Salesman.class
 create mode 100644 bin/model_test/EmployeeTest.class
 create mode 100644 src/model/Clerk.java
 create mode 100644 src/model/Employee.java
 create mode 100644 src/model/Manager.java
 create mode 100644 src/model/Salesman.java
 create mode 100644 src/model_test/EmployeeTest.java

jayantabsen@OFFICE MINGW64 ~/eclipse_core_proj/dynamic_method_dispatch (master)
$ git push -u origin master
Enumerating objects: 23, done.
Counting objects: 100% (23/23), done.
Delta compression using up to 4 threads
Compressing objects: 100% (20/20), done.
Writing objects: 100% (22/22), 6.49 KiB | 1.08 MiB/s, done.
Total 22 (delta 3), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (3/3), done.
To https://github.com/jbs1972/corejava_student.git
   fc7ccb8..afabde2  master -> master
branch 'master' set up to track 'origin/master'.