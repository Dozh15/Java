package Main;

import java.util.Random;

public class ThreadClass implements Runnable{

    private String name;
    private Random random;
    private int time;



    public ThreadClass(String name)
    {
        random =  new Random();
        time = random.nextInt(999);
        this.name =  name;


    }

    public void run() {

        System.out.println(name + " Making thread");
        try
        {
            Thread.sleep(time);
            System.out.println(name+ " Thread sleeping time: "+time);


        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Something with thread went wrong...");
        }finally {
            System.out.println("Thread off...");
        }

    }
}
