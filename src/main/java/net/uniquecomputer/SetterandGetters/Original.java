package net.uniquecomputer.SetterandGetters;

public class Original {
    public static void main(String[] args) {

        Book myBook = new Book();
        System.out.println(myBook.getBookPage());

        myBook.setBookPage(500);
        System.out.println(myBook.getBookPage());

        Book yourBook = new Book();
        System.out.println(yourBook.getBookPage());

        System.out.println(myBook.getBookTitle());

//        myBook.bookPage = 400;
//        System.out.println(myBook.bookPage);

    }
}
