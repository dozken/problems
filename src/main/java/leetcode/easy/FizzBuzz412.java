package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz412 {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            // if(i%3==0 && i%5==0){
            //     result.add("FizzBuzz");
            // }else if(i%3==0){
            //     result.add("Fizz");
            // }else if(i%5==0){
            //     result.add("Buzz");
            // }else{
            //     result.add(String.valueOf(i));
            // }
            boolean divBy3 = i % 3 == 0;
            boolean dibBy5 = i % 5 == 0;;
            result.add(
                    divBy3 && dibBy5 ? "FizzBuzz"
                            : divBy3 ? "Fizz"
                            : dibBy5 ? "Buzz"
                            : String.valueOf(i)
            );
        }
        return result;

        // return IntStream.rangeClosed(1,n)
        //     .mapToObj(i-> i%3==0 && i%5==0 ? "FizzBuzz"
        //              : i%3 == 0 ? "Fizz"
        //              : i%5 == 0 ? "Buzz"
        //              : String.valueOf(i))
        //     .collect(Collectors.toList());
    }
}
