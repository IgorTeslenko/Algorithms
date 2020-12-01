package homework2;

import homework2.utils.MyArrayList;

import java.util.Comparator;
import java.util.Random;

public class Main {

    public static final int LIST_SIZE = 1_000_000;

    public static void main(String[] args) throws InterruptedException {

        Random rnd = new Random();

        MyArrayList<Integer> list0 = new MyArrayList<>();

        for (int i = 0; i < LIST_SIZE; i++) {
            list0.add(rnd.nextInt(1000));
        }

        MyArrayList<Integer> list1 = new MyArrayList<>();
        MyArrayList<Integer> list2 = new MyArrayList<>();

        for (int i = 0; i < list0.size(); i++) {
            list1.add(list0.get(i));
            list2.add(list0.get(i));
        }

        Thread selection = new Thread(() -> {
            long begin = System.currentTimeMillis();
            list0.selectionSort(Comparator.reverseOrder());
            long end = System.currentTimeMillis();
            System.out.printf("selectionSort: %d%n", end - begin);
        });

        Thread inserting = new Thread(() -> {
            long begin = System.currentTimeMillis();
            list1.insertionSort(Comparator.reverseOrder());
            long end = System.currentTimeMillis();
            System.out.printf("insertionSort: %d%n", end - begin);
        });

        Thread bubble = new Thread(() -> {
            long begin = System.currentTimeMillis();
            list2.bubbleSort(Comparator.reverseOrder());
            long end = System.currentTimeMillis();
            System.out.printf("bubbleSort: %d%n", end - begin);
        });

        selection.start();
        inserting.start();
        bubble.start();

        selection.join();
        inserting.join();
        bubble.join();
    }
}
