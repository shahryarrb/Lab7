package Stream;

import java.io.File;

/**
 * The Buffer.Note class represents a note in noting system
 */
public class Note {

    // Title of the note
    private String title;

    // Content of the note
    private String content;

    // Date of creation of the note
    private String date;

    // A file for saving the note
    private File file;

    /**
     * Creates a new note with the given title, content, and date
     * @param title title of a note
     * @param content content of a note
     * @param date date of creation of the note
     */
    public Note(String title, String content, String date) {
        this.title = title;
        this.content = content;
        this.date = date;
    }

    /**
     * Get the title of a note
     * @return title field
     */
    public String getTitle() {
        return title;
    }

    /**
     * Get the content of a note
     * @return content field
     */
    public String getContent() {
        return content;
    }

    /**
     * Get the date of creation of a note
     * @return date field
     */
    public String getDate() {
        return date;
    }

    /**
     * Get the file that note is saved on
     * @return file field
     */
    public File getFile() {
        return file;
    }

    /**
     * Set a file for saving a note
     * @param file a file
     */
    public void setFile(File file) {
        this.file = file;
    }
}
