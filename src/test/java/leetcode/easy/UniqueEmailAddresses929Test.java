package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class UniqueEmailAddresses929Test {

    @Test
    void numUniqueEmails() {
        String[] arr = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};

        UniqueEmailAddresses929 test = new UniqueEmailAddresses929();

        assertEquals(2, test.numUniqueEmails(arr));
    }
}