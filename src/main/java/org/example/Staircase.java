package org.example;

public class Staircase {
    public void staircase(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j< (n-i-1)) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
