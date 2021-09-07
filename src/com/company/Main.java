package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(temp(20,35));
        System.out.println(temp(15,24));
        System.out.println(temp(10,20));
        System.out.println(temp(35,45));
        System.out.println(temp(45,55));
    }
    public static String temp(int age, int temperature){
        if(age>=20 && age<45 ){
            if(temperature >=-20 && temperature <=30){
                return "Можно идти гулять";
            }
            else{
                return "Остовайтесь дома";

            }


        }
        if(age<20 && age>=0){
            if(temperature>=0 && temperature<=28){
                return "Можно идти гулять";
            }
            else{
                return "Остовайтесь дома";
            }
        }
        if(age>=45){
            if(temperature<=25 && temperature>=-10){
               return "Можно идти гулять";
            }
            else{
                return "Остовайтесь дома";
            }

        }
        return "0";
    }

}
