# Project: Task Manager
Overview
The Task Manager is a Java application designed to help users efficiently manage their tasks. Users can add, remove, sort, and display tasks through 
a simple command-line interface, allowing for effective task organization.

## Features
**Add Tasks:** Users can add a task with a description, status, and priority (High, Medium, Low).
**Remove Tasks:** Tasks can be removed by their description.
**Sort Tasks:** Tasks are sorted based on their priority.
**Display Tasks:** All tasks can be displayed at any time for quick viewing.

## Project Tag: s3 (Simple 3)
The Task Manager project is categorized as Simple 3 because it implements basic task management functionality and employs fundamental Java concepts 
such as lists and command-line input handling.

## Usage
To run this project, clone the repository and execute the Main class. The application accepts the following commands:

Demo Code
```java
TaskManager taskManager = new TaskManager();
taskManager.addTask("Complete homework", "incomplete", "high");
taskManager.addTask("Go grocery shopping", "incomplete", "medium");
taskManager.sortTask();
taskManager.printList();
