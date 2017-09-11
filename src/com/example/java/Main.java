package com.example.java;

public class Main {

    public static void main(String[] args) {
	int numberone = 15;
	int numbertwo = 30;


        System.out.println( "15+30=45") ;
        int result1= numberone + numbertwo;

        if (result1==45){
                    System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        System.out.println( "15-30=-15") ;
        int result2= numberone - numbertwo;

        if (result2==-15){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        System.out.println( "15*30=450") ;
        int result3= numberone * numbertwo;

        if (result3==450){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        System.out.println( "15/30=1/2") ;
        int result4 = numberone / numbertwo;

        if (result4==1/2){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }


        System.out.println( "30%15=0") ;
        int result5 = numbertwo%numberone;

        if (result5==0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
