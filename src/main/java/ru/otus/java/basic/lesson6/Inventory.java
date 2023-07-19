package ru.otus.java.basic.lesson6;

public class Inventory {
    private String[] items = new String[5];

    public void clear() {
        for (int i = 0; i < items.length; i++) {
            items[i] = null;
        }
        System.out.println("Выбросили все из сумки");
    }

    public void use(String item) {
        for (int i = 0; i < items.length; i++) {
            if (item.equals(items[i])) {
                items[i] = null;
                if (item.equals("Хлеб")) {
                    System.out.println("Съели хлеб");
                } else if (item.equals("Фонарик")) {
                    System.out.println("Посветили в темноту");
                } else if (item.equals("Кирпич")) {
                    System.out.println("Выбросили в воду");
                } else if (item.equals("Ручка")) {
                    System.out.println("Подписали документ");
                } else if (item.equals("Масло")) {
                    System.out.println("Съели масло без хлеба");
                } else {
                    System.out.println("Я не знаю что это, лучше выбросить..");
                }
                return;
            }
        }
        System.out.println("Невозможно применить предмет: " + item + ". Его просто нет в рюкзаке");
    }

    public void add(String item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("В рюкзак положили предмет: " + item);
                return;
            }
        }
        System.out.println("В рюкзаке нет места для предмета: " + item);
    }

    public void drop(String item) {
        for (int i = 0; i < items.length; i++) {
            if (item.equals(items[i])) {
                items[i] = null;
                System.out.println("Из рюкзака был выброшен предмет: " + item);
                return;
            }
        }
        System.out.println("В рюкзаке нет предмета: " + item);
    }

    public void print() {
        System.out.println("Рюкзак:");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
        System.out.println();
    }
}