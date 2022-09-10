package ru.netology;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.meneger.ManagerFilms;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerFilmsTest {
     ManagerFilms afisha = new ManagerFilms();
     ManagerFilms limitFilms = new ManagerFilms(5);



     FilmItem first = new FilmItem(1, "Бладшот", "боевик");
    FilmItem second = new FilmItem(2, "Вперёд", "мультфильм");
     FilmItem third = new FilmItem(3, "Отель Белград", "комедия");
     FilmItem fourth = new FilmItem(4, "Джентельмены", "боевик");
     FilmItem fifth = new FilmItem(5, "Человек-невидимка", "ужасы");
     FilmItem sixth = new FilmItem(6, "Вечные", "фантастика");
     FilmItem seventh = new FilmItem(7, "Главный герой", "фантастика");
     FilmItem eighth = new FilmItem(8, "Последний богатырь: корень зла", "приключения");
     FilmItem ninth = new FilmItem(9, "Пара из будущего", "комедия");
     FilmItem tenth = new FilmItem(10, "Девятаев", "военный");
     FilmItem eleventh = new FilmItem(11, "После", "драма");

    //проверка добавления фильма
    @Test
    void addFilmTest() {
        //добавляем элементы в массив
        afisha.addFilm(first);
        afisha.addFilm(second);
        afisha.addFilm(third);
        afisha.addFilm(fourth);
        afisha.addFilm(fifth);

        ru.netology.FilmItem[] actual = afisha.findAll();
        ru.netology.FilmItem[] expected = new ru.netology.FilmItem[]{first, second, third, fourth, fifth};

        //проверка ожидаемого и фактического результата
        Assertions.assertArrayEquals(expected,actual);
    }

    //вывод в обратном порядке — фильмов меньше 10
    @Test
    void getAllLess10Test() {
        //добавляем элементы в массив
        afisha.addFilm(first);
        afisha.addFilm(second);
        afisha.addFilm(third);
        afisha.addFilm(fourth);
        afisha.addFilm(fifth);

        FilmItem[] actual = afisha.getAll();
        FilmItem[] expected = new FilmItem[]{fifth, fourth, third, second, first};

        //проверка ожидаемого и фактического результата
        assertArrayEquals(expected, actual);
    }

    //вывод в обратном порядке фильмов больше 10
    @Test
    void getAllMore10Test() {
        //добавляем элементы в массив
        afisha.addFilm(first);
        afisha.addFilm(second);
        afisha.addFilm(third);
        afisha.addFilm(fourth);
        afisha.addFilm(fifth);
        afisha.addFilm(sixth);
        afisha.addFilm(seventh);
        afisha.addFilm(eighth);
        afisha.addFilm(ninth);
        afisha.addFilm(tenth);
        afisha.addFilm(eleventh);

        FilmItem[] actual = afisha.getAll();
        FilmItem[] expected = new FilmItem[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        //проверка ожидаемого и фактического результата
        assertArrayEquals(expected, actual);
    }

    //вывод в обратном порядке используем конструктор (фильмов добавлено больше лимита)
    @Test
    void getAllMoreConstrTest() {

        limitFilms.setLimit(limitFilms.getLimit());

        //добавляем элементы в массив
        limitFilms.addFilm(first);
        limitFilms.addFilm(second);
        limitFilms.addFilm(third);
        limitFilms.addFilm(fourth);
        limitFilms.addFilm(fifth);
        limitFilms.addFilm(sixth);
        limitFilms.addFilm(seventh);

        FilmItem[] actual = limitFilms.getAll();
        FilmItem[] expected = new FilmItem[]{seventh, sixth, fifth, fourth, third};

        //проверка ожидаемого и фактического результата
        assertArrayEquals(expected, actual);
    }

    //вывод в обратном порядке используем конструктор (фильмов добавлено меньше лимита)
    @Test
    void getAllConstrTest() {

        limitFilms.setLimit(limitFilms.getLimit());

        //добавляем элементы в массив
        limitFilms.addFilm(first);
        limitFilms.addFilm(second);
        limitFilms.addFilm(third);
        limitFilms.addFilm(fourth);

        FilmItem[] actual = limitFilms.getAll();
        FilmItem[] expected = new FilmItem[]{fourth, third, second, first};

        //проверка ожидаемого и фактического результата
        assertArrayEquals(expected, actual);
    }

}