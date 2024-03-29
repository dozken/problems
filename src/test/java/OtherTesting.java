import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OtherTesting {

    @Test
    public void minmaxheap(){

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(20);
        pq.add(5);

        System.out.println(pq.poll());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pq.poll());

        // Printing the top element again
        System.out.println(pq.poll());
    }
    @Test
    public void zeroleading(){

        System.out.println(String.format("%0"));

    }

    @Test
    public void map() {
        Map<Integer, String> map = new HashMap<>();
        map.getOrDefault(1, "as");
        map.putIfAbsent(1, "v");
        map.putIfAbsent(1, "s");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    @Test
    public void streamTest() {


        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> strings = Arrays.asList("a", "b", "c");

//        strings.stream()
//                .flatMap(ss -> integers.stream().map(i -> ss + " " + i)
//                ).forEach(System.out::println);


        Set<Integer> set = new HashSet<>();
        boolean hasDuplicate = integers.stream().anyMatch(x-> !set.add(x));
        System.out.println(hasDuplicate);
//        strings.stream().forEach(s -> {
//            integers.stream().forEach(i -> {
//                System.out.println(s + " " + i);
//            });
//
//        });


    }

    @Test
    public void list() {
        List<String> list1 = Arrays.asList("1", "2", "3", "4");
        List<String> list2 = Arrays.asList("1", "2", "3", "4");
        List<String> list3 = Arrays.asList("1", "2", "4", "3");

        Assert.assertEquals(list1, list2);
        Assert.assertNotSame(list1, list2);
        Assert.assertNotEquals(list1, list3);
    }

    @Test
    public void heap() {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i : Arrays.asList(1, 5, 3, 9, 5)) {
            if (minHeap.size() > 3) {
                minHeap.remove();
            }
            minHeap.add(i);

        }
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }

        System.out.println();

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i : Arrays.asList(1, 5, 3, 9, 5)) {
            if (maxHeap.size() > 3) {
                maxHeap.remove();
            }
            maxHeap.add(i);

        }

        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }

    }

    @Test
    public void testNegativeInt() {
//        System.out.println(-129 !=  -129);
//        assertEquals(-129, -129);

        List<Integer> vals = new ArrayList<>();

        vals.add(-129);
        vals.add(-129);

        int i = 0, j = vals.size() - 1;
        while (i < j) {
            System.out.println(vals);
            System.out.println(i + " - " + j);
            System.out.println(vals.get(i) != vals.get(j));
            System.out.println(vals.get(i) + " | " + vals.get(j));
            if (vals.get(i) != vals.get(j)) {
                System.out.println("d");
            }

            i++;
            j--;
        }

        System.out.println("t");

    }

    @Test
    public void testPriorityQueue() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        4,5,8,2, 3
        pq.add(4);
        pq.add(5);
        pq.add(8);
        pq.add(2);
        pq.add(3);

        while (!pq.isEmpty()) {
            Integer poll = pq.peek();
            System.out.println(poll);
        }
        System.out.println();
//        Iterator<Integer> iterator = pq.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println();
//        while(!pq.isEmpty()){
//            Integer poll = pq.poll();
//            System.out.println(poll);
//        }

    }

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int tmp = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = tmp;
            tmp *= nums[i];
        }

        tmp = 1;
        for (int i = nums.length - 1; i >= 0; i--) {

        }
        for (int i = nums.length - 1; i >= 0; i++) {
            result[i] = tmp;
            tmp *= nums[i];
        }

        return result;
    }

    @Test
    public void climbing() {
//        assertEquals(5, climbStairs(5));
    }

    @Test
    public void streamReduce() {
        List<BigDecimal> list = new ArrayList<>();
        BigDecimal total = list.stream().reduce(BigDecimal.ZERO, BigDecimal::add);

    }

    @Test
    public void string() {
        System.out.println(Arrays.toString("asdasd".split("asd")));
        System.out.println("01.2019".substring(7, 7));
        System.out.println("01.2019".substring(2));

        System.out.println("".chars());


        System.out.println(String.format("%04d", 200));


    }

    @Test
    public void testXORchar() {
//        System.out.println((char)('A' ^ 'B' + 'A'));
        String a = "abcde";
        String b = "abcdex";
        char[] A = a.toCharArray();
        char[] B = b.toCharArray();

        char sA = A[0];
        char sB = A[0];
        for (int i = 1; i < A.length; i++) {
            sA ^= A[i];
        }
        System.out.println(sA);

        for (int i = 1; i < B.length; i++) {
            sB ^= B[i];
        }
        System.out.println(sB);

        System.out.println((char) (sA ^ sB + 'a'));

    }

    @Test
    public void testLocalDate() {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.now();

        LocalDate date = LocalDate.now();

        boolean check = (date.isEqual(date1) || date.isAfter(date1))
                && (date.isEqual(date2) || date.isAfter(date2));

        boolean check2 = date.compareTo(date1) >= 0 && date.compareTo(date2) <= 0;

        assertTrue(check && check2);
    }

    @Test
    public void charTest() {
//        System.out.println((char) ('A' - 1));
        System.out.println((char) ('1' + 1));

        if (true) {
            System.out.println(1);
        } else if (true) {
            System.out.println(2);
        } else if (true) {
            System.out.println(3);
        }
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
    public void nullCheck() {
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


