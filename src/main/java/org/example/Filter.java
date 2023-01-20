package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Filter implements Interface{
    @Override
    public List<Laptop> getLaptopList() {
        List<Laptop> laptopList = Arrays.asList(
                new Laptop("Lenovo", "Windows 11", 16, 512, "Серый"),
                new Laptop("Huawei", "Windows 11", 16, 1000, "Зеленый"),
                new Laptop("Apple", "MacOS", 8, 512, "Серый"),
                new Laptop("Acer", "Windows 10", 8, 1000, "Черный"),
                new Laptop("Hiper", "Astra Linux", 8, 128, "Черный"));
        return laptopList;
    }

    @Override
    public Map<Integer, String> laptopFilters() {
        Map<Integer, String> filtersList = new HashMap<>();
        filtersList.put(1, "все");
        filtersList.put(2, "все");
        filtersList.put(3, "все");
        filtersList.put(4, "все");
        filtersList.put(5,"все");
        return filtersList;
    }

    static List<Laptop> list = new Filter().getLaptopList();
    static Map<Integer, String> filters = new Filter().laptopFilters();

    static public void showLaptops() {
        for (Laptop laptop : list) {
            boolean suitable = true;
            for (Map.Entry<Integer, String> filter : filters.entrySet()) {

                if (!filter.getValue().equals("все")) {
                    switch (filter.getKey()) {
                        case 1: // размер оперативной памяти
                            if (laptop.getRam() != Integer.parseInt(filter.getValue().split("-")[0])){
                                suitable = false;
                            }
                            break;
                        case 2: // размер жесткого диска
                            if (laptop.getSsd() != Integer.parseInt(filter.getValue().split("-")[0])) {
                                suitable = false;
                            }
                            break;
                        case 3: // операционная система
                            if (!laptop.getOpSystem().equals(filter.getValue())) {
                                suitable = false;
                            }
                            break;
                        case 4: // цвет
                            if (!laptop.getColor().equals(filter.getValue())) {
                                suitable = false;
                            }
                            break;
                        case 5: // производитель
                            if (!laptop.getName().equals(filter.getValue())){
                                suitable = false;
                            }
                            break;
                    }
                }
                if (!suitable) break;
            }
            if (suitable) {
                System.out.println("----------------");
                System.out.println(laptop);
            }
        }
    }

    static String getFilters(int key) {
        return filters.get(key);
    }

    static void changeFilter(int key, String value) {
        filters.put(key, value);
    }
}
