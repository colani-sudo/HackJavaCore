import java.util.*;
import java.io.*;

class CheckBST {
    int data;
    CheckBST left;
    CheckBST right;

    public static boolean checkBST(CheckBST root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean isValidBST(CheckBST root, long minVal, long maxVal){
        if(root == null) return true;
        if(root.data >= maxVal || root.data <= minVal) return false;
        return isValidBST(root.left, minVal, root.data)
            && isValidBST(root.right, root.data, maxVal);
    }
    public static void main(String[] args) {
        CheckBST root = new CheckBST();
        root.data = 4;
        root.left = new CheckBST();
        root.left.data = 2;
        root.right = new CheckBST();
        root.right.data = 6;
        root.left.left = new CheckBST();
        root.left.left.data = 1;
        root.left.right = new CheckBST();
        root.left.right.data = 3;
        root.right.left = new CheckBST();
        root.right.left.data = 5;
        root.right.right = new CheckBST();
        root.right.right.data = 7;

        System.out.println(checkBST(root));
    }
}


