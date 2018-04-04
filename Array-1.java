/*
 * Given an array of ints, return true if 6 appears as either the 
 *  first or last element in the array. The array will be length 1 or more.
 */
public boolean firstLast6(int[] nums) {

     if((nums[0]) == 6)
        return true;
      if((nums[nums.length -1]) == 6)
        return true;
     
     else return false;
  
}

/*
 * Given an array of ints, return true if the array is length 1 or 
 *  more, and the first element and the last element are equal.
 */
public boolean sameFirstLast(int[] nums) {
   
   if(nums.length < 1)
   return false;
   return (nums[0] == nums[nums.length -1]);
  
}

/*
	Return an int array length 3 containing 
	the first 3 digits of pi, {3, 1, 4}.
*/
public int[] makePi() {
  
  int anArray[] = {3,1,4};
  return anArray;
}

/*
 * Given 2 arrays of ints, a and b, return true if they have the same first 
 * element or they have the same last element. Both arrays will be length 1 or more.
 */

public boolean commonEnd(int[] a, int[] b) {

  if(a[0] == b[0] || a[a.length -1] == b[b.length -1])
  return true;
 // else if(a[a.length -1] == b[b.length -1])
  //return true;
  
  else return false;
  
}

/*
 * Given an array of ints length 3, return the sum of all the elements.
 */

public int sum3(int[] nums) {
  
  return (nums[0] + nums[1] + nums[2]);
  }

  
  /*
   * Given an array of ints length 3, return a new array 
   *  with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
   */
public int[] reverse3(int[] nums) {

   int temp;
   
   temp = nums[0];
   nums[0] = nums[2];
   nums[2] = temp;
   
   return nums;
}

/*
  Given an array of ints, return the sum of the first 2 elements in the array. 
  If the array length is less than 2, just sum up the elements that exist, 
  returning 0 if the array is length 0.
*/
public int sum2(int[] nums) {
  
  int result;
  
  if(nums.length == 0)
	return 0;
  
  if(nums.length < 2)
  {
   result = nums[0];
   return result;
  }
  else
	return nums[0] + nums[1];
}

/*
* Given 2 int arrays, a and b, each length 3, 
  return a new array length 2 containing their middle elements.
*/
public int[] middleWay(int[] a, int[] b) {

   int result[] = new int[2];
   result[0] = a[1];
   result[1] = b[1];
   
   return result;
}

/*
* Given an int array length 2, return true if it does not contain a 2 or 3.
*/

public boolean no23(int[] nums) {

  if(nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3)
	return false;
  
  else return true;
  }

 /*
 * Given an int array length 3, if there is a 2 in the array 
   immediately followed by a 3, set the 3 element to 0. 
   Return the changed array.
 */
 
 public int[] fix23(int[] nums) {
    
    int num;
    
    if(nums[0] == 2 && nums[1] == 3  )
    {
     nums[1] = 0;
     return nums;
    }
    
    if (nums[1] ==2 && nums[2] ==3)
     nums[2] = 0;
     return nums;
}

/*
	Given an array of ints of even length, return a new 
	array length 2 containing the middle two elements from the original array. 
	The original array will be length 2 or more.
 */
 
public int[] makeMiddle(int[] nums) {


 int[] result = new int[2];
 int numResult = nums.length/2;
if(nums.length > 2 && numResult % 2 == 0)
{
   result[0] = nums[numResult -1];
   result[1] = nums[numResult];
   return result;
}
else if(nums.length > 2 && numResult % 2 == 1)
{
   result[0] = nums[numResult -1];
   result[1] = nums[numResult];
   return result;
}

else return nums;
}

/*
* We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. 
Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
*/
public boolean unlucky1(int[] nums) {
  
   boolean result;
   if(nums.length == 1 || nums.length == 0)
   return false;
   result = ((nums[0] == 1 && nums[1] == 3) || nums[nums.length -2] ==1 && nums[nums.length -1] == 3  || nums[1] == 1 && nums [2] == 3)?true:false;
   
   return result;
}

