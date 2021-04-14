package randArrayandSearch;

public class numberArrayAndSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] anArray;        

        anArray = new int[50]; 
        int smallest = anArray[0];
        int largetst = anArray[0];
        boolean found=false;

        
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] =  (int) (Math.random() * 25);
            System.out.print(anArray[i] + " ");
         if (anArray[i]> largetst)
         {
        largetst = anArray[i];
       
       
         }
         else if (anArray[i] < smallest)
         {
        smallest = anArray[i];
         }
     
        }
        System.out.println();
       
        System.out.println(smallest);
        System.out.println(largetst);

	}

}
