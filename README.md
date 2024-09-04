Git is the most widely‑used version control system in the world today.

Git is a version control system, also known as a VCS. This version control refers to the process of saving files or versions throughout the stages in life of a project where you can retrieve past versions at any time.

Git is a time machine.

Git tracks changes made to files in a project and creates a unique identifier to each change so that it's easily discoverable if you ever want to go back and retrieve a version of the project or revert a change that you've made.

Git stores each saved version of your project as a complete snapshot of the entire project's file system at that specific point in time. This snapshot captures everything in the project, including its history and all of its metadata.

Git won't perform any action without you clearly telling it what to do. Git won't autosave your work or complete those snapshots, unless you explicitly tell Git to do it. Every Git action requires your explicit command or instruction.

When you add a new file to an existing Git project, Git won't automatically start tracking that file, you have to tell Git to track it.

Once a file is being tracked, it can reside in one of three different statuses, unmodified, modified. and staged. 

Unmodified means that you are tracking the file, but the file doesn't have any unsaved changes from the last time it was saved in that Git snapshot.

The next status is called modified. A file will move into this status when you have made changes to the file, but haven't yet saved them to the Git project.

A file can remain in this status for as long as you want, and you can continue to make changes until you want to save those changes in the next snapshot. When you're ready to save your changes by creating a snapshot, you move that file with the unsaved changes into the staged status.

The cool thing about the staging area is that you can move different files into this status at different times and work in different files that have different statuses all while having some files remain in the staging area.

And then once you're ready to save your changes and make that Git snapshot, you run a Git command to create that snapshot and commit those changes to the project.

Git has three main directories: .git, the working directory, and the staging area.

The .git directory is hidden at the project root and contains all Git metadata and committed file snapshots.

The working directory is where files are modified but not yet staged.

The staging area (also called index or cache) holds files that are staged and ready for the next commit.

Files can be in three states: committed (.git), modified (working directory), or staged (staging area).

Git requires specific commands to perform actions, with about 20-30 foundational commands being most common.

Basics commands include git init (create repository), git add (stage changes), git status (show file status), git commit (record changes), git config (set configurations), git log (view commit history), and git diff (show differences).

Branch commands are git branch (manage branches), git checkout (switch or create branches), and git merge (merge branches).

Remote commands include git clone (copy repository), git remote (view remotes), git push (send changes), git pull (fetch and merge changes), and git fetch (fetch without merging).

Undoing changes, use git revert (safe, creates inverse commits) and git reset (potentially destructive, resets changes).

Use git <command> --help for detailed information on any command.

Minor Git version differences usually don’t impact core features, but upgrades are recommended for new options.

Basic shell commands include pwd (print directory), mkdir (create directory), ls (list contents), cd (change directory), and touch (create file).

The .git folder is created during initialization and contains all version control data for the project.

The command git status checks the current status of your repository, including the current branch and any uncommitted changes.

Use ls -a to view hidden files, including the .git directory. Never delete the .git folder, as it contains all Git tracking data.

Inside the .git directory, files like HEAD point to the current branch. This directory manages all Git operations.

Git configurations are set at three levels:

System Level: Applies to all users on a machine. It's rarely used unless multiple people share the same machine.
Global Level: Applies to all repositories for a user. This is the most commonly used level.
Local Level: Applies only to a single repository, overriding global settings for that project.
Before committing, you need to set two configurations: user.name and user.email. These are tied to every commit you make.

Check the status of our Git repository with git status. If your project has no files, Git shows nothing to commit. If there are files, Git will list them as "untracked," meaning Git isn't tracking them yet.

To track these files, use git add. You can add all files with git add ., but be cautious, as it adds everything. 

Each git has ID and each file has ID File.

Using multiple branches in Git is essential for managing changes without affecting the main project. 
It's good practice to avoid making changes directly on the main branch. Branching allows you to try new ideas without impacting the main branch.

git diff shows changes in the working directory (e.g., the new step in frozen-mocha-blended.md).
git diff --staged shows changes in the staging area (e.g., the switch from whole milk to almond milk).
git diff HEAD displays all changes, both staged and unstaged.

Use git add -p to select specific changes within a file.
Create and switch to a feature branch with git checkout -b feature.
Return to the main branch with git checkout main.
On the feature branch, make changes, stage with git add, and commit.
Ensure you're on the main branch with git checkout main.

git log: Displays commit history with full details (commit ID, author, date, message).
git log --oneline: Simplifies output to one line per commit, showing shortened commit ID and message.
git log --oneline --graph: Adds a visual representation of the branch structure and commit history.
git branch -d <branch_name>: Deletes a branch. The branch must be merged into another branch or it will not be deleted.
git branch -a: Lists all branches, including remote-tracking branches.




git remote add <name> <URL>: Add a new remote connection.
git remote: List all remote connections.
git remote -v: List remote connections with detailed URLs.
git remote remove <name>: Remove a remote connection (not discussed but useful to know).

git push: Sends commits from your local repository to the remote repository.
-u (upstream): Sets up a tracking connection between your local branch and the remote branch. This is needed the first time you push a new branch to the remote repository.
origin: The name of the remote connection (default is origin).
main: The branch you are pushing to.
Cloning a repository sets up the remote connection and allows you to work locally.
Make and commit changes locally, then push them to share with others.
Use git remote -v to check the remote connections and verify that your repository is linked correctly.

git fetch retrieves updates from the remote but does not merge them, allowing you to review changes first.
git pull retrieves and merges updates from the remote, ensuring your local repository is synchronized.
Use git diff to review changes between local and remote branches before merging.

Conflict Trigger: Different changes to the same file sections from different branches.
Resolution Steps: Identify conflicts, manually resolve, stage changes, and commit the resolution.
Best Practice: Regularly pull changes and communicate with team members to minimize conflicts.



git commit --amend allows you to change the most recent commit’s message or content.

git reset --soft <commit> moves a commit from history back into the staging area.
Useful for regrouping commits or altering staged changes before committing again.
git reset or git reset --mixed <commit> moves changes from a commit back to the working directory (unstaged).
git reset --hard <commit> completely discards changes from the commit and removes them from staging and working directory.

git reset --soft: Moves commits to the staging area, useful for regrouping or modifying staged changes.
git reset (mixed): Moves commits to the working directory, allowing for re-staging changes.
git reset --hard: Permanently removes commits from history and clears the working directory and staging area.
git reflog: Keeps a local history of where HEAD has been, useful for recovering lost commits.
git cherry-pick: Allows you to apply a specific commit from another branch or from the reflog into your current branch.
