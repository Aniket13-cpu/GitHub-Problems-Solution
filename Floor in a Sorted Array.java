class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        int low = 0, hi = n-1;
        while(low <= hi) {
            int mid = ((low+hi)/2);
            if(arr[mid] == x) {
                return mid;
            }
            else if(arr[mid] < x) {
                low = mid+1;
            }
            else {
                hi = mid-1;
            }
        }
        return low-1;
    }
    
}