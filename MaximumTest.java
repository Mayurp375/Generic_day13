package org.example;


public class MaximumTest<T extends Comparable<T>> {
    T x, y, z;

    public MaximumTest(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T maximum() {
        return MaximumTest.maximum(x, y, z);
    }

    //determinr the largest number of three Compable object
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; //assume x is initially  the largest
        if (y.compareTo(max) > 0) {
            max = y;//y is the largest so far
        }
        if (z.compareTo(max) > 0) {
            max = z;//z is larges now
        }
        printMax(x, y, z);
        return max;//returns the largest object
    }

    public static String testMaximum(String x, String y, String z) {
        String max = x;
        if (y.compareTo(max) > 0) {
            max = y;//y is the largest so far
        }
        if (z.compareTo(max) > 0) {
            max = z;//z is larges now
        }
        printMax(x, y, z);
        return max;//returns the largest object
    }

    public static <T> void printMax(T x, T y, T z) {
        System.out.println("Max of x," + x + " y," + y + "and z is " + z  );
    }

    public static void main(String[] args) {
        Integer xInt = 3,yInt = 4,zInt = 5;
        Float xFl = 6.6f,yFl= 8.8f,zFl= 7.7f;
        String xStr = "pear",yStr = "apple",zStr = "orange";

        MaximumTest.testMaximum(xStr,yStr,zStr);
        new MaximumTest(xInt,yInt,zInt).maximum();
        new MaximumTest(xFl,yFl,zFl).maximum();
        new MaximumTest(xStr,yStr,zStr).maximum();
    }

}