 import static org.junit.Assert.*;

import org.junit.Test;


public class UserAccountListTest {

	@Test
	public void path1() {
		UserAccountList list = new UserAccountList();
		list.addUserAccount(new UserAccount("John","Smith"));
		
		assertNotNull("path1 correct", list.getUser("Smith","John"));
	}

	@Test
	public void path2() {
		UserAccountList list = new UserAccountList();
		list.addUserAccount(new UserAccount("Smith","John"));
				
		assertNull("path2 correct", list.getUser("Lester","Jane"));
	}
	
	@Test
	public void path3() {
		UserAccountList list = new UserAccountList();
		list.addUserAccount(new UserAccount("Smith","John"));
				
		assertNull("path3 correct", list.getUser("Smith","Jane"));
	}
	
	@Test
	public void path4() {
		UserAccountList list = new UserAccountList();
		list.addUserAccount(new UserAccount("Smith","John"));
				
		assertNull("path4 correct", list.getUser("Lester","John"));
	}

	@Test
	public void path5() {
		UserAccountList list = new UserAccountList();
		
		assertNull("path5 correct", list.getUser("Smith","John"));
	}
	
	@Test
	public void path6() {
		UserAccountList list = new UserAccountList();
		
		assertNull("path6 correct", list.getUser("Lester","Jane"));
	}
}
