package lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Demo {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square("#a09542", 2, 2));
        shapes.add(new Rectangle("#f5f6f5", 2, 2, 5));
        shapes.add(new Circle("#f5f6f5", 2, 3));

        for (Shape s : shapes) {

            System.out.println("Name of the shape: " + s.getName());
            System.out.println("Area of the shape: " + s.getArea());
            System.out.println("Border width: " + s.getBorderWidth());
            System.out.println("Hex color: " + s.getHexFillColor());

            System.out.println();
            s.draw();
            System.out.println();

        }


        // Problema 4 - laborator 4
        // numar culori
        List<String> colors = new ArrayList<>();
        for(Shape s: shapes) {
            colors.add(s.getHexFillColor());
        }
        System.out.println("List - colors: " + colors);

        Set<String> mySet = new HashSet<String>(colors);
        for(String x: mySet){
            System.out.println(x + " " + Collections.frequency(colors,x));
        }


    }
}
