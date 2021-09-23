package com.csc205.project2;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ThreeDimensionalShape sphere = new Sphere(4.0);
        ThreeDimensionalShape cube = new Cube(5.0);
        ThreeDimensionalShape cylinder = new Cylinder(6.0, 3.0);
        ThreeDimensionalShape cone = new Cone(3.0, 6.0);

        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);
        shapes.add(cone);

        shapes.forEach(System.out::println);

    }
}