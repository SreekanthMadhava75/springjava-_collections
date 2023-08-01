package com.example.demo.pqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueUserDefinedObjectExample {




	static class Task {
        private int priority;
        private String description;

        public Task(int priority, String description) {
            this.priority = priority;
            this.description = description;
        }

        public int getPriority() {
            return priority;
        }

        public String getDescription() {
            return description;
        }
    }

    private Comparator<Task> priorityComparator = new Comparator<Task>() {
        @Override
        public int compare(Task o1, Task o2) {
            return o1.getPriority() - o2.getPriority();
        }
    };

    // Create a PriorityQueue with the custom comparator
    private PriorityQueue<Task> taskQueue = new PriorityQueue<>(priorityComparator);

    public void addTask(int priority, String description) {
        Task newTask = new Task(priority, description);
        taskQueue.add(newTask);
    }

    public void addTasks() {
        addTask(2, "Do the laundry");
        addTask(1, "Buy groceries");
        addTask(3, "Write a report");
    }

    public void removeItem() {
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println("Priority: " + task.getPriority() + ", Description: " + task.getDescription());
        }
    }
}
