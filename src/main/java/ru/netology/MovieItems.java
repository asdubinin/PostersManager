package ru.netology;

public class MovieItems {
    private int id;
    private String movieName;
    private String genreMovie;
    private boolean premiere;

    public MovieItems(int id, String movieName, String genreMovie, boolean premiere) {
        this.id = id;
        this.movieName = movieName;
        this.genreMovie = genreMovie;
        this.premiere = premiere;
    }

}
