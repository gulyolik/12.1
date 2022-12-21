package ru.netology;

import ru.netology.domain.Filmslist;
import ru.netology.repository.FilmslistRepository;
public class FilmslistManager {
    private FilmslistRepository repo;
    int maxNumber;

    public FilmslistManager(FilmslistRepository repo) {
        this.repo = repo;
        this.maxNumber = 10;

    }

    public FilmslistManager(FilmslistRepository repo, int maxNumber){
        this.repo = repo;
        this.maxNumber = maxNumber;
    }

    public void add (Filmslist list){

        repo.save(list);
    }
    public Filmslist[] findALl() {

        return repo.getFilms();
    }

    public Filmslist[] findLast() {
        Filmslist[] all = findALl();
        int resultLength;
        if (all.length <= maxNumber) {
            resultLength = all.length;
        } else {
            resultLength = maxNumber;
        }
        Filmslist[] reversed = new Filmslist[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

}

