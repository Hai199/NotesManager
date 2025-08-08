import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotesManager {
private static final String FILE_NAME ="C:\\Users\\Hreesh\\OneDrive\\Desktop\\Spring\\Manager.text.txt";
private static void printMenu() {
    System.out.println("\n+----------------------------+");
    System.out.println("|       NOTES MANAGER       |");
    System.out.println("+----------------------------+");
    System.out.println("| 1. Add Note               |");
    System.out.println("| 2. View Notes             |");
    System.out.println("| 3. Delete All Notes       |");
    System.out.println("| 4. Exit                   |");
    System.out.println("+----------------------------+");
    System.out.print("Enter your choice (1-4): ");
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int choice;

        do {
        	printMenu();
		 choice = scanner.nextInt();
         scanner.nextLine(); // Consume newline

         switch (choice) {
             case 1 -> addNote(scanner);
             case 2 -> viewNotes();
             case 3 -> deleteAllNotes();
             case 4 -> System.out.println("Exiting Notes Manager. Goodbye!");
             default -> System.out.println("Invalid choice! Please enter 1-4.");
         }
     } while (choice != 4);

     scanner.close();
 }
	// Add a new note
    private static void addNote(Scanner scanner) {
        System.out.print("Enter your note: ");
        String note = scanner.nextLine();

        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(note + System.lineSeparator());
            System.out.println("Note added successfully.");
        } catch (IOException e) {
            System.out.println("Error writing note to file.");
            e.printStackTrace();
        }
    }

    // View all notes
    private static void viewNotes() {
        System.out.println("\n--- Your Notes ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            int count = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println(count++ + ". " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No notes found.");
        } catch (IOException e) {
            System.out.println("Error reading notes.");
            e.printStackTrace();
        }
    }

    // Delete all notes
    private static void deleteAllNotes() {
        File file = new File(FILE_NAME);
        if (file.delete()) {
            System.out.println("All notes deleted.");
        } else {
            System.out.println("No notes to delete or failed to delete.");
        }
    }


	

}
