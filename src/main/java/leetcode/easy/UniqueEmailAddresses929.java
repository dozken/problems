package leetcode.easy;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

class UniqueEmailAddresses929 {

    int numUniqueEmails(String[] emails) {
        HashSet set = new HashSet();
        for(String email: emails){
//            email = email.toLowerCase();
            int atIndex = email.indexOf("@");
            String address = email.substring(0, atIndex)
                    .substring(0, email.indexOf("+"))
                    .replaceAll(Pattern.quote("."),"");
            String domain = email.substring(atIndex);
            set.add(address + domain);
        }
        return set.size();
    }

}
