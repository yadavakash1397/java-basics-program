package feb1;

public class TwoDimensionalArray 
{

	public static void main(String[] args) 
	{
		/*int[][] a=new int[2][3];
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		
		a[1][0]=11;
		a[1][1]=21;
		a[1][2]=31;
		*/
		int[][] a= {{1,2},
					{5,6,7}};
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				if(i==0&&j==2)
					continue;
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
