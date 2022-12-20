package ru.netology;


public class Filmslist {
    private String[] films = new String[0];
    int maxFilms;

    public Filmslist(int maxFilms) {
        this.maxFilms = maxFilms;
    }

    public Filmslist() {
        this.maxFilms = 10;
    }

    public void save(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] getFilms() {

        return films;
    }

    public String[] findLast() {
        String[] all = getFilms();
        int resultLength;
        if (all.length <= maxFilms) {
            resultLength = all.length;
        } else {
            resultLength = maxFilms;
        }
        String[] reversed = new String[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

}

