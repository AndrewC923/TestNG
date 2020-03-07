import java.util.*;

public class Band {
    String Name;
    String Genre;
    boolean Active;
    ArrayList<Album> albums = new ArrayList<Album>();


    public Band(String Name, String Genre, boolean Active){
        this.Name = Name;
        this.Genre = Genre;
        this.Active = Active;
    }
    public void addAlbum(Album album){
        albums.add(album);
    }
    public void printBand(){
        System.out.println("Name: " + this.Name + "\nGenre: " + this.Genre + "\nActive: " + this.Active);
        System.out.println("\nAlbums:");
        for(Album album: albums){
            System.out.println(album.Name);
        }
    }
    public void searchDiscographyByYear(int year){
        for(Album album : albums){
            if(album.Year == year){
                System.out.println("Album: " + album.Name + "\t\tYear: " + album.Year);
            }
        }
    }
}
