package com.company;

import java.util.LinkedList;
public class Stack {
    private LinkedList <String> items = new LinkedList<String>();
    public Stack(){
        items = new LinkedList<String>();
    }
    //Добавление элемента в стэк
    public void Push(String value)
    {
        items.addFirst(value);
    }
    //Считывание и удаление последнего элемента
    public String Pop() throws Exception {
        if (items.size() == 0)
        {
            throw new Exception("The stack is empty");
        }
        String result = items.getFirst();
        items.removeFirst();
        return result;
    }
    public boolean isEmpty(){
        return items.isEmpty();
    }
}
