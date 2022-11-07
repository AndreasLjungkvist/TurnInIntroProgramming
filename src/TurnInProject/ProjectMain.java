package TurnInProject;

import java.util.Scanner;


public class ProjectMain {
    public static void main(String[] args) {
        //  Objects and variables
        LogicClass textIn = new LogicClass("");
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
                    while (textIn.booleanSwitch(textIn.getText())) {
                        System.out.printf("%s", ":");
                        textIn.setText(scan.nextLine());
                        //IF NOT ignoreCase "stop", then add to list.
                        if (!(textIn.getText().equalsIgnoreCase("stop"))) {
                            textIn.addToList();
                           // textIn.getList();
                        }
                    }
                    //Change text attribute to "empty" to let make case 1 repeatable.
                    textIn.setText("");
                    break;
                //Case 2. List display, character count, row count, word count & longest word.
                case 2:
                    textIn.listToString();
                    System.out.println("The saved text are as follow: " + textIn.getList());
                    System.out.println("Character count: " + textIn.getCountCharacters());
                    System.out.println("Row count: " + textIn.getCountRows());
                    System.out.println("Word count: " + textIn.getCountWordsToken());
                    System.out.println("The longest word is: ");
                    scan.nextLine();
                    /** System.out.println("The values in the list are:" + textIn.getList()+"\nThe character count is: "
                     + textIn.getcountCharacters() + "symbols and characters.\n"); */
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
 */