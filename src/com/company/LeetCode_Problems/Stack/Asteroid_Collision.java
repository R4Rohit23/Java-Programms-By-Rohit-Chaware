package com.company.LeetCode_Problems.Stack;
// We are given an array asteroids of integers representing asteroids in a row.
// For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning
// right, negative meaning left). Each asteroid moves at the same speed.
// Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If
// both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

// ALGORITHM
// (1) Iterate over the asteroids from left to right; for each asteroid do the following:
// i. Initialize a boolean flag to true. We will use this flag later to determine if we should store this asteroid in
// the stack or if it will explode.
// ii. If there is an asteroid in the stack and the asteroid on the top of the stack can collide with this asteroid,
// then we have some options here.
//      a. If the `asteroid` is bigger than the asteroid on the top, then this asteroid on the top will explode, and we
//          will pop it from the stack.
//      b. If the `asteroid` has the same size as the asteroid on the top, then both will explode. Hence we will pop it
//           from the stack; also, we will mark `flag` as `false` because this `asteroid` will also explode, and
//           hence we won't save it into the stack.
//      c. If the `asteroid` is smaller than the asteroid on the top, then the asteroid on the top will not explode, so
//          we will not pop it. But the `asteroid` will explode and thus we will mark `flag` as `false`.
// iii. If flag is true, add the asteroid to the stack.
// (2) Add the asteroids from the stack into the list remainingAsteroids in the reverse order.
// (3) Return remainingAsteroids.

import java.util.Stack;

public class Asteroid_Collision {
    public static int[] checkCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid: asteroids) {
            boolean flag = true;

            // while there are asteroids moving in opposite direction
            while (!stack.isEmpty() && stack.peek() > 0 && asteroid < 0) {
                // If the top asteroid in the stack is smaller, then it will explode.
                // Hence, pop it from the stack, also continue with the next asteroid in the stack.
                if (Math.abs(stack.peek()) < Math.abs(asteroid)) {
                    stack.pop();
                    continue;
                }
                // If both asteroids have the same size, then both asteroids will explode.
                // Pop the asteroid from the stack; also, we won't push the current asteroid to the stack.
                else if (Math.abs(stack.peek()) == Math.abs(asteroid)) {
                    stack.pop();
                }
                // If we reach here, the current asteroid will be destroyed
                // Hence, we should not add it to the stack
                flag = false;
                break;
            }
            if (flag) {
                stack.push(asteroid);
            }
        }
        int[] remainingAsteroids = new int[stack.size()];
        for (int i = remainingAsteroids.length - 1; i >= 0; i--) {
            remainingAsteroids[i] = stack.peek();
            stack.pop();
        }

        return remainingAsteroids;
    }
    public static void main(String[] args) {
        int[] asteroids = {10, 2, -5};
        int[] ans = checkCollision(asteroids);
        for (int i: ans) {
            System.out.print(i + " ");
        }
    }
}
