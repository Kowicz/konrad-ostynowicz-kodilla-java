package com.kodilla.stream.portfolio;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public final class TaskList {
    private final List<Task> tasks = new LinkedList<>();
    private final String name;

    public TaskList(final String name) {
        this.name = name;
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public boolean removeTask(Task task) {
        return this.tasks.remove(task);
    }

    public List<Task> getTasks() {
        return new LinkedList<>(this.tasks);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "name='" + name + '\'' + ",\n" +
                "tasks=\n" + tasks + "\n" +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        TaskList taskList = (TaskList) object;
        return getName().equals(taskList.getName());
    }
}
