package ru.job4j.di;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<String> data = new ArrayList<>();

    public void add(String value) {
        data.add(value);
    }

    public List<String> findAll() {
        return new ArrayList<>(data);
    }
}
