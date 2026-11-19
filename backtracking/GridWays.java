package backtracking;

public class GridWays {

    static int getFactorial(int n){
        if(n == 0) return 1;
        return n * getFactorial(n-1);
    }

    static int gridWays(int x, int y, int n, int m){ // Time complexity O(2^n+m)
        // Base case
        if(x == n-1 && y == m-1){ // Base case to achieve last column so return 1 way
            return 1;
        }else if(x == n || y == m){ // Corner case handle to go of the outside row and column then return 0
            return 0;
        }

        // Recursive work choice 2 options right or down
        return gridWays(x+1, y, n,m) + gridWays(x, y+1, n, m);
    }

    static int gridWaysOptimized(int n, int m){
        int factOfN = getFactorial(n-1);
        int factOfM = getFactorial(m-1);
        int factOfNPlusM = getFactorial(((n-1) + (m-1)));
        return factOfNPlusM / (factOfN * factOfM);
    }

    static void main(String[] args) {
//        int totalWays = gridWays(0,0,3,3);
        int totalWays = gridWaysOptimized(3,3);
        System.out.println("Total Number of ways: " + totalWays);
    }
}
