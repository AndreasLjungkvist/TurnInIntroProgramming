package TurnInProject;

import static org.junit.Assert.*;
import org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class TDDClass {
    Scanner scan = new Scanner(System.in);
    //set Text input.
    @Test
    public void getTextInput() {
        //Arrange
        LogicClass library = new LogicClass("");
        //Act
        library.setText("Andreas");
        String acutal = library.getText();
        String expected = "Andreas";
        //Assert
        assertEquals(expected, acutal);
    }
    //Set Boolean Switch to false.
    @Test
    public void setBoolSwitchToFalse() {
        //Arrange
        LogicClass library = new LogicClass("");
        //Act
        library.setText("stop");
        boolean actual = library.booleanSwitch(library.getText());
        boolean expected = false;
        //Assert
        assertEquals( actual, expected);
    }
    //Set Boolean Switch to true.
    @Test
    public void setBoolSwitchToTrue() {
        //Arrange
        LogicClass library = new LogicClass("");
        //Act
        library.setText("blåbär");
        boolean actual = library.booleanSwitch(library.getText());
        boolean expected = true;
        //Assert
        assertEquals( actual, expected);
    }

    //Add String to ArrayList.
    @Test
    public void addToArrayList() {
        //Arrange
        LogicClass library = new LogicClass("");
        List<String> list = new ArrayList<String>();
        List<String> exp = new ArrayList<String>(Arrays.asList("Test string in","String 2","Text 3"));

        //Act
        library.setText("Test string in");
        list.add(library.getText());
        library.setText("String 2");
        list.add(library.getText());
        library.setText("Text 3");
        list.add(library.getText());
        List actual = list;
        List expected = exp;
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void manualInputs() {
        //Arrange
        LogicClass library = new LogicClass("");
        List<String> list = new ArrayList<String>();
        List<String> exp = new ArrayList<String>(Arrays.asList("Test string in","String 2","Text 3"));

        //Act
        library.setText("Test string in");
        list.add(library.getText());
        library.setText("String 2");
        list.add(library.getText());
        library.setText("Text 3");
        list.add(library.getText());
        List actual = list;
        List expected = exp;
        //Assert
        assertEquals(expected,actual);
    }
}
