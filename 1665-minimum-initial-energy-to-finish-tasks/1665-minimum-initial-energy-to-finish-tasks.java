class Solution {
    public int minimumEffort(int[][] tasks) {
        int n = tasks.length;
        Arrays.sort(tasks, (a, b) ->
            (b[1] - b[0]) - (a[1] - a[0])
        );
        int min = 0;
        int compute = 0;
        for(int i = 0; i < n; i++) {
            if(compute < tasks[i][1]) {
                min += tasks[i][1] - compute;
                compute = tasks[i][1];
            }
            compute -= tasks[i][0];
        }
        return min;
    }
}
