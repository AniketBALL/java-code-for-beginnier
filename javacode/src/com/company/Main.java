package com.company;
import java.util.Arrays; // use for array properties
import java.util.Scanner; // use to take input from user

public class Main {
    public static void printjava(){
        System.out.println("HELLO JAVA.......");           ///// CREATING FUNCTIONSMETHODS...//////
    }
    public static void printname(String name){
        System.out.println("your name = "+name);       /////TAKING INNPUT FROM USER TO PRINT NAME////////
    }
    public static void total(int a,int b){
        int sums= a+b;                                    ///// TAKING TWO INPUTS FROM USER ///////
        System.out.println("Total is " +sums);
    }

    public static void main(String[] args) {
	// First program
        System.out.println("hello Lucifer!");



        // variables ====
        String name="Aniket";
        int age=13;
        String nickname="Lucifer";
        String alternate = nickname; //Giving the value of other variables
        System.out.println(age); //printing a variables
        System.out.println(alternate);



        //Datatypes ===
            //1)Primitive----
        // Types------>
        byte old=20;
        int phone1 =1234567890;
        long phone2 = 1_234_567_890_000L;
        float pie =3.14F;
        char letter ='@';//or 'anime'
        boolean isAdult = true;//or false
        System.out.println(phone2);

             //2)non-primitive----- (it has self functions or methods to do some operations)
        String yourname="Rex";
        System.out.println(yourname);
        System.out.println(yourname.length()); //fucition used in non primitive type
                        //OR
        // It is also created by 'new'keyword.it is not complasary...
        String words=  new String("luci");
        System.out.println(words);

         //Types----->

        //STRINGS=======
          //FUNCTIONS------------------
          // 1)concatenate---- add strings
        String name1="Mom";
        String name2="Me";
        String name3="Pagli";
        String happiness=name1+" and "+name2+" and "+name3;
        System.out.println(happiness);
          // 2)charAt()----- find character for  specific location
        String word1="rex anderson";
        System.out.println(word1.charAt(5));
          // 3)length()----- calculate total no.of character present
        String word2="hello hi";
        System.out.println(word2.length());
          // 4)replace()-----
        String word3="Lucifer";
        String word4=word3.replace("L","R");
        System.out.println(word4);
        System.out.println(word3);
          // 5)substring()----- find small part from a string(indecing of string)
        String sentance="I am the devil himself";
        System.out.println(sentance.substring(9,14));


        //ARRAYS========== It can be int , char, strings,boolean
        // it is a non-primitive datatype
        int[]marks = new int[5]; //1D Array
        marks[1]=77;
        marks[2]=99;
        marks[3]=56;
        marks[4]=78;
        System.out.println(marks[3]);

        //PROPERTIES------>
             //1)Length------
        System.out.println(marks.length);
             //2)Sorting------
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]); //sorted

        // If the values of array is know then we do not use 'new' keyword
        int[]mark={78,89,79}; //1D array
        System.out.println(mark[1]);

        int[][] finalmarks={{88,90,76},{98,99,70}}; //2D Array;
        System.out.println(finalmarks[0][2]);
        System.out.println(finalmarks[1][0]);



        //Casting========

          //TYPES-------->
             //Implicit casting------ smaller to bigger
        double price=100.90;
        double finalprice=price+18;
        System.out.println(finalprice);

           //Explicit casting-------- bigger to smaller (lose data)
        int p =100;
        int Fp= p+(int)18.99;
        System.out.println(Fp);



        //Constants========
           //for constant 'final' keyword is used
        final float PI = 3.14F;



        //Operator=======
           // 1)Arithmatic operator------->
         double a= 5;
         double b=3;
         double sum = a+ b;
         double sub = a-b;
         double multi = a*b;
         double div = a/b;
         double modulo = a%b;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(modulo);

          // 2)Unary operator--------> =,++,--,=+
        int numb=2;
        //numb =numb+1;
        // ///OR////////
        //System.out.println(numb);
        numb++;
        System.out.println(numb);

          //sum---
        int num = 1;
        System.out.println(num++); //1 (change after)
        System.out.println(num); // 2
        int num1=2;
        System.out.println(++num1);//3 (change before)
        System.out.println(num1); //3
          //Substract---
        int num2 =2;
        System.out.println(num2--);//2 (change after)
        System.out.println(num2);//1
        int num3 =4;
        System.out.println(--num3);//3 (change before)
        System.out.println(num3);//3


        //3)Assigment operators========== +=,-=,*=,/=
        int  n =3;
        int v=1 ;
        v+=n;//4              ////ADD////
        v-=n;//2              /////Substract/////
        System.out.println(v);


        //Maths======
         //Examples(some functions)-----------
          //Maxnimum()---->
        System.out.println(Math.max(13,35));
          //MInimum()----->
        System.out.println(Math.min(13,93));
           //Ramdom()------>
        System.out.println((int)(Math.random()*100)); //Random values in int that why we use typecast integer



        // User input in java
            //for int,float,double ...
