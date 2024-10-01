public class TextInformation {
    String facts = """
            CLI File-Explorer
                Facts:
                    1. Text Metadata: The first entity in the list of text items is metadata, specifically the date and time when the\s
                        folder or text was created. \s
                    2. Folder Naming Restriction: Folders cannot start with a numeric value to prevent issues when switching folders.\s
                    3. Current Folder Deletion: The program prevents the deletion of the currently active folder. You must switch\s
                        to a parent folder before deleting a subfolder to avoid errors.
                    4. Navigation by Index: The program supports navigation through folders using both positive and negative\s
                        indices. Positive indices move forward through the hierarchy, while negative indices move backward.
                    5. Context Switching Flexibility: The program allows internal folder switching by specifying either the folder\s
                        name or its index in the hierarchy.\s
                    7. Sorting Sub-Folders: Sub-folders within a parent folder can be sorted alphabetically
                        with the 'sort folder' command.
                    8, Exception Handling: If the user tries to switch to a non-existent folder or delete a folder that\s
                        doesn’t exist, the program handles the error gracefully by displaying appropriate messages.
                    9. Context Switching Alternative: Although a simpler array-based method could have been used to manage folder\s
                        navigation (returning an array with the current and target folders), this approach was avoided in favor of\s
                        hierarchical folder management.
            """;
    String instructions = """
            CLI File-Explorer
                Instructions:
                    1. Use 'create' / generate folder for folder creation
                    2. Use 'create' / generate text or information for text generation
                    3. Use 'delete folder' for deletion of the folder
                    4. Use 'delete text' / information for deletion of the text (information).
                    5. Use 'switch' / 'goto' + folder for folder switching
                        5.1. Specify the folder name (sub-folder of the current folder)
                        5.2. Or Specify the index (hierarchical) (Could be -ve or +ve)
                    6. Use view folder for folder viewing
                    7. Use 'view information' / text for viewing of the text.
                    8. Use 'view all' to view all the folder related information
                    9. Use 'view hierarchy' to view the hierarchy i.e. (relation b/w folders). Alternatively you can type 'drives'
                    10. Use 'sort' folder to sort the folder (sub-folders) which is inside the parent folder
                    11. Use 'exit' to quit the program
               \s""";

}
