package exercise2;

public class program4 {
	public static void main(String[] args) 
	{
		int x[][]={{1,2,3},{5,6,3},{5,5,5}};  
		int y[][]={{1,6,1},{2,4,5},{3,1,2}}; 
		int z[][]=new int[3][3];  
		
		for(int i=0,j=2;i<3;i++,j--)
			for(int k=0,l=2;k<3;k++,l--)
				z[i][k]=x[i][k]*y[j][l];
			
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(z[i][j]+" ");
			System.out.println();
		}
	}
}
