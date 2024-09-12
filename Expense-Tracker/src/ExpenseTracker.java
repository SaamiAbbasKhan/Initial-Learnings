import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ExpenseTracker implements Operable<Expenses>{

    private final List<Expenses> list = new ArrayList<>();
    List<EnumInterface> enumList = new ArrayList<>();

    public ExpenseTracker() {
        enumList.addAll(Arrays.asList(Market.values()));
        enumList.addAll(Arrays.asList(Education.values()));
        enumList.addAll(Arrays.asList(Essentials.values()));
        enumList.addAll(Arrays.asList(Requirements.values()));
        enumList.addAll(Arrays.asList(Extras.values()));
    }

    static class ExpenseTrackerComparator implements Comparator<Expenses> {
        @Override
        public int compare(Expenses o1, Expenses o2) {
            return o1.amount() - o2.amount();
        }
    }

    @Override
    public void add(Expenses expenses) {
        list.add(expenses);
    }

    private Expenses find(String name) {
        for (var exp : list) {
            if (exp.name().equalsIgnoreCase(name)) {
                return exp;
            }
        }
        return null; // returns null if no match found
    }

    @Override
    public void delete(String name) {
        list.remove(find(name));
    }

    @Override
    public void printData() {
        System.out.println(list);
    }

    @Override
    public int sum() {
        int sum = 0;
        for (var exp : list) {
            sum += exp.amount();
        }
        return sum;
    }

    public void sort() {
        // Will use comparator
        list.sort(new ExpenseTrackerComparator());
    }

    public void categorize() {

        System.out.println("Market: ");
        if (!helperCategorize("Market")) System.out.println("Nil");

        System.out.println("Education: ");
        if (!helperCategorize("Education")) System.out.println("Nil");

        System.out.println("Essentials: ");
        if (!helperCategorize("Essentials")) System.out.println("Nil");

        System.out.println("Extras: ");
        if (!helperCategorize("Extras")) System.out.println("Nil");

        System.out.println("Requirements: ");
        if (!helperCategorize("Requirements")) System.out.println("Nil");


    }

    public boolean helperCategorize(String temp) {
        /* Function will firstly loop through all the expenses and will then check each for all the
           enum values (actual values) and then will check if the name of the expense matches the name
           of the enum if so (until this point we'll only get those expenses which are in the enum's
           the next if statement is to finally check if the enum is equal to the temp (which will be
           passed with the different values of enum class names
           The function will only print in categorized manner. */
        boolean flag = false; // Keeps track of whether the code reach the 2nd if statement or not
        for (var exp : list) {
            for (int i = 0; i < enumList.size(); i++) {
                if (exp.name().equalsIgnoreCase(enumList.get(i).toString())) {

                    // up to this only the category elements would get printed

                    if (enumList.get(i).getClass().getSimpleName().equals(temp)) {
                        System.out.println("\t" + exp.name());
                        flag = true;
                    }
                }
            }
        }

        return flag;
    }
}




