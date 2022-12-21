package ru.netology.repository;


import ru.netology.domain.Filmslist;

public class FilmslistRepository {
    private Filmslist[] films = new Filmslist[0];


    public void save(Filmslist film) {
        Filmslist[] tmp = new Filmslist[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Filmslist[] getFilms() {

        return films;
    }
    
    public int findById(int id){
        Filmslist[] tmp = new Filmslist[films.length -1];
        int copyToIndex = 0;
        for(Filmslist film: films){
            if(film.getId()!=id){
                copyToIndex++;
            }else{
                return copyToIndex;
            }
       }

        return copyToIndex;
    }

    public void removeById(int id){
            Filmslist[] tmp = new Filmslist[films.length -1];
            int copyToIndex = 0;
            for(Filmslist film: films){
                if(film.getId()!=id){
                    tmp[copyToIndex] = film;
                    copyToIndex++;
                }
            }
            films = tmp;
    }

    public void deleteAllFilms() {
        Filmslist[]tmp = new Filmslist[0];
        films = tmp;
    }

}

