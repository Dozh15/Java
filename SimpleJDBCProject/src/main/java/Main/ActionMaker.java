package Main;

public class ActionMaker {
    public ActionMaker()
    {

        //Call method that reads all data from sever to show what you have

        ReaderDB readerDB = new ReaderDB();

        // Method that ask what you want to do with that info

        ActionAsker actionAsker =  new ActionAsker();
    }
}
