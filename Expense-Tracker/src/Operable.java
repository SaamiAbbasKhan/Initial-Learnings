public interface Operable<T> {
    void add(T t);
    void delete(String name);
    void printData();
    int sum();
}

// Operable class contains the basic functionalities that would help in data manipulation