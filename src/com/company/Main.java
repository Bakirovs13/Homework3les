package com.company;

public class Main {

    public static void main(String[] args) {

        //ДЗ №3
        //Домашнее задание
        //
        //Создать массив, заполнив его именами людей, элементов массива должно быть 3
        //Создать switch на каждый элемент массива (Но всего в программе должен быть только 1 свитч)
        //Первому человеку программа должна желать доброго утра, второму доброго дня, а третьему доброго вечера.
        //Программа должна поприветствовать всех


        String[] names = {"Mike", "Jack", "Otis"};
        String[] names3 = {names[0], names[1], names[2], "Alex"};

        for (int i = 0; i < names3.length; i++) {

            int name = i;


            switch (name) {

                case 0: {
                    System.out.println("Good morning" + names3[i]);

                    break;

                }
                case 1: {
                    System.out.println("Good day," + names3[i]);
                    break;
                }
                case 2: {
                    System.out.println("Good evening," + names3[i]);
                    break;
                }

                case 3: {
                    System.out.println("Good bye," + names3[i]);
                    break;
                }
            }
        }
    }
}