
public class Point 
{	
	private float abs;
	private float ord;
	
	public Point(float abs,float ord)
	{
		this.abs = abs;
		this.ord = ord;
	}
	
	public float getAbs()
	{
		return abs;
	}
	
	public float getOrd()
	{
		return ord;
	}
	
	public void setAbs(float abs)
	{
		this.abs = abs;
	}
	public void setOrd(float ord)
	{
		this.ord = ord;
	}
	
	public void afficherP()
	{
		System.out.println("absice : "+ abs);
		System.out.println("ordonné:" + ord);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Abscice du point : "+getAbs()+" ordonnée du point : "+getOrd();
	}
	
	public static void main(String[] args)
	{
		Point p = new Point(5,2);
		p.afficherP();
		p.setAbs(2);
		p.setOrd(5);
		p.afficherP();
	}
}