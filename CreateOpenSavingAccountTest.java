

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.green.bank.database.DatabaseOperations;
import com.green.bank.database.JDBC_Connect;
import com.green.bank.model.AccountModel;

public class CreateOpenSavingAccountTest {
	private DatabaseOperations databaseOperations;
	private static AccountModel accountModel;
	private Connection con;
	private static PreparedStatement prst;

	@Before
	public void setUp() throws Exception {
		databaseOperations = new DatabaseOperations();
		con = JDBC_Connect.openConnection();
	}

	// Test create new saving account
	@Test
	public void fullProperties() throws SQLException {
		String id = "hongson123";
		String first_name = "Duong Hong";
		String last_name = "Son";
		String address = "Nam Tu Liem";
		String city = "Ha Noi";
		String branch_name = "TP Bank";
		String zip = "100000";
		String username = "hongson";
		String password = "123";
		String phone = "098771231";
		String email = "hongson@gmail.com";
		String account_type = "Saving Account";
		String reg_date = "24/05/2021";
		int amount = 10000000;

		accountModel = new AccountModel(id, first_name, last_name, address, city, branch_name, zip, username, password,
				phone, email, account_type, reg_date, amount);
		boolean expectedValue = true;
		try {
			boolean insertAccountDetails = databaseOperations.insertAccountDetails(accountModel);
			assertEquals(expectedValue, insertAccountDetails);
		} catch (Exception e) {
			String sql = "delete from account where id=?";
			prst = con.prepareStatement(sql);
			prst.setString(1, id);
			int i = prst.executeUpdate();
			if (i > 0) {
				System.out.println("Delete account!");
			}
			e.printStackTrace();
		}
	}
	@Test
	public void leaveid() throws SQLException {
		String id = "";
		String first_name = "Duong Hong";
		String last_name = "Son";
		String address = "Nam Tu Liem";
		String city = "Ha Noi";
		String branch_name = "TP Bank";
		String zip = "100000";
		String username = "hongson";
		String password = "123";
		String phone = "098771231";
		String email = "hongson@gmail.com";
		String account_type = "Saving Account";
		String reg_date = "24/05/2021";
		int amount = 10000000;
		
		accountModel = new AccountModel(id, first_name, last_name, address, city, branch_name, zip, username, password,
				phone, email, account_type, reg_date, amount);
		boolean expectedValue = true;
		try {
			boolean insertAccountDetails = databaseOperations.insertAccountDetails(accountModel);
			assertEquals(expectedValue, insertAccountDetails);
		} catch (Exception e) {
			String sql = "delete from account where id=?";
			prst = con.prepareStatement(sql);
			prst.setString(1, id);
			int i = prst.executeUpdate();
			if (i > 0) {
				System.out.println("Delete account!");
			}
			e.printStackTrace();
		}
	}


}
