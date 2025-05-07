// PROGRAM to print * on first and last rows and columns and diagonals only
// On rest places, print SPACE

public class DiagonalStar {

    public static void main(String[] args) {

        printSquareStar(4);
        printSquareStar(8);
    }

    public static void printSquareStar(int number){

        if(number < 5){

            System.out.print("Invalid Value");
            return;

        }

        System.out.println();
        for(int row = 1; row <= number; row++){

            for(int column = 1; column <= number; column++){

                boolean isFirstRowOrColumn = row == 1 || column == 1; // checking if it is 1st row or 1st column to print '*'
                boolean isLastRowOrColumn = row == number || column == number; // checking if it is last row or last column to print '*'
                boolean isDiagonal = (row == column) || (column == (number - row + 1)); // checking for both the diagonals to print '*'

                if(isFirstRowOrColumn || isLastRowOrColumn || isDiagonal){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
