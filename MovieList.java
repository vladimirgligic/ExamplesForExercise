//Adding movies and directors
//Creating a playlist for movies
//Navigate through the playlist

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class MovieList {

    ArrayList<Movie> movies = new ArrayList<>();
    LinkedList<Movie> movieList = new LinkedList<>();

    public static void main(String[] args) {
        MovieList ml = new MovieList();
        ml.addMovie("Andrei Tarkovsky", "Andrei Rublev");
        ml.addMovie("Andrei Tarkovsky", "Solaris");
        ml.addMovie("Andrei Tarkovsky", "Stalker");
        ml.addMovie("George Lucas", "Star Wars");
        ml.addMovie("Quentin Tarantino", "Pulp Fiction");
        ml.addMovie("Quentin Tarantino", "Jackie Brown");
        ml.addMovie("Emir Kusturica", "Underground");
        ml.addMovie("Emir Kusturica", "When Father Was Away on Business");
        ml.addMovie("Stanley Kubrick", "Dr. Strangelove");
        ml.addMovie("Robert Zemeckis", "Forrest Gump");
        ml.addMovie("Stanley Kubrick", "2001: A Space Odyssey");
        ml.addMovie("Martin Scorsese", "Taxi Driver");
        ml.addMovie("Martin Scorsese", "Casino");
        ml.addMovie("Jim Jarmusch", "Night on Earth");
        ml.addMovie("Wim Wenders", "Until the End of the World");

        ml.createPlayList("Forrest Gump");
        ml.createPlayList("Pulp Fiction");
        ml.createPlayList("Jackie Brown");
        ml.createPlayList("Andrei Rublev");
        ml.createPlayList("Stalker");
        ml.createPlayList("Underground");
        ml.createPlayList("Dr. Strangelove");
        ml.createPlayList("Taxi Driver");
        ml.createPlayList("Casino");
        ml.createPlayList("Night on Earth");
        ml.createPlayList("Until the End of the World");
        ml.createPlayList("Star Wars");
        //ml.printPlayList();
        //ml.printList();

        ml.playMovie();
    }
    
    //method for adding movie objects to the ArrayList
    public boolean addMovie(String director, String name) {
        for (int i = 0; i < movies.size(); i++) {
            if (name.equals(movies.get(i).getMovieName())) {
                System.out.println("Movie is aleready added");
                return false;
            }
        }
        movies.add(new Movie(director, name));
        return true;
    }
    //method for searching movies
    public Movie findMovie(String movieName) {
        for (int i = 0; i < movies.size(); i++) {
            Movie a = movies.get(i);
            if (a.getMovieName().equals(movieName)) {
                //System.out.println("True");
                return a;
            }
        }
        //System.out.println("Null");
        return null;
    }

    public void printList() {
        for (Movie a : movies) {
            System.out.println("Movie " + a.getMovieName() + " from Director: " + a.getDirector());

        }
    }
    
    //method for create playlist
    public void createPlayList(String movieName) {
        Movie a = findMovie(movieName);
        movieList.add(a);
    }

    public void printPlayList() {
        ListIterator it = movieList.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

    public void printMenu() {
        System.out.println("Menu:");
        System.out.println("0 - power off\n"
                + "1 - next\n"
                + "2 - previous\n"
                + "3 - repeat\n"
                + "4 - menu");
    }
    
    //method to navigate through the playlist
    public void playMovie() {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean fw = true;
        ListIterator<Movie> i = movieList.listIterator();

        if (movieList.isEmpty()) {
            System.out.println("No movies in the list.");
            return;
        } else {
            System.out.println("Now watching: " + i.next());
            printMenu();

        }

        while (!quit) {
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 0:
                    System.out.println("Power off!");
                    quit = true;
                    break;
                case 1:

                    if (!fw) {
                        if (i.hasNext()) {
                            i.next();

                        }
                        fw = true;
                    }
                    if (i.hasNext()) {
                        System.out.println("Now watching " + i.next());
                    } else {
                        System.out.println("End");
                        fw = false;
                    }
                    break;
                case 2:
                    if (fw) {
                        if (i.hasPrevious()) {
                            i.previous();

                        }
                        fw = false;
                    }
                    if (i.hasPrevious()) {
                        System.out.println("Now watching " + i.previous());
                    } else {
                        System.out.println("Start");
                        fw = true;
                    }
                    break;
                case 3:
                    if (fw) {
                        if (i.hasPrevious()) {
                            System.out.println("Now watching " + i.previous());
                            fw = false;
                        } else {
                            System.out.println("Start");
                        }
                    } else {
                        if (i.hasNext()) {
                            System.out.println("Now watching " + i.next());
                            fw = true;
                        }

                    }

                    break;
                case 4:
                    printMenu();

            }
        }
    }
}

class Movie {

    String movieName;
    String director;

    public Movie(String director, String movieName) {
        this.movieName = movieName;
        this.director = director;

    }

    public String getMovieName() {
        return movieName;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return movieName + ",from " + director;
    }

}
