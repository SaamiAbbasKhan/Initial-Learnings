# Simple CLI File Explorer

## Project Overview
The **Simple CLI File Explorer** is a command-line-based file explorer that allows users to interact with directories and text files. 
It provides basic folder management functionalities like creating, deleting, navigating between directories, and managing text within files. 
The project is designed as a learning exercise to strengthen core programming concepts and basic file system operations. The project
was a fulfilling journey that allowed me to apply my Java knowledge while learning valuable lessons in software development. 
I successfully created a functional CLI tool that mimics basic file management operations, while also setting the stage for further enhancements 
and learning opportunities in the future. Through this project, I reinforced my understanding of core concepts like object-oriented programming, 
file handling, exception management, and basic data structures.

## Table of Contents
- [Project Overview](#project-overview)
- [Features](#features)
  - [Folder Management](#folder-management)
  - [Text File Management](#text-file-management)
  - [Command Line Interface (CLI)](#command-line-interface-cli)
- [Installation](#installation)
- [Instructions](#instructions)
- [Facts About the Project](#facts-about-the-project)
- [Future Improvements](#future-improvements)
- [Usage](#usage)
- [Conclusion](#conclusion)
- [License](#license)

## Features

### Folder Management
- **Create New Folders:** The explorer allows the creation of new folders.
- **Switch Between Folders:** Users can navigate to any folder within the current directory.
- **Delete Folders:** Folders can be removed from the file system.
- **List Folders:** The explorer can display the list of folders in the current directory.
- **Folder Hierarchy:** Only the parent folder is stored when navigating through nested folders to optimize memory usage.

### Text File Management
- **Add Text to Files:** The explorer allows adding text to a file within a folder.
- **Search in Files:** Users can search for text within files.
- **List Files:** The list of files in the current folder is displayed when requested.
- **Delete Files:** Files can be deleted from within the explorer.

### Command Line Interface (CLI)
- **User Commands:** Various commands are supported, such as folder creation, text addition, deletion, and switching between directories.
- **Error Handling:** The project includes error handling for invalid commands, non-existing folders, and files.
- **Fact and Instruction Display:** The explorer can print out facts and detailed instructions when requested.

## Installation

1. Clone the repository to your local machine:
    ```bash
    git clone https://github.com/SaamiAbbasKhan/Simple-FileExplorer-CLI.git
    cd Simple-FileExplorer-CLI
    ```

2. Compile the Java project:
    ```bash
    javac Main.java
    ```

3. Run the program:
    ```bash
    java Main
    ```

## Instructions
To use the CLI File Explorer, follow these commands:

1. **Create a Folder:** Use the command `create` or `generate` folder to generate a new folder.
2. **Create a Text File:** Use the command `create` or `generate` text for text generation (to create a text file with specified content).
3. **Delete a Folder:** Use the command `delete folder` for the deletion of a specified folder.
4. **Delete Text File:** Use the command `delete text`  or `delete <information>` for the deletion of the text (information).
5. **Switch Folders:** Use the command `switch folder` or `goto folder` for folder switching.
   - 5.1. Specify the folder name (sub-folder of the current folder).
   - 5.2. Or specify the index (hierarchical) (could be negative or positive).
6. **View Current Folder:** Use the command `view folder` for folder viewing.
7. **View Text File:** Use the command `view text` or `view information` for viewing the text.
8. **View All Information:** Use the command `view all` to view all the folder-related information.
9. **View Hierarchy:** Use the command `view hierarchy` to view the hierarchy (i.e., the relation between folders). Alternatively, you can type `drives`.
10. **Sort Folders:** Use the command `sort folder` to sort the sub-folders inside the parent folder.
11. **Exit Program:** Use the command `exit` to quit the program.

__In all the above steps, you will be prompted to enter the folder or text name.__

## Facts About the Project
- **Single Parent Storage:** The explorer only adds the parent folder to memory once, even if you navigate through multiple subfolders.
- **Simple Structure:** The project uses basic ArrayLists for storing folders and files, ensuring simplicity and ease of understanding.
- **Error Handling:** Invalid inputs, such as non-existent folders or files, are gracefully handled to avoid crashes.
- **Customization:** Users can extend this project by adding more commands or functionalities.
- **Core Focus:** This project was built to help strengthen fundamental concepts like OOP, file handling, exception handling, and basic data structures.

## Future Improvements
- **Support for File/Folder Metadata:** Adding the ability to view and modify metadata like file size, last modified date, etc.
- **Tree Data Structures:** Implementing a tree-like structure for more efficient folder management and navigation.
- **File Permissions:** Allow users to set file and folder permissions (read/write/execute).
- **Recursive Folder Deletion:** Currently, the explorer only allows deletion of empty folders. Recursive deletion could be added to remove non-empty folders.
- **Search Functionality:** Implement a more robust search mechanism that can search for files and folders by partial matches.
- **File I/O Improvements:** Optimize the way files are read and written by integrating better file I/O techniques.
- **Graphical Interface:** A potential upgrade could include adding a GUI using JavaFX or Swing for a better user experience.

## Usage
To use this application, clone the repository and run the Java application in your preferred environment.

## Conclusion
Feel free to explore and contribute to this project. Your feedback is invaluable for future improvements, and I'd love to hear your thoughts on how to make this CLI File Explorer better!

## License
This project is licensed under the MIT License.
