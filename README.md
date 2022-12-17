
1. Download GIT for Window (https://git-scm.com/)
	https://github.com/git-for-windows/git/releases/download/v2.39.0.windows.1/Git-2.39.0-64-bit.exe

2. verify git
	cmd -> git --version

FIRST TIME PUSH YOUR LOCAL PROJEC TO GITHUB
--------------------------------------------------------------------------------------------
3. Create Account on GITHUB or BitBucket or GitLab
	https://github.com/

4. Create New Repository on GITHUB or BitBucket or GitLab

5. Go to local project folder & open folder in cmd
	git status
6. for new repository
	git status (to check current file status)
	git init (first time repository initialisation)
	git status 
	git add . (for all files) 
	git commit -m "first commit" (to commit to local git)
	git remote add origin https://github.com/ckjdelhi/JavaProjectDec2022.git
	git push -u origin master (ask username password for github)


EXISTING PROJECT STEPS
-----------------------------
GITHUB PROJECT LINK: https://github.com/ckjdelhi/JavaProjectDec2022.git
1. Create new folder in your system and open in cmd
2. check git installation: git --version
3. git clone https://github.com/ckjdelhi/JavaProjectDec2022.git
4. Open Eclipse -> import -> existing maven project


PUSH NEW CHANGES TO GITBUH
-----------------------------------
git branch
git status
git add .
git status
git commit -m "second commit" 
git push origin master


TAKE LATEST CODE FROM EXISITNG PROJECT
------------------------------------------
go to project folder and open in cmd
1. git branch
2. git status
3. git stash
4. delete .gitignore manually
5. git pull

