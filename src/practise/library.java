package practise;


/*  WAP to create a class library having data members department_name,number_of_books,no_of_authors and member function
 input to get details of library. Derive a class book from library having data members name,isbn,no_of_copies,author_name.
 It contains functions getBook() details-to get book information and display function() which displays library details and book details
*/



public class library {
    String departmentName;
    int numberofBooks;
    int noofAuthors;

    library(){
    }

    public library(String departmentName, int numberofBooks, int noofAuthors) {
        this.departmentName = departmentName;
        this.numberofBooks = numberofBooks;
        this.noofAuthors = noofAuthors;
    }

//    void input(String name, int books, int auth){
//        this.departmentName=name;
//        this.numberofBooks=books;
//        this.noofAuthors=auth;
//    }
    void disp(){
        System.out.println("Department name: "+departmentName+" Number of Books: "+numberofBooks+" Number of Authors: "+noofAuthors);
    }


    public static void main(String[] args) {
        library lib=new library();
       // lib.input("CSE",500,50);
      //  lib.disp();
        Book b1=new Book("The Midnight Library","1234ABC",50,"Robert Frost");
        b1.display();
    }
}
class Book extends library{
    String name;
    String isbn;
    int noofcopies;
    String authorname;
    Book(String n,String i,int cop,String a){
        super("bc",123,2);
        this.name=n;
        this.isbn=i;
        this.noofcopies=cop;
        this.authorname=a;
    }

//    void getBook(String n,String i,int cop,String a){
//
//        this.name=n;
//        this.isbn=i;
//        this.noofcopies=cop;
//        this.authorname=a;
//    }
    void display(){
        super.disp();
        System.out.println("Book: "+name+" ISBN: "+isbn+" No. of copies: "+noofcopies+" AuthorName: "+authorname);
    }
}