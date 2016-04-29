package uebung04;

/**
 * Created by vrm on 29/04/16.
 */
public class NumberSearch {

    // Searching Two consecutive numbers or an allignment of those two within a Matrix
    public static int searchtwo(int[][] array, int numberone, int numbertwo){

        int count = 0;
        /*
        * All the &&-Statements within the For-loops are just boundries for the array
        */
        //left -> right
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i][j]==numberone && j< array.length-1){
                    if(array[i][j+1]==numbertwo ){
                        count++;
                    }
                }

            }
        }

        //right -> left
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length -1; j > 0; j--) {
                if(array[i][j]==numberone && j>0){
                    if(array[i][j-1]==numbertwo){
                        count++;
                    }
                }
            }
        }

        //Up -> down
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                if(array[i][j]==numberone && i<array.length-1){
                    if(array[i+1][j]==numbertwo){
                        count++;
                    }
                }
            }
        }

        // Down -> Up
        for (int i = array.length-1; i > 0; i--) {
            for (int j = array.length-1; j > 0 ; j--) {
                if(array[i][j]==numberone && i > 0){
                    if(array[i-1][j]==numbertwo){
                        count++;
                    }
                }
            }
        }

        // Diagnonals
        //Forward-> Downward
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i][j]==numberone && j< array.length-1 && i<array.length-1){
                    if(array[i+1][j+1]==numbertwo){
                        count++;
                    }
                }
            }
        }
        //Forward -> Upwards
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i][j]==numberone && j< array.length-1 && i>0){
                    if(array[i-1][j+1]==numbertwo ){
                        count++;
                    }
                }
            }
        }
        //Backward -> Upwards
        for (int i = array.length-1; i > 0; i--) {
            for (int j = array.length-1; j > 0 ; j--) {
                if(array[i][j]==numberone && i > 0 && j>0){
                    if(array[i-1][j-1]==numbertwo){
                        count++;
                    }
                }
            }
        }
        //Backward -> Downwards
        for (int i = array.length-1; i > 0; i--) {
            for (int j = array.length-1; j > 0 ; j--) {
                if(array[i][j]==numberone && i<array.length-1 && j>0){
                    if(array[i+1][j-1]==numbertwo){
                        count++;
                    }
                }
            }
        }


        return count;
    }

    // Searching Three consecutive numbers or an allignment of those two within a Matrix
    public static int searchthree(int[][] array,int numberone, int numbertwo, int numberthree){

        int count = 0;
        /*
        * All the &&-Statements within the For-loops are just boundries for the array
        */
        //left -> right
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i][j]==numberone && j< array.length-1){
                    if(array[i][j+1]==numbertwo && j < array.length -2){
                        if(array[i][j+2]==numberthree){
                            count++;
                        }
                    }
                }

            }
        }

        //right -> left
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length -1; j > 0; j--) {
                if(array[i][j]==numberone && j>0){
                    if(array[i][j-1]==numbertwo && j>0){
                        if(array[i][j-2]==numberthree){
                            count++;
                        }
                    }
                }
            }
        }

        //Up -> down
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                if(array[i][j]==numberone && i<array.length-1){
                    if(array[i+1][j]==numbertwo && i< array.length-2){
                        if(array[i+2][j]==numberthree){
                            count++;
                        }
                    }
                }
            }
        }

        // Down -> Up
        for (int i = array.length-1; i > 0; i--) {
            for (int j = array.length-1; j > 0 ; j--) {
                if(array[i][j]==numberone && i > 0){
                    if(array[i-1][j]==numbertwo && i > 0){
                        if(array[i-2][j]==numberthree){
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
                if(array[i][j]==numberone && j< array.length-1 && i<array.length-1){
                    if(array[i+1][j+1]==numbertwo && j < array.length -2 && i<array.length-2){
                        if(array[i+2][j+2]==numberthree){
                            count++;
                        }
                    }
                }
            }
        }
        //Forward -> Upwards
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i][j]==numberone && j< array.length-1 && i>0){
                    if(array[i-1][j+1]==numbertwo && j < array.length -2 && i>0){
                        if(array[i-2][j+2]==numberthree){
                            count++;
                        }
                    }
                }
            }
        }
        //Backward -> Upwards
        for (int i = array.length-1; i > 0; i--) {
            for (int j = array.length-1; j > 0 ; j--) {
                if(array[i][j]==numberone && i > 0 && j>0){
                    if(array[i-1][j-1]==numbertwo && i > 0 && j>0){
                        if(array[i-2][j-2]==numberthree){
                            count++;
                        }
                    }
                }
            }
        }
        //Backward -> Downwards
        for (int i = array.length-1; i > 0; i--) {
            for (int j = array.length-1; j > 0 ; j--) {
                if(array[i][j]==numberone && i<array.length-1 && j>0){
                    if(array[i+1][j-1]==numbertwo && i<array.length-2&& j>0){
                        if(array[i+2][j-2]==numberthree){
                            count++;
                        }
                    }
                }
            }
        }


        return count;
    }



    public static void main(String[] args) {

    }
}
