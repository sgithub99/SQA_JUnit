

import static org.junit.Assert.*;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.green.bank.database.JDBC_Connect;

public class WithdrawTest {

	private static Connection conn = null;
	PreparedStatement stmt = null;
	private static int current_amount;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testWithDraw() {
		boolean expectedValue = false;
		boolean isSuccess = false;
		String account_no = "xuanson";
		String username = "xuanson";
		String password = "123";
		int withdraw_amount = 900000;

		try {
			conn = JDBC_Connect.openConnection();

			stmt = conn.prepareStatement("select * from account where id='" + account_no + "' and username='"
					+ username + "' and password='" + password + "'");

			ResultSet rs = stmt.executeQuery();

			if (!rs.isBeforeFirst()) {
//				request.setAttribute("isPassOK", "No");
//				RequestDispatcher rd = request.getRequestDispatcher("withdraw.jsp");
//				rd.forward(request, response);
			} else {
				System.out.println("I am in");
				ResultSet rs1 = ((java.sql.Statement) stmt).executeQuery("select * from amount where id ='" + account_no + "'");

				while (rs1.next()) {
					current_amount = rs1.getInt(2);

					System.out.println(current_amount);
				}

				if (current_amount >= withdraw_amount) {
					current_amount -= withdraw_amount;

					PreparedStatement ps = conn.prepareStatement("update amount set amount=? where id= ?");
					ps.setInt(1, current_amount);
					ps.setString(2, account_no);
					ps.executeUpdate();
					isSuccess = true;
					conn.close();
				} else {
					conn.close();
					isSuccess = true;
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		assertEquals(expectedValue, isSuccess);
	}

}
