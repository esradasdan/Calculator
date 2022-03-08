package com.esradasdan.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    public TextView text1;
    public TextView text2;
    public String mystring="";



    public ArrayList<String> list = new ArrayList<String>();
    public static char arr[]={'+','-','*','/'};


    public double func(String s) {

        list.clear();

        int k=0;

        for(int i=0;i<s.length();i++) {

            for (int j=0;j<arr.length;j++) {

                if(s.charAt(i)==arr[j]) {

                    String temp="";

                    for (int m=k;m<i;m++) {
                        temp+=s.charAt(m);
                    }

                    list.add(temp);
                    String temp2=""; temp2+=s.charAt(i);
                    list.add(temp2);

                    k=i+1;
                }
            }
        }
        String e="";
        for (;k<s.length();k++) {e+=s.charAt(k); } list.add(e);
        System.out.println(list);

        if(list.size()>1) {
            if(list.get(0).equals("")){
                list.remove(0);
            }


            if(list.get(0).equals("-")) {
                String second=list.get(1);
                String x="-";
                x+=second;
                list.remove(0);
                System.out.println("REMOVE SNRA");
                System.out.println(list);

                list.set(0,x);
                System.out.println("SET SONRA");
                System.out.println(list);

            }
        }



        return calc(list);

    }

    public double calc(ArrayList<String> list) {


        int t=0;
        for(int s=0;s<list.size();s++) {

            for (int j=0;j<arr.length;j++) {

                if(list.get(s).equals(String.valueOf(arr[j]))) {
                    t=1; break;
                }
            }


        }


        if(t==1) {


            int i=0;


            while (i<list.size()) {

                if(list.get(i).equals("*")) {

                    double result=Double.parseDouble(list.get(i-1))*Double.parseDouble(list.get(i+1));
                    list.set((i-1),String.valueOf(result));
                    list.remove(i); list.remove(i);

                }

                else if(list.get(i).equals("/")) {

                    double result=Double.parseDouble(list.get(i-1))/Double.parseDouble(list.get(i+1));
                    list.set((i-1),String.valueOf(result));
                    list.remove(i); list.remove(i);
                }

                else i++;

            }

            int u=0;

            while (u<list.size()) {


                if(list.get(u).equals("+")) {

                    double result=Double.parseDouble(list.get(u-1))+Double.parseDouble(list.get(u+1));
                    list.set((u-1),String.valueOf(result));
                    list.remove(u); list.remove(u);
                }

                else if(list.get(u).equals("-")) {
                    double result=Double.parseDouble(list.get(u-1))-Double.parseDouble(list.get(u+1));
                    list.set((u-1),String.valueOf(result));
                    list.remove(u); list.remove(u);

                }
                else u++;

            }
        }
        if (list.get(0).equals("Infinity") || list.get(0).equals("-Infinity")){
            mystring = "";
        }
        return Double.parseDouble(list.get(0));


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.textView2);


    }





    public void one(View view) {
        char letter='1';
        if(mystring=="Infinity"|| mystring=="-Infinity") mystring="";
        mystring+=letter;
        text1.setText(mystring);

        String strresult=String.valueOf(func(mystring));
        text2.setText(strresult);

    }

    public void two(View view) {
        char letter='2';
        if(mystring=="Infinity"|| mystring=="-Infinity") mystring="";
        mystring+=letter;
        text1.setText(mystring);
        String strresult=String.valueOf(func(mystring));
        text2.setText(strresult);

    }

    public void three(View view) {
        char letter='3';
        if(mystring=="Infinity"|| mystring=="-Infinity") mystring="";
        mystring+=letter;
        text1.setText(mystring);
        String strresult=String.valueOf(func(mystring));
        text2.setText(strresult);

    }

    public void four(View view) {
        char letter='4';
        if(mystring=="Infinity"|| mystring=="-Infinity") mystring="";
        mystring+=letter;
        text1.setText(mystring);
        String strresult=String.valueOf(func(mystring));
        text2.setText(strresult);


    }

    public void five(View view) {
        char letter='5';
        if(mystring=="Infinity"|| mystring=="-Infinity") mystring="";
        mystring+=letter;
        text1.setText(mystring);
        String strresult=String.valueOf(func(mystring));
        text2.setText(strresult);

    }

    public void six(View view) {
        char letter='6';
        if(mystring=="Infinity"|| mystring=="-Infinity") mystring="";
        mystring+=letter;
        text1.setText(mystring);
        String strresult=String.valueOf(func(mystring));
        text2.setText(strresult);

    }

    public void seven(View view) {
        char letter='7';
        if(mystring=="Infinity"|| mystring=="-Infinity") mystring="";
        mystring+=letter;
        text1.setText(mystring);
        String strresult=String.valueOf(func(mystring));
        text2.setText(strresult);


    }

    public void eight(View view) {
        char letter='8';
        if(mystring=="Infinity"|| mystring=="-Infinity") mystring="";
        mystring+=letter;
        text1.setText(mystring);
        String strresult=String.valueOf(func(mystring));
        text2.setText(strresult);

    }

    public void nine(View view) {
        char letter='9';
        if(mystring=="Infinity"|| mystring=="-Infinity") mystring="";
        mystring+=letter;
        text1.setText(mystring);
        String strresult=String.valueOf(func(mystring));
        text2.setText(strresult);



    }

    public void zero(View view) {
        char letter='0';
        if(mystring=="Infinity"|| mystring=="-Infinity") mystring="";

        if(mystring.length()==0) {
            mystring+="0.";
            text1.setText(mystring);}
        else if (mystring.charAt(mystring.length() - 1) == '/') {
            mystring+="0.";
            text1.setText(mystring);
        }

        else {
            mystring += letter;
            String strresult=String.valueOf(func(mystring));
            text2.setText(strresult);
        }

        text1.setText(mystring);

    }

    public void point(View view) {

        String letter=".";

        if(mystring.length()==0) {text2.setText("Virgül ile ile başlayamaz");}
        else if (mystring.charAt(mystring.length() - 1) == '/' || mystring.charAt(mystring.length() - 1)=='+' || mystring.charAt(mystring.length() - 1) =='*' || mystring.charAt(mystring.length() - 1)=='-') {
            text2.setText("Nokta koymadan önce bir sayı giriniz");
        }

        else if(mystring.charAt(mystring.length()-1)=='.') {

        }

        else {
            mystring += letter;
            String sss=mystring.substring(0,mystring.length()-1);
            text2.setText(String.valueOf(func(sss)));
        }

        text1.setText(mystring);

    }

    public void plus(View view) {
        int a=0;

        if(mystring.length()==0) {  //boşsa
            text2.setText("İşlem operatör ile başlayamaz");
            a=1;
        }


        else {

            for(char i:arr) {  //iki op arka arkaya ise
                if(i==mystring.charAt(mystring.length()-1)) {
                    a=1;
                    text2.setText("Art arda iki operatör gelemez"); break;
                }
            }
        }

        if(a!=1) {  //2.de sorun yoksa
            mystring += '+';
            text1.setText(mystring);
            String sss=mystring.substring(0,mystring.length()-1);
            text2.setText(String.valueOf(func(sss)));
        }



    }

    public void minus(View view) {
        int a=0;

        if(mystring.length()==0) {  //boşsa
            mystring += '-';
            text1.setText("-");
            a=1;
        }

        else {

            for(char i:arr) {  //iki op arka arkaya ise
                if(i==mystring.charAt(mystring.length()-1)) {
                    a=1;
                    text2.setText("Art arda iki operatör gelemez"); break;
                }
            }
        }

        if(a!=1) {  //2.de sorun yoksa
            mystring += '-';
            text1.setText(mystring);
            String sss=mystring.substring(0,mystring.length()-1);
            text2.setText(String.valueOf(func(sss)));
        }


    }

    public void multiple(View view) {
        int a=0;

        if(mystring.length()==0) {  //boşsa
            text2.setText("İşlem operatör ile başlayamaz");
            a=1;
        }


        else {
            for (char i : arr) {  //iki op arka arkaya ise
                if (i == mystring.charAt(mystring.length() - 1)) {
                    a = 1;
                    text2.setText("Art arda iki operatör gelemez");
                    break;
                }
            }
        }

        if(a!=1) {  //2.de sorun yoksa
            mystring += '*';
            text1.setText(mystring);
            String sss=mystring.substring(0,mystring.length()-1);
            text2.setText(String.valueOf(func(sss)));
        }


    }

    public void divide(View view) {
        int a=0;

        if(mystring.length()==0) {  //boşsa
            text2.setText("İşlem operatör ile başlayamaz");
            a=1;
        }

        else{
            for (char i : arr) {  //iki op arka arkaya ise
                if (i == mystring.charAt(mystring.length() - 1)) {
                    a = 1;
                    text2.setText("Art arda iki operatör gelemez");
                    break;
                }
            }
        }

        if(a!=1) {  //2.de sorun yoksa
            mystring += '/';
            text1.setText(mystring);
            String sss=mystring.substring(0,mystring.length()-1);
            text2.setText(String.valueOf(func(sss)));
        }


    }

    public void c(View view) {
        mystring="";

        text1.setText("");
        text2.setText("");

    }

    public void delete(View view) {
        if(mystring.equals("Infinity") || mystring.equals("-Infinity")) {
            mystring="";
        }
        if(mystring.length()!=0) mystring=mystring.substring(0, mystring.length()-1);
        text1.setText(mystring);
    }

    public void equals(View view) {



        if(mystring.length()!=0) {
            char last=mystring.charAt(mystring.length()-1);

            if(last=='+' || last=='-' || last=='*' || last=='/') {
                text2.setText("İşlem tamamlanmadı");
            }

            else {
                double result=func(mystring);
                String strresult=String.valueOf(result);
                text1.setText(strresult);
                mystring=strresult;
            }

        }
        else text2.setText("İşlem yok");




    }


}