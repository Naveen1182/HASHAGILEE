public class hashagile 
{
    // This function finds the majority element if there is one
    public static int maxans(int[] inp) {
        // First, let's assume the first element might is majority
        int max1 = inp[0];
        int maxcount = 1; // Counter for how many times we've seen this number
        int n=inp.length;
        // Now we go through the array to see if the number is still avilable
        for(int i=1;i<n;i++) {
            if(inp[i]==max1)
            {
                maxcount++; // same number, so increment counting
            } 
            else
            {
                maxcount--; // different number, decrement the counting
            }
            // If counter goes to 0, we pick up a new number
            if(maxcount==0)
            {
                max1 = inp[i];
                maxcount = 1;
            }
        }
        // Ok, now we going to check if the number  really appearing more number of times
        maxcount = 0; // reset count to actually count the occurrences
        for(int num:inp)
        {
            if (num == max1)
            {
                maxcount++;
            }
        }
        // If this number's count is more than half the array, it’s majority
        if(maxcount>n/ 2)
        {
            return max1; // yes, we found the majority element
        }
        else
        {
            return -1; // no, no majority element in this array
        }
    }
    public static void main(String[]args)
    {
        int[]inp={3,3,4,2,4,4,2,4,4}; //input1
        int result=maxans(inp); // call the function to find the majority
        // Display the result based on whether we found a majority element or not
        if(result!=-1)
        {
            System.out.println("Majority element is "+result);
        } 
        else
        {
            System.out.println("No majority  is element found");
        }
    }
}
