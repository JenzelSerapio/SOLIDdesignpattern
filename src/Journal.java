class Journal implements ILibraryResource {
    private String title;

    public Journal(String title) {
        this.title = title;
    }

    @Override
    public void borrow(Student student) {
        System.out.println(student.getName() + " borrowed the journal: " + getTitle());
    }

    @Override
    public void returnResource(Student student) {
        System.out.println(student.getName() + " returned the journal: " + getTitle());
    }

    @Override
    public String getTitle() {
        return title;
    }
}