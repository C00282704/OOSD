//Student Name: Tadgh Fitzpatrick
//Student ID  : C00282704
public class TestLibrary 
{
    public static void main(String args[])
    {
    LibraryItem[] catalogue = new LibraryItem[10];

    Book book1 = new Book("Book", "B001", "Philip P.Harris", "Great Keys", 450);
    Book book2 = new Book("Book", "B002", "Angela Stars", "The Ramifications of The Battle", 360);
    Book book3 = new Book("Book", "B003", "Killian Myers", "1,2....Who are You!?", 50);

    CD cd1 = new CD("CD", "C001", "Har Hur", "Lost Days", 12);
    CD cd2 = new CD("CD", "C002", "Halo", "Big Bang?", 6);
    CD cd3 = new CD("CD", "C003", "Crunch", "Thy True Service", 20);

    catalogue[0] = book1;
    catalogue[1] = book2;
    catalogue[2] = book3;
    catalogue[3] = cd1;
    catalogue[4] = cd2;
    catalogue[5] = cd3;

    /*for(int i=0; i < 6; i++)
    {
        catalogue[i].calculatePrice();
    }*/

    for(int i=0; i < 6; i++)
    {
        System.out.println(catalogue[i] + ", Price: " + catalogue[i].calculatePrice());
    }
    }
}
