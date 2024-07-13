package com.company;
import java.util.*;

public class switch_on_java_solution {
    public static int countLightSwitches(int[] entryTimes, int[] exitTimes) {
        int n = entryTimes.length;

        // store all entries into one array
        int[] events = new int[2 * n];

        // Combine entry and exit times into a single array of events
        for (int i = 0; i < n; i++) {
            events[i] = entryTimes[i];
            events[i + n] = exitTimes[i];
        }

        // Sort the events array in ascending order
        Arrays.sort(events);

        int count = 0;  // Number of times the lights get switched on
        int peopleInRoom = 0;

        for (int i = 0; i < 2 * n; i++) {
            if (Arrays.binarySearch(entryTimes, events[i]) >= 0) {
                if (peopleInRoom == 0) {
                    count++;
                }
                peopleInRoom++;
            } else {
                peopleInRoom--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of people in the gym: ");
        int numberOfPeople = scan.nextInt();

        // store the entry and exit time of the person
        int[] entryTimes = new int[numberOfPeople];
        int[] exitTimes = new int[numberOfPeople];

        for (int i = 0; i < numberOfPeople; i++) {
            System.out.print("Enter the entry and exit time: ");
            entryTimes[i] = scan.nextInt();
            exitTimes[i] = scan.nextInt();
        }

        int switches = countLightSwitches(entryTimes, exitTimes);
        System.out.println("Number of times the lights get switched on: " + switches);
    }
    }


