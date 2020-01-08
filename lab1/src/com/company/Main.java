package com.company;

public class Main {

    public static void main(String[] args) {
        Monitor m1= new Monitor("pink", 12, 13, 14, 22);
        m1.culoare = "blue";
        m1.length = 21;
        m1.width = 20;
        m1.height = 10;
        m1.resolution = 25;

        Monitor m2= new Monitor( "blue", 15, 21, 18, 20);

        System.out.println("\nFirst monitor properties: \nColor: " + m1.culoare + ";\nDimensions: Length " + m1.length + "mm, Width " + m1.width+ "mm, Height " + m1.height + "mm;\nResolution: " + m1.resolution + " * " );

        System.out.println("\nSecond monitor properties: \nColor: " + m2.culoare + ";\nDimensions: Length " + m2.length + "mm, Width " + m2.width + "mm, Height " + m2.height + "mm;\nResolution: " + m2.resolution + " * \n" );

        if (m1.culoare == m2.culoare){
            System.out.println("Both monitors have the same color: " + m1.culoare);
        } else if (m1.culoare != m2.culoare){
            System.out.println("Monitors have different colors.");
        }

        if (m1.length == m2.length && m1.width == m2.width && m1.height == m2.height){
            System.out.println("Both monitors have same dimensions: Length " + m1.length + "mm, Width " + m1.width + "mm, Height " + m1.height + "mm");
        } else if (m1.length != m2.length && m1.width != m2.width && m1.height != m2.height){
            System.out.println("Monitors have different dimensions.");
        }

        if (m1.resolution == m2.resolution ){
            System.out.println("Both monitors have the same resolution: " + m2.resolution + " * ");
        } else if (m1.resolution != m2.resolution ){
            System.out.println("Monitors have different resolutions.");
        }

    }
}
