package HW.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class СharAndCount {
    public void run(BufferedReader reader) {
        System.out.println("Please enter string");
        try {
            String text = reader.readLine();
            char[] chars = text.toCharArray();

            List<CompareArray> compareArrays = new ArrayList<>();


//            List<CompareArray> compareArrays = new ArrayList<>();
            for (char nowChar : chars) {
                if(compareArrays.isEmpty()){
                    CompareArray newCompareArray = new CompareArray();
                    newCompareArray.letter = nowChar;
                    newCompareArray.count = 1;
                    compareArrays.add(newCompareArray);

                }else {
                    boolean existChar = false;
                    for (CompareArray compareArray : compareArrays) {

                        if (nowChar == compareArray.letter){

                            existChar = true;
                            compareArray.count++;

                        }
                    }
                    if (!existChar){
                        CompareArray newCompareArray = new CompareArray();
                        newCompareArray.letter = nowChar;
                        newCompareArray.count = 1;
                        compareArrays.add(newCompareArray);
                    }

                }


        }
            for (CompareArray compareArray : compareArrays) {
                System.out.println(compareArray);
            }
    } catch (IOException e) {
            e.printStackTrace();
        }


    }




    }







