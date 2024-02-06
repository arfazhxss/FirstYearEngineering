/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo225;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Malek
 */
public class Algo225 {

    
    static int[] arr = new int[1000];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner file = new Scanner(new File("E:\\Academic\\[Java_projects]\\Codeforces\\src\\in.in"));
        int n = file.nextInt();
        if(n == 0) return;
        for(int i = 0; i < n; i++){
            arr[i] = file.nextInt();
        }
        Arrays.sort(arr, 0, n);
        int left = 0;
        int right = n - 1;
        int ans = 0;
        while(left < right){
            if(arr[left] + arr[right] > 225) right--;
            if(arr[left] + arr[right] < 255) left++;
            if(arr[left] + arr[right] == 225){
                ans++;
                left++;
                right--;
            }
        }
        System.out.println(ans);
    }
    
}
