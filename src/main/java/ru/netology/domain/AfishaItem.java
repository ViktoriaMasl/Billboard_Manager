package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
public class AfishaItem {
    private int cinemaId;
    private String cinemaUrl;
    private String cinemaName;
    private String cinemaGenre;
}
