package com.Practice.Numbers;



import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6, 7, 8};  
        int l = 0;
        int r = arr.length - 1;
        int x = 3;  
        
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (x == arr[mid]) {
                System.out.println("Element found at index " + mid);
                return;  
            }
            if (arr[mid] < x) {
                l = mid + 1;
            } else {
                r = mid - 1;  
            }
        }
        System.out.println("Element not found");
    }
}
