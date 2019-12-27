package g1.Test;

import java.sql.Connection;

public class Appl {
public static void main(String[] args) {
	Connection con=DaoConnection.getConnection();
    System.out.println("connected..");
}
}