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
