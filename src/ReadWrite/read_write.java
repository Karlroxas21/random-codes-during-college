package ReadWrite;

import java.io.*;
class ReadWrite{public static void main(String[] args) throws IOException {


    String fileName = "D:\\1.txt";
    FileReader fileReader =
            new FileReader(fileName);
    BufferedReader bufferedReader =
            new BufferedReader(fileReader);



    String stringContainer = null;
    String[] stringArray = new String[6];
    int count = 0;
    while((stringContainer = bufferedReader.readLine()) != null) {
        stringArray[count] = stringContainer;
        count++;
    }
    bufferedReader.close();

    File file = new File(fileName);
    FileWriter fileWriter = new FileWriter(file);

    for(int i = stringArray.length - 1; i >= 0; i--)  {

        for(int j = 0; j < stringArray[i].length(); j++)  {

            String[] charReplacement = stringArray[i].split("");
            if(charReplacement[j].equals("O")){
                charReplacement[j] = "X";
            }
            else {
                charReplacement[j] = "O";
            }

            System.out.print(charReplacement[j]);

        }
        fileWriter.write(stringArray[i] + "\n");

        System.out.println();
    }


    fileWriter.close();

//Credits to Group2
}

}