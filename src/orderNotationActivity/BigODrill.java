package orderNotationActivity;

import java.util.Random;

// Activity Readme can be found here:
// https://docs.google.com/document/d/1UTI-1HLoBwvOo67ZwsHYjArW6qgxBYbsyiaDNri2tA0/edit?usp=sharing

public class BigODrill {

    /**
     * (1)
     * Demonstrates an algorithm with a constant run time, O(1)
     * @param numArr - an int array numArr
     * @return the last element of the array numArr
     * Discussion: The runtime for this method will be the same regardless of 
     * the amount of elements in the array.
     */
    public static int constantTime(int[] numArr) {
        return numArr[numArr.length - 1];
    }


    /**
     * (2)
     * Demonstrates an algorithm with a linear run time, O(n)
     * @param numArr - an integer array
     * @return the input array where each element of the array is multiplied with itself
     * Discussion: The runtime will scale linearly with n. 
     * Say each element in the array took 1 second to process(inaccurate).
     * 1000 elements would take 1000 seconds, and one million elements would take one million seconds.
     */
    public static int[] linearTime(int[] numArr) {
        for (int i=0; i < numArr.length; i++) {
            numArr[i] = numArr[i] * numArr[i];
        }
        return numArr;
    }

    /**
     * (3)
     * Demonstrates an algorithm with 
     * @param numArr - an integer array
     * Discussion: The time complexity of this code is O(log n).
     * A). We can tell that the runtime will be relatively quick at 1000
     * and 1 million. This method's time complexity scales logarithmically,
     * so as it gets larger, the increases in runtime will become fewer and fewer
     * and will remain a constant duration.
     * B). Because this function has a for loop, it is at least O(n).
     * Within the for loop, it quadratically increases the rate at which it iterates through
     * numArr. Because of this exponential increase in iteration jumps,
     * we see a converse logarithmic increase in time complexity.
     */
    public static int[] puzzle03(int[] numArr) {
        //TODO: What does the following code do?
        // The following code creates a new array the same size as the paramater array.
        //It loops through the original array starting at index 1 and sets the values of 
        //tempArray to numArr[2^index2]
        int index2 = 0;
        int[] tempArr = new int[numArr.length];
        for(int index = 1; index < numArr.length; index = index * 2) {
            tempArr[index2] = numArr[index];
            index2++;
        }
        return tempArr;
    }

    /**
     * (4)
     * Demonstrates an algorithm with
     * @param numArr -  a two dimensional rectangular integer array a.k.a 2D matrix
     * @return a double that represents the sparsity of numArr
     * The following code has a time complexity of O(n^2)
     * A). The runtime of this method at n=1000 will be the amount of time each
     * operation takes times 1000^2.
     * The same will be true at n = one million, operation time times 1 million^2
     * B).A real life example could be used by sports stadiums to track how many free t-shirts are caught
     * out of the t-shirt cannon. The matrix could contain data about the number of t-shirts that
     * each person in each row caught. The vast majority of people will not have caught any,
     * making the matrix sparse.
     * 
     */
    public static double sparsity(int[][] numArr) {
        double zeroCount = 0;
        double totalCount = 0;
        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length; j++) {
                totalCount+=1;
                if (numArr[i][j] == 0) {
                    zeroCount+=1;
                }
            }
        }
        double sparsityRatio = zeroCount/totalCount;
        return sparsityRatio;
    }

    /**
     * (5)
     * Demonstrates an algorithm with TODO: What is the O( ? ) of the following code?
     * @param numArr - two dimensional rectangular integer array a.k.a 2D matrix
     * @param sparsityValue - 0.0-1.0 representing sparsity to make the matrix.
     * @return - numArray overwritten as a sparse matrix with a sparsity of sparsityValue
     */
    public static int[][] sparseMatrix(int[][] numArr, double sparsityValue) {
        assert(sparsityValue >= 0.0 && sparsityValue <= 1.0);
        Random randGenerator = new Random();

        //TODO: Write the code to overwrite the numArr such that it is a sparse matrix
        // with a sparsity of %75

        return numArr;
    }


    public static void main (String[] args){
        //TODO: Write code to run your methods

    }
}
