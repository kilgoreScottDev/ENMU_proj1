public class FindBugsError {
    private String name;

    public FindBugsError() {
        // The name is not initialized.
    }

    public int getNameLength() {
        return name.length();  // Potential null dereference will be caught by FindBugs.
    }

    public static void main(String[] args) {
        FindBugsError error = new FindBugsError();
        System.out.println(error.getNameLength());
    }
}
