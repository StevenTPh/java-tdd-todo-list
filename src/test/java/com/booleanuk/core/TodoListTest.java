package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void testAdd() {
        TodoList todoList = new TodoList();
        String task = "Wash";
        Assertions.assertTrue(todoList.add(task));
    }

    @Test
    public void testAddExisting() {
        TodoList todoList = new TodoList();
        String task = "Wash";
        String task2 = "Clean";
        Assertions.assertTrue(todoList.add(task));
        Assertions.assertTrue(todoList.add(task2));
        Assertions.assertFalse(todoList.add(task));
    }
}
