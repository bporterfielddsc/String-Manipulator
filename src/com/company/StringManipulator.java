package com.company;

public class StringManipulator
{
    private String userString = new String();//will store user input string

    public StringManipulator()//constructor
    {
        userString = "";
    }

    public String getUserString()//userString getter
    {
        return userString;
    }

    public void setUserString(String userString)//userString setter
    {
        this.userString = userString;
    }

    public String allUpperCase()
    //creates string called UpperCase and adds all of the uppercase letters in the user input string to the UpperCase string, returns the UpperCase string
    {
        String UpperCase = new String();
        for (int i = 0; i < userString.length(); )//goes through each index of the user input string
        {
            if (Character.isUpperCase(userString.charAt(i)))//checks if the character at index i is a uppercase letter or not
            {
                UpperCase += userString.charAt(i);//adds uppercase letters to the UpperCase string
                i++;//next index

            } else
            {
                i++;//next index
            }

        }
        return UpperCase;
    }

    public String allVowels()
    //creates string called Vowels and adds all of the vowels in the user input string to the Vowels string, returns the Vowels string
    {
        String Vowels = new String();
        for (int i = 0; i < userString.length(); )//goes through each index of the user input string
        {
            if (userString.charAt(i) == 'a' || userString.charAt(i) == 'e' || userString.charAt(i) == 'i' || userString.charAt(i) == 'o' || userString.charAt(i) == 'u' || userString.charAt(i) == 'A' || userString.charAt(i) == 'E' || userString.charAt(i) == 'I' || userString.charAt(i) == 'O' || userString.charAt(i) == 'U')
            //checks if the character in index i is a lowercase or uppercase vowel
            {
                Vowels += userString.charAt(i);//adds vowel to Vowels string
                i++;//next index

            } else
            {
                i++;//next index
            }

        }
        return Vowels;
    }

    public String replaceVowels()
    //creates string called underScoreString and replaces all the vowels in the user input string with underscores, returns the underScoreString string
    {
        String underScoreString = new String();
        for (int i = 0; i < userString.length(); )//goes through each index of the user input string
        {
            if (userString.charAt(i) == 'a' || userString.charAt(i) == 'e' || userString.charAt(i) == 'i' || userString.charAt(i) == 'o' || userString.charAt(i) == 'u' || userString.charAt(i) == 'A' || userString.charAt(i) == 'E' || userString.charAt(i) == 'I' || userString.charAt(i) == 'O' || userString.charAt(i) == 'U')
            //checks if the character at index i is a vowel
            {

                underScoreString += '_';//replaces vowel with underscore
                i++;//next index

            } else
            {
                underScoreString += userString.charAt(i);//adds character from user input string to underScoreString
                i++;//next index
            }

        }
        return underScoreString;
    }

    public int countVowels()
    //counts number of vowels in the user input string, returns the number of vowels in the user input string
    {
        int vowelCount = 0;
        for (int i = 0; i < userString.length(); )//goes through each index of the user input string
        {
            if (userString.charAt(i) == 'a' || userString.charAt(i) == 'e' || userString.charAt(i) == 'i' || userString.charAt(i) == 'o' || userString.charAt(i) == 'u' || userString.charAt(i) == 'A' || userString.charAt(i) == 'E' || userString.charAt(i) == 'I' || userString.charAt(i) == 'O' || userString.charAt(i) == 'U')
            //checks if the character at index i is a vowel
            {

                vowelCount++;//adds one to vowel count
                i++;//next index

            } else
            {
                i++;//next index
            }

        }

        return vowelCount;
    }


    public StringBuilder reverseInput()
    //creates StringBuilder variable called Reverse to store the reverse of the string input from the user, returns Reverse
    {
        StringBuilder Reverse = new StringBuilder();//StringBuilder Reverse variable declaration
        Reverse.append(userString);//append user input string
        Reverse = Reverse.reverse();//save the reverse of the user input string in Reverse
        return Reverse;

    }

    public String eachChar()
     //creates a string called separateLineChar that puts every character from the user input string on a separate line, returns separateLineChar
    {
        String separateLineChar = new String();
        for (int i = 0; i < userString.length(); )
        //goes through each index in the user input string
        {
            separateLineChar += userString.charAt(i) + "\n";//adds character from index i in the user input string to the separateLineChar string and goes to the next line
            i++;//next index
        }
        return separateLineChar;
    }
}
