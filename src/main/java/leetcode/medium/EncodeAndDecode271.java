package leetcode.medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class EncodeAndDecode271 {

    public String encode(List<String> list) {
        StringBuffer sb = new StringBuffer();

        list.forEach(str -> {
            sb.append(str.length() + "#" + str);
        });

        return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();
        for (int i = 0; i < str.length(); ) {

            String strLength = "";
            while (str.charAt(i) != '#') {
                strLength += str.charAt(i);
                i++;
            }
            int length = Integer.parseInt(strLength);
            int beginIdx = i + 1;
            int endIdx = beginIdx + length;
            result.add(str.substring(beginIdx, endIdx));
            System.out.println(result);
            i = endIdx;
        }

        return result;
    }


    @Test
    public void test() {
        List<String> list = Arrays.asList("abc", "123", "qaz");
        String str = encode(list);

        System.out.println(str);
        List<String> decode = decode(str);

        System.out.println(decode);
        assertEquals(list, decode);
    }

    @Test
    public void test2() {
        List<String> list = Arrays.asList("abdddddddddddddddc", "123", "qaz");
        String str = encode(list);

        System.out.println(str);
        List<String> decode = decode(str);

        System.out.println(decode);
        assertEquals(list, decode);
    }
}
