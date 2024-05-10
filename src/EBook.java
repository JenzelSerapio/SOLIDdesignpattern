public class EBook implements ILibraryResource {
    private String title;

    public EBook(String title) {
        this.title = title;
    }

    @Override
    public void borrow(Student student) {
        System.out.println(student.getName() + " borrowed the ebook: " + getTitle());
    }

    @Override
    public void returnResource(Student student) {
        System.out.println(student.getName() + " returned the ebook: " + getTitle());
    }

    @Override
    public String getTitle() {
        return title;
    }
}
