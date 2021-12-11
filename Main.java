import java.util.Scanner;
class Main
{
	public static void main(String Args[])
	{
		int w;
		do
		{ 
			System.out.println("1. SBI Bank Service -Normal-");
			System.out.println("2. About Our Galaxy -Inheritance-");
			System.out.println("3. School Result -Overlording-");
			System.out.println("4. Exit");

			System.out.println("Enter Your Choose");
        	Scanner sc1=new Scanner(System.in);
        	w=sc1.nextInt();
			switch(w)
			{
				case 1:
					{
						Sbi sb=new Sbi();
						sb.group();
						break;
					}
				case 2:
					{
					Galaxy gl=new Galaxy();
					gl.all();
					break;
					}
				case 3:
					{
					School sl=new School();
					School sl1=new School("Taher","English",60);
					sl.name="Rohit";
					sl.subject="Math";
					sl.marks=65;
					System.out.println(sl1);
					System.out.println(sl);
					break;
					}
				case 4:
					{
					System.out.println("Visit again");
					break;
					}
				default:
					{
					System.out.println("Pls Press Right Key");
					break;
					}
			}
		}while(w!=4);
	}
}
class Sbi
{
	void group()
	{
	int cha,u,no,p,pa;
       do
       {
        System.out.println("Welcomr to SBI");
        System.out.println("");
        System.out.println("");
        
        System.out.println("1. Mobile Banking");
        System.out.println("2. Net Banking");
        System.out.println("3. Customer Service");
        System.out.println("4. Exit");

        System.out.println("");
        System.out.println("");
        System.out.println("Enter Your Choose");
        Scanner sc1=new Scanner(System.in);
        cha=sc1.nextInt();
        switch(cha)
        {
            case 1:
            {
                System.out.println("-:Welcome to SBI Mobile Banking:-");
                System.out.println("Enter Your Mobile Number:-");
                Scanner input1=new Scanner(System.in);
                String o=input1.nextLine();
                System.out.println("Enter Your Password:-");
                Scanner input2=new Scanner(System.in);
                String q=input2.nextLine();
                System.out.println("You are all Set");
                break;
            }
            case 2:
            {
                System.out.println("-:Welcone to SBI Net Banking:-");
             	System.out.println("Enter Your username:-");
                Scanner input1=new Scanner(System.in);
                String z=input1.nextLine();
                System.out.println("Enter Your Password:-");
                Scanner input2=new Scanner(System.in);
                String j=input2.nextLine();
                System.out.println("Welcone "+z+"Start Ur tranjection");
                break;
            }
            case 3:
            {
            	System.out.println("Welcone to SBI Customer Service");
            	System.out.println("We will Happy to Help You");
            	break;
            }
            case 4:
            {
            	System.out.println("Thank You");
            	break;
            }
            default :
            {
            	System.out.println("Invalid Input");
            	break;
            }
        }
     }while(cha!=4);
    }
}
class SolarSystem
{
	void planets()
	{
	System.out.println("");
	System.out.println("-:Planets Nmae:-");
	System.out.println("1. Marcury");
	System.out.println("2. Venus");
	System.out.println("3. Earth");
	System.out.println("4. Mars");
	System.out.println("5. Jupiter");
	System.out.println("6. Saturn");
	System.out.println("7. Uranus");
	System.out.println("8. Neptune");
	}
	void star()
	{
	System.out.println("");
	System.out.println("-:Star Name:-");
	System.out.println("1. Sun");
	}
}
class Earth extends SolarSystem
{
	void wonders()
	{
	System.out.println("");
	System.out.println("-:Seven wonders Name of Earth:-");
	System.out.println("1. Great Pyramid of Giza");
	System.out.println("2. Great wall of Chaina");
	System.out.println("3. Petra");
	System.out.println("4. The colosseum");
	System.out.println("5. Machu Picchu");
	System.out.println("6. Taj Mahal");
	System.out.println("7. Christ the Redeemer");
	}
	void continents()
	{
	System.out.println("");
	System.out.println("-:continents Name of Earth:-");
	System.out.println("1. Asia");
	System.out.println("2. Africa");
	System.out.println("3. North America");
	System.out.println("4. South America");
	System.out.println("5. Antarctica");
	System.out.println("6. Oceania");
	System.out.println("7. Europe");
	}
}
class Galaxy extends Earth
{
	void all()
	{
		planets();
		star();
		continents();
		wonders();
	}
}
class School
{
	String name;
	String subject;
	int marks;
	School()
	{
		name="";
		subject="";
		marks=0;
	}
	School(String n,String s,int m)
	{
		name=n;
		subject=s;
		marks=m;
		System.out.println(n+"got"+m+"marks in"+s);
	}
}