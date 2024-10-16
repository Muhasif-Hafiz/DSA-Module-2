import java.util.ArrayList;

public class RatInAMaze {
    public static void main(String[] args) {

        int [][]mat={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        ArrayList<String> ans= findPath(mat);
        System.out.println(ans);

    }
    public static ArrayList<String> findPath(int[][] mat) {
        ArrayList<String> result= new ArrayList<>();
        int [] []  visited= new int[mat.length][mat[0].length];
       if(mat[0][0]==1) solveMaze(0,0,result, mat, mat.length, "", visited);
       return  result;
    }
    public static void solveMaze(int i, int j, ArrayList<String> result, int [][] mat, int n , String ans, int [][] visited){

        if(i==n-1 && j==n-1){
            result.add(ans);
            return ;
        }
     //Downwards
        if(i+1<n && visited[i+1][j]!=1 && mat[i+1][j]==1){
            visited[i][j]=1;
            solveMaze(i+1,j, result, mat, n, ans+"D",visited);
            visited[i][j]=0;

        }
        // Left

        if(j-1>=0 && visited[i][j-1]!=1 && mat[i][j-1]==1){
            visited[i][j]=1;
            solveMaze(i, j-1, result, mat, n, ans+"L", visited);
            visited[i][j]=0;
        }
        //Right
        if(j+1 <n && visited[i][j+1] !=1 && mat [i][j+1]==1){
            visited[i][j]=1;
            solveMaze(i, j+1, result,mat,n, ans+"R", visited);
            visited[i][j]=0;
        }
        //Up

        if(i-1>=0 && visited[i-1][j]!=1 && mat[i-1][j]==1){
            visited[i][j]=1;
            solveMaze(i-1,j, result, mat,n, ans+"U", visited);
            visited[i][j]=0;
        }
    }
}
