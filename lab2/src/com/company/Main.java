package com.company;

public class Main {

    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(9);
        Box box3 = new Box(9, 8, 7);
//        System.out.println("Box 3 width = " + box3.width);
        System.out.println("Surface of the box is "+ box1.getSurface());
        System.out.println("Volum of the box is "+ box1.getVolume());

        Queue queue1 = new Queue();
        Queue queue2 = new Queue(2);
        queue1.push(1);
        queue1.push(2);
        queue1.push(3);
        queue1.pop();
        queue1.pop();
        queue1.pop();
        System.out.println("Queue is empty: "+queue1.isEmpty());
        queue1.isFull();


//        queue1.showQueue();
        queue2.push(2);
        queue2.push(8);
        queue2.push(6);
        queue2.pop();
//        queue2.showQueue();
        System.out.println("Queue is empty: "+queue2.isEmpty());
        queue2.isFull();
    }
}
