/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jtableenqueue;

/**
 *
 * @author Fernando Maldonado
 */
public class JTableEnqueue {
    int [] queue;
    int rear;
    int front;
    int size;

    public JTableEnqueue(int sizeOfArray){
        queue = new int [sizeOfArray];
        rear = -1;
        front = -1;
        size = 0;
    }
    public boolean isEmpty(){
        boolean response = false;
        if(size == 0){
            response = true;
        }
        return response;
    }
    public boolean enqueue(int element){
        boolean response = false;
        if(rear != queue.length - 1){
            rear++;
            queue[rear] = element;
            size++;
            response = true;
        }
        return response;
    }
    public int dequeue(){
        int response = 0;
        if(size != 0){
            front++;
            response = queue[front];
            size--;
        }
        return response;
    }
    public int peek(){
        int response = 0;
        if(!isEmpty()){
            response = queue[front + 1];
    }
        return response;
    }
    public int getSize(){
        return size;
    }
}

