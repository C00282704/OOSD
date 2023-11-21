//Student Name: Tadgh Fitzpatrick
//Student ID  : C00282704
public class CD extends LibraryItem
{
    String band;
    String title;
    int numTracks;

    public CD(String type, String ID, String band,String title, int numTracks)
    {
        super(type, ID);
        this.band = band;
        this.title = title;
        this.numTracks = numTracks;
    }

    public int calculatePrice()
    {
        return numTracks/2;
    }

    public String toString()
    {
        return "Type: " + type + ", ID: " + ID + ", Band: " + band + ", Title: " + title + ", Num.Tracks: " + numTracks;
    }
}
