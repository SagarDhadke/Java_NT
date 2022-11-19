package net.uniquecomputer.SetterandGetters;

public class Book {
    private int bookPage = 300;
    private String bookTitle = "The Android Developer";

    public int getBookPage() {
        return bookPage;
    }

    public void setBookPage(int bookPage) {
        this.bookPage = bookPage;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    void reading(){
        System.out.println("Read from 1st page --------- till 300 pages");
    }


}
