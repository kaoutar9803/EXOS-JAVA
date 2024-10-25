package org.example;
import java.util.Scanner;
import java.util.Stack;

public class Exercice31 {
    public static void rotate(Stack<Integer> stack, int positions) {
        if (stack.isEmpty() || positions <= 0) {
            return;
        }

        int size = stack.size();
        positions = positions % size;

        Stack<Integer> tempStack = new Stack<>();

        for (int i = 0; i < size; i++) {
            tempStack.push(stack.pop());
        }

        for (int i = 0; i < size; i++) {
            if (i < positions) {
                stack.push(tempStack.get(size - 1 - i));
            } else {
                stack.push(tempStack.get(size - 1 - (i - positions)));
            }
        }
    }

    public static void displayStack(Stack<Integer> stack) {
        for (int item : stack) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

}
