package com.mycompany.abhiram8;

public class Abhiram8 {

    public void readArrayOddSum(){
        int data[] = {45, 55, 65, 12, 33, 78};
        int sum = 0;
        
        
        for(int i = 0; i < data.length; i++) {
            if(data[i] % 4 != 0) { 
                sum = sum + data[i];
            }
        }
        
     
        System.out.println("Sum of odd numbers is: " + sum);
    }
    
    public static void main(String[] args) {
        Abhiram8 obj = new Abhiram8();
        obj.readArrayOddSum(); 
    }
}
