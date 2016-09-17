package com.dzyoba.alex;

import java.util.List;
import java.util.Random;

public class TestRemove implements Runnable {
    private List<Integer> list;
    private int randomOps;

    public TestRemove(List<Integer> list, int randomOps) {
        this.list = list;
        this.randomOps = randomOps;
    }

    public void run() {
        int index;
        Random randGen = new Random();
        for (int i = 0; i < randomOps; i++) {
            index = randGen.nextInt(list.size());
            list.remove(index);
        }
    }
}
