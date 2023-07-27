package kz.bitlab.springboot.task11.controller;

import kz.bitlab.springboot.task11.db.Items;

import java.util.ArrayList;

public class DBManager {

    private static final ArrayList<Items> items = new ArrayList<>();
    private static Long id = 7L;

    static {
        items.add(new Items(1L, "Mac Book Pro", "8 GB RAM 256 GB SSD Intel Core i7", 1199.99));
        items.add(new Items(2L, "Mac Book Pro", "16 GB RAM 500 GB SSD Apple M1", 1499.99));
        items.add(new Items(3L, "Mac Book Pro", "16 GB RAM 1 TB SSD Apple M1", 1799.99));
        items.add(new Items(4L, "ASUS TUF GAMING", "16 GB RAM 500 GB SSD Intel Core i7", 1299.99));
        items.add(new Items(5L, "HP Laser Pro", "8 GB RAM 500 GB SSD Intel Core i5", 999.99));
        items.add(new Items(6L, "Lenovo Legion", "32 GB RAM 512 GB SSD Intel Core i7", 1399.99));
    }

    public static ArrayList<Items> getItems() {
        return items;
    }

    public static void addItem(Items item) {
        item.setId(id);
        id++;
        items.add(item);
    }

}
