import java.io.*;
import java.util.*;

class U_in
{   Scanner sc;
	U_in()
	{
		sc = new Scanner(System.in);
	}
}

class Cases extends U_in
{   
 	Cases()
	{
	   int choice=0;

       while(choice != 10)
        {
		System.out.println("---------Menu-----------");
		System.out.println("1. Create File");
		System.out.println("2. File Name");
		System.out.println("3. File Path");
		System.out.println("4. Write File");
		System.out.println("5. Read File");
		System.out.println("6. File Raname");
		System.out.println("7. Can Read?");
		System.out.println("8. Can Write?");
		System.out.println("9. Delete File");
		System.out.println("10. Exits");

		System.out.println("---------------------------");
		System.out.print("Enter Above Choice :-");

        choice = sc.nextInt();
 		

		switch(choice)
		{
			case 1:
			new Create();
			break;

			case 2:
			new Filename();
			break;

			case 3:
			new Filepath();
			break;

            case 4:
			new Write();
			break;

			case 5:
			new FileRead();
			break;

			case 6:
			new Rename();
			break;

			case 7:
			new Canread();
			break;

			case 8:
			new Canwrite();
			break;

			case 9:
			new Delete();
			break;

			case 10:
			System.out.println("Exists...");
			break;
		}

	}
   }
}

class Create extends U_in
{
	Create()
	{
 		System.out.print("Enter File Name :-");
 		String name = sc.nextLine();
 		
 		try{
	 		File f = new File(name);
	 		f.createNewFile();
	 		System.out.println("***************************");
	 		System.out.println("File Create Successfully...");
	 		System.out.println("***************************");
 			}
 		 catch(IOException e)
 		{
 			System.out.println(e);
 		}
 	}
}
class Filename extends U_in
{
	Filename()
	{	
	  System.out.print("Enter File Path :-");
	  String path = sc.nextLine();
	 	try{

		    File f =new File(path);
		    if(f.exists())
		    {
		    System.out.println("***************************");
		 	System.out.println("File Name Is :-"+f.getName());
		 	System.out.println("***************************");
 			}
 			else 
 			{
 				System.out.println("File Dose Not Exits...");
 			}
 			}

 		catch(Exception e)
 		{
 			System.out.println(e);
 		}
	}
}

class Filepath extends U_in
{
	Filepath()
	{

		System.out.print("Enter File Name With Txt Extension :-");
	    String path = sc.nextLine();
	    try{
	    File f = new File(path);
	        System.out.println("***************************");
		 	System.out.println("File Path Is :-"+f.getAbsolutePath());
		 	System.out.println("***************************");
		 }
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class Write extends U_in
{
	Write()
	{
 		System.out.print("Enter File Name :-");
 		String name =sc.nextLine();
 		try{
 		   FileWriter fw = new FileWriter(name);
 	     	System.out.print("Write Your Content Here :-");
 	    	String content = sc.nextLine();
 		   fw.write(content);
 		 fw.close();
 		 System.out.println("***************************");
		 System.out.println("Your Content Write Successfully...");
		 System.out.println("***************************");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	
}

class FileRead extends U_in
{
	FileRead()
	{
		System.out.print("Enter File Name Which File You Want To Read :-");
		String name = sc.nextLine();
		try
		{
			FileReader fr = new FileReader(name);
			int val;
			 System.out.println("***************************");
			while((val=fr.read())!=-1)
			{
				System.out.print((char)val);
			}
			System.out.println();
			 System.out.println("***************************");
			fr.close();
		}

		catch(Exception e)
		{
				System.out.println(e);
		}
	}
}

class Rename extends U_in
{
	Rename()
	{
		System.out.print("Enter File Name Which You Want To Rename:-");
		String oldfile = sc.nextLine();
		

		try{
			File frename = new File(oldfile);
			if(frename.exists())
			{
				System.out.print("Enter New File Name:-");
		        String newfile = sc.nextLine();
				frename.renameTo(new File(newfile));
				 System.out.println("***************************");
				System.out.println("File Rename Successfully...");
				 System.out.println("***************************");
			}
			else
			{   
				 System.out.println("***************************");
				System.out.println("Please Enter valid File Name...");
				 System.out.println("***************************");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class Canread extends U_in
{
	 Canread()
	 {
	 	System.out.print("Enter File Name Which Want To Check File Read Or Not ?");
	 	String name = sc.nextLine();
	 	try
	 	{
	 		File f = new File(name);
	 		if(f.canRead())
	 		{
	 			System.out.println("***************************");
	 			System.out.println("You Can Read File...");
	 			System.out.println("***************************");
	 		}
	 		else
	 		{
	 			System.out.println("***************************");
	 			System.out.println("You Can Not Read File...");
	 			 System.out.println("***************************");
	 		}

	 	}
	 	catch(Exception e)
	 	{
	 		System.out.println(e);
	 	}
	 }
}

class Canwrite extends U_in
{
	Canwrite()
	{
		System.out.println("Enter File Name Which Want To Check File Write Or Not ?");
		String name = sc.nextLine();
		try 
		{
			File f =new File(name);
			if(f.exists())
			{
				System.out.print("You Can Write File...");
			}
			else
			{
				System.out.print("You Can Not Write File..");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class Delete extends U_in
{
	Delete()
	{
		System.out.print("Enter File Which You Want To Delete :-");
		String name = sc.nextLine();

		try 
		{
			File f = new File(name);
			 if(f.delete())
			 {  System.out.println("=============================");
			 	System.out.println("File Delete Successfully.....");
			 	System.out.println("=============================");
			 }
			 else{
			 	System.out.println("File Can Not Delete...");
			 }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class Menu
{
	public static void main(String[] args) 
	{
	      	Cases cs = new Cases();
	}
}