package TurnInProject;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class LogicClass {

    private List<String> aList = new ArrayList<>();
    private String text, textString, longestWord;
    private boolean boolSwitch;
    private int countCharacters, countRows;


    public LogicClass(String input1) {
        text = input1;
        boolSwitch = true;
        longestWord = null;
        textString = "";
    }

    //Condition for while-trigger. Check for better function than OR.
    public boolean booleanSwitch(String bSwitchCondition) {
        // if (bSwitchCondition == "stop" || bSwitchCondition == "Stop" || bSwitchCondition == "STOP") {
        if (bSwitchCondition.equalsIgnoreCase("stop")) {
            boolSwitch = false;
        } else {
            boolSwitch = true;
        }
        return boolSwitch;
    }

    // Input into string.
    public void setText(String stringIn) {
        text = stringIn;
    }

    public String getText() {
        return text;
    }

    // Add String value to list.
    public void addToList() {
        aList.add(text);
    }

    public List getList() {
        return aList;
    }

    //Convert list to string.
    public void listToString() {
        textString = aList.toString();
    }

    //Counting methods.
    //getCountCharacters. Reduce -2 to account for brackets created from converting ArrayList to String.
    public int getCountCharacters() {
        countCharacters = (textString.length()-2);
        return countCharacters;
    }

    public int getCountRows() {
        countRows = aList.size();
        return countRows;
    }

    public int getCountWordsToken() {
        if (textString == null || textString.isEmpty()) {
            return 0;
        } else {
            StringTokenizer stringToken = new StringTokenizer(textString);
            return stringToken.countTokens();
        }
    }
}
  /**  public String getLongestWord (){
        for (String aList : aList){
            if (longestWord == null || textString.length() > longestWord.length()) {
                longestWord = textString;
            }
        }
        return longestWord;
    }*/
  /**public String getLongestWord(){
      int length = 0;
      textString = textString + "";
      for (int i =0;i< textString.length();i++){
          if(equals(textString.charAt(i)  ""){

          }
      }
  }*/

   /** public int countRows(){
        int rowCount = aList.size();
    }

    public int countCharacters(){
        int characterCount =
        return characterCount;
    }*/


    //To-Do: Separera bool try och return. En void med text som input. En bool return?
    //Kolla på inmatning. Ta bort set text eller ändra textIn-klassen. Dubbel input just nu.
    //Rensa while-variabeln för "stopp" så att case 1 kan repeteras korrekt.