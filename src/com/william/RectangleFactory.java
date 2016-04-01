package com.william;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by william on 01.04.16.
 */
public class RectangleFactory {
    private final static Logger LOGGER = Logger.getLogger(RectangleFactory.class.getName());

    public Rectangle getRectangle() {
        Rectangle rectangle = null;

        // create a scanner so we can read the command-line input
        Scanner scanner = new Scanner(System.in);

        // prompt for the rectangle's parameters
        try {
            System.out.print("The x coordinate of the upper-left corner of the Rectangle: ");
            int x = scanner.nextInt();
            System.out.print("The y coordinate of the upper-left corner of the Rectangle: ");
            int y = scanner.nextInt();
            System.out.print("The width of the Rectangle: ");
            int width = scanner.nextInt();
            System.out.print("The height of the Rectangle: ");
            int height = scanner.nextInt();

            rectangle = new Rectangle(x, y, width, height);
        } catch (InputMismatchException e) {
            LOGGER.log(Level.SEVERE, "Error occur in parameter input.", e);
            return null;
        }

        return rectangle;
    }
}