//        Scanner sc = new Scanner(System.in);         ////////sc is VARIABLE////////
//        System.out.println("Input any number=");
//        int number= sc.nextInt();
//        System.out.println("the number is "+(number));
//
//          //for string(for single word)....
//        //Scanner sc = new Scanner(System.in);        ////////sc is VARIABLE////////
//        System.out.println("your name==");
//        String namee = sc.next();
//        System.out.println("my name is "+(namee));
//
//
//          //for a line or sentance....
//        Scanner sz = new Scanner(System.in);          ////////sz is VARIABLE///////
//        System.out.println("Enter a sentance=");
//        String linee = sz.nextLine();
//        System.out.println("The line is "+(linee));



        //Conditional statement=========
//         Scanner sa =new Scanner(System.in);           ///////sa is VARIABLE////
//        System.out.println("Enter the age=");
//        int age1= sa.nextInt();
//        if (age1 > 18)
//            System.out.println("can vote");
//        else
//            System.out.println("can't vote");


        //Logical operation============

          // 1) &&-------> AND(both must be true)
            int r = 10;
            int s =30;
            if (r<50 && s<50)
                System.out.println("both less than 50");
          // 2) ||--------> OR(atleast one must be true)
            int t =99;
            int d = 13;
            if (t<50 || d<50)
                System.out.println("atleast one is small");
          // 3) !---------> NOT(negative the satement)
            boolean isadult=false;
            if (!isadult)  // or if(!isadult == true)  {both are same}
                System.out.println("is adult");
            else
                System.out.println("is not adult");


        // EXAMPLE-- Contional statement----===================

//         Scanner pr = new Scanner(System.in);      ///////pr is VARIABLE//////
//              //pen = 10 and notebook=40
//        System.out.println("Total cash");
//        int cash = pr.nextInt();
//        System.out.println("you have=="+(cash));
//        if (cash<10){
//            System.out.println("you can not buy any things");
//            System.out.println("you need more money");                    ///////BLOCK STATEMENT///////
//        }
//        else if (cash>10 && cash<50){
//            System.out.println("you can one thing");
//        }
//        else
//            System.out.println("you can buy both");

        // Switch and Break statemant============
        Scanner da = new Scanner(System.in);
        System.out.println("Enter the date=");    ////monday =1,tuesday =2 and so on
        int day= da.nextInt();                     ////////da is VARIABLE///////
        System.out.println("the day is ");
        switch(day) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("sun - web");
        }



     // Loops============

        //types---------->
          // 1) For Loops-------
                // 1) Print number from 1-13----
//        for (int i=1 ;i<=13;i++)
//            System.out.println(i);

              //2) print number from 13-1-----
//        for (int j =13;j>=1;j--)
//            System.out.println(j);


         // 2) while Loops------
             // Print number from 1-5----
//          int o= 1;
//          while (o<=5){
//              System.out.println(o);
//              o++;
//          }

         // 3) do whlie Loops------
             // print number from 5-1-----
//         int q =5;
//          do {
//              System.out.println(q);
//              q--;
//          }while (q>=1);

        //Exercise of while loop------>
            // Stop the loop until the user gives a number is less than equal to zero....
//        Scanner sb = new Scanner(System.in);
//        int var;
//        do {
//            System.out.println("Enter the number=");
//            var= sb.nextInt();
//            System.out.println("Thee number is= "+var);
//        }while(var>=0);
//        System.out.println("THE END");
//
//
//        // Break and Continue(KEYWORD)=======
//        int vr = 0;
//        while (true) {        //IT will run infinite times.
//
//            System.out.println(vr);
//            vr++;
//            if (vr > 5) {
//                break;           ////IT  WILL HELP TO BREAK THE LOOP//////
//            }
//
//            if (vr == 3) {
//                vr++;           ////IT SKIP THE TREM AND CONTINUE THE REST LOOP UNTIL THE LOOP IS FALSE ORR BREAK.////
//                continue;
//            }
//        }


        // Try and catch in Exception handling=============
        int[] gg ={12,13,15};
        try {
            System.out.println(gg[3]);   ////ERROR////
        }catch (Exception exception){
            ///do someithing after catching
        }
        System.out.println("hi  heloo");


    // Methods/Functions============ we can a create a function..
       //EXAmple 1-------
        printjava();
        printjava();      ////call the function////
        printjava();

        //Example 2------input name from user by using function
        printname("Aniket");
        printname("Lucifer");

        //Example 3------do sum by using function
        total(3,5);


    }
}
