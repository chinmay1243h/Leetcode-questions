class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    ArrayList<Double> list = new ArrayList<>();
   for(int i =0;i<nums1.length;i++){
    list.add((double)nums1[i]);
   }
   for(int i =0;i<nums2.length;i++){
    list.add((double)nums2[i]);
   }

   Collections.sort(list);
   int size = list.size();
   double median;

   if(size%2==0){
    int mid1 = size/2 -1;
    int mid2 = size/2;
    median = (list.get(mid1)+list.get(mid2))/2.0;
    }else{
       int mid = size/2;
       median = list.get(mid);
    }

   

return median;
  }
}