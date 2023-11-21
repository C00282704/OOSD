//Student Name: Tadgh Fitzpatrick
//Student ID  : C00282704
public class LibraryItem implements LoanItem
{
    String type;
    String ID;

    public LibraryItem(String type, String ID)
  	{ 
  		this.type = type; 
  		this.ID = ID;
  	}

    public int calculatePrice()
    {
       return 9999;
    }
}
