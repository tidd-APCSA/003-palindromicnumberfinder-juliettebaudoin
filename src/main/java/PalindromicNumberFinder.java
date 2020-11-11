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
        int i = num;
        boolean flag = true;
        while (flag){
          i++;
          if(testPalindromicNum(i)){
            flag = false;
          }
        }
        return i - num;  
    }
    

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
        Integer myInt = num;
        String myString = myInt.toString();
        return myString.equals(this.reverseNum(myInt));
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
