
/**
 * PuzzleJava
 */
import java.util.*; // THIS IMPORTS EVERYTHING IN java.util

public class PuzzleJava {

  public void getTenRolls() {

    Random randMachine = new Random();

    // randMachine.ints();
    // return randMachine;

    int[] arr = new int[10];

    //THIS IS HOW TO LOOP AND INSERT IN EVERY INDEX A RANDOM NUMBER
    for(int i = 0; i < arr.length; i++){
      arr[i] = randMachine.nextInt(10, 21);
    }

    System.out.println(Arrays.toString(arr)); // THIS IS HOW TO PRINT THE ARRAY
  }

  public char getRandomLetter() {
    Random randCharMachine = new Random();

    char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}; 

    char randomLetter = alphabet[randCharMachine.nextInt(alphabet.length)];

    return randomLetter;

}
  public String generatePassword() {
    String password = "";

    // for (char letter = getRandomLetter(); letter < 8; letter++) 
    for (int i = 0; i < 8;i++) {
    char letter = getRandomLetter();
    password += letter; 
  }

    return password ;
  }

  // visibility // return type // method name // arg/ parameteres
  public ArrayList<String> getNewPasswordSet(int num) {
    ArrayList<String>  passwordSet = new ArrayList<String>();
    for ( int i = 0 ; i < num;i++ ) {
      String password = generatePassword();
      passwordSet.add(password);
  }

  return passwordSet;


  }

    
    }

//     getNewPasswordSet

// Write a method that takes an int length as an argument and 
// creates an array of random eight-character words. The array should be
//  the length passed in as an int. Return the array of passwords.

    // public string generatepassword

    // String password = ""

    // String letter = getRandomLetter();
    // password += letter