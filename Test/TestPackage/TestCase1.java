package TestPackage;

import static org.junit.Assert.*;

import java.awt.event.ActionEvent;

import org.junit.Test;

public class TestCase1 {

	@Test
	public void test() {
		UnitTest j=new UnitTest();
		int t=j.SaveToDatabase(3,"Sam","CS");
		assertEquals(1, t);
		

}
	@Test
	public void test1() {
		UnitTest j=new UnitTest();
		int t=j.SaveToDatabase(3,null,"CS");
		assertEquals(0, t);
	}
	@Test
	public void test2() {
		UnitTest j=new UnitTest();
		int t=j.SaveToDatabase((Integer) null,"Ray","CS");
		assertEquals(0, t);
	}
	@Test
	public void test3() {
		UnitTest j=new UnitTest();
		int t=j.SaveToDatabase(3,"ray",null);
		assertEquals(0, t);
	}
	@Test
	public void test4() {
		UnitTest j=new UnitTest();
		int t=j.SaveToDatabase( null,null,"CS");
		assertEquals(0, t);
	}
	@Test
	public void test5() {
		UnitTest j=new UnitTest();
		int t=j.SaveToDatabase((Integer) null,"Tob",null);
		assertEquals(0, t);
	}
	@Test
	public void test6() {
		UnitTest j=new UnitTest();
		int t=j.SaveToDatabase(3,null,null);
		assertEquals(0, t);
	}
	@Test
	public void test7() {
		UnitTest j=new UnitTest();
		int t=j.SaveToDatabase((Integer)null,null,null);
		assertEquals(0, t);
	}
	
	@Test
	public void test10() {
		UnitTest j=new UnitTest();
		boolean t=j.SaveToDatabase(3,null);
		assertTrue(t);
	}
	@Test
	public void test11() {
		UnitTest j=new UnitTest();
		boolean t=j.SaveToDatabase();
		assertTrue(t);
	}
}