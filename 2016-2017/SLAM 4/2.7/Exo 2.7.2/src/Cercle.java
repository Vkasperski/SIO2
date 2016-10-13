public class Cercle extends Point
{
	private float rayon;
	
	public Cercle(float abs, float ord, float rayon)
	{
		super(abs, ord);
		this.setRayon(rayon);
	}

	public float getRayon() 
	{
		return rayon;
	}

	public void setRayon(float rayon) 
	{
		if(rayon>0)
		{
			this.rayon = rayon;
	
		}
	}
	
	
	public void affCercle()
	{
		System.out.println("absisce : "+ getAbs());
		System.out.println("ordonné : "+ getOrd());
		System.out.println("rayon : "+ rayon);
	}
	@Override
	public String toString() {
		
		return super.toString()+" rayon : "+getRayon();
	}
	public static void main(String[] args)
	{
		Cercle C = new Cercle(1,2,3);
		C.affCercle();
		System.out.println(C.toString());
	}
}
