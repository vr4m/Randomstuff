package uebung04;

/**
 * Created by vrm on 20/04/16.
 */
public class fourtwenty {

    public static int mod_add(int number_one, int number_two, int modulo_numb){

        int result = (number_one + number_two)%modulo_numb;

        return result;
    }

    public static int mod_mul(int number_one, int number_two, int modulo_numb){

        int result = (number_one*number_two)%modulo_numb;

        return result;
    }

    public static int search420(int[][] array){

        int count = 0;
        /*
        * All the && Statements within the For-loops are just boundries for the array
        */
        //left -> right
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i][j]==4 && j< array.length-1){
                    if(array[i][j+1]==2 && j < array.length -2){
                        if(array[i][j+2]==0){
                            count++;
                        }
                    }
                }

            }
        }

        //right -> left
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length -1; j > 0; j--) {
                if(array[i][j]==4 && j>0){
                    if(array[i][j-1]==2 && j>0){
                        if(array[i][j-2]==0){
                            count++;
                        }
                    }
                }
            }
        }

        //Up -> down
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                if(array[i][j]==4 && i<array.length-1){
                    if(array[i+1][j]==2 && i< array.length-2){
                        if(array[i+2][j]==0){
                            count++;
                        }
                    }
                }
            }
        }

        // Down -> Up
        for (int i = array.length-1; i > 0; i--) {
            for (int j = array.length-1; j > 0 ; j--) {
                if(array[i][j]==4 && i > 0){
                    if(array[i-1][j]==2 && i > 0){
                        if(array[i-2][j]==0){
                            count++;
                        }
                    }
                }
            }
        }

        // Diagnonals
        //Forward-> Downward
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i][j]==4 && j< array.length-1 && i<array.length-1){
                    if(array[i+1][j+1]==2 && j < array.length -2 && i<array.length-2){
                        if(array[i+2][j+2]==0){
                            count++;
                        }
                    }
                }
            }
        }
        //Forward -> Upwards
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i][j]==4 && j< array.length-1 && i>0){
                    if(array[i-1][j+1]==2 && j < array.length -2 && i>0){
                        if(array[i-2][j+2]==0){
                            count++;
                        }
                    }
                }
            }
        }
        //Backward -> Upwards
        for (int i = array.length-1; i > 0; i--) {
            for (int j = array.length-1; j > 0 ; j--) {
                if(array[i][j]==4 && i > 0 && j>0){
                    if(array[i-1][j-1]==2 && i > 0 && j>0){
                        if(array[i-2][j-2]==0){
                            count++;
                        }
                    }
                }
            }
        }
        //Backward -> Downwards
        for (int i = array.length-1; i > 0; i--) {
            for (int j = array.length-1; j > 0 ; j--) {
                if(array[i][j]==4 && i<array.length-1 && j>0){
                    if(array[i+1][j-1]==2 && i<array.length-2&& j>0){
                        if(array[i+2][j-2]==0){
                            count++;
                        }
                    }
                }
            }
        }


        return count;
    }

    public static int[][] createAddArray(int n) {
        int[][] array = new int[n][n]; // n is the number of modulo

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = mod_add(i,j,n);
            }
        } return array;
    }

    public static int[][] createMulArray(int n) {
        int[][] array = new int[n][n]; // n is the number of modulo

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = mod_mul(i,j,n);
            }
        } return array;
    }

    public static void main(String[] args) {

        int size = 10;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("[" + createMulArray(size)[i][j] + "]");
            }
            System.out.println();
        }

        if(search420(createMulArray(size))==1)
        {System.out.println("There was " + search420(createMulArray(size)) + " 420");}
        if(search420(createMulArray(size)) > 1){
        System.out.println("There were " + search420(createMulArray(size)) + " 420's");}
    }

}
