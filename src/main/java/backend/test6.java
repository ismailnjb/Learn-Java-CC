package backend;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        LinkedList<String>ll1=new LinkedList<String>();
        ll.add("This Is");
        ll.add("my Linked list");
        ll.add("i love ll");

        System.out.println("First: "+ll.getFirst()+  "  ,  " + "Last: "+ll.getLast());

        Iterator<String>it= ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        LinkedList<Integer>ll=new LinkedList<Integer>();
        for(int i=0;i<n;i++){
            ll.add(scan.nextInt());
        }
        int n1=scan.nextInt();
        for(int i=0;i<n;i++){
            if(scan.next().equals("Insert")){
                ll.add(scan.nextInt(), scan.nextInt());
            }else{
                ll.remove(scan.nextInt());
            }
        }



    }
}
