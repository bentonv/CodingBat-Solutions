/*
*Given a string and a non-negative int n, return a larger string that is n copies of the original string.
*/

public String stringTimes(String str, int n){

      String result = "";
      String fail = "fail";
    for(int i = 0; i < n; i ++)
    {
	//str.concat(str);
      result = result + str;
    }
  return result;
}

/*
* Given a string and a non-negative int n, we'll say that the front of the 
* string is the first 3 chars, or whatever is there if the string is less than length 3. 
* Return n copies of the front;
*/
public String frontTimes(String str, int n) {
  
  int frontString = 3;
  String result = ""; 
  String front = "";
 
  if(frontString > str.length())
	frontString = str.length();
  
  front = str.substring(0, frontString );
  for(int i = 0; i < n; i ++)
  {
    result =  result + front;
  } 
  return result;
}

/*
	Count the number of "xx" in the given string. 
	We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
*/
int countXX(String str) {
  
  String result = "xx";
  int count = 0;
  for (int i = 0; i < str.length() -1; i++){
   // char c = str.charAt(i); 
     if(str.substring(i, i + 2).equals(result))
     {
      count ++;
     }
 //Process char
   }
  return count;
}


/*
	Given a string, return true if the first instance of "x" 
	in the string is immediately followed by another "x".
*/
boolean doubleX(String str) {
  int x = str.indexOf("x");
  
  if (x < str.length() - 1)
	return str.charAt(x + 1) == 'x';
  return false;
}

/*
	Given a string, return a new string made of every 
	other char starting with the first, so "Hello" yields "Hlo".
*/
public String stringBits(String str) {
  
     String result;
     result = "";
     
     for(int i = 0; i< str.length(); i+=2)
     {
          result = result + str.substring(i , i + 1);
     }
     return result;
}

/*
*Given a non-empty string like "Code" return a string like "CCoCodCode".
*/
public String stringSplosion(String str) {
  
  String result = "";
  
  for(int i = 0; i < str.length(); i ++)
  {
    result = result + str.substring(0,i + 1);
  }
   return result;
}

/*
*	Given a string, return the count of the number of times that a substring length 2 appears in the string 
*	and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
*/
public int last2(String str) 
{

  int count = 0;
  String last = "";
  String previous = "";
  
  if(str.length() < 2 )
   return 0;
  
  last =  str.substring(str.length()-2);
  
   for(int i = 0; i < str.length()-2; i ++)
   {
    previous = str.substring(i,i+2);  
    if(previous.equals(last))
       count++;
   }
   return count;
  
}

/*
* Given an array of ints, return the number of 9's in the array.
*/

public int arrayCount9(int[] nums) {

  int count = 0;
  
  for(int i = 0; i < nums.length; i ++)
  {
      if(nums[i] == 9)
      count ++;
  }
  return count;
}

/*
 * Given an array of ints, return true if one of the first 4 elements in the array is a 9. 
 *  The array length may be less than 4.
 */

public boolean arrayFront9(int[] nums) {

  for(int i = 0; i < nums.length; i++)
  {
    if(nums[i] == 9 && i < 4)
      return true;
  }
  return false;
  
}

/*
 * Given an array of ints, return true if the sequence of 
   numbers 1, 2, 3 appears in the array somewhere.
*/
public boolean array123(int[] nums) {

  for(int i = 0; i < nums.length -2 ; i++)
  {
    if(nums[i] == 1 && nums[ i + 1] == 2 && nums[i + 2] == 3)
    
    return true; 
  }
 
  return false;
}

/*
 * Given a string, return a version where all the "x" have been removed. 
 * Except an "x" at the very start or end should not be removed.
 */
public String stringX(String str) {
  
  String result = "";
  for(int i = 0; i < str.length(); i ++)
  {
     //sets the boundries for i
    if(!((i > 0) && i < (str.length() -1) && str.substring(i, i + 1).equals("x")))
      result = result + str.substring(i, i + 1);
  }
  return result;
}

/*
 * Given a string, return a string made of the chars at 
 *  indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
 */
public String altPairs(String str) {
  String result = "";
  
  int pair;
  // for 0 4 8.
  for(int i=0; i<str.length(); i+=4)
  {
    pair = i + 2;
    if(pair > str.length())
    {
      pair = str.length(); 
    }
    result = result +  str.substring(i, pair);
  }
  return result;
}

/*
 * Given an array of ints, return the number of times that two 6's are next to each other in the array. 
 *  Also count instances where the second "6" is actually a 7.
 */
public int array667(int[] nums) {
 
 int count = 0; 

  for(int i = 0; i < nums.length -1; i ++ )
  {
   if(nums[i] == 6 && nums[i + 1] == 6 || nums[i] == 6 && nums[i + 1] == 7)
   {
    count ++;
   }
   
  }
  return count;
}

/*
 *  Given an array of ints, we'll say that a triple is a value appearing 
 *  3 times in a row in the array. Return true if the array does not contain any triples.
 */
public boolean noTriples(int[] nums) {

  int i = 0;
  
  while(i < nums.length -2)
  {
    if(nums[i] == nums[i + 1] && nums [i + 1] == nums[i + 2])
    return false;
    i ++;
  }
  return true;
}






