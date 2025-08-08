# Notes Manager (Java - Console Based)

A simple **text-based notes manager** built using Java that allows users to **add, view, and delete notes** using a terminal interface. Notes are stored persistently in a text file.
##  Features

-  Add a new note
-  View all saved notes
-  Delete all notes
-  Notes are saved to `notes.txt` for persistence
-  Runs completely in the console (no external dependencies)
# File Structure

project-folder/
│
├── NotesManager.java       # Main Java source code
├── notes.txt               # File that stores your notes (created automatically)
└── README.md               # This file
#  Example Usage

+----------------------------+
|       NOTES MANAGER       |
+----------------------------+
| 1. Add Note               |
| 2. View Notes             |
| 3. Delete All Notes       |
| 4. Exit                   |
+----------------------------+
Enter your choice (1-4):
# Key Concepts Used
File I/O (java.io):
Used FileWriter, FileReader, BufferedReader to read/write data from/to a text file.

Control Structures:
do-while, switch-case, and conditional logic to navigate menu options.

Exception Handling:
Proper use of try-catch blocks to handle file operations safely.

Methods for Code Organization:
Divided functionality into reusable methods like addNote(), viewNotes(), etc.

User Input (Scanner):
Used Scanner class to get user input from the console.

Modular Design:
Each menu option is handled in a dedicated method, making code easier to maintain.
