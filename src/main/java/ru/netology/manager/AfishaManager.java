package ru.netology.manager;

import ru.netology.domain.AfishaItem;
import ru.netology.repository.AfishaRepository;

public class AfishaManager {
    private AfishaRepository repository;
    private int numberToPrint;

    public AfishaManager(AfishaRepository repository) {
        this.repository = repository;
        this.numberToPrint = 10;
    }

    public void add(AfishaItem item) {
        repository.save(item);
    }

    public AfishaItem[] getAll() {
        int k = numberToPrint;
        AfishaItem[] items = repository.findAll();
        if (k > items.length) {
            k = items.length;
        }

        AfishaItem[] result = new AfishaItem[k];
        for (int i = 0; i < k; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}
