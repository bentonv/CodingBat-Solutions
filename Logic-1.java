/*
	When squirrels get together for a party, they like to have cigars. 
	A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. 
	Unless it is the weekend, in which case there is no upper bound on the number of cigars. 
	Return true if the party with the given values is successful, or false otherwise.
*/

public boolean cigarParty(int cigars, boolean isWeekend) {

   boolean result;
   
  return result = ((cigars >= 40 && cigars <= 60 && isWeekend == false) || (isWeekend == true && cigars >= 40))?true:false;
}

/*
	You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your 
	clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. 
	The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 
	8 or more, then the result is 2 (yes). 
	With the exception that if either of you has style of 2 or less, then the result is 0 (no). 
	Otherwise the result is 1 (maybe).
*/
public int dateFashion(int you, int date) 
{
     if((you >= 8 && date > 2) || (date >= 8 && you > 2))
       return 2;
     else if(you <= 2 || date <= 2 )
       return 0;
     else return 1;
  
}

/*
	You are driving a little too fast, and a police officer stops you. 
	Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. 
	If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. 
	If speed is 81 or more, the result is 2. 
	Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
*/
public int caughtSpeeding(int speed, boolean isBirthday) {

     int noTicket = 0;
     int smallTicket = 1;
     int bigTicket = 2;
     
     int lowSpeed;
     int midSpeed;
     int higherSpeed;
     int highSpeed;
     
     if(!isBirthday)
     {
        lowSpeed = 60;
        midSpeed = 61;
        higherSpeed = 80;
        highSpeed = 81;
     }
     else 
     {
        lowSpeed = 65;
        midSpeed = 66;
        higherSpeed = 85;
        highSpeed = 86;
     }
    
        if((speed >= midSpeed && speed <= higherSpeed))
        return smallTicket;
       
       else if( speed >= highSpeed)
        return bigTicket;
      
        else return noTicket;
  
}

/*
	Given 2 ints, a and b, return their sum. 
	However, sums in the range 10..19 inclusive, 
	are forbidden, so in that case just return 20.
*/

public int sortaSum(int a, int b) {
  int sum = a + b;
  if(sum >= 10 && sum <= 19)
    return 20;
  else return sum;
}

/*
	The number 6 is a truly great number. 
	Given two int values, a and b, return true if either one is 6. 
	Or if their sum or difference is 6. 
	Note: the function Math.abs(num) computes the absolute value of a number.
*/
public boolean love6(int a, int b) {

    int c;
    int d;
    c = a + b;
    d = a - b;
    if(a == 6 || b == 6)
      return true;
      
    else if(c == 6)
      return true;
    else if (d == 6)
      return true;
    else if(Math.abs(d) == 6)
      return true;
    else return false;
  
}

/*
Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
*/
public boolean more20(int n) {
  if(n % 20 <= 2 && n % 20 > 0 )
    return true;
  else return false;
}

/*
	Given a non-negative number "num", return true if num is within 2 of a multiple of 10. 
	Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.
*/
public boolean nearTen(int num) {
  if(num % 10 <= 2 || num % 10 >= (10-2))
    return true;
    
  else return false;
}

/*
	Given 2 ints, a and b, return their sum. 
	However, "teen" values in the range 13..19 inclusive, are extra lucky. 
	So if either value is a teen, just return 19.
*/
public int teenSum(int a, int b) {

int result;
if(a >= 13 && a <= 19 || b >= 13 && b <= 19)
  return 19;

else return result = a + b;
  
}

/*
	Given a string str, if the string starts with "f" return "Fizz". 
	If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". 
	In all other cases, return the string unchanged.
*/

public String fizzString(String str) {
    
    if(str.substring(0,1).equals("f")  && str.substring(str.length() -1).equals("b"))
    {
      return "FizzBuzz";
    }
    else if(str.substring(str.length() -1).equals("b") )
    {
      return "Buzz";
    }
    else if(str.substring(0,1).equals("f"))
    {
      return "Fizz";
    }
    else return str;
}

/*
  Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
*/
public boolean twoAsOne(int a, int b, int c) {
  
  int result = a + b; 
  int result2 = a + c;
  int result3 = b + c;
  
  if(result == c || result2 == b || result3 == a)
  
  return true;
  
  else return false;
}

/*
	Given three ints, a b c, return true if two or more of them have the same rightmost digit. 
	The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
*/
 public boolean lastDigit(int a, int b, int c) {
  
  int r1 = a % 10;
  int r2 = b % 10;
  int r3 = c % 10;
  
  return (r1 == r2 || r1 == r3 || r2 == r1 || r2 == r3);
  
}

/*
	Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, 
	such as the 2 in 12 and 23. (Note: division, e.g. n/10, 
	gives the left digit while the % "mod" n%10 gives the right digit.)
*/

public boolean shareDigit(int a, int b) {
  int rightA = a % 10;
  int rightB = b % 10;
  int leftA = a/10;
  int leftB = b/10;
  
  if(rightA == rightB || leftA == leftB || rightA == leftB || leftA == rightB)
    return true;
  else return false;
}



