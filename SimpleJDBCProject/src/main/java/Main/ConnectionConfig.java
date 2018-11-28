package Main;

public abstract class ConnectionConfig {

    //JUST A CLASS THAT HAS CONFIQ FOR CONNECTION

    private final String url = "jdbc:mysql://localhost/party";
    private final String login = "admin";
    private final String password = "password";


    public String getLogin()
    {
        return login;
    }

    public  String getUrl()
    {
        return url;
    }

    public String getPassword()
    {
        return password;
    }



}
