import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> songs = new ArrayList<>();

        songs.add("London calling");
        songs.add("Anarchy in the UK");
        songs.add("O sole mio");

        System.out.println(songs);
        Collections.sort(songs);
        System.out.println(songs);

        ///////////////////////////////////////
        System.out.println("Using Song class:");

        ArrayList<Song> song_list = new ArrayList<>();

        Song s1 = new Song("London Calling","the clash",1980);
        Song s2 = new Song("anarchy in the uk","sex pistols",1977);
        Song s3 = new Song( "o sole mio","pink floyd",1975);

        Song s1_copy = new Song("London Calling","the clash",1980);


        if (s1_copy.equals(s1)) {
            System.out.println("They are equal!!!");
        }
        else
            System.out.println("They are not equal");

        System.out.println("Hashcodes of the two");


        song_list.add(s1);
        song_list.add(s2);
        song_list.add(s3);

        System.out.println("Original list:");
        System.out.println(song_list);
        Collections.sort(song_list);
        System.out.println("Sorted with comparable:");
        System.out.println(song_list);

        AuthorComparator ac = new AuthorComparator();
        Collections.sort(song_list,ac);
        System.out.println("Sorted with author comparator");
        System.out.println(song_list);

        YearComparator yc = new YearComparator();
        Collections.sort(song_list,yc);
        System.out.println("Sorted with year comparator");
        System.out.println(song_list);


        //////////////////////////////////////////////////7

        HashSet<Song> song_set = new HashSet<>();

        song_set.add(s1);

        if (s1_copy.equals(s1)) {
            System.out.println("s1_copy is equal to s1!!!");
        }
        else
            System.out.println("s1 and s1_copy are NOT equal");

        System.out.println("Hashcodes of the two");

        if (song_set.contains(s1_copy)) {
            System.out.println("I've found s1_copy in the set!");
        }
        else
        System.out.println("s1_copy non found!!");



    }
}
