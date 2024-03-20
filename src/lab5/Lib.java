package lab5;

//WAP to create a class library having data members department name , number of books , number of author
// and member function input to get details of library.Derive a class book from library having data members name ,
// ISBN , number of copies , author name. It contains function get book details - to get book information and
// display function which displays library details and book details.
public class Lib {
    public static void main(String[] args) {
        Book b1=new Book();
        b1.input("CSE",30,10);
        b1.get("DBMS","23WZX",30,"XYZ");
        b1.display();
    }
}

class Library{
    String dept_name;
    int no_of_books;
    int no_of_author;

    void input(String dept_name , int no_of_books,int no_of_author){
        this.dept_name=dept_name;
        this.no_of_books=no_of_books;
        this.no_of_author=no_of_author;
    }
}

class Book extends Library{
    String name;
    String ISBN;
    int no_of_copies;
    String author;

    @Override
    void input(String dept_name, int no_of_books, int no_of_author) {
        super.input(dept_name, no_of_books, no_of_author);
    }

    void get(String name, String ISBN, int no_of_copies, String author){
        this.name=name;
        this.ISBN=ISBN;
        this.no_of_copies=no_of_copies;
        this.author=author;
    }

    void display(){
        System.out.println("Department name is :"+ dept_name);
        System.out.println("Number of books is: " + no_of_books);
        System.out.println("Number of author is :" + no_of_author);
        System.out.println("Name is:"+name);
        System.out.println("ISBN number is :"+ISBN);
        System.out.println("Number of copies is :"+no_of_copies);
        System.out.println("Author name is :" + author);
    }

}