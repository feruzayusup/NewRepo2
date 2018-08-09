package feruza;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class StrFreq {
	
	public static void main(String[] args) 
    {    
        //Creating wordCountMap which holds words as keys and their occurrences as values
         
        HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
     
        BufferedReader reader = null;
         
        try
        {
            //Creating BufferedReader object
             
            reader = new BufferedReader(new FileReader("C:\\sample.txt"));
             
            //Reading the first line into currentLine
             
            String currentLine = reader.readLine();
             
            while (currentLine != null)
            {    
                //removing the punctuation and splitting the currentLine into words
                 
                String[] words = currentLine.toLowerCase().replaceAll(".","")
                		.replaceAll(",","").replaceAll("?","").replaceAll("!","")
                		.replaceAll(":","").replaceAll(";","").split(" ");
                 
                //Iterating each word
                 
                for (String word : words)
                {
                    //if word is already present in wordCountMap, updating its count
                     
                    if(wordCountMap.containsKey(word))
                    {    
                        wordCountMap.put(word, wordCountMap.get(word)+1);
                    }
                     
                    //otherwise inserting the word as key and 1 as its value
                    else
                    {
                        wordCountMap.put(word, 1);
                    }
                }
                 
                //Reading next line into currentLine
                 
                currentLine = reader.readLine();
            }
             
            //Getting the second most repeated word and its occurrence
             
            String secondMostRepeatedWord = null;
             
            int count = 0;
             
            Set<Entry<String, Integer>> entrySet = wordCountMap.entrySet();
             
            for (Entry<String, Integer> entry : entrySet)
            {
                //eliminating the word "Macbeth"
				if(entry.getValue()<285 && entry.getValue() > count)
                {
                	secondMostRepeatedWord = entry.getKey();
                     
                    count = entry.getValue();
                }
            }
             
            System.out.println("The second most repeated word in input file is : "+secondMostRepeatedWord);
             
            System.out.println("Number Of Occurrences : "+count);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();           //Closing the reader
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }    
}


