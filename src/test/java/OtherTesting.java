import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class OtherTesting {

    @Test
    public void arrayListCheck(){
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

    public int checkPrimitiveInt(int a){
        int b = Integer.parseInt(null);
        Integer candidate = null;
        return candidate;
    }

    @Test
    public  void checkPrimitiveInt(){
        assertNull(checkPrimitiveInt(1));
    }
}


