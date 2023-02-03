import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Movie {
    private String name;
    private String genre;
    private String language;
    private double rating;

    public Movie(String name, String genre, String language, double rating) {
        this.name = name;
        this.genre = genre;
        this.language = language;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getLanguage() {
        return language;
    }

    public double getRating() {
        return rating;
    }
}

class MovieRecommender {
    private List<Movie> movies;

    public MovieRecommender() {
        movies = new ArrayList<>();
        movies.add(new Movie("The Shawshank Redemption", "Drama", "English", 9.2));
        movies.add(new Movie("The Godfather", "Crime", "English", 9.2));
        movies.add(new Movie("The Godfather: Part II", "Crime", "English", 9.0));
        movies.add(new Movie("The Dark Knight", "Action", "English", 9.0));
        movies.add(new Movie("12 Angry Men", "Drama", "English", 8.9));
    }

    public List<Movie> getRecommendations(String genre, String language, double rating) {
        List<Movie> recommendations = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getGenre().equals(genre) && movie.getLanguage().equals(language) && movie.getRating() >= rating) {
                recommendations.add(movie);
            }
        }
        return recommendations;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieRecommender recommender = new MovieRecommender();

        System.out.print("Enter preferred genre: ");
        String genre = sc.nextLine();
        System.out.print("Enter preferred language: ");
        String language = sc.nextLine();
        System.out.print("Enter minimum rating: ");
        double rating = sc.nextDouble();

        List<Movie> recommendations = recommender.getRecommendations(genre, language, rating);
        if (recommendations.isEmpty()) {
            System.out.println("No recommendations found");
        } else {
            System.out.println("Recommendations: ");
            for (Movie movie : recommendations) {
                System.out.println(movie.getName());
            }
        }
    }
}