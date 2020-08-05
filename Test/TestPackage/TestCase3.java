package TestPackage;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeNoException;

import javax.swing.border.EmptyBorder;

import org.junit.Test;

public class TestCase3 {

	@Test
	public void test() {
		UnitTest j=new UnitTest();
		int t=j.DeleteDatabase(3,"Sam","CS");
		assertEquals(1, t);
		

}
	@Test
	public void test1() {
		UnitTest j=new UnitTest();
		int t=j.DeleteDatabase(3,null,"CS");
		assertEquals(0, t);
	}
	@Test
	public void test2() {
		UnitTest j=new UnitTest();
		int t=j.DeleteDatabase((Integer) null,"Ray","CS");
		assertEquals(0, t);
	}
	@Test
	public void test3() {
		UnitTest j=new UnitTest();
		int t=j.DeleteDatabase(3,"ray",null);
		assertEquals(0, t);
	}
	@Test
	public void test4() {
		UnitTest j=new UnitTest();
		int t=j.DeleteDatabase( null,null,"CS");
		assertEquals(0, t);
	}
	@Test
	public void test5() {
		UnitTest j=new UnitTest();
		int t=j.DeleteDatabase((Integer) null,"Tob",null);
		assertEquals(0, t);
	}
	@Test

	public void test6() {
		UnitTest j=new UnitTest();
		int t=j.DeleteDatabase(3,null,null);
		assertEquals(0, t);
	}
	@Test
	public void test7() {
		UnitTest j=new UnitTest();
		int t=j.DeleteDatabase((Integer)null,null,null);
		assertEquals(0, t);
	}
	@Test
	public void test8() {
		UnitTest j=new UnitTest();
		int t=j.BrowseImage("C:\\Users\\Kichu\\Downloads\\student.jpg");
		assertEquals(1, t);
	}
	
}
