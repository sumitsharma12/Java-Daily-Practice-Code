package com.Manoj_Sir.Exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Throws_Exception {

    void readFile()throws FileNotFoundException{
        FileInputStream fis=new FileInputStream("d:abc.txt");
    }
    void saveFile()throws FileNotFoundException{
        FileOutputStream fos=new FileOutputStream("d:xyz;txt");
    }


    public static void main(String[] args) {
        Throws_Exception obj=new Throws_Exception();
//        obj.readFile();
try{
    obj.readFile();
}
catch (FileNotFoundException e){
    e.printStackTrace();
}
      try{
          obj.saveFile();
      }
      catch (FileNotFoundException e){
          e.printStackTrace();

      }
        System.out.println("helloooo");
    }
}
