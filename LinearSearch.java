public int LinearSearch(int[] arr, int val) {
   if (arr.contains(val)) {
      for(int x = 0; x<arr.size; x++)
         if(arr[x] == val) return val;
   return -1;
   }
