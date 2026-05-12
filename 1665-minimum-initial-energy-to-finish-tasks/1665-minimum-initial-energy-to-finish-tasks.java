class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a, b) ->
            (b[1] - b[0]) - (a[1] - a[0])
        );
        int min = 0;
        int compute = 0;
        for(int[] task : tasks) {
            if(compute < task[1]) {
                min += task[1] - compute;
                compute = task[1];
            }
            compute -= task[0];
        }
        return min;
    }
}
