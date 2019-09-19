import java.util.ArrayList;

public class Library {
    private ArrayList<Book> booksInLibrary;

    public Library() {
        this.booksInLibrary = new ArrayList<Book>();
    }

    public void addBook(Book newBook){
        booksInLibrary.add(newBook);
    }

    public void printBooks(){
        for (Book books : booksInLibrary){
            System.out.println(books);
        }
    }

    public ArrayList<Book> searchByTitle(String searchedTitle){
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book books : booksInLibrary){
            if(StringUtils.included(books.title(), searchedTitle)) {
                found.add(books);
            }
        }
        return found;
    }
    public ArrayList<Book> searchByPublisher(String searchedPublisher){
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book books : booksInLibrary){
            if(StringUtils.included(books.publisher(), searchedPublisher)) {
                found.add(books);
            }
        }
        return found;
    }
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book books : booksInLibrary){
            if (books.year() == year){
                found.add(books);
            }
        }
        return found;
    }

}
