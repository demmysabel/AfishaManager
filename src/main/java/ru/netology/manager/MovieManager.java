package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieManager {
    private Movie[] movies = new Movie[0];
    private int countMovies;

    public MovieManager(int countMovies) {
        this.countMovies = countMovies;
    }

    public MovieManager() {
        this.countMovies = 10;
    }

    public void addMovie(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movie[] findAll() {
        return movies;
    }


    public Movie[] findLast() {
        int resultLength;
        if (countMovies < movies.length) {
            resultLength = countMovies;
        } else {
            resultLength = movies.length;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}



