package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean hasTeen(int param1,int param2,int param3){
        if((param1>= 13 && param1<=19 ) || (param2>= 13 && param2<=19) || (param3>= 13 && param3<=19)){
            return true;
        }else return false;
    }

    public static  boolean isTeen(int param){
        if(param>= 13 && param<=19)
            return true;
        else  return false;
    }
}
