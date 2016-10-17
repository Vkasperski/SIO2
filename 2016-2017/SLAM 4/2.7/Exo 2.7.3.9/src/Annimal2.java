public abstract class Annimal2 implements Comparable
{
	private
		String Cnom;
	
	public void setNom(String nom)
	{
		Cnom = nom;
	}
	public String getNom()
	{
		return Cnom; 
	}
	
	public String parle()
	{
		return Cnom + " dit : ";
	}
	
	@Override
	public int compareTo(Comparable other) 
	{
		int long1 = this.getNom().length();
		int long2 = ((Annimal2)other).getNom().length();
		return long1-long2;
	}



	public static void main(String[] args)
    {       
			Annimal2 a = new Chat("Miaous");
            Annimal2 b = new Chien("Arcanin");
            Annimal2 c = new Vache("Ecremeuh");
            Annimal2 d = new Girafe("Josianne");
            System.out.println(((Chat)a).getNom() +" dit : "+a.parle());
            System.out.println(((Chien)b).getNom() +" dit : "+b.parle());
            System.out.println(((Vache)c).getNom() +" dit : "+c.parle());
            System.out.println(((Girafe)d).getNom() +" la girafe dit : "+d.parle());
    }
}

	
	
	class Chat extends Annimal2
	{
		public Chat(String nom)
		{
			setNom(nom);
		}
		
		@Override
		public String parle()
		{
			return "MIAOUUUUUUUS !!!!";
		}
	}
	
	
	class Chien extends Annimal2
	{
		public Chien(String nom)
		{
			setNom(nom);
		}
		@Override
		public String parle() 
		{
			
			return "ARCANIIIIIIIIN !!!";
		}
	}
	
	
	class Vache extends Annimal2
	{
		public Vache(String nom)
		{
			setNom(nom);
		}
		
		@Override
		public String parle() 
		{
			return "ECREMEUUUUUUUUUUHHHH !!!!!";
		}
	}
	

	
	
	class Girafe extends Annimal2
	{
		public Girafe(String nom)
		{
			setNom(nom);
		}
		
		@Override
		public String parle() 
		{
			return "NON EN VRAI ELLE FERME SA GUEULE PAUVRE CON ELLE EST MUETTE !!!!!";
		}
	}