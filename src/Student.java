public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void borrowResource(ILibraryResource resource) {
        resource.borrow(this);
    }

    public void returnResource(ILibraryResource resource) {
        resource.returnResource(this);
    }

    public String getName() {
        return name;
    }
}
