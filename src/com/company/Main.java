package com.company;

public class Main {


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int ai : nums2) {
            _mergesArray(ai,nums1,m);
            m++;

        }
    }

    private static void _mergesArray(int x, int[] a, int m) {
        boolean checkArray = false;
        for (int i = 0; i < m ; i++) {
            if (a[i] > x) {
                checkArray = true;
//                for (int j = m-1; j>= i ; j--) {
//                    a[j+1] = a[j];
//                }
                System.arraycopy(a, i, a, i + 1, m - i);
                a[i] = x;
                break;
            }
            
        }
        if(!checkArray) {
            a[m] = x;
        }
    }

    public static void main(String[] args) {
	// write your code here
        int[] nums1 = {4,5,6,0,0,0};
        int[] nums2 = {1,2,3};
        merge(nums1,3,nums2,3);
        for (int a : nums1) {
            System.out.println(a);

        }

    }
}
