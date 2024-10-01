//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Nicholas Cary 
 */


 public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println("Increment 1: " + lab.increment(1));
    
    int[] nums = {5, 9, 3, 12, 7, 3, 11, 5};

    System.out.print("Array in order: ");
    int i = 0;
    while (i < nums.length) {
      System.out.print(nums[i] + " ");
      i++;
    }
    System.out.println();

    System.out.print("Array in reverse: ");
    for (int j = nums.length - 1; j >= 0; j--) {
      System.out.print(nums[j] + " ");
    }
    System.out.println();

    System.out.println("First value: " + nums[0]);
    System.out.println("Last value: " + nums[nums.length - 1]);

    System.out.println("Maximum of 5 and 9: " + lab.max(5, 9));
    System.out.println("Minimum of 5 and 9: " + lab.min(5, 9));
    System.out.println("Sum of array: " + lab.sum(nums));
    System.out.println("Array Average: " + lab.average(nums));
    System.out.println("Maximum in array: " + lab.max(nums));
    System.out.println("Minimum in array: " + lab.min(nums));
  }
}

class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  public int max(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  public int min(int a, int b) {
    if (a < b) {
      return a;
    } else {
      return b;
    }
  }

  public int sum(int[] nums) {
    int total = 0;
    for (int num : nums) {
      total += num;
    }
    return total;
  }

  public double average(int[] nums) {
    int total = 0;
    for (int num : nums) {
      total += num;
    }
    return (double) total / nums.length;
  }

  public int max(int[] nums) {
    int maxValue = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > maxValue) {
        maxValue = nums[i];
      }
    }
    return maxValue;
  }

  public int min(int[] nums) {
    int minValue = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < minValue) {
        minValue = nums[i];
      }
    }
    return minValue;
  }
}