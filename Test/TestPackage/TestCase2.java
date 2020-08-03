package TestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase2 {

	@Test
	public void test() {
		UnitTest j=new UnitTest();
		int t=j.UpdateDatabase(3,"Sam","CS");
		assertEquals(1, t);
		

}
	@Test
	public void test1() {
		UnitTest j=new UnitTest();
		int t=j.UpdateDatabase(3,null,"CS");
		assertEquals(0, t);
	}
	@Test
	public void test2() {
		UnitTest j=new UnitTest();
		int t=j.UpdateDatabase((Integer) null,"Ray","CS");
		assertEquals(0, t);
	}
	@Test
	public void test3() {
		UnitTest j=new UnitTest();
		int t=j.UpdateDatabase(3,"ray",null);
		assertEquals(0, t);
	}
	@Test
	public void test4() {
		UnitTest j=new UnitTest();
		int t=j.UpdateDatabase( null,null,"CS");
		assertEquals(0, t);
	}
	@Test
	public void test5() {
		UnitTest j=new UnitTest();
		int t=j.UpdateDatabase((Integer) null,"Tob",null);
		assertEquals(0, t);
	}
	@Test
	public void test6() {
		UnitTest j=new UnitTest();
		int t=j.UpdateDatabase(3,null,null);
		assertEquals(0, t);
	}
	@Test
	public void test7() {
		UnitTest j=new UnitTest();
		int t=j.UpdateDatabase((Integer)null,null,null);
		assertEquals(0, t);
	}
	

}
