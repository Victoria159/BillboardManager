package ru.netology.manager;

import ru.netology.domain.MoviesInfo;

public class MoviesManager {
    private MoviesInfo[] movies = new MoviesInfo[0];
    private int numbersOfMovies = 10;

    public MoviesManager(int numbersOfMovies) {
        this.numbersOfMovies = numbersOfMovies;
    }

    public MoviesManager() {
    }

    public void add(MoviesInfo movie) {

        int length = movies.length + 1;
        MoviesInfo[] tmp = new MoviesInfo[length];

        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public MoviesInfo[] getAll() {
        MoviesInfo[] result = new MoviesInfo[movies.length];
        for (int i = 0; i < movies.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

    public MoviesInfo[] getLast10Movies() {
        int resultLength;
        if (movies.length < numbersOfMovies) {
            resultLength = movies.length;
        } else {
            resultLength = numbersOfMovies;
        }
        MoviesInfo[] result = new MoviesInfo[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = movies.length - 1 - i;
            result[i] = movies[index];
        }
        return result;
    }
}

