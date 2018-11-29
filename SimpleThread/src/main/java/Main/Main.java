package Main;

public class Main {

    public static void main(String ... args)
    {

        //Calling and making threads...

        Thread t1 =  new Thread(new ThreadClass("t1"));
        t1.start();

        Thread t2 =  new Thread(new ThreadClass("t2"));
        t2.start();

        Thread t3 =  new Thread(new ThreadClass("t3"));
        t3.start();



    }

}
