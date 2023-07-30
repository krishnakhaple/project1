package package2;

public class Primenumber {

	

	

		public Primenumber() 
		{
			
		}

		public static void main(String[] args) 
		{
			int num=101,prime=1;;
			for(int v=2;v<num;v++)
			{
				if(num%v==0)
				{
					prime=0;
					break;
				}
			}
			
			if(prime==1)
			{
				System.out.println("it is prime");  
			}
			else
			{
				System.out.println("it is not prime number");
			}

		}

	}



