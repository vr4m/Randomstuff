package uebung04;

import java.util.ArrayList;

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

    // looks if there is a number 42 and a 0 somewhere around it
    public static int search42_0(int[][] array){

        int count = 0;
        /*
        * All the &&-Statements within the For-loops are just boundries for the array
        */
        //left -> right
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i][j]==42 && j< array.length-1){
                    if(array[i][j+1]==0 ){
                            count++;
                    }
                }

            }
        }

        //right -> left
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length -1; j > 0; j--) {
                if(array[i][j]==42 && j>0){
                    if(array[i][j-1]==0){
                            count++;
                    }
                }
            }
        }

        //Up -> down
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                if(array[i][j]==42 && i<array.length-1){
                    if(array[i+1][j]==0){
                            count++;
                    }
                }
            }
        }

        // Down -> Up
        for (int i = array.length-1; i > 0; i--) {
            for (int j = array.length-1; j > 0 ; j--) {
                if(array[i][j]==42 && i > 0){
                    if(array[i-1][j]==0){
                            count++;
                    }
                }
            }
        }

        // Diagnonals
        //Forward-> Downward
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i][j]==42 && j< array.length-1 && i<array.length-1){
                    if(array[i+1][j+1]==0){
                            count++;
                    }
                }
            }
        }
        //Forward -> Upwards
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i][j]==42 && j< array.length-1 && i>0){
                    if(array[i-1][j+1]==0 ){
                            count++;
                    }
                }
            }
        }
        //Backward -> Upwards
        for (int i = array.length-1; i > 0; i--) {
            for (int j = array.length-1; j > 0 ; j--) {
                if(array[i][j]==42 && i > 0 && j>0){
                    if(array[i-1][j-1]==0){
                            count++;
                    }
                }
            }
        }
        //Backward -> Downwards
        for (int i = array.length-1; i > 0; i--) {
            for (int j = array.length-1; j > 0 ; j--) {
                if(array[i][j]==42 && i<array.length-1 && j>0){
                    if(array[i+1][j-1]==0){
                            count++;
                    }
                }
            }
        }


        return count;
    }


    // Looks for A 4 if found a 2 and if a zero is found => therefore the counter goes up by 1
    public static int search4_20(int[][] array){

        int count = 0;
        /*
        * All the &&-Statements within the For-loops are just boundries for the array
        */
        //left -> right
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i][j]==4 && j< array.length-1){
                    if(array[i][j+1]==20 ){
                            count++;
                    }
                }

            }
        }

        //right -> left
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length -1; j > 0; j--) {
                if(array[i][j]==4 && j>0){
                    if(array[i][j-1]==20){
                            count++;
                    }
                }
            }
        }

        //Up -> down
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                if(array[i][j]==4 && i<array.length-1){
                    if(array[i+1][j]==20 ){
                            count++;
                    }
                }
            }
        }

        // Down -> Up
        for (int i = array.length-1; i > 0; i--) {
            for (int j = array.length-1; j > 0 ; j--) {
                if(array[i][j]==4 && i > 0){
                    if(array[i-1][j]==20 ){
                            count++;
                    }
                }
            }
        }

        // Diagnonals
        //Forward-> Downward
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i][j]==4 && j< array.length-1 && i<array.length-1){
                    if(array[i+1][j+1]==20 ){
                            count++;
                    }
                }
            }
        }
        //Forward -> Upwards
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i][j]==4 && j< array.length-1 && i>0){
                    if(array[i-1][j+1]==20 ){
                            count++;
                    }
                }
            }
        }
        //Backward -> Upwards
        for (int i = array.length-1; i > 0; i--) {
            for (int j = array.length-1; j > 0 ; j--) {
                if(array[i][j]==4 && i > 0 && j>0){
                    if(array[i-1][j-1]==20 ){
                            count++;
                    }
                }
            }
        }
        //Backward -> Downwards
        for (int i = array.length-1; i > 0; i--) {
            for (int j = array.length-1; j > 0 ; j--) {
                if(array[i][j]==4 && i<array.length-1 && j>0){
                    if(array[i+1][j-1]==20 ){
                            count++;
                    }
                }
            }
        }


        return count;
    }

    public static int search4_2_0(int[][] array){

        int count = 0;
        /*
        * All the &&-Statements within the For-loops are just boundries for the array
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

        int size = 6;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("[" + createMulArray(size)[i][j] + "]");
            }
            System.out.println();
        }

        if(search4_2_0(createMulArray(size))==1)
        {System.out.println("There was " + search4_2_0(createMulArray(size)) + " 4_2_0");}
        if(search4_2_0(createMulArray(size)) > 1){
        System.out.println("There were " + search4_2_0(createMulArray(size)) + " 4_2_0's");}

        if(search42_0(createMulArray(size))==1)
        {System.out.println("There was " + search42_0(createMulArray(size)) + " 42_0");}
        if(search42_0(createMulArray(size)) > 1){
            System.out.println("There were " + search42_0(createMulArray(size)) + " 42_0's");}

        if(search4_20(createMulArray(size))==1)
        {System.out.println("There was " + search4_20(createMulArray(size)) + " 4_20");}
        if(search4_20(createMulArray(size)) > 1){
            System.out.println("There were " + search4_20(createMulArray(size)) + " 4_20's");}
    }

}
