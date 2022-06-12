package Test;

import General.Fouad;
import junit.framework.TestCase;

public class FouadTest extends TestCase{
	public void test(){
		Fouad f=new Fouad();
		f.setNom("Fouad");
		f.setPrime(250000);
		f.setSalaire(200000);
		f.getNom();
		f.getPrime();
		f.getSalaire();
		assertEquals(15000,f.CalculeSalaire(10000,5000));
	}
	public void test1(){
		Fouad f=new Fouad("ali", 200000, 150000);
		f.setNom("asma");
		f.setPrime(250000);
		f.setSalaire(200000);
		assertEquals(450000,f.CalculeSalaire(f.getSalaire(),f.getPrime()));
	}

}
