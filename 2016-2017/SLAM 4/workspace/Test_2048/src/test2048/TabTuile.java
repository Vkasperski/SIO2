package test2048;
import java.util.ArrayList;

public class TabTuile 
{
	private
		int dimention;
		int TabJeu[][];
		
	public TabTuile(int dim)
	{
		try
		{
			dimention = dim;
			int Tab[][] = new int[dim][dim];
			for(int i=0; i<dim;i++)
			{
				for(int j=0; j<dim;j++)
				{
					Tab[i][j]=0;
				}
			}
			TabJeu = Tab;
		}
		catch(Exception MauvaiseDimention)
		{
			System.out.println("Erreur la dimention de votre 2048 doit �tre positif non nul");
		}
	}
	
	public int getDim()
	{
		return dimention;
	}
	
	public int[][] getTab()
	{
		return TabJeu;
	}
	
	public void affichTab()
	{
		for(int i=0; i<dimention;i++)
		{
			System.out.print("| ");
			for(int j=0;j<dimention;j++)
			{
				if(TabJeu[i][j]==0)
				{
					System.out.print("  | ");
				}
				else
					System.out.print(TabJeu[i][j]+" | ");
			}
			System.out.print("\n");
		}
	}
	
	public void popTuiles()
	{
		ArrayList<Integer> ligne = new ArrayList<Integer>();
		ArrayList<Integer> colone = new ArrayList<Integer>();
		int index=0;
		for(int i=0; i<dimention;i++)
		{
			for(int j=0; j<dimention;j++)
			{
				if(TabJeu[i][j]==0)
				{
					ligne.add(i);
					colone.add(j);
					index=+1;
				}
			}
		}
		index = (int) (Math.random() * ligne.size() );
		int nbPop = (int)(Math.random() * 4);
		if(nbPop==3)
		{
			nbPop = 4;
		}
		else
		{
			nbPop = 2;
		}
		TabJeu[ligne.get(index)][colone.get(index)]= nbPop;
	}
	
	public void MoveLeft()
	{
		int k;
		for(int i=0;i<dimention;i++)
		{
			for(int j=1;j<dimention;j++)
			{
				if(TabJeu[i][j]!=0)
				{
					if(	)
					if(TabJeu[i][j-1]==TabJeu[i][j])
					{
						TabJeu[i][j-1]=TabJeu[i][j]*2;
						TabJeu[i][j]=0;
						for(k=j;k<dimention-1;k++)
						{
							TabJeu[i][k]=TabJeu[i][k+1];
							TabJeu[i][k+1]=0;
						}
					}
				}
			}
		}	
	}
	
	
	public static void main(String[] args)
	{
		TabTuile T = new TabTuile(4);
		T.popTuiles();
		T.popTuiles();
		T.MoveLeft();
		T.affichTab();
		System.out.println("\n \n \n \n ");
		T.popTuiles();
		T.popTuiles();
		T.popTuiles();
		T.popTuiles();
		T.popTuiles();
		T.popTuiles();
		T.popTuiles();
		T.popTuiles();
		T.affichTab();
		System.out.println("\n \n \n \n ");
		T.MoveLeft();
		T.MoveLeft();
		T.MoveLeft();
		T.MoveLeft();
		T.MoveLeft();
		T.MoveLeft();
		T.MoveLeft();
		T.MoveLeft();
		T.affichTab();
	}
}