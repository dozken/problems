import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class OtherTesting {

    @Test
    public void nullCheck(){
        int a = 5;
        // this will not compile !!!
//        if(a == null)
    }

    @Test
    public void arrayCreation() {
        int[] a = new int[1];
        int[][] b = new int[1][1];
        int[][][] c = new int[1][1][];

        System.out.println("A");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("B");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println(b[i]);
            }
        }

        System.out.println("C");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                for (int k = 0; k < c[i][j].length; k++) {
                    System.out.println(c[i][j][k]);
                }
            }
        }
    }

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

    public int checkPrimitiveInt(int a) {
        int b = Integer.parseInt(null);
        Integer candidate = null;
        return candidate;
    }

    @Test
    public void checkPrimitiveInt() {
        assertNull(checkPrimitiveInt(1));
    }


}


