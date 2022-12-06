package com.sunglowsys;

public class PrintNumberFrom1ToN {
    public static void PrintDec(int n){
        if (n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n+ " ");
        PrintDec(n-1);
    }
    public static void PrintInc(int n){
        if (n == 1){
            System.out.println(n +" ");
            return;
        }
        PrintInc(n-1);
        System.out.println(n);

    }
    public static int Fact(int n){
        if (n == 0){
            return  1;
        }
        int fnml = Fact(n -1);
        int fn = n * Fact(n-1);
        return fn;
    }
    public static int CalSum(int n){
        if (n == 1){
            return 1;
        }
        int Sum = CalSum(n - 1);
            int sn = n + Sum;
            return sn;
        }


        public static int Fib(int n){
        if (n == 0 || n == 1){
            return n;
        }
        int fnm1 = Fib(n-1);
        int fnm2 = Fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
        }
        public static Boolean isSorted(int arr[],int i) {
            if (i == arr.length - 1) {
                return true;
            }
            if (arr[i] > arr[i+1]){
                return false;
            }
            return isSorted(arr, i+1);
        }
        public static int firstOccurance(int arr[],int key,int i){
        if (i == arr.length){
            return -1;
        }
        if (arr[i] == key){
            return i;
        }

         return firstOccurance(arr,key,i + 1);
        }
        public static int lastOccurence(int arr[],int key,int i) {
            if (i == arr.length) {
                return -1;
            }
            int isFound = lastOccurence(arr, key, i + 1);
            if (isFound == -1 && arr[i] == key) {
                return i;

                }
            return isFound;

        }
        public static int Power(int x ,int n){
        if (n == 0){
            return 1;
        }
        return x * Power(x, n-1);
        }
    public static void main(String[] args) {
        System.out.println(Power(3,5));
    }

    }