/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author zequncao
 */

public class EvenOdd {
    static void EvenOdd (int arr[], int n) {
        int even = 1;
        int odd = 1;
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                even = arr[i]*2;
            else
                odd = arr[i]*3;
        }
        System.out.println("Even Index Product : " + even);
        System.out.println("Odd Index Product : " + odd);
    }
    
     public static void main(String []args)
    {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
     
        EvenOdd(arr, n);
    }
}
