package movies;

public class Movie {
    private String name;
    private String category;
    private String[] genre ={"drama", "musical", "scifi"};

    public String getCategory(){
        return category;
    }

    public String getName(){
        return name;
    }

    public Movie(String movieName, String movieCat) {
        name = movieName;
        category = movieCat;
    }
}
