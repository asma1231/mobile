package Test;

import General.Calculatrice;
import junit.framework.TestCase;

public class CalculatriceTest extends TestCase{
	
	public void test1(){
		Calculatrice c=new Calculatrice();
		assertEquals(8,c.multiplication(4,2));
	}

}
