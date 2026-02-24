package d2_01;
/*
* The main reason behind using static factory method is =
* <b> The readability gets increased for the code</b>
* <b> If there are two fields with same return type are being used in constructor, we can't differentiate it</b>
* <b> We can control the object creation, ie; if we are using constructor, it will create a new object but with factory method it doesn't have to create a new object everytime</b>
* <b> The factory method can return subtype in return as well, with constructor it is not possible</b>
* * */
public class DatabaseConnection {
    private String host;
    private int port;
    private String type;
    private boolean readOnly;

    private static final String MYSQL = "MySQL";
    private static final String POSTGRES = "Postgres";


    private DatabaseConnection(String host, int port, String type, boolean readOnly) {
        this.host = host;
        this.port = port;
        this.type = type;
        this.readOnly = readOnly;
    }

    public static DatabaseConnection mysql(String host){
        return new DatabaseConnection(host,3306,MYSQL,false);
    }

    public static DatabaseConnection postgres(String host){
        return new DatabaseConnection(host,5432,POSTGRES,false);
    }

    public static DatabaseConnection readOnly(String host,String type, int port){
        return new DatabaseConnection(host,port,type,true);
    }


    @Override
    public String toString() {
        return "DatabaseConnection{" +
                "host='" + host + '\'' +
                ", port=" + port +
                ", type='" + type + '\'' +
                ", readOnly=" + readOnly +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("Response 1 is "+mysql("localhost"));
        System.out.println("Response 2 is "+ postgres("localhost:8080"));
        System.out.println("Response 3 is "+readOnly("localhost:9090","Postgres",5432));
    }

}

