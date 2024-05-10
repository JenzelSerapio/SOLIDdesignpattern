interface ILibraryResource {
    void borrow(Student student);
    void returnResource(Student student);
    String getTitle();
}
