package com.Practice.Arrays;



import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6, 7, 8};  // Array must be sorted for binary search to work
        int l = 0;
        int r = arr.length - 1;
        int x = 3;  // Element to be searched
        
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid]==x) {
                System.out.println("Element found at index " + mid);
                return;  // Exit the loop if the element is found
            }
            if (arr[mid] < x) {
                l = mid + 1;  // Search in the right half
            } else {
                r = mid - 1;  // Search in the left half
            }
        }
        System.out.println("Element not found");
    }
}
