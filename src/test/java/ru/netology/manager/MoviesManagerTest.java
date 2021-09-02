package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MoviesInfo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoviesManagerTest {
    MoviesInfo first = new MoviesInfo(1, "Бладшот", "боевик", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png?raw=true");
    MoviesInfo second = new MoviesInfo(2, "Вперёд", "мультфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png?raw=true");
    MoviesInfo third = new MoviesInfo(3, "Отель Белград", "комедия", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png?raw=true");
    MoviesInfo fourth = new MoviesInfo(4, "Джентельмены", "боевик", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png?raw=true");
    MoviesInfo fifth = new MoviesInfo(5, "Человек-невидимка", "ужасы", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png?raw=true");
    MoviesInfo sixth = new MoviesInfo(6, "Тролли.Мировой тур", "мультильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png?raw=true");
    MoviesInfo seventh = new MoviesInfo(7, "Номер один", "комедия", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png?raw=true");
    MoviesInfo the8th = new MoviesInfo(8, "Шрек", "мультфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png?raw=true");
    MoviesInfo ninth = new MoviesInfo(9, "Перелом", "триллер", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png?raw=true");
    MoviesInfo tenth = new MoviesInfo(10, "Форсаж", "боевик", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png?raw=true");
    MoviesInfo theEleventh = new MoviesInfo(11, "Шрек 3", "боевик", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png?raw=true");


    @Test
    public void shouldAddMovies() {
        MoviesManager manager = new MoviesManager();

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(the8th);
        manager.add(ninth);
        manager.add(tenth);

        MoviesInfo[] actual = manager.getAll();
        MoviesInfo[] expected = new MoviesInfo[]{tenth, ninth, the8th, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldListOfTenMovies() {
        MoviesManager manager = new MoviesManager();

        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(the8th);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(theEleventh);

        MoviesInfo[] actual = manager.getAll();
        MoviesInfo[] expected = new MoviesInfo[]{theEleventh, tenth, ninth, the8th, seventh, sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMore10Movies() {
        MoviesManager manager = new MoviesManager(10);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(the8th);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(theEleventh);


        MoviesInfo[] expected = new MoviesInfo[]{theEleventh, tenth, ninth, the8th, seventh, sixth, fifth, fourth, third, second};

        MoviesInfo[] actual = manager.getLast10Movies();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldIn10Movies() {
        MoviesManager manager = new MoviesManager(10);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(the8th);
        manager.add(ninth);
        manager.add(tenth);


        MoviesInfo[] expected = new MoviesInfo[]{tenth, ninth, the8th, seventh, sixth, fifth, fourth, third, second, first};

        MoviesInfo[] actual = manager.getLast10Movies();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldInLess10Movies() {
        MoviesManager manager = new MoviesManager(10);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(the8th);


        MoviesInfo[] expected = new MoviesInfo[]{the8th, seventh, sixth, fifth, fourth, third, second, first};

        MoviesInfo[] actual = manager.getLast10Movies();

        assertArrayEquals(expected, actual);

    }
}