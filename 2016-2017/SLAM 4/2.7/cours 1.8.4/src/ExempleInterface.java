interface Saluer
{
        public void saluer();
        public void insulter();
}

class Bonjour implements Saluer
{
        @Override
        public void saluer()
        {
                System.out.println("Bonjour");
        }
        
        @Override
        public void insulter()
        {
        	System.out.println("salle enculeur de mouton néonaziste");
        }
}

class Hello implements Saluer
{
        @Override
        public void saluer()
        {
                System.out.println("Hello");
        }
        
        @Override
        public void insulter()
        {
        	System.out.println("dining sheep fucker neo-Nazism");
        }
}

class GutenTag implements Saluer
{
        @Override
        public void saluer()
        {
                System.out.println("Guten tag");
        }
        
        @Override
        public void insulter()
        {
        	System.out.println("Speise Schafe Ficker Neonazismus");
        }
}

class DzienDobry implements Saluer
{
	@Override
	public void saluer()
	{
		 System.out.println("Dzien Dobry");
	}
	
	@Override
	public void insulter()
	{
		System.out.println("jadalnia owce skurwiel neo-nazizm");
	}
}
public class ExempleInterface
{
        public static void main(String[] args)
        {
                Saluer s = new Bonjour();
                s.saluer();
                s.insulter();
                s = new Hello();
                s.saluer();
                s.insulter();
                s = new DzienDobry();
                s.saluer();
                s.insulter();
                Saluer[] t = new Saluer[] { new Bonjour(), new Hello(), new GutenTag(), new DzienDobry() };
                for (int i = 0; i < 4; i++)
                {
                        t[i].saluer();
                		t[i].insulter();
                }
        }
}