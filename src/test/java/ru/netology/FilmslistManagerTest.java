package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.domain.Filmslist;
import ru.netology.repository.FilmslistRepository;

import static org.mockito.Mockito.doReturn;



class FilmslistManagerTest {
    Filmslist films = new Filmslist();
FilmslistRepository repo = Mockito.mock(FilmslistRepository.class);

FilmslistManager manager1 = new FilmslistManager(repo);
FilmslistRepository repo1 = new FilmslistRepository();
    FilmslistManager manager2 = new FilmslistManager(repo1, 3);

Filmslist film1 = new Filmslist(0,"Film1");
Filmslist film2 = new Filmslist(1,"Film2");
Filmslist film3 = new Filmslist(2,"Film3");
Filmslist film4 = new Filmslist(3,"Film4");
Filmslist film5 = new Filmslist(4,"Film5");
Filmslist film6 = new Filmslist(5, "Film6");

@Test
    public void shouldFindAllFilmsMockTest(){
    Filmslist[] films = {film1, film2, film3};
    doReturn(films).when(repo).getFilms();
    Filmslist [] expected = {film1,film2, film3};
    Filmslist [] actual = manager1.findALl();
    Assertions.assertArrayEquals(expected,actual);
}

@Test
    public void shouldShowReversedFilmsMockTest(){
    Filmslist[] films = {film1, film2, film3, film4, film5, film6};
    doReturn(films).when(repo).getFilms();
    Filmslist[] expected = {film6, film5, film4, film3, film2, film1};
    Filmslist[] actual = manager1.findLast();
    Assertions.assertArrayEquals(expected, actual);
}

@Test
    public void shouldShow3ReversedFilmsTest(){
    manager2.add(film1);
    manager2.add(film2);
    manager2.add(film3);
    manager2.add(film4);
    manager2.add(film5);
    manager2.add(film6);
    Filmslist[] expected = {film6, film5,film4};
    Filmslist[] actual = manager2.findLast();
    Assertions.assertArrayEquals(expected,actual);
}
}