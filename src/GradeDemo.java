
public class GradeDemo {
	
	public static char findGrade(double per)
	{
		if(per>=80 && per<=100)
		{
			return 'A';
		}
		else if(per>=60 &&  per<80)
		{
			return 'B';
		}
		else if(per >=40 && per< 60)
		{
			return 'c';
		}
		else if(per >=30 && per< 40)
		{
			return 'D';
		}
		else if(per>=0 && per<30)
		{
			return 'E';
		}
		else
		{
			return 'O';
		}
	}
	public static void main(String[] args) 
	{
	
		
	}

}
