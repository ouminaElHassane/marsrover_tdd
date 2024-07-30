package com.tutofox.demo.kata.mars;

public class ChristmasTree {
    public static void main(String[] args) {


        int height = 10;
        for (int i = 0; i < height; i++) {
            System.out.println(drawLeaf(i) + drawTrunc() + drawLeaf(i));
        }


    }

    private static String drawTrunc() {
        return "|";
    }

    private static String drawLeaf(int height) {
        if (height == 0) return "";
        return drawLeaf(height - 1) + "*";

    }
/*      |
       *|*
      **|**
     ***|***
   *****|*****
  ******|******
********|********
**********|********

*/


}
