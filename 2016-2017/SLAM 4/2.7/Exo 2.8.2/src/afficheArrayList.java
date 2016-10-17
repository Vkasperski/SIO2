import java.util.ArrayList;

public class afficheArrayList 
{

	public static ArrayList<String> inversser(ArrayList<String> name)
	{
		ArrayList<String> copie = new ArrayList<>();
		for(int i= name.size()-1;i>=0;i++)
		{
			copie.add(name.get(i));
		}
		return copie;
	}
	
	
	public static void main(String[] args)
	{
		ArrayList<String> Nom = new ArrayList<>();
		
		Nom.add("mouloud");
		Nom.add("Moussa");
		Nom.add("Oussama");
		Nom.add("Ben-haid");
		Nom.add("Ourmazd");
		Nom.add("Mamadou");
		Nom.add("Pepito");
		Nom.add("Ngijol");
		Nom.add("Mohamed");
		
		for(String name : Nom)
		{
			System.out.println(name);
		}
		Nom = inversser(Nom);
		
		for(String name : Nom)
		{
			System.out.println(name);
		}
	}
}
