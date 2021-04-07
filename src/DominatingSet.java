import java.util.*;

/*
 * CIS263 - Winter 2021 - Project 2
 * Find the smallest dominating set for an undirected graph.
 * More information about Dominating Sets can be found at:
 * https://mathworld.wolfram.com/DominatingSet.html
 * https://mathworld.wolfram.com/MinimumDominatingSet.html
 * https://en.wikipedia.org/wiki/Dominating_set
 *
 * This code reads, from the standard input, the graph that contains:
 * n the number of nodes in the graph
 * the adjacency matrix for the graph
 *
 * This code then calculates 2^n, the size of the PowerSet
 * For each and everyone of the possible subsets of the set of nodes
 * the code checks if that particular subset is a dominating set.
 * The code reports the smallest dominating set.
 */

public class DominatingSet {

    private static int n;
    private static int adjacencyMatrix[][];

    /* Return true if the SetOfLabels x is
     * a subset that is a dominating set.
     * Your code goes here.
     */
    private static boolean isDominatingSet(SetOfLabels x) {
        //Declare two arrays of integers of size n
        int setAsArray[] = new int[n];
        int result[] = new int[n];

        //You need to set to 1 the appropriate entries in the array SetAsArray.
        for (int i = 0; i < n; i++) {
            //if appropriate entry set to 1
            //if(condition){
            setAsArray[i] = 1;
            //}
            //else{
            //setAsArray[i] = 0;
            //}
        }

        //Write code that multiplies the adjacenyMatrix by the array SetAsArray.
        //Store the result in the result array

        //If all entries in the array result contain values different from 0, return true
        //else, if you find any zero return false. 
        for(int z = 0; z < n; z++) {
            if(result[z] == 0){
                return false;
            }
            else{
                return true;
            }
        }

    }

    public static void main(String args[]) {
        /* Read the size of the graph - number of vertices
        and then read the adjacency matrix for the graph
         */
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        adjacencyMatrix = new int [n][n];
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < n;j++) {
                adjacencyMatrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate the size of the power set: 2^n
        int twoToN = 1;
        for(int i = 0;i < n;i++) {
            twoToN = twoToN * 2;
        }
        // System.out.println("2^n is: "+twoToN);

        SetOfLabels smallestDominatingSet = new SetOfLabels(twoToN-1,n);
        int sizeOfSmallestDominatingSet = n;
        // Iterate over all the elements in the PowerSet
        // Those elements are encoded by the integers 1..2^n -1
        // For each posssible subset, check if it is a dominating set
        // Report the smallest dominating set\
        for(int i = 1;i < twoToN;i++) {
            SetOfLabels candidate = new SetOfLabels(i,n);
            if (isDominatingSet(candidate)) {
                if (candidate.getNumberOfElements()<sizeOfSmallestDominatingSet) {
                    smallestDominatingSet = candidate;
                    sizeOfSmallestDominatingSet = candidate.getNumberOfElements();
                }
            }
        }

        System.out.println("The smallest dominating set is: "+
                smallestDominatingSet.toString());
        System.out.println("The size of the smallest dominating set is: "+
                smallestDominatingSet.getNumberOfElements());

    }
}