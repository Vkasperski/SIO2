public abstract class Devise implements Comparable
{
	private double somme = 0;

	public abstract double getCours();

	public void setSomme(Devise d)
	{
		this.somme = d.somme * d.getCours() / this.getCours();
	}

	public void setSomme(double somme)
	{
		this.somme = somme;
	}

	public double getSomme()
	{
		return somme;
	}
	
	@Override
	public String toString()
	{
		return "somme = " + somme + " ";
	}

	//----------------------------------------------------------------------------------//
	// IMPLEMENTATION DE L'INTERFACE COMPARABLE
	//----------------------------------------------------------------------------------//
	// IMPLEMENTATION DE LA METHODE COMPARE TO
	//----------------------------------------------------------------------------------//
	
	@Override
	public int compareTo(Comparable other) {
		double a = (new Dollars(this)).getSomme();
		double b = (new Dollars((Devise)other)).getSomme();	
		return (int) (a-b);
	}
	
	//----------------------------------------------------------------------------------//
	// MAIN 
	//----------------------------------------------------------------------------------//
	
	public static void main(String[] args)
	{
		Dollars d = new Dollars(1);
		System.out.println(d);

		
		Euros e = new Euros(d);
		System.out.println(e);
		
		Livres l = new Livres(e);
		System.out.println(l);

		Rouble r = new Rouble(l);
		System.out.println(r);
		
		Yen y = new Yen(r);
		System.out.println(y);

		
		FrancCFA fc = new FrancCFA(y);
		System.out.println(fc);
		
		Dram_armenien da = new Dram_armenien(d);
		System.out.println(da);
		
		Rial_Iranien ri = new Rial_Iranien(d);
		System.out.println(ri);
		
		
	}
}


//----------------------------------------------------------------------------------//
// MONNAIE IRANIENNE
//----------------------------------------------------------------------------------//
class Rial_Iranien  extends Devise
{
	public Rial_Iranien(Devise d)
	{
		setSomme(d);
	}
	
	public Rial_Iranien(double somme)
	{
		setSomme(somme);
	}
	
	@Override
	public double getCours()
	{
		return 1/31319.4586;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "Rial Iranien";
	}
}

//----------------------------------------------------------------------------------//
// MONNAIE ARMENIENNE
//----------------------------------------------------------------------------------//

class  	Dram_armenien extends Devise
{
	public Dram_armenien(Devise d)
	{
		setSomme(d);
	}
	
	public Dram_armenien(double somme)
	{
		setSomme(somme);
	}
	
	@Override
	public double getCours()
	{
		return 1/473.9828;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "Dram Armenien";
	}
}

//----------------------------------------------------------------------------------//
// MONNAIE AFRICAINE
//----------------------------------------------------------------------------------//

class FrancCFA extends Devise
{
	public FrancCFA(Devise d)
	{
		setSomme(d);
	}
	
	public FrancCFA(double somme)
	{
		setSomme(somme);
	}
	@Override
	public double getCours()
	{
		return 0.00170225;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " Francs CFA";
	}
}

//----------------------------------------------------------------------------------//
// MONNAIE NIAKWE
//----------------------------------------------------------------------------------//

class Yen extends Devise
{
	public Yen(Devise d)
	{
		setSomme(d);
	}
	
	
	public Yen(double somme)
	{
		setSomme(somme);
	}
	
	@Override
	public double getCours()
	{
		return 0.0098;
	}
	
	
	@Override
	public String toString()
	{
		return super.toString() + "Yens";
	}
}

//----------------------------------------------------------------------------------//
// MONNAIE FEUJ
//----------------------------------------------------------------------------------//

class Rouble extends Devise
{
	public Rouble(Devise d)
	{
		setSomme(d);
	}
	
	
	public Rouble(double somme)
	{
		setSomme(somme);
	}
	
	@Override
	public double getCours()
	{
		return 0.0154;
	}
	
	
	@Override
	public String toString()
	{
		return super.toString() + "Roubles";
	}
}

//----------------------------------------------------------------------------------//
// MONNAIE ROSEBEEF
//----------------------------------------------------------------------------------//

class Livres extends Devise
{
	public Livres(Devise d)
	{
		setSomme(d);
	}

	public Livres(double somme)
	{
		setSomme(somme);
	}

	@Override
	public double getCours()
	{
		return 1.95842;
	}

	@Override
	public String toString()
	{
		return super.toString() + " Livres";
	}
}

//----------------------------------------------------------------------------------//
// MONNAIE BOUFFEUR DE GRENOUILLES
//----------------------------------------------------------------------------------//

class Euros extends Devise
{
	public Euros(Devise d)
	{
		setSomme(d);
	}

	public Euros(double somme)
	{
		setSomme(somme);
	}

	@Override
	public double getCours()
	{
		return 1.4625;
	}

	@Override
	public String toString()
	{
		return super.toString() + " Euros";
	}
}

//----------------------------------------------------------------------------------//
// MONNAIE DE BASE (AMERICAINE)
//----------------------------------------------------------------------------------//

class Dollars extends Devise
{
	public Dollars(Devise d)
	{
		setSomme(d);
	}

	public Dollars(double somme)
	{
		setSomme(somme);
	}

	@Override
	public double getCours()
	{
		return 1.;
	}

	@Override
	public String toString()
	{
		return super.toString() + " Dollars";
	}
}
