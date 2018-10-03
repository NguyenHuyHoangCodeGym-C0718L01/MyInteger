package com.company;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    //Check value is even or not
    public boolean isEven(){
        boolean checkValueEven = getValue() % 2 == 0;
        if(checkValueEven){
            return true;
        }else{
            return false;
        }
    }


    //Check value is odd or not
    public boolean isOdd(){
        boolean checkValueOdd = getValue() % 2 != 0;
        if(checkValueOdd){
            return true;
        }else{
            return false;
        }
    }


    //Check value is prime or not
    public boolean isPrime(){
        int count = 0;
        for(int i = 1; i <= getValue(); i++){
            if(getValue() % i == 0){
                count ++ ;
            }
        }
        boolean checkValuePrime = count == 2;
        if(checkValuePrime){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isEven(int value){
        boolean checkValueEven = value % 2 == 0;
        if(checkValueEven){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isOdd(int value){
        boolean checkValueOdd = value % 2 != 0;
        if(checkValueOdd){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isPrime(int value){
        int count = 0;
        for(int i = 1; i <= value; i++){
            if(value % i == 0){
                count ++ ;
            }
        }
        boolean checkValuePrime = count == 2;
        if(checkValuePrime){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isEven(MyInteger myInteger){
        boolean checkValueEven = myInteger.getValue() % 2 == 0;
        if(checkValueEven){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isOdd(MyInteger myInteger){
        boolean checkValueOdd = myInteger.getValue() % 2 != 0;
        if(checkValueOdd){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isPrime(MyInteger myInteger){
        int count = 0;
        for(int i = 1; i <= myInteger.getValue(); i++){
            if(myInteger.getValue() % i == 0){
                count ++ ;
            }
        }
        boolean checkValuePrime = count == 2;
        if(checkValuePrime){
            return true;
        }else{
            return false;
        }
    }

    public boolean equals(int inputValue){
        boolean checkTwoValuesEqual = getValue() == inputValue;
        if(checkTwoValuesEqual){
            return true;
        }else{
            return false;
        }
    }

    public boolean equals(MyInteger myInteger){
        boolean checkTwoValuesEqual = getValue() == myInteger.getValue();
        if(checkTwoValuesEqual){
            return true;
        }else{
            return false;
        }
    }

    public static int parseInt(char[] array){
       return String.valueOf(array).hashCode();
    }

    public static int parseInt(String context){
        return (context.hashCode());
    }
}
