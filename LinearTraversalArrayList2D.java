public String LinearSearch(ArrayList<ArrayList> arr, Object val) {
   for(int k = 0; k<arr.size(); k++)
       if (arr.get(k).contains(val))
          for(int x = 0; x<arr.get(k).size(); x++)
              if(arr.get(k).get(x).equals(val)) return "[" + k + "," + x + "]";
   return "" + -1;
}
