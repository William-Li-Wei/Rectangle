package com.william;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // create two rectangles based on user input
        RectangleFactory rectangleFactory = new RectangleFactory();
        Rectangle rectangle1;
        Rectangle rectangle2;
        Boolean intersect;

        rectangle1 = rectangleFactory.getRectangle();
        rectangle2 = rectangleFactory.getRectangle();

        if(rectangle1 == null) {
            System.out.println("Invalid input for rectangle 1.");
        }
        if(rectangle2 == null) {
            System.out.println("Invalid input for rectangle 2.");
        }

        // only check intersections of two valid rectangles
        if(rectangle1 != null && rectangle2 != null) {
            intersect = rectangle1.intersects(rectangle2);
            System.out.println("Rectangle 1 " + (intersect ? "intersects " : "does not intersect ") + "with rectangle 2");
        } else {
            System.out.println("Test Stopped.");
        }
    }
}
