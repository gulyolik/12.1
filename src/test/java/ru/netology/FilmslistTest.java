package ru.netology;

import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;


public class FilmslistTest {

    String[] films = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8", "film9", "film10"};

    @Test
    public void shouldCheckIfFilmsSaved() {
        Filmslist list = new Filmslist();
        list.save("film1");
        list.save("film2");
        list.save("film3");
        list.save("film4");
        list.save("film5");
        list.save("film6");
        list.save("film7");
        list.save("film8");
        list.save("film9");
        list.save("film10");
        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8", "film9", "film10"};
        String[] actual = list.getFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneMoreFilm() {
        Filmslist list = new Filmslist();
        String newFilm = "film11";
        list.save("film1");
        list.save("film2");
        list.save("film3");
        list.save("film4");
        list.save("film5");
        list.save("film6");
        list.save("film7");
        list.save("film8");
        list.save("film9");
        list.save("film10");
        list.save("film11");
        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8", "film9", "film10", "film11"};
        String[] actual = list.getFilms();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowFilmsInReversTurn() {
        Filmslist list = new Filmslist();
        list.save("film1");
        list.save("film2");
        list.save("film3");
        list.save("film4");
        list.save("film5");
        list.save("film6");
        list.save("film7");
        list.save("film8");
        list.save("film9");
        list.save("film10");
        String[] expected = {"film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};
        String[] actual = list.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowLast10Films() {
        Filmslist list = new Filmslist();
        list.save("film1");
        list.save("film2");
        list.save("film3");
        list.save("film4");
        list.save("film5");
        list.save("film6");
        list.save("film7");
        list.save("film8");
        list.save("film9");
        list.save("film10");
        String[] expected = {"film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};
        String[] actual = list.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLast5Films() {
        Filmslist list = new Filmslist(5);
        list.save("film1");
        list.save("film2");
        list.save("film3");
        list.save("film4");
        list.save("film5");
        list.save("film6");
        list.save("film7");
        list.save("film8");
        list.save("film9");
        list.save("film10");
        String[] expected = {"film10", "film9", "film8", "film7", "film6"};
        String[] actual = list.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowLast11Films() {
        Filmslist list = new Filmslist(11);
        list.save("film1");
        list.save("film2");
        list.save("film3");
        list.save("film4");
        list.save("film5");
        list.save("film6");
        list.save("film7");
        list.save("film8");
        list.save("film9");
        list.save("film10");
        list.save("film11");
        String[] expected = {"film11", "film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};
        String[] actual = list.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}