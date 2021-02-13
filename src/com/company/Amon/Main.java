/*
Benton Amon
Project 1
Creates a list of tasks that can be added to, remove and edit entries, display the list,
and exit using an Array List.
 */


package com.company.Amon;

import java.util.Scanner;
import java.util.*;

public class Main {

    // Functions

    // Menu
    static void menu() {
        System.out.println("Please choose an option:");
        System.out.println("(1) Add a task.");
        System.out.println("(2) Remove a task.");
        System.out.println("(3) Update a task.");
        System.out.println("(4) List all tasks.");
        System.out.println("(0) Exit.");
    }

    // Add a Task
    static ArrayList<String> addATask(ArrayList<String> a) {
        Scanner input = new Scanner(System.in);
        System.out.println("What task would you like to add?");
        String userInput = input.nextLine();
        a.add(userInput);
        return a;
    }

    // Remove a Task
    static ArrayList<String> removeTask(ArrayList<String> a) {

        int b;
        Scanner input = new Scanner(System.in);

        System.out.println("What task would you like to remove?");
        b = input.nextInt();
        a.remove(b);
        return a;
    }

    // Update a Task
    static ArrayList<String> updateTask(ArrayList<String> x) {
        int a;
        String editTask;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an index value of task to update: ");
        a = input.nextInt();
        System.out.println("What would you like this task to say?");
        editTask = input.next();
        x.set(a, editTask);
        return x;
    }

    // Displays All Tasks
    static void displayAllTasks(ArrayList<String> taskList) {
        /*for(String a:taskList) {
            System.out.println(a);
        } */
        int i = 0;
        for (String a:taskList) {
            System.out.println(i + ": " + a);
            i++;
        }
    }

    // Exit the Program
    static void exitProgram() {
        System.exit(0);
    }

    // ------------------

    // Program Begins
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare and Initialize
        int task = -1;

        // Create Array List
        ArrayList<String> taskList = new ArrayList<>();

        // Loop
        while(task != 0) {
            menu();
            task = input.nextInt();

            switch (task) {
                case 1:
                    addATask(taskList);
                    break;
                case 2:
                    removeTask(taskList);
                    break;
                case 3:
                    updateTask(taskList);
                    break;
                case 4:
                    displayAllTasks(taskList);
                    break;
                case 0:
                    exitProgram();
                    break;
                default:
                    System.out.println("Please enter a valid option.");
                    break;
            }
       }






    }
}
