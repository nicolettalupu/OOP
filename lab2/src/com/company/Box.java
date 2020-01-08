package com.company;

public class Box {
    private int height;
    private int width;
    private int depth;

    public Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    public Box(){
        this(1,1,1);
    }

    public Box(float initValue) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    public double getSurface(){
        float surface = 2*this.depth+2*this.width+2*this.height;
        return surface;
    }
    public double getVolume(){
        float volume = this.depth * this.height * this.width;
        return volume;
    }

}
