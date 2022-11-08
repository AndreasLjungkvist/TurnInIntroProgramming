package TurnInProject;

import java.util.Scanner;


public class ProjectMain {
    public static void main(String[] args) {
        //  Objects and variables
        LogicClass logic = new LogicClass("");
        Scanner scan = new Scanner(System.in);

        int inputSwitch;
        boolean bool1 = true;

        //outer while-loop to exit program. case 3 sets value.
        while (bool1 == true) {
            System.out.println("""
                    Main menu.
                    Choose option:
                    1:Add to library.
                    2:See statistics.
                    3:Exit.""");

            inputSwitch = scan.nextInt();
            //scan.nextline(); below to clear cache to avoid empty first element in list.
            scan.nextLine();
            switch (inputSwitch) {
                //Main input stringIn.
                case 1:
                    // Condition: IF NOT ignoreCase "stop" from getText, then run.
                    System.out.println("You are now adding to the library.\nTo exit and go back to the main menu type 'Stop'.");
                    while (logic.getBooleanSwitch()) {
                        System.out.printf("%s", ":");
                        logic.setText(scan.nextLine());
                        //IF NOT ignoreCase "stop", then add to list.
                        if (!(logic.getText().equalsIgnoreCase("stop"))) {
                            logic.addToList();
                           // logic.getList();
                        }
                        logic.tryBooleanSwitch();
                    }
                    //Change text attribute to "empty" to let make case 1 repeatable.
                    logic.setText("");
                    break;
                //Case 2. List display, character count, row count, word count & longest word.
                case 2:
                    logic.listToString();
                    System.out.println("The saved text are as follow: " + logic.getList());
                    System.out.println("Character count: " + logic.getCountCharacters());
                    System.out.println("Row count: " + logic.getCountRows());
                    System.out.println("Word count: " + logic.countWords());
                    System.out.println("The longest word is: " + logic.getLongestWord());
                    scan.nextLine();
                    /** System.out.println("The saved text are as follows: " + logic.getList() +"\nCharacter count: "
                     * + logic.getCountCharacters() "); */
                    break;
                //Case 3. Exit program.
                case 3:
                    System.out.println("Program ending. Bye!");
                    bool1 = false;
                    break;

                default:
                    System.out.println("The input value was not eligible. Try with a value 1-3.");
            }
        }
    }
}

/**Changes:
-Added Scan.nextline(); to case 2 before break. 52.
 -Added textIn.setText to "" after case 1 loop to make case 1 repeatable. 42.
 -Removed -2 in logic getCountCharacters, for replace in 54,55.
 -Replace tokenizer-method with split()-method.
 -Added getLongestWord-method.
 -Separated boolean switch into try and get.
 -Reworked tests "setBoolSwitchToTrue" & "setBoolSwitchToFalse".
 -Refactored "textIn" to "logic".
 -Added logic.tryBooleanSwitch at end of case 1.
 -Added TDD case "countCharacters".
 */