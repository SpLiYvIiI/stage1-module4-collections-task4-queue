package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> res = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }
        int i = 1;
        while (!queue.isEmpty()) {
            int curr = queue.remove();
            if (i % everyDishNumberToEat != 0) {
                queue.add(curr);
                i++;
            } else {
                res.add(curr);
                i = 1;
            }
        }
        return res;
    }
}
