import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class OtherTesting {

    @Test
    public void charTest() {
        System.out.println((char) ('A' - 1));
        System.out.println(52 % 25);
    }

    @Test
    public void testDateMethodReference() {

        class SalaryValue {

            private BigDecimal value;
            private LocalDate date;

            public BigDecimal getValue() {
                return value;
            }

            public LocalDate getDate() {
                return date;
            }

        }

        List<SalaryValue> values = new ArrayList<>();

        LocalDate maxDate = LocalDate.now();
        Optional<SalaryValue> optSalary = values.stream()
                .filter(x -> x.getDate().compareTo(maxDate) < 1)
                .max(Comparator.comparing(SalaryValue::getDate));
    }
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


