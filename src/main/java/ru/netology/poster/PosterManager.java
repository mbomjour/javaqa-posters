package ru.netology.poster;

public class PosterManager {
    private Poster[] posters = new Poster[0];
    private int defaultLast = 5;

    public PosterManager(int defaultLast) {
        this.defaultLast = defaultLast;
    }

    public PosterManager() {
    }

    public void add(Poster poster) {
        Poster[] tmp = new Poster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public Poster[] findAll() {
        return posters;
    }

    public Poster[] findLast() {
        int resultLength;
        if (defaultLast < posters.length) {
            resultLength = defaultLast;
        } else {
            resultLength = posters.length;
        }
        Poster[] tmp = new Poster[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = posters[posters.length - 1 - i];
        }
        return tmp;
    }
}
