class Solution { 
    public static long sumBetweenTwoKth(long A[], long N, long K1, long K2)
    {
        // Your code goes here
        Arrays.sort(A);
        int f = 0, fidx = -1;
        int s = 0, sidx = -1;
        int i = 0;
        for(i = 0; i < A.length-1; i++) {
            if(A[i] != A[i+1]) {
                f++;
                s++;
                sidx = i;
            }
            if(f == K1) {
                fidx = i;
            }
            if(s == K2) {
                sidx = i;
                break;
            }
        }
        
        if(s < K2) {
            sidx += 1;
        }
        long sum = 0;
        for(int j = fidx+1; j < A.length && j < sidx; j++) {
            sum += A[j];
        }
        return sum;
    }
    
}