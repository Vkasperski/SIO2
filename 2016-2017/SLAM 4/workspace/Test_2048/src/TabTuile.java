public class TabTuile 
{
	private
		static int dimention;
		int TabJeu[][];
		
	public TabTuile(int dim)
	{
		try
		{
			dimention = dim;
			for(int i=0; i<dimention;i++)
			{
				for(int j=0; j<dimention;i++)
				{
					TabJeu[i][j]=0;
				}
			}
		}
		catch(Exception MauvaiseDimention)
		{
			System.out.println("Erreur la dimention de votre 2048 doit être positif non nul");
		}
	}
	
	public TabTuile popTuiles(TabTuile lol)
	{
		return lol;
	}
}
