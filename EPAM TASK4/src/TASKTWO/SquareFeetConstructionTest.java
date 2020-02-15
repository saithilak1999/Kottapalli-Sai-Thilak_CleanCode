package TASKTWO;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareFeetConstructionTest {


	SquareFeetConstruction csf=new SquareFeetConstruction();
		private static final double DELTA = 1e-15;
		@Test
		public void test() {
			String s="Standard_Material";
			assertEquals(30000.0f,csf.CalculationSquareFeet(s,25),DELTA);
		}
		@Test
		public void test1() {
			String s="Above_Standard_Material";
			assertEquals(45000.0f,csf.CalculationSquareFeet(s,30),DELTA);
		}
		@Test
		public void test2() {
			String s="High_Standard_Material";
			assertEquals(63000.0f,csf.CalculationSquareFeet(s,35),DELTA);
		}
		@Test
		public void test3() {
			String s="High_Standard_Material_and_Automated";
			assertEquals(100000.0f,csf.CalculationSquareFeet(s,40),DELTA);
		}


	}

