package backend;

import java.util.ArrayList;

public class test5 {

    public static void main(String[] args) {

        ArrayList<String>arr=new ArrayList<String>();
        arr.add("welcome");
        arr.add("the ");
        arr.add("my ");
        arr.add("world");
        arr.add("of fun");

        arr.set(1,"the grand");

        for(int i=0;i<5;i++){
            System.out.println((arr.get(i)));
        }
    }

}
