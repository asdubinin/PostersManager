package ru.netology;

public class PostersManager {
    private int lastMovies = 10;
    private MovieItems[] items = new MovieItems[0];

    public MovieItems[] save(MovieItems item) {
        MovieItems[] tmp = new MovieItems[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
        return tmp;
    }

    public MovieItems[] findAll() {
        return items;
    }

    public PostersManager() {

    }
    public PostersManager(int lastMovies) {
        this.lastMovies = lastMovies;
    }

    public MovieItems[] findLast() {
        int resultLength;
        if (items.length > lastMovies) {
            resultLength = lastMovies;
        } else {
            resultLength = items.length;
        }
    MovieItems[] result = new MovieItems[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = items[items.length - 1 - i];
        }
        return result;
    }

}


