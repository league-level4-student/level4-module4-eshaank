package _01_introduction_to_encapsulation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import static org.junit.Assert.*;

public class encapsulationTest  {
	@Test
	public void testItems() throws Exception {
		
		EncapsulateTheData hi = new EncapsulateTheData();
		hi.setItemsReceived(-1);
		hi.setDegreesTurned(360);
		hi.setNomenclature("");
		hi.setMemberObj("hi");
		assertEquals(" ", hi.getNomenclature());
		assertEquals(0, hi.getItemsReceived());
		assertEquals(360.0, hi.getDegreesTurned(), 0.0);
		
		assertEquals((Object) "hi", hi.getMemberObj());
	}

}
