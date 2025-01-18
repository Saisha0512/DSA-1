class Solution {
    public int findCircleNum(int[][] isConnected) {
        int result = 0;
        boolean[]visited = new boolean[isConnected.length]; //Array to keep track of visited nodes
        for(int i = 0; i<isConnected.length; i++){
            if(visited[i]!=true){
                result++; //Adding a province
                dfs(i, visited, isConnected); //calling dfs to traverse the province

            }
        }
        return result;
    }
    void dfs(int i, boolean[]visited, int[][] isConnected){
        visited[i] = true; //Marking the current node
        for(int j = 0; j<isConnected[0].length; j++){
            if(isConnected[i][j]==1 && visited[j]!=true){
                dfs(j, visited, isConnected); //traversing the neighbouring node
            }
        }
    }
}
