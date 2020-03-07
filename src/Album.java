import org.w3c.dom.NameList;

public class Album {
    String Name;
    int Year;
    double Price;

    public Album(String Name, int Year, double Price){
        this.Name = Name;
        this.Year = Year;
        this.Price = Price;
    }
    public void printAlbum(){
        System.out.println("Name:" + this.Name + "\nYear: " + this.Year + "\nPrice: "+ this.Price);
    }
}
