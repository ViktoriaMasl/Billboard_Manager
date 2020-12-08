package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.AfishaItem;


import static org.junit.jupiter.api.Assertions.*;

class AfishaRepositoryTest {
    private AfishaRepository repository = new AfishaRepository();
    AfishaItem first = new AfishaItem(1, "https://1.ru", "Cinema1", "horror");
    AfishaItem second = new AfishaItem(2, "https://2.ru", "Cinema2", "fantasy");
    AfishaItem third = new AfishaItem(3, "https://3.ru", "Cinema3", "drama");
    AfishaItem fourth = new AfishaItem(4, "https://4.ru", "Cinema4", "comedy");
    AfishaItem fifth = new AfishaItem(5, "https://5.ru", "Cinema5", "feature film");
    AfishaItem sixth = new AfishaItem(6, "https://6.ru", "Cinema6", "fantasy");
    AfishaItem seventh = new AfishaItem(7, "https://7.ru", "Cinema7", "crime");

    @BeforeEach
    public void setUp() {
        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(fourth);
        repository.save(fifth);
        repository.save(sixth);
        repository.save(seventh);
    }


    @Test
    void shouldFindAll() {
        assertArrayEquals(new AfishaItem[]{first, second, third, fourth, fifth, sixth, seventh}, repository.findAll());
    }

    @Test
    void shouldSave() {
        AfishaItem eighth = new AfishaItem(8, "https://8.ru", "Cinema8", "action");
        repository.save(eighth);
        assertArrayEquals(new AfishaItem[]{first, second, third, fourth, fifth, sixth, seventh, eighth}, repository.findAll());
    }

    @Test
    void shouldFindById() {
        assertEquals(third, repository.findById(3));
        assertEquals(fifth, repository.findById(5));
        assertEquals(seventh, repository.findById(7));
        assertEquals(null, repository.findById(15));
    }

    @Test
    void removeById() {
        int idForRemove = 2;
        repository.removeById(idForRemove);

        assertArrayEquals(new AfishaItem[]{first, third, fourth, fifth, sixth, seventh}, repository.findAll());
    }

    @Test
    void removeAll() {
        repository.removeAll();
        assertArrayEquals(new AfishaItem[]{}, repository.findAll());
    }
}