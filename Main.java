import java.util.ArrayList;
import java.util.List;

class Main{
    public static void main(String[] args) {
        String words = "Have fun decrypting!";
        List<Integer> numbers = new ArrayList<>();
        List<Integer> newNumber = new ArrayList<>();
        List<Integer> diff = new ArrayList<>();
        List<Character> newChar = new ArrayList<>();

        for(char letter: words.toCharArray()) //for each letter in the string
        {
            numbers.add((int)letter); //adds the ascii value of the letter to the list
        }
        for(int number: numbers) //for each number in the list
        {
            
            int newNum = (int)(Math.random() * (127 -32 + 1)) + 32; 
            newNumber.add(newNum); //adds the random number to the new list
            diff.add(number-newNum); //adds the difference between the new number and the old number to the diff list

        }
        for(int i = 0; i < newNumber.size(); i++) //for each number in the list
        {
            newChar.add((char)(int)(newNumber.get(i)));
        }

        List<Character> wordList = new ArrayList<>();

        for (char letter : words.toCharArray()) {
            wordList.add(letter); // Adds each character from the string to the list
        }

        StringBuilder result = new StringBuilder();
        for (char c : newChar) {
            result.append(c); // Append each character to the StringBuilder
        }
        String finalString = result.toString();


        StringBuilder diffS = new StringBuilder();
        for (int c : diff){
            diffS.append(c);
            diffS.append(" "); // Append each character to the StringBuilder
        }
        String diffString  = diffS.toString();

        StringBuilder newNums = new StringBuilder();
        for (int c : newNumber){
            newNums.append(c);
            newNums.append(" "); // Append each character to the StringBuilder
        }
        String appendNew  = newNums.toString();

        System.out.println(finalString); //prints the new string
        System.out.println(diffString); //prints the difference between the new and old string
        System.out.println(appendNew); //prints the new string


            for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Original Char: " + wordList.get(i) +
                       ", Original ASCII: " + numbers.get(i) +
                       ", Random ASCII: " + newNumber.get(i) +
                       ", Difference: " + diff.get(i) +
                       ", Random Char: " + newChar.get(i));
        }
        // for(int i = 0; i < diff.size(); i++;)
        // {
        //     System.out.println("");
        // }
    }
}