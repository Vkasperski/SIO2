package essaie;

class ClasseMere
	{
		private int x;
		public ClasseMere(int x)
		{
			this.x = x;
		}
		public int getX()
		{
			return x;
		}
		@Override
		public String toString() {
		
		return "toto";
		}
	}
	
class ClasseFille extends ClasseMere
	{
		private int y;
		public ClasseFille(int x, int y)
		{
			super(x);
			this.y = y;
		}
		
		public int getY()
		{
			return y;
		}
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return "Rattata";
		}
		
	}

public class TestClasseFillePolymorphisme
{
	public static void main(String[] args)
	{
		ClasseMere o = new ClasseFille(1,2);
		System.out.println("(" + o.getX() + ", " + ((ClasseFille) o).getY()+ ")");
		
		Object p = new ClasseFille(1,2);
		System.out.println("(" + p.toString() + ", " + p.hashCode()+ ")");
		
		System.out.println();
	}
}
