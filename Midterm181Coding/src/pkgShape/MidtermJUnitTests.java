package pkgShape;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

//Every test runs green on my machine: 16/16 Runs, 0 Errors, 0 Failures.
public class MidtermJUnitTests {
	
	//Rectangle tests.

	@Test
	public void Rectangle_Constructor_test() {
		Rectangle recTest = new Rectangle(1,1);
		assertTrue(recTest instanceof Rectangle);
	}

	@Test
	public void Rectangle_WidthGetter_test() {
		Rectangle recTest = new Rectangle(1,2);
		assertEquals(recTest.getiWidth(), 1);
	}
	
	@Test
	public void Rectangle_LengthGetter_test() {
		Rectangle recTest = new Rectangle(1,2);
		assertEquals(recTest.getiLength(), 2);
	}
	
	@Test
	public void Rectangle_WidthSetter_test() {
		Rectangle recTest = new Rectangle(1,2);
		recTest.setiWidth(100);
		assertEquals(recTest.getiWidth(), 100);
	}
	
	@Test
	public void Rectangle_LengthSetter_test() {
		Rectangle recTest = new Rectangle(1,2);
		recTest.setiLength(100);
		assertEquals(recTest.getiLength(), 100);
	}
	
	@Test
	public void Rectangle_area_test() {
		Rectangle recTest = new Rectangle(4,6);
		assertTrue(recTest.area() == 24.0);
	}
	
	@Test
	public void Rectangle_perimeter_test() {
		Rectangle recTest = new Rectangle(5,6);
		assertTrue(recTest.perimeter() == 22.0);
	}
	
	@Test
	public void Rectangle_compareTo_test() {
		Rectangle[] recTestArray = new Rectangle[5];
		Rectangle recTest1 = new Rectangle(1,6);
		Rectangle recTest2 = new Rectangle(2,6);
		Rectangle recTest3 = new Rectangle(6,3);
		Rectangle recTest4 = new Rectangle(6,4);
		Rectangle recTest5 = new Rectangle(5,6);
		recTestArray[0] = recTest3;
		recTestArray[1] = recTest2;
		recTestArray[2] = recTest5;
		recTestArray[3] = recTest4;
		recTestArray[4] = recTest1;
		Arrays.sort(recTestArray);
		assertTrue(recTestArray[0] == recTest1);
		assertTrue(recTestArray[1] == recTest2);
		assertTrue(recTestArray[2] == recTest3);
		assertTrue(recTestArray[3] == recTest4);
		assertTrue(recTestArray[4] == recTest5);
		
	}
	
	//Cuboid tests.
	
	@Test
	public void Cuboid_Constructor_test() {
		Cuboid cubTest = new Cuboid(1,1,1);
		assertTrue(cubTest instanceof Cuboid);
	}
	
	@Test
	public void Cuboid_DepthGetter_test() {
		Cuboid cubTest = new Cuboid(1,2,3);
		assertEquals(cubTest.getiDepth(), 3);
	}
	
	@Test
	public void Cuboid_DepthSetter_test() {
		Cuboid cubTest = new Cuboid(1,2,3);
		cubTest.setiDepth(100);
		assertEquals(cubTest.getiDepth(), 100);
	}
	
	@Test
	public void Cuboid_volume_test() {
		Cuboid cubTest = new Cuboid(1,2,3);
		assertTrue(cubTest.volume() == 6);
	}
	
	@Test
	public void Cuboid_area_test() {
		Cuboid cubTest = new Cuboid(1,2,3);
		assertTrue(cubTest.area() == 22);
	}
	
	@Test (expected = UnsupportedOperationException.class)
	public void Cuboid_perimeter_test() throws UnsupportedOperationException {
		Cuboid cubTest = new Cuboid(1,2,3);
		cubTest.perimeter();
	}
	
	@Test
	public void Cuboid_SortByVolume_test() {
		Cuboid cubTest1 = new Cuboid(1,2,3);
		Cuboid cubTest2 = new Cuboid(3,3,2);
		Cuboid cubTest3 = new Cuboid(3,2,4);
		Cuboid cubTest4 = new Cuboid(4,6,2);
		Cuboid cubTest5 = new Cuboid(5,5,5);
		ArrayList<Cuboid> ar = new ArrayList<Cuboid>();
		ar.add(cubTest3);
		ar.add(cubTest2);
		ar.add(cubTest5);
		ar.add(cubTest4);
		ar.add(cubTest1);
		Collections.sort(ar, new Cuboid.SortByVolume());
		assertTrue(ar.get(0) == cubTest1);
		assertTrue(ar.get(1) == cubTest2);
		assertTrue(ar.get(2) == cubTest3);
		assertTrue(ar.get(3) == cubTest4);
		assertTrue(ar.get(4) == cubTest5);
	}
	
	@Test
	public void Cuboid_SortByArea_test() {
		Cuboid cubTest1 = new Cuboid(1,2,3);
		Cuboid cubTest2 = new Cuboid(3,3,2);
		Cuboid cubTest3 = new Cuboid(3,2,4);
		Cuboid cubTest4 = new Cuboid(4,6,2);
		Cuboid cubTest5 = new Cuboid(5,5,5);
		ArrayList<Cuboid> ar = new ArrayList<Cuboid>();
		ar.add(cubTest3);
		ar.add(cubTest2);
		ar.add(cubTest5);
		ar.add(cubTest4);
		ar.add(cubTest1);
		Collections.sort(ar, new Cuboid.SortByArea());
		assertTrue(ar.get(0) == cubTest1);
		assertTrue(ar.get(1) == cubTest2);
		assertTrue(ar.get(2) == cubTest3);
		assertTrue(ar.get(3) == cubTest4);
		assertTrue(ar.get(4) == cubTest5);
	}
}
