package Vectors;

import java.util.List;
import java.util.Vector;

public class VectorMain {

    public static void main(String[] args) {
        List<Integer> vectorObjOne = new Vector<>();
        vectorObjOne.add(100);
        vectorObjOne.add(200);
        vectorObjOne.add(300);
        System.out.println("vectorObj One is:: " + vectorObjOne);
        vectorObjOne.removeFirst();
        System.out.println("vectorObj One is:: " + vectorObjOne);
    }
}
