// KASPERSKI VICTOR : TEST 2048
// 07/11/2016

package test2048;

import java.util.Scanner;


public class Test2048 
{
	public static void main(String[]args)
	{
		Scanner dim = new Scanner(System.in);
		Scanner choix = new Scanner(System.in); 
		int dimention;
		char isWin='0';
		char chx = '1';
		do
		{
			System.out.print("Dimention du 2048 : ");
			try
			{
				dimention = dim.nextInt();
			}
			catch(Exception e)
			{
				System.out.println("Dimention incorect dimention 4 cases sur 4 utilis� par d�faut!!!");
				dimention = 4;
			}
			TabTuile Game = new TabTuile(dimention);
			TabTuile Save = new TabTuile(dimention);
			Save.setTab(Game);
				do
				{
					if(chx=='1'||chx=='2'||chx=='g'||chx=='G'||chx=='d'||chx=='D'||chx=='b'||chx=='B'||chx=='h'||chx=='H')
					{
						if(Game.CheckMove(Save))
						{
							Game.popTuiles();
							Game.popTuiles();
						}
					}
					Game.affichTab();
					Save.setTab(Game);
					if(Game.MovePossible())
					{
						System.out.println(" 'g'->Gauche \n 'd'->Droite \n 'b'->Bas \n 'h'->Haut");
						System.out.println(" '1'->reset \n '2'->Nouvelle Partie \n '3'->Quitter \n" );
						chx = choix.next().charAt(0);
						switch (chx)
						{
							case '1' :
								Game.reset();
								break;
							case '2' :
								System.out.println("\n\n\n\n");
								break;
							case '3' :
								break;
							case 'g' | 'G' :
								Game.MoveLeft();
								break;
							case 'd' | 'D' :
								Game.MoveRight();
								break;
							case 'h' | 'H' :
								Game.MoveUp();
								break;
							case 'b' | 'B' :
								Game.MoveDown();
								break;
							default :
								System.out.println("\n Choix non disponible");
								break;
						}
					}
					else
					{
						System.out.println("Plus de mouvelent disponible :\n 1->reset \n 2->Nouvelle Partie \n 3->Quitter");
						chx = choix.next().charAt(0);
						if(chx!='1' && chx!='2' && chx!='3')
						{
							System.out.println("Choix non disponible");
						}
					}
					if(isWin=='0')
					{
						if(Game.is2048())
						{
							isWin='1';
						}
					}
				}while(chx!='2' && chx !='3');
		}while(chx!='3');
		dim.close();
		choix.close();
	}
}