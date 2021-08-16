package com.Practice;

    public  class Condi {

        public void first(){
            for(int a=1;a<8;a++) {
                for (int b = 1; b < a; b++) {
                    System.out.print(b);
                }
                System.out.println();
            }
                for (int c = 1; c < 8; c++) {
                    for (int d =6; d > c; d--) {
                        System.out.print(d);
                    }
                    System.out.println();
                }

        }

    public static void main(String[] args) {
     Condi obj=new Condi();
     obj.first();
    }

}
