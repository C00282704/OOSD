//Student Name: Tadgh Fitzpatrick
//Student ID  : C00282704
public class Book extends LibraryItem
{
    String author;
    String title;
    int numPages;

    public Book(String type, String ID, String author,String title, int numPages)
    {
        super(type, ID);
        this.author = author;
        this.title = title;
        this.numPages = numPages;
    }
    public int calculatePrice()
    {
        return numPages/10;
    }

    public String toString()
    {
        return "Type: " + type + ", ID: " + ID + ", Author: " + author + ", Title: " + title + ", Num.Pages: " + numPages;
    }
}
