public int LinearSearch(ArrayList<Integer> arr, int val) {
   if (arr.contains(val))
      for(int x = 0; x<arr.size(); x++)
         if(arr.get(x).equals(val)) return val;
   return -1;
}
