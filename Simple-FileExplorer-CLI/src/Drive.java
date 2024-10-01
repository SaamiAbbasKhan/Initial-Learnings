import java.util.List;

public interface Drive {
    void add(String text);
    void add(ProDrive folder);
    void delete(String text);
    void delete(ProDrive folder);
    List<String> printSubFolders();
    List<String> printSubTexts();

    default void viewAll() {} // for viewing all the hierarchy starting form the given folder
    default void sortSub() {}
}
