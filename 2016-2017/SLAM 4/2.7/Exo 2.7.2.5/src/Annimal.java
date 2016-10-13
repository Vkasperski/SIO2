public interface Annimal 
{
	public void setNom();
	public String getNom();
	public String parle();
	
	class Chat implements Annimal
	{
		private
			String Cnom;
			String Cnom2;
		public Chat(String nom)
		{
			Cnom=nom;
		}
		@Override
		public void setNom() 
		{
			Cnom=Cnom2;
		}

		@Override
		public String getNom() 
		{
			return Cnom;
		}

		@Override
		public String parle() 
		{
			return "MIAOUUUUUUUS!!!!";
		}
		
	}
	
	class Chien implements Annimal
	{
		private
		String Cinom;
		String Cinom2;
		
		public Chien(String nom)
		{
			Cinom=nom;
		}
		@Override
		public void setNom() 
		{
			Cinom=Cinom2;
		}

		@Override
		public String getNom() 
		{
			return Cinom;
		}

		@Override
		public String parle() 
		{
			
			return "ARCANIIIIIIIIN !!!";
		}
	}
	
	class Vache implements Annimal
	{
		private
		String Vnom;
		String Vnom2;
		
		public Vache(String nom)
		{
			Vnom=nom;
		}
		
		@Override
		public void setNom() 
		{
			Vnom=Vnom2;
		}

		@Override
		public String getNom() 
		{
			return Vnom;
		}

		@Override
		public String parle() 
		{
			return "ECREMEUUUUUUUUUUHHHH !!!!!";
		}
	}
	
	class Girafe implements Annimal
	{
		private
		String Gnom;
		String Gnom2;
		
		public Girafe(String nom)
		{
			Gnom=nom;
		}
		
		@Override
		public void setNom() 
		{
			Gnom=Gnom2;
		}

		@Override
		public String getNom() 
		{
			return Gnom;
		}

		@Override
		public String parle() 
		{
			return "NON EN VRAI ELLE FERME SA GUEULE PAUVRE CON ELLE EST MUETTE !!!!!";
		}
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args)
    {       Annimal a = new Chat("Miaous");
            Annimal b = new Chien("Arcanin");
            Annimal c = new Vache("Ecremeuh");
            Annimal d = new Girafe("Josianne");
            System.out.println(((Chat)a).getNom() +" dit : "+a.parle());
            System.out.println(((Chien)b).getNom() +" dit : "+b.parle());
            System.out.println(((Vache)c).getNom() +" dit : "+c.parle());
            System.out.println(((Girafe)d).getNom() +" la girafe dit : "+d.parle());
    }
}

















