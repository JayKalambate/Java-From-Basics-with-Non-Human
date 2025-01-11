class DimentionsArray {
    public static void main(String args[])
    {
        int arr[][] = new int [3][2]; // 3 rows and 2 columns
        arr[0][0] = 1;
        arr[0][1] = 2;
      
        
        // This will print the array
        for (int i = 0; i < arr.length; i++) { // This is for First Dimension
    

            // This is for Second Dimension
            for(int j= 0;j<arr.length;j++)
            {

                // This is to Print Both of the dimentions
            
                System.out.println(arr[i][j] + " ");
            }
    }
}
}
