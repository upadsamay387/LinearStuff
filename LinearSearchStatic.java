public int LinearSearchStatic(int[] arr, int val) {
   if (arr.contains(val)) {
      for(int x = 0; x<arr.length; x++)
         if(arr[x] == val) return val;
   return -1;
   }
