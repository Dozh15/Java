package TestingEnviroment;


import java.util.Random;

public class ThreadClass implements Runnable {

    private String name;
    private Random random;
    private int time;

    public ThreadClass(String name){
    this.name =  name;
    random = new Random();
    time = random.nextInt(999);

    }


    public void run() {
        System.out.println(name + "Starting new thread. Thread name: "+ name);
        try {
            Thread.sleep(time);
            System.out.println(name + " Sleeping time was :" + time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " is Done...");
    }
}
