package Test;

import General.Exemple;
import junit.framework.TestCase;

public class ExempleTest extends TestCase{
	
	public void test1(){
		Exemple ex=new Exemple(1,1);
		assertEquals(2,ex.calculer());
	}

}
