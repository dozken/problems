import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class OtherTesting {

    @Test
    public void nullCheck(){
        int a = 5;
        // this will not compile !!!
//        if(a == null)
        System.out.println(Math.ceil(3.2));
    }

//    @Test
//    public void arrayCreation() {
//        int[] a = new int[1];
//        int[][] b = new int[1][1];
//        int[][][] c = new int[1][1][];
//
//        System.out.println("A");
//        for (int i1 : a) {
//            System.out.println(i1);
//        }
//
//        System.out.println("B");
//        for (int[] ints1 : b) {
//            for (int j = 0; j < ints1.length; j++) {
//                System.out.println(ints1);
//            }
//        }
//
//        System.out.println("C");
//        for (int[][] ints : c) {
//            for (int j = 0; j < ints.length; j++) {
//                for (int k = 0; k < ints[j].length; k++) {
//                    System.out.println(ints[j][k]);
//                }
//            }
//        }
//    }

    @Test
    public void arrayListCheck() {
        ArrayList<Object> objects = new ArrayList<>(4);


        objects.add(new Object());
        objects.add(new Object());
        objects.add(new Object());
        objects.add(new Object());
        objects.add(new Object());
        objects.add(new Object());
        int size = objects.size();
        assertEquals(size, 4);
    }



}


