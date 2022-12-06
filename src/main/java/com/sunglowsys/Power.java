package com.sunglowsys;

public class Power {
    public static int OptimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = OptimizedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd number
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static int tilingProblem(int n) {
        //base case
        if (n == 0 || n == 1) {
            return 1;

            //kam
            // verical choice
        }
        int fnml1 = tilingProblem(n - 1);

        // horizontal choice
        int fnml2 = tilingProblem(n - 2);

        int totWays = fnml1 + fnml2;
        return totWays;
    }

    // remove duplicate String
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }


        //kam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {

            // duplicate
            removeDuplicate(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx + 1, newStr.append(currChar), map);
        }

    }

    public static int friendsParing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // choice
        // single

//        int fnml1 = friendsParing(n -1);
//
//         pairing
//        int fnml2 = friendsParing(n - 2);
//        int pairWays = (n - 1) * fnml2;
//
//         totalWays
//        int totalWays = fnml1 + pairWays;
//        return totalWays;
        return friendsParing(n - 1) + (n - 1) * friendsParing(n - 2);
    }

    public static void PrintBinString(int n, int lastPlace, StringBuilder str) {
        if (n == 0) {
            System.out.println(str);
        }
        PrintBinString(n - 1, 0, str.append("0"));
        if (lastPlace == 0) {
            PrintBinString(n - 1, 1, str.append("1"));

        }
            return ;
    }


    public static void main(String[] args) {
       PrintBinString(3,0,new StringBuilder(""));


    }
}
