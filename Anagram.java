import java.util.Scanner;

public class Anagram{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter s1 string ");
		String s1=sc.nextLine();
		System.out.println("Enter s2 string ");
		String s2=sc.nextLine();
		String s3=s2;
		int flag=0;
		for(int i=0;i<s1.length();i++)
		{
			flag=0;
			for(int j=0;j<s2.length();j++)
			{
				if(s1[i]==s2[j])
				{
					flag=1;
					s2[j]=".";
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("s1 ans s2 not anagram");
				return 0;
			}
		}
		
		for(int i=0;i<s3.length();i++)
		{
			flag=0;
			for(int j=0;j<s1.length();j++)
			{
				if(s3[i]==s1[j])
				{
					flag=1;
					s3[i]=".";
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("s1 ans s2 not anagram");
				return 0;
			}
		}
}
	}
			
		