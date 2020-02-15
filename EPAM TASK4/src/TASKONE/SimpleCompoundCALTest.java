package TASKONE;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCompoundCALTest {
	SimpleCompoundCAL scc=new SimpleCompoundCAL();
	private static final double DELTA = 1e-15;
	@Test
	public void test() {
		String s="SimpleIntrest";
		assertEquals(576.0f,scc.SimpleCompound(s,1200,2,24.0),DELTA);
	}
	public void test1() {
		String p="CompoundIntrest";
		assertEquals(828.0000000000002,scc.SimpleCompound(p,1200,2,30),DELTA);
	}

}
