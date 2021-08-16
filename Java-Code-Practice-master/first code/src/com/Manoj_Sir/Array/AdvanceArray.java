package com.Manoj_Sir.Array;

public class AdvanceArray {
    public static void main(String[] args) {
        int marks[]={23,42,42,56,2,22,2};
       for(int i=0;i<marks.length;i++){
for(int j=i+1;j<marks.length;j++){
    if(marks[i]==marks[j]){
        System.out.println(marks[j]);
    }

}

           }



    }
}
