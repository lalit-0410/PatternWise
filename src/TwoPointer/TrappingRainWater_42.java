package TwoPointer;

public class TrappingRainWater_42 {

    static void maxWaterTrap(int[] height) {

        /*Brute Force
        for (int i = 0; i < n; i++) {
            int lmax = 0;
            int rmax = 0;
            for (int j = i; j >= 0; j--) {
                if (height[j] > lmax) {
                    lmax = height[j];
                }
            }
            for (int k = i; k < n; k++) {
                if (height[k] > rmax) {
                    rmax = height[k];
                }
            }

            int water = Math.min(lmax, rmax) - height[i];
            maxWater += water;

        }*/

        /* Better
        int n = height.length;
        int[] lmaxArr=new int[n];
        int[] rmaxArr=new int[n];

        //left max
        lmaxArr[0]=height[0];
        for (int i = 1; i < n ; i++) {
            lmaxArr[i]=Math.max(height[i],lmaxArr[i-1]);
        }

        //right max
        rmaxArr[n-1]=height[n-1];
        for (int j = n-2; j >= 0 ; j--) {
            rmaxArr[j]=Math.max(height[j],rmaxArr[j+1]);
        }

        //water trap
        for (int k = 0; k < n ; k++) {
            maxWater+=Math.min(lmaxArr[k],rmaxArr[k])-height[k];
        }
        */
        int maxWater = 0;
        int n=height.length;
        int left=0,right=n-1;
        int leftMax=0,rightMax=0;
        while (left<right){
            leftMax=Math.max(leftMax,height[left]);
            rightMax=Math.max(rightMax,height[right]);

            if(leftMax<rightMax){
                maxWater+=(leftMax-height[left]);
                left++;
            }
            else {
                maxWater+=(rightMax-height[right]);
                right--;
            }
        }


        System.out.println("Total Water Trapped: " + maxWater);
    }

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};

        maxWaterTrap(height);
    }
}
