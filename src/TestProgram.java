public class TestProgram {
    public static void main(String[] args) {
        Student jenzelSerapio = new Student("Jenzel Serapio");

        Book book = new Book("Effective Java");
        Journal journal = new Journal("Agricultural History");
        ILibraryResource ebook = new EBook("The Alchemist");


        jenzelSerapio.borrowResource(book);
        jenzelSerapio.borrowResource(journal);
        jenzelSerapio.borrowResource(ebook);

        System.out.println();

        jenzelSerapio.returnResource(book);
        jenzelSerapio.returnResource(journal);
        jenzelSerapio.returnResource(ebook);




    }
}