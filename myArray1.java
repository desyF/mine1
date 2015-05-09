public class myArray1{

        public static void main(String[] args){
                int i;
                int j;
                int[][] arrayNumber = new int[6][5];
                // column 0
                arrayNumber[0][0] = 10;
                arrayNumber[0][1] = 12;
                arrayNumber[0][2] = 43;
                arrayNumber[0][3] = 11;
                arrayNumber[0][4] = 22;

                // column 1
                arrayNumber[1][0] = 20;
                arrayNumber[1][1] = 45;
                arrayNumber[1][2] = 56;
                arrayNumber[1][3] = 1;
                arrayNumber[1][4] = 33;

		System.out.println("Array 1 test!");
                
                for(i=0; i<6; i++){
                    for(j=0; j<5; j++){
                       System.out.print(arrayNumber[i][j]+" ");
                          
                    }
                    System.out.println(" ");                     
                }
                

	}
}
