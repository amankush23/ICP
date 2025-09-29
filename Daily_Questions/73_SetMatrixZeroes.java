class Solution {
    public void setZeroes(int[][] matrix) {
        List<int[] > arr  = new ArrayList<>();
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    arr.add(new int[] {i,j});
                }
            }
        }
        for(int i = 0 ; i < arr.size(); i++){
            int r = arr.get(i)[0];
            int c = arr.get(i)[1];
            Arrays.fill(matrix[r], 0);
            for(int j = 0 ; j < matrix.length; j++){
                matrix[j][c] = 0;
            }

        }
    }
}
