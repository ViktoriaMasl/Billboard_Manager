package ru.netology.manager;

import ru.netology.domain.AfishaItem;

public class AfishaManager {
    private AfishaItem[] items = new AfishaItem[0];
    private int numberToPrint;

    public AfishaManager(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }

    public void add(AfishaItem item) {
        int length = items.length + 1;
        AfishaItem[] tmp = new AfishaItem[length];
//        for (int i = 0; i < items.length; i++) {
//            tmp[i] = items[i];
//        }
        System.arraycopy(items, 0, tmp, 0, items.length);
//        int lastIndex = tmp.length - 1;
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public AfishaItem[] getAll() {
        int k = numberToPrint;
        if (items.length < numberToPrint) {
            k = items.length;
        }
        AfishaItem[] result = new AfishaItem[k];

        for (int i = 0; i < k; i++) {
            int index = items.length - 1 - i;
            result[i] = items[index];
        }
        return result;
    }
}
