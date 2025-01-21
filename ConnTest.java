package employee.management.system;

public class ConnTest {
    public static void main(String[] args) {
        Conn conn = new Conn(); // Initialize the Conn object
        if (conn.c != null) {
            System.out.println("Connection is working fine!");
        } else {
            System.out.println("Failed to connect to the database!");
        }
    }
}

