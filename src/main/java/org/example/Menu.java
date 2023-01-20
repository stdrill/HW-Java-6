package org.example;

import java.util.Scanner;

public class Menu {
    static void showMenu() {
        boolean end = false;
        Scanner scanner = new Scanner(System.in);
        while (!end) {
            System.out.println("Изменить фильтр поиска? (1 - да, 2 - нет, 0 - выход)");
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    outputFilters(scanner);
                    break;
                case 2:
                    Filter.showLaptops();
                    break;
                case 0:
                    end = true;
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }

    static void outputFilters(Scanner scanner) {
        int variant = 0;
        while (variant != 6) {
            System.out.println("\nВыберите критерий фильтра");
            System.out.printf(
                    "1 - оперативная память(%s) ГБ\n2 - размер жесткого диска(%s) ГБ\n3 - операционная система(%s)" +
                            "\n4 - цвет(%s)\n5 - производитель(%s) \n6 - показать товары\nВведите номер: ",
                    Filter.getFilters(1), Filter.getFilters(2), Filter.getFilters(3), Filter.getFilters(4),Filter.getFilters(5));
            variant = scanner.nextInt();
            changeFilter(scanner, variant);
        }
        // когда variant равен 5
        Filter.showLaptops();
    }

    static void changeFilter(Scanner scanner, int num) {
        int size;
        switch (num) {
            case 1:
                System.out.printf(
                        "Выберите размер оперативной памяти\n1 - 8 ГБ\n2 - 16 ГБ\n3 - Все\nВведите номер: ");
                size = scanner.nextInt();
                if (size == 1) {
                    Filter.changeFilter(1, "8");
                } else if (size == 2) {
                    Filter.changeFilter(1, "16");
                } else if (size == 3) {
                    Filter.changeFilter(1, "все");
                }
                break;
            case 2:
                System.out.printf(
                        "Выберите размер жесткого диска\n1 - 128 ГБ\n2 - 512 ГБ \n3 - 1000 ТБ\n4 - Все\nВведите номер: ");
                size = scanner.nextInt();
                if (size == 1) {
                    Filter.changeFilter(2, "128");
                } else if (size == 2) {
                    Filter.changeFilter(2, "512");
                } else if (size == 3) {
                    Filter.changeFilter(2, "1000");
                } else if (size == 4) {
                    Filter.changeFilter(2, "все");
                }
                break;
            case 3:
                System.out.printf(
                        "Выберите операционную систему\n1 - Windows 10\n2 - Windows 11\n3 - MacOS\n4 - Astra Linux\n5 - Все\nВведите номер: ");
                size = scanner.nextInt();
                if (size == 1) {
                    Filter.changeFilter(3, "Windows 10");
                } else if (size == 2) {
                    Filter.changeFilter(3, "Windows 11");
                } else if (size == 3) {
                    Filter.changeFilter(3, "MacOS");
                } else if (size == 4) {
                    Filter.changeFilter(3, "Astra Linux");
                } else if (size == 5) {
                    Filter.changeFilter(3, "все");
                }
                break;
            case 4:
                System.out.printf(
                        "Выберите цвет\n1 - Черный\n2 - Серый\n3 - Зеленый\n4 - Все\nВведите номер: ");
                size = scanner.nextInt();
                if (size == 1) {
                    Filter.changeFilter(4, "Черный");
                } else if (size == 2) {
                    Filter.changeFilter(4, "Серый");
                } else if (size == 3) {
                    Filter.changeFilter(4, "Зеленый");
                } else if (size == 4) {
                    Filter.changeFilter(4, "все");
                }
                break;
            case 5:
                System.out.printf(
                        "Выберите производителя\n1 - Lenovo\n2 - Huawei\n3 - Apple\n4 - Acer\n5 - Hiper\n6 - Все\nВведите номер: ");
                size = scanner.nextInt();
                if (size == 1) {
                    Filter.changeFilter(5, "Lenovo");
                } else if (size == 2) {
                    Filter.changeFilter(5, "Huawei");
                } else if (size == 3) {
                    Filter.changeFilter(5, "Apple");
                } else if (size == 4) {
                    Filter.changeFilter(5, "Acer");
                }else if (size == 5) {
                    Filter.changeFilter(5, "Hiper");
                }else if (size == 6) {
                    Filter.changeFilter(5, "все");
                }
            default:
                break;
        }
    }

}
