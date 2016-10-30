package test2048;

import java.awt.FlowLayout;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Test2048 
{
	public static void main(String[]args)
	{
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setTitle("2048");
		f.pack();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(new FlowLayout());
		f.getContentPane().add(new JButton("my First JButton"));
		Scanner dim = new Scanner(System.in);
		Scanner choix = new Scanner(System.in);
		int dimention;
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
						System.out.println("Plus de mouvelent disponible");
					}
				}while(chx!='2' && chx !='3');
		}while(chx!='3');
		dim.close();
		choix.close();
	}
}