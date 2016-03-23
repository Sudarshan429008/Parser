import java.util.Scanner;

public class sudarshan 
{


	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(sudarshan.class.getResourceAsStream("input.data"));
		
	    while(input.hasNextLine())
		{
		String line = input.nextLine();
	
		if(line.contains("<"))	
		{
				line = line.replaceAll("<", "");
				line = line.replaceAll(">", "->");
				String[] run = line.split("/");
				line= run[0];
		}
		
				System.out.println(line);
		}
			
			}		
				}

	 