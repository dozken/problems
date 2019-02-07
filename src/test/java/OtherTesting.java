import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
}
