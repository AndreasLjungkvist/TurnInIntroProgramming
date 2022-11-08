package TurnInProject;

import java.util.ArrayList;
import java.util.List;

public class LogicClass {

    private List<String> aList = new ArrayList<>();
    private String text, textString, longestWord;
    private boolean boolSwitch;
    private int countCharacters, countRows;


    public LogicClass(String input1) {
        text = input1;
        boolSwitch = true;
        longestWord = "";
        textString = "";
    }

    //Condition for while-trigger. Check for better function than OR.
    public void tryBooleanSwitch() {
        // if (bSwitchCondition == "stop" || bSwitchCondition == "Stop" || bSwitchCondition == "STOP") {
        if (getText().equalsIgnoreCase("stop")) {
            boolSwitch = false;
        } else {
            boolSwitch = true;
        }
    }
    public boolean getBooleanSwitch(){
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

    //Convert list to string. Remove generated string-brackets.
    public void listToString() {
        textString = aList.toString();
        textString = textString.replace("[","");
        textString = textString.replace("]","");
    }

    //Counting methods.
    public int getCountCharacters() {
        countCharacters = (textString.length());
        return countCharacters;
    }
    public int getCountRows() {
        countRows = aList.size();
        return countRows;
    }

  /**  public int getCountWordsToken() {
        if (textString == null || textString.isEmpty()) {
            return 0;
        } else {
            StringTokenizer stringToken = new StringTokenizer(textString);
            return stringToken.countTokens();
        }
    }
 }
   */
  public int countWords() {
      if (textString == null || textString.isEmpty()) {
          return 0;
      }
      String[] words = textString.split("\\s+");
      return words.length;
  }
    public String getLongestWord (){
      String[] words = textString.split(" ");
      textString = textString.replace(",","");
        for (int i = 0; i < words.length; ++i ){
                if(words[i].length() >= longestWord.length()){
                    longestWord = words[i];
                }
        }
        return longestWord;
    }
}


    //To-Do: Separera bool try och return. En void med text som input. En bool return?
    //Kolla på inmatning. Ta bort set text eller ändra textIn-klassen. Dubbel input just nu.
    //Rensa while-variabeln för "stopp" så att case 1 kan repeteras korrekt.
    //Ev. korrigerings-int för stringconvertering.