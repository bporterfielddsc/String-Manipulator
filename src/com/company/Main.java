package com.company;

import javax.swing.*;
//Blayne Porterfield

public class Main
{

    public static void main(String[] args)
    //executes input by user, calls displayMenu method and menuExcecution method with the functionSelection argument
    // and the the StringManipulator argument
    {

        StringManipulator stringMan = new StringManipulator();
        int functionSelection = 0;
        stringMan.setUserString(JOptionPane.showInputDialog("Please enter a string value"));

        functionSelection = displayMenu();
        menuExcecution(functionSelection, stringMan);

        JOptionPane.showMessageDialog(null, "bye bye");

    }

    private static int displayMenu()
     //Displays menu to user, returns the userSelection and makes sure it is an appropriate input
    {
        int userSelection = 0;
        boolean success = true;


        String menu = new String();

        menu += "1. List all uppercase letters in the string\n";
        menu += "2. List the vowels in the string\n";
        menu += "3. Replace vowels with underscores “_”\n";
        menu += "4. Count the number of vowels\n";
        menu += "5. Print the input in reverse\n";
        menu += "6. Print each character on a separate line\n";
        menu += "7. Exit";
        do //displays menu again when the user inputs an invalid menu choice
        {
            try //catches flaws in user input
            {
                userSelection = Integer.parseInt(JOptionPane.showInputDialog(menu));

                if (userSelection < 1)
                {
                    success = false;
                    JOptionPane.showMessageDialog(null, "you have entered an invalid menu choice.");
                } else if (userSelection > 7)
                {
                    success = false;
                    JOptionPane.showMessageDialog(null, "you have entered an invalid menu choice.");
                } else
                {
                    success = true;
                }
            } catch (Exception e)
            {
                success = false;
                JOptionPane.showMessageDialog(null, "you have entered an invalid menu choice");
            }

        } while (!success);
        return userSelection;
    }

    private static void menuExcecution(int functionSelection, StringManipulator stringMan)
    //takes the functionSelection and calls the appropriate method from the StringManipulator class
    {
        while (functionSelection != 7)
        {
            switch (functionSelection)
            {
                case 1:

                    JOptionPane.showMessageDialog(null, "all uppercase letters in your string are " + stringMan.allUpperCase());
                    break;

                case 2:

                    JOptionPane.showMessageDialog(null, "all the vowels in your string are " + stringMan.allVowels());
                    break;

                case 3:
                    stringMan.replaceVowels();
                    JOptionPane.showMessageDialog(null, "your string with all vowels replaced with a underscore is " + stringMan.replaceVowels());
                    break;

                case 4:

                    JOptionPane.showMessageDialog(null, "the number of vowels in your string is " + stringMan.countVowels());
                    break;

                case 5:

                    JOptionPane.showMessageDialog(null, "your string in reverse is " + stringMan.reverseInput());
                    break;

                case 6:

                    JOptionPane.showMessageDialog(null, "Here is each character in your string printed on a separate line:\n" + stringMan.eachChar());
                    break;




            }

            functionSelection = displayMenu();
        }
    }
}
