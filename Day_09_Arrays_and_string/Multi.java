public class Multi {
    public static void main(String[] args) {
        // Multi-dimensional array
        // 1. 2D array
        // int [][] rollNums = new int[3][3];

        // rollNums[0][0] = 50;
        // rollNums[0][1] = 51;
        // rollNums[0][2] = 52; 

        // rollNums[1][0] = 53;
        // rollNums[1][1] = 54;
        // rollNums[1][2] = 55;

        // rollNums[2][0] = 56;
        // rollNums[2][1] = 57;
        // rollNums[2][2] = 58;
        
        // for(int row = 0;row < rollNums.length;row++){
        //     for(int col =0;col< rollNums[row].length;col++){
        //         System.out.print(rollNums[row][col]+" ");
        //     }
        //     System.out.println();
        // }

       //Variable column in 2-d Arrays.
       
    //    int [][] arr = new int[3][];
       
    //    // define the column size for each row
    //    arr[0] = new int[2];
    //    arr[1] = new int[3];
    //    arr[2] = new int[4];

    //   // values intialize in 2-d array.
    //   arr[0][0] = 21;
    //   arr[0][1] = 22;
    //                      //arr[0][2] = 23; // This will throw an ArrayIndexOutOfBoundsException because arr[0] has only 2 columns.
    //    arr[1][0] = 24;
    //    arr[1][1] = 25;
    //    arr[1][2] = 26;

    //    arr[2][0] = 27;
    //    arr[2][1] = 28;
    //    arr[2][2] = 29;
    //    arr[2][3] = 30;

    //    for(int row = 0;row < arr.length;row++){
    //        for(int col =0;col< arr[row].length;col++){
    //            System.out.print(arr[row][col]+" ");
    //        }
    //        System.out.println();
    //    }


       // Another way to define 2-d array and 1-d array.

        // int [] arr = {1,23,3,3};
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

         
        int [][] arr1 = {
            {1,2,3},
            {21,22,22},
            {2,23,2,2}
        };

        for(int row = 0;row <arr1.length;row++){
            for(int col = 0;col<arr1[row].length;col++){
                System.out.print(arr1[row][col]+" ");
            }
            System.out.println();
        }



    }
}
