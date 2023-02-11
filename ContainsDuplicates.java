class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> ds= new HashSet<>();
        for(int n:nums)
        {
            if(ds.contains(n))
           
              return true;
              ds.add(n);
              }

           return false;
    }
}
