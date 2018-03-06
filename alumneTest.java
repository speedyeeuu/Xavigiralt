import org.junit.Test;

import junit.framework.TestCase;
public class alumneTest extends TestCase {	
		alumne xg,ec;
	   @Before
		protected void setUp() throws Exception {
			 xg = new alumne("Xavier",39,2016,9,90,5);
			 ec = new alumne("Enric",17,2016,5,90,3);	
		}

	   @Test
		public void esMajorEdat() {
			
		   assertTrue("xg es major de edat", xg.esMajorEdat());
		   assertFalse("ec no es major de edat", ec.esMajorEdat());
		}
	   @Test
		public void aprovaM5() {			
			assertTrue("Xavi Aprova m5",xg.aprovaM5(90));	
			assertTrue("Enric aprova m5",ec.aprovaM5(90));
		
	   }
	   @Test
	   public void anysMatriculat() {
		      
		   assertEquals("Xavi porta",2016,xg.anysMatriculat(2018));
		   assertEquals("Enric porta",2016,ec.anysMatriculat(2018));
		   	   
		}
	   
	   
	   
	   
		
		 
	

}
