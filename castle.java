import java.util.*;
public class castle
{
	public static void main (String[] args)
	{
		Scanner in= new Scanner (System.in);
		Room Start = new Room("Bridge Tower", 20, 20);
		Room Temp = new Room("Courtyard", 100, 100);
		Start.S = Temp;
		Temp.N = Start;
		Temp = new Room("Kitchen", 50, 50);
		Start.S.W = Temp;
		Temp.E = Start.S;
		Temp = new Room ("Servent Quarters", 45, 20);
		Start.S.W.S = Temp;
		Temp.N = Start.S.W;
		Temp= new Room ("Dungeon", 100, 100);




		String Choice=" ";
		Temp=Start;
		while (!Choice.equals ("q"))
		{
			System.out.println("You are in room " + Temp.Name);
			System.out.println("Which directon would you like to go?");
			Choice = in.next();
			if (Choice.equals ("s") && Temp.S != null)
			Temp = Temp.S;
			if (Choice.equals ("n") && Temp.N != null)
			Temp =Temp.N;
			if (Choice.equals ("e") && Temp.E != null)
			Temp= Temp.E;
			if (Choice.equals("w") && Temp.W !=null)
			Temp=Temp.W;
		}
	}
}

class Room
{
	String Name;
	int Width, Height;
	Room N, S, E, W;

	Room (String TheName, int TheWidth, int TheHeight)
	{
		Name = TheName;
		Width= TheWidth;
		Height= TheHeight;

	}

}