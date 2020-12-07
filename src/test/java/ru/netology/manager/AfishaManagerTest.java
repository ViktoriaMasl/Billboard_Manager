package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.AfishaItem;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {
    AfishaManager manager = new AfishaManager(10);

    @Test
    void shouldAdd() {
     AfishaItem first = new AfishaItem(1, "https://1.ru", "Cinema1", "horror" );
     AfishaItem second = new AfishaItem(2, "https://2.ru", "Cinema2", "fantasy" );
     AfishaItem third = new AfishaItem(3, "https://3.ru", "Cinema3", "drama" );
     AfishaItem fourth = new AfishaItem(4, "https://4.ru", "Cinema4", "comedy" );
     manager.add(first);
     manager.add(second);
     manager.add(third);
     manager.add(fourth);

     AfishaItem[] actual = manager.getAll();
     AfishaItem[] expected = new AfishaItem[]{fourth, third, second, first};

     assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAddWhenMoreThanTen() {
        AfishaItem first = new AfishaItem(1, "https://1.ru", "Cinema1", "horror" );
        AfishaItem second = new AfishaItem(2, "https://2.ru", "Cinema2", "fantasy" );
        AfishaItem third = new AfishaItem(3, "https://3.ru", "Cinema3", "drama" );
        AfishaItem fourth = new AfishaItem(4, "https://4.ru", "Cinema4", "comedy" );
        AfishaItem fifth  = new AfishaItem(5, "https://5.ru", "Cinema5", "feature film" );
        AfishaItem sixth  = new AfishaItem(6, "https://6.ru", "Cinema6", "fantasy" );
        AfishaItem seventh = new AfishaItem(7, "https://7.ru", "Cinema7", "crime" );
        AfishaItem eighth  = new AfishaItem(8, "https://8.ru", "Cinema8", "action" );
        AfishaItem ninth  = new AfishaItem(9, "https://9.ru", "Cinema9", "animation" );
        AfishaItem tenth  = new AfishaItem(10, "https://10.ru", "Cinema10", "family" );
        AfishaItem eleventh  = new AfishaItem(11, "https://11.ru", "Cinema11", "drama" );
        AfishaItem twelfth  = new AfishaItem(12, "https://12.ru", "Cinema12", "musical" );
        AfishaItem thirteen  = new AfishaItem(13, "https://13.ru", "Cinema13", "post-apocalyptic" );
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);
        manager.add(thirteen);

        AfishaItem[] actual = manager.getAll();
        AfishaItem[] expected = new AfishaItem[]{thirteen, twelfth, eleventh, tenth, ninth,eighth, seventh, sixth, fifth, fourth};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldEmptyAfisha() {
        AfishaItem[] actual = manager.getAll();
        AfishaItem[] expected = new AfishaItem[0];

        assertArrayEquals(expected, actual);
    }
}