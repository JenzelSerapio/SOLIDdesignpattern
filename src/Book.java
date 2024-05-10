class Book implements ILibraryResource {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void borrow(Student student) {
        System.out.println(student.getName() + " borrowed the book: " + getTitle());
    }

    @Override
    public void returnResource(Student student) {
        System.out.println(student.getName() + " returned the book: " + getTitle());
    }

    @Override
    public String getTitle() {
        return title;
    }
}