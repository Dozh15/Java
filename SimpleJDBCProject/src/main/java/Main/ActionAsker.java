package Main;


import java.util.Scanner;

//Class dedicated to get further action need
public class ActionAsker {

    private String firstName;
    private  String lastName;
    private int age;

    public ActionAsker()
    {
        Asker();
    }



    private void Asker() {

        //ASK WHICH ACTION TO CHOOSE TO DO

        System.out.println("Do you want to add more friends the the list?");
        System.out.println("If you want to add more -  write Y/y \nif not AND WANT YOU WANT TO EXIST JUST PASS");
        System.out.println("IF YOU WANT TO DELETE FRIEND WRITE 'DELETE'\n ");


        //SCANNER READ INPUT
        Scanner reader =  new Scanner(System.in);
        String answ =  reader.next();
        if(answ.toLowerCase().equals("y"))
        {
            friendInfoAsker();
            ActionMaker actionMaker = new ActionMaker();
        }
        else if (answ.toLowerCase().equals("delete"))
        {
            DeleterDB deleterDB = new DeleterDB();
            ActionMaker actionMaker = new ActionMaker();

        }
        else {
            System.out.println("BYE!");
        }
    }


    //IF ADD FUNCIONT IS CHOOSEN IT START TO COLLECT DATA
    private void friendInfoAsker() {
        System.out.println("Name: ");
        Scanner readerName = new Scanner(System.in);
        this.firstName = readerName.next();

        System.out.println("Last name: ");
        Scanner readerLastName = new Scanner(System.in);
        this.lastName = readerLastName.next();

        System.out.println("Age: ");
        Scanner readerAge =  new Scanner(System.in);
        this.age = readerAge.nextByte();

        System.out.println("Your friend :" +firstName + " "+ lastName + "("+age+") has been added..." );

        WriterDB writerDB = new WriterDB();
        writerDB.writeToMysql(firstName , lastName , age);


    }





}
