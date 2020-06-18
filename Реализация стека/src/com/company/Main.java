package com.company;

import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception {
        Stack str = new Stack();
        String tmp = "";
        try{
            File fileIn = new File("C:\\Users\\EtoJeToha\\Desktop\\СИАОД\\input.txt");
            FileReader fr = new FileReader(fileIn);
            BufferedReader reader = new BufferedReader(fr);
            while ((tmp=reader.readLine())!=null) {
                str.Push(tmp);
            }
            fr.close();
            reader.close();
        }
        catch (FileNotFoundException e) {e.printStackTrace();}
        catch (IOException e) {e.printStackTrace();}
        try{
            File fileOut = new File("C:\\Users\\EtoJeToha\\Desktop\\СИАОД\\output.txt");
            FileWriter fw = new FileWriter(fileOut);
            while(!str.isEmpty()){
                fw.write(str.Pop()+ "\n");
            }
            fw.close();}
        catch (IOException e) {e.printStackTrace();}
        catch (Exception e) { e.printStackTrace();}
    }
}
