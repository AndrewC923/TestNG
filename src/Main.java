import java.util.HashSet;

public class Main  {
    public static void main(String[] args){
        HashSet<Band> _bandList = new HashSet<Band>();

        Band band1 = new Band("Strapping Young Lad", "Metal", false);
        _bandList.add(band1);
        band1.addAlbum(new Album("The New Black", 2008, 20.00));
        band1.addAlbum(new Album("Alien", 2003, 21.00));
        band1.addAlbum(new Album("City", 1998, 19.00));
        band1.addAlbum(new Album("Heavy as a Really Heavy Thing", 1996, 17.00));
        band1.addAlbum(new Album("SYL", 2006, 18.00));

        Band band2 = new Band("Gojira", "Death Metal", true);
        band2.addAlbum(new Album("Magma", 2016, 24.00));
        band2.addAlbum(new Album("L'enfant Sauvage", 2012, 22.00));
        band2.addAlbum(new Album("The Way of All Flesh", 2008, 24.00));
        band2.addAlbum(new Album("From Mars to Sirius", 2005, 19.00));
        band2.addAlbum(new Album("Terra Incognita", 2001, 24.30));
        _bandList.add(band2);

        Band band3 = new Band("Red Hot Chili Peppers", "Funk Rock", true);
        band3.addAlbum(new Album("The Getaway", 2016, 24.00));
        band3.addAlbum(new Album("I'm With You", 2011, 22.00));
        band3.addAlbum(new Album("Stadium Arcadium", 2006, 24.00));
        band3.addAlbum(new Album("By The Way", 2002, 19.00));
        band3.addAlbum(new Album("Californication", 1999, 24.30));
        band3.addAlbum(new Album("One Hot Minute", 1995, 24.30));
        _bandList.add(band3);



        for (Band band : _bandList){
            band.printBand();
            System.out.println("------------------------------");
        }


        System.out.println("\nSearch By Year: ");
        band1.searchDiscographyByYear(1998);


    }
}
