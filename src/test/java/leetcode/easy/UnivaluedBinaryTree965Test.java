package leetcode.easy;

import leetcode.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UnivaluedBinaryTree965Test {

    private UnivaluedBinaryTree965 test;

    @BeforeEach
    void setUp() {
        test = new UnivaluedBinaryTree965();


    }

    @Test
    void isUnivalTree() {
//        [9,9,6,9,9]

        TreeNode tree = new TreeNode(9);
        tree.left = new TreeNode(9);
        tree.left.left = new TreeNode(9);
        tree.left.right = new TreeNode(9);

        tree.right = new TreeNode(6);

        assertFalse(test.isUnivalTree(tree));


    }

    @Test
    void test() {
        boolean a = false;
        boolean b = true;
        boolean test = check(10);
        assertTrue(test);
    }

    boolean check(int a) {
        System.out.println("here??");

        if (a > 10) return check(a / 2);
        else return true;
    }
}
