import java.util.Scanner;
class Matrix{
	public static void main(String[] argv){
		
		int[][] a=new int[10][10];
		int[][] b=new int[10][10];
		int[][] c=new int[10][10];
		int i=0,j=0,k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Matrix Multiplication...\n!");
		
		
		System.out.println("1st Matrix...\n");
		System.out.print("Enter number of rows:");
		int m=sc.nextInt();
		System.out.print("Enter number of columns:");
		int n=sc.nextInt();
		System.out.print("Enter the elements:");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("1st Matrix...\n");
		for(i=0;i<m;i++){
			System.out.println();
			for(j=0;j<n;j++){
				System.out.println("\n"+a[i][j]);
			}
			System.out.print("\t");
		}
		
		
		
		System.out.println("2nd Matrix...\n");
		System.out.print("Enter number of rows:");
		int p=sc.nextInt();
		System.out.print("Enter number of columns:");
		int q=sc.nextInt();
		System.out.print("Enter elements:");
		for(i=0;i<p;i++){
			for(j=0;j<q;j++){
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("2nd Matrix...\n");
		for(i=0;i<p;i++){
			System.out.println();
			for(j=0;j<q;j++){
				System.out.println(""+b[i][j]);
			}
			System.out.print("\t");
		}
		
		
		if(m!=q){
			System.out.println("Matrix multiplication not possible");
		}
		else{
			
			for(i=0;i<m;i++){
				
				for(j=0;j<q;j++){
					c[i][j]=0;
					for(k=0;k<m;k++){
						c[i][j]=a[i][k]*b[k][j];
					}
					
				}
				
			}
			
			
		}
		
		System.out.println("multiplied matrix...");
		for(i=0;i<m;i++){
			System.out.println();
			for(j=0;j<q;j++){
				System.out.println(""+c[i][j]);
			}
			System.out.print("\t");
 		}
		
	}
}
