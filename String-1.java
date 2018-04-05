/*
	Given a string name, e.g. "Bob", return a greeting of the 
	form "Hello Bob!".
*/
public String helloName(String name) {
  
   String greeting;
   greeting = "Hello ";
   return greeting + name + "!";
}

/*
	Given an "out" string length 4, 
	such as "<<>>", and a word, return a new string where the 
	word is in the middle of the out string, e.g. 
	"<<word>>". Note: use str.substring(i, j) to extract the String 
	starting at index i and going up to but not including index j.
*/
public String makeOutWord(String out, String word) {
  
 
  String substring2 = out.substring(0,2);
  String substring3 = out.substring(2,4);
  return substring2 + word + substring3 ;
}

public String firstHalf(String str) {
  return str.substring(0,str.length()/2);
}
public String nonStart(String a, String b) {
 
 String resultA;
 String resultB;

 resultA = a.substring(1,a.length());
 resultB = b.substring(1,b.length());
 
 return resultA + resultB;
 }

/*
	Given a string of even length, return the first half. 
	So the string "WooHoo" yields "Woo".
*/
 public String theEnd(String str, boolean front) {
  
  
   if(front == true)
    return  str.substring(0,1);
    else return str.substring(str.length() -1);
}

/*
	Given 2 strings, return their concatenation, 
	except omit the first char of each. 
	The strings will be at least length 1.
*/
public boolean endsLy(String str) {
  
  String result;
  result = str;
  String test = "ly";
  String resString;
 
 if(str.length() >=2)
 {

  result = result.substring(result.length()-2, result.length());
 
  if(result.equals(test))
    return true;
  else return false;
  
 }
 
 else return false;
}

/*
	Given a string of odd length, return the string length 3 from its 
	middle, so "Candy" yields "and". The string length will be at least 3.
*/
public String middleThree(String str) {

    String result = str;
    int value = (str.length())/2;
    //String other = str.substring(value,str.length()- value);
   
     if(str.length() == 3)
     {
       return result;
     }
     
    return str.substring(value -1,value + 2);
     
}

/*
 Given 2 strings, a and b, return a new string made of the 
 first char of a and the last char of b, so "yo" and "java" yields "ya". 
 If either string is length 0, use '@' for its missing char.
*/
public String lastChars(String a, String b) {
  String c;
  
  if(a.length() == 0 && b.length() == 0)
    return "@@";
  else if(a.length() == 0)
    return "@" + b.substring(b.length() -1);
   else if(b.length() == 0)
    return  a.substring(0, 1 ) + "@";
   
  
  else return a.substring(0,1) + b.substring(b.length() -1);
}

/*
   Given a string, if the string begins with "red" or "blue" 
   return that color string, otherwise return the empty string.
*/
public String seeColor(String str) {

    if(str.length() >=3 && str.substring(0,3).equals("red"))
         return "red";
        else if(str.length() >=4 && str.substring(0,4).equals("blue"))
         return "blue";
    else return "";
}

/*
*  Given a string, return a new string made of 3 copies of the first 2 chars of the original string. 
   The string may be any length. If there are fewer than 2 chars, use whatever is there.
*/

public String extraFront(String str) {
  
  if(str.length() < 2)
   return str+str+str;
   
  else{ 
    String result = str.substring(0,2);
  return result+result+result;
  }
}


