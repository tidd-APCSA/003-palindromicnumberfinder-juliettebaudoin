public class PalindromicNumberFinder {
    private int num;
    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    // this method should find the next palindromic number
    public int searchForPalindromicNum(int num){
        Integer myInt = num;
        String myString = myInt.toString();
        //return myInt + 101;
        //Integer newNum = myInt + 105;
        //while (num > 100) {
          //for (int i = 0; i < myString.length()-1; i++){
            //System.out.println(myString.charAt((myString.length() + 1) /2) +1 );
            //System.out.println(num % 10);
            int newNum = num + 110;
            // int digit = num % 1000;
            // System.out.println(digit);
            // int lastDigit = num % 10;
            // //System.out.println(digit % 100 - lastDigit);
            // System.out.println(digit + 10);
            // // int lastDigit = num % 10;
            // System.out.println(lastDigit);
            // System.out.println("new last " +lastDigit);
            // int middleDigit = num % 100;
            // System.out.println(middleDigit);
            // System.out.println("new middle " + (middleDigit + 1));
            // int firstDigit = num / 100;
            // System.out.println(firstDigit);
        //int next = myString.charAt(myString.length()/2) ;
        //System.out.println(next);
                         
  //  int digit = num % 10;
  //  num /= 10;
  //  System.out.print(digit + " ");
//}
return newNum - num;        //return newNum;
        //return this.testPalindromicNum(newNum);
    }

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
        Integer myInt = num;
        String myString = myInt.toString();

        // if (myString.substring(0, myString.length()/2) == myString.substring(myString.length()/2, myString.length())){
        //   return true;
        // }


        //System.out.println("Int" + myInt);
        //System.out.println("String" + myString);
        //System.out.print("reverse" + reverseNum(myInt));
        //return (this.reverseNum(myInt) == myInt.toString());
        System.out.println(myInt.toString());
        // System.out.println(this.reverseNum(myInt));
        // System.out.println(myInt.toString());
        return myString.equals(this.reverseNum(myInt));

        // for (int i = 0; i < myString.length(); i++){
        //   return myString()==this.reverseNum(myInt);
        // }
        

      // if (myString == myInt.reverseNum()){
      //   return true;
      // }
    }


    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
        Integer myInt = num;
        String myString = myInt.toString();
        String reverseString = "";
        for (int i = 0; i < myString.length(); i++){
          reverseString = reverseString + myString.charAt(myString.length()-(1+i));

        }
        return reverseString;

    }
    


    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
