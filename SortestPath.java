public class SortestPath {


    public static float findSortestPath(String path){ // Time Complexity is O(n)
        int x = 0, y = 0;
        for(int i = 0; i<path.length(); i++){
            char direction = Character.toUpperCase(path.charAt(i));

            // Check if direction is E then update the x++;
            if(direction == 'E'){
                x++;
            }
            // Check if direction is W then update the x--;
            if(direction == 'W'){
                x--;
            }
            // Check if direction is N then update the y++
            if(direction == 'N'){
                y++;
            }
            // Check if direction is S then update the y--;
            if(direction == 'S'){
                y--;
            }

        }

        return (float) Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    static void main(String[] args) {
//        String path = "WNEENESENNN";
        String path = "NS";
        float displacement = findSortestPath(path);
        System.out.println("Your displacement is: "+ displacement);
    }
}
