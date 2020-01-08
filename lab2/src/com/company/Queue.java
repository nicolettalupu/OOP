package com.company;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    private int nrOfElements;
    private List<Integer> queue;

    public Queue(int nrOfElements) {
        this.nrOfElements = nrOfElements;
        this.queue =new ArrayList<Integer>();
    }
    public Queue(){
        this.nrOfElements = -1;
        this.queue = new ArrayList<Integer>();
    }
    public void push(int itemToAdd){
        if(this.nrOfElements<0||this.nrOfElements> this.queue.size()){
            this.queue.add(itemToAdd);
        }else{
            System.out.println("Queue is full");
        }
    }
    public void pop(){
        if(this.queue.size()<=0){
            System.out.println("Queue is empty");
        }else{
            this.queue.remove(0);
        }
        this.showQueue();
    }
    public void showQueue(){
        System.out.println("Queue has following elements");
        for(int i=0; i< this.queue.size(); i++){
            System.out.println(this.queue.get(i)+", ");
        }
        if(this.nrOfElements<0){
            System.out.println(" Queue has no limit");
        }else{
            System.out.println(" Maximum nr of elements is : "+this.nrOfElements);
        }
    }
    public boolean isEmpty() {
        if(this.queue.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
    public void isFull() {
        if (this.nrOfElements < 0) {
            System.out.println("Queue is never full");
        } else if (this.nrOfElements > this.queue.size()) {
            System.out.println("The queue is not full");
        } else {
            System.out.println("The queue is full");
        }
    }

}
