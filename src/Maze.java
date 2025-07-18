import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        printingPaths("",3,3);
        System.out.println(pathRetDiagonal("",3,3));
        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathRestrictions("",board,0,0);
        allPaths("",board,0,0);
    }

    static int count(int r,int c){
        if(r==1||c==1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left+right;
    }
    static void printingPaths(String p,int r,int c){
        if(r==1&&c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            printingPaths(p+'D',r-1,c);
        }
        if(c>1){
            printingPaths(p+'R',r,c-1);
        }

    }
    static ArrayList<String> pathRetDiagonal(String p,int r,int c){
        if(r==1&&c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r>1&&c>1){
            list.addAll(pathRetDiagonal(p+'D',r-1,c-1));
        }

        if(r>1){
            list.addAll(pathRetDiagonal(p+'V',r-1,c));
        }
        if(c>1){
            list.addAll((pathRetDiagonal(p+'H',r,c-1)));
        }

        return list;

    }
    // maze with obstacles
    // when you land on a new cell check whether that is a river or not.
    // if you land on the obstacles just stop recursion for that call.

    static void pathRestrictions(String p,boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }

        if(r< maze.length-1){
            pathRestrictions(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            pathRestrictions(p+'R',maze,r,c+1);
        }
    }

    static void allPaths(String p,boolean[][]maze,int r,int c){
        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        // i am considering this block in my path
        maze[r][c]= false;
        if(r< maze.length-1){
            allPaths(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            allPaths(p+'R',maze,r,c+1);
        }
        if(r>0){
            allPaths(p+'U',maze,r-1,c);
        }
        if(c>0){
            allPaths(p+'L',maze,r,c-1);
        }
        // this line is where the function will be over
        // so before the function gets removed, also remove the changes
        // that were made by that function.
        maze[r][c] = true;

    }
//    infinite recursion calls.
//    from where you are starting you came back there again that's a
//   problem
//    what can we do to solve this
//    don't allow it to go to the cell that were visited
//    all cells that are visited mark them as false.
//    return for those nodes.
//     marking false ==1 i have that cell in my current path.
//    so when that path is over, ex you are in another recursion call
//    these cells should not be false.
//
//    while you are moving back you restore the maze as it was
//    the going back is happened when the function is returned.
//    you have to revert the changes while going back hence mark the
//    cell as true.
    // this is backtracking
}
