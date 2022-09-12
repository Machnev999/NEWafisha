package ru.netology.meneger;


import ru.netology.FilmItem;

public class ManagerFilms {

    private FilmItem[] items = new FilmItem[0];  //создаём пустой массив. в который будем складывать значения айтемов
    private int limit = 10; // лимит по выведению колличества фильмов

    // создаем конструтор лимит кол.ва фильмов
    public ManagerFilms() {
    }

    public ManagerFilms(int limit) {
        this.limit = limit;
    }


    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    //добавление фильма в ленту (добавление элемента в массив)
    public void addFilm(FilmItem item) {

        FilmItem[] tmp = new FilmItem[items.length + 1];// создадим новую линию массива
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i]; // перебираем и фиксируем в новый массив тмп
        }
        tmp[tmp.length - 1] = item;// создаем ячейку в массиве для последней переменной
        items = tmp;
    }

    //выводим ленту фильмов — весь массив
    public FilmItem[] findAll() {
        return items;
    }

    //выводим ленту в обратном порядке/ ТЫ ЗАКОНЧИЛ ТУТ
    public FilmItem[] getAll() {
        FilmItem[] items = findAll();
        int resultLength = 0;
        if (items.length <= limit) {
            resultLength = items.length;
        } else {
            resultLength = limit;
        }
        FilmItem[] result = new FilmItem[resultLength];
        for (int i = 0; i < resultLength; i++) {
            if (items.length <= limit) {
            }
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}
