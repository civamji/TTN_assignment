import java.io.*;
import java.util.*;

class Block
{
    String name = "";
    public int count = 0;

    public void setName(String geek, List<String> list)
    {

        synchronized(this)
        {
            name = "Anonymous";
            count++; // how many threads change geek's name.
        }
        System.out.println(count);


        list.add(geek);
    }
}

class q3_2
{
    public static void main (String[] args)
    {
        Block bk = new Block();
        List<String> list = new ArrayList<String>();
        bk.setName("mohit", list);
        bk.setName("Shivam", list);
        bk.setName("Vishal", list);
        bk.setName("Shubham", list);
        System.out.println(bk.name);


    }
} 
