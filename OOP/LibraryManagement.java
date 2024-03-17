class Library  {
    int reg_no;
    String name;
    int borrowed_books;
    static int available_books = 50;

    Library(int reg, String identity){
        reg_no = reg;
        name = identity;
    }

    void borrowBook(int numofBooks){
        if(numofBooks > 5){
            System.out.println("You can't borrow more than 5 books at a single time");
        } else {
            borrowed_books = borrowed_books + numofBooks;
            available_books = available_books - numofBooks;
            System.out.println("Successfully, Borrowed " + numofBooks + " Books");
        }
    }

    void availableBook() {
        System.out.println(available_books + " Books Are Currently Available");
    }

    void checkInfo(){
        System.out.println(reg_no + ". " + name + ", " +  "Borrowed Books: " + borrowed_books);
    }

    void returnBook(int n){
        if(available_books == 50){
            System.out.println("Since you doesn't borrowed any book so you can't return them");
        } else {
            available_books = available_books + n;
            System.out.println("Successfuly, returned " + n + " Books");
        }
       
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Library person1 = new Library(1, "Manish");
        person1.borrowBook(5);
        person1.checkInfo();
        person1.borrowBook(12);
        person1.returnBook(5);
        person1.availableBook();

        Library person2 = new Library(2, "Rahul");
        person2.returnBook(10);
        person2.availableBook();
        person2.checkInfo();
    }
}
