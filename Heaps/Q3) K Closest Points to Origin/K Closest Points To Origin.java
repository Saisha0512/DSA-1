class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Double.compare(Math.sqrt(b[0]*b[0]+b[1]*b[1]), Math.sqrt(a[0]*a[0]+a[1]*a[1])));
        for(int[] arr:points){
            pq.add(arr);
            if(pq.size()>k){
                pq.poll(); //Removes the largest distance, i.e: the point farthest from origin out of all points currently in the heap
            }

        }
        int[][]result = new int[k][2];
        for(int i = 0; i<k; i++){
            result[i] = pq.poll();
        }

        return result;

    }
}
// O(nlogk) time complexity
