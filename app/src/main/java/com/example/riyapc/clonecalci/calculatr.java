package com.example.riyapc.clonecalci;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class calculatr extends AppCompatActivity {

    TextView e1;
    float temp1=0.0f,temp2=0.0f;
    boolean rAdd,rSub,rMul,rDiv,rMod;
    String res;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatr);
        e1=(TextView) findViewById(R.id.e1);

    }

    public void clear(View view) {e1.setText("");
    temp1=temp2=0;}

    public void dot(View view) {e1.setText(e1.getText() +".");}

   //*********************division

    public void div(View view)
    {
        if(temp1==0.0f)
        {
            temp1= Float.parseFloat(e1.getText().toString());
            e1.setText("");
            rDiv = true;
        }

        else {
            if (temp2 == 0) {
                temp2 = Float.parseFloat(e1.getText().toString());
                calculate();
                rDiv = true;
            }
            else{
                calculate();
                e1.setText(res);
                rDiv =true;
            }
        }

    }
    //********************************

    public void mod(View view)
    {
        if(temp1==0.0f)
        {
            temp1= Float.parseFloat(e1.getText().toString());
            e1.setText("");
            rMod = true;
        }

        else {
            if (temp2 == 0) {
                temp2 = Float.parseFloat(e1.getText().toString());
                calculate();
                rMod = true;
            }
            else{
                calculate();
                e1.setText(res);
                rMod=true;
            }
        }

    }
    //********************************
    public void mul(View view)
    {
        if(temp1==0.0f)
        {
            temp1= Float.parseFloat(e1.getText().toString());
            e1.setText("");
            rMul = true;
        }

        else {
            if (temp2 == 0) {
                temp2 = Float.parseFloat(e1.getText().toString());
                calculate();
                rMul = true;
            }
            else{
                calculate();
                e1.setText(res);
                rMul=true;
            }
        }

    }
//*************************************************
    public void sub(View view)
    {
        if(temp1==0.0f)
        {
            temp1= Float.parseFloat(e1.getText().toString());
            e1.setText("");
            rSub = true;
        }

        else {
            if (temp2 == 0) {
                temp2 = Float.parseFloat(e1.getText().toString());
                calculate();
                rSub = true;
            }
            else{
                calculate();
                e1.setText(res);
                rSub=true;
            }
        }

    }
//********************************
    public void add(View view) {
        {
            if (temp1 == 0.0f) {
                temp1 = Float.parseFloat(e1.getText().toString());
                e1.setText("");
                rAdd = true;
            } else {
                if (temp2 == 0) {
                    temp2 = Float.parseFloat(e1.getText().toString());
                    calculate();
                    rAdd = true;
                } else {
                    calculate();
                    e1.setText(res);
                    rAdd = true;
                }
            }

        }
    }
//************************************
    public void equals(View view)
    {
        temp2= Float.parseFloat(e1.getText().toString());

        if(rAdd==true)
        {
            e1.setText("");
            res = String.valueOf(temp1+temp2);
             e1.setText(res);
            rAdd=false;

        }
        if(rSub==true)
        {
            e1.setText("");
            res = String.valueOf(temp1-temp2);
            e1.setText(res);
            rSub=false;
        }
        if(rMod==true)
        {
            e1.setText("");
            res = String.valueOf(temp1%temp2);
            e1.setText(res);
            rMod=false;
        }
        if(rMul==true)
        {
            e1.setText("");
            res = String.valueOf(temp1*temp2);
            e1.setText(res);
            rMul=false;
        }
        if(rDiv==true)
        {
            e1.setText("");
            res = String.valueOf(temp1/temp2);
            e1.setText(res);
            rDiv=false;
        }
    }

//*************************
   public String calculate(){
       if(rAdd==true)
       {
           e1.setText("");
           res = String.valueOf(temp1+temp2);
           temp1=temp2=0.0f;
           rAdd=false;
           return res;

       }
       if(rSub==true)
       {
           e1.setText("");
           res = String.valueOf(temp1-temp2);
           temp1=temp2=0.0f;
           rSub=false;
           return res;
       }
       if(rMod==true)
       {
           e1.setText("");
           res = String.valueOf(temp1%temp2);
           temp1=temp2=0.0f;
           rMod=false;
           return res;
       }
       if(rMul==true)
       {
           e1.setText("");
           res = String.valueOf(temp1*temp2);
           temp1=temp2=0.0f;
           rMul=false;
           return res;
       }
       if(rDiv==true)
       {
           e1.setText("");
           res = String.valueOf(temp1/temp2);
           temp1=temp2=0.0f;
           rDiv=false;
           return res;
       }
return res;
    }
//**************************
    public void nine(View view) {
        if((rMod || rMul || rSub || rDiv || rAdd )==true)
        {
            if(temp1==0){
                temp1= Float.parseFloat(e1.getText()+"");
                e1.setText("9");
                temp2=9;
            /*calculate();
            e1.setText(res);
            temp1=temp2=0;*/
            }else
            {
                e1.setText(e1.getText() + "9");
                temp2= Float.parseFloat((e1.getText()+""));
            }
        }
        else{

            e1.setText(e1.getText() + "9");
        }
    }
    //*************************************************************
    public void eight(View view) {
        if((rMod || rMul || rSub || rDiv || rAdd )==true)
        {
            if(temp1==0){
                temp1= Float.parseFloat(e1.getText()+"");
                e1.setText("8");
                temp2=8;
            /*calculate();
            e1.setText(res);
            temp1=temp2=0;*/
            }else
            {
                e1.setText(e1.getText() + "8");
                temp2= Float.parseFloat((e1.getText()+""));
            }
        }
        else{

            e1.setText(e1.getText() + "8");
        }
    }
    //*************************************************************
    public void seven(View view) {

        if((rMod || rMul || rSub || rDiv || rAdd )==true)
        {
            if(temp1==0){
                temp1= Float.parseFloat(e1.getText()+"");
                e1.setText("7");
                temp2=7;
            /*calculate();
            e1.setText(res);
            temp1=temp2=0;*/
            }else
            {
                e1.setText(e1.getText() + "7");
                temp2= Float.parseFloat((e1.getText()+""));
            }
        }
        else{

            e1.setText(e1.getText() + "7");
        }
    }
    //*************************************************************
    public void six(View view) {
        if((rMod || rMul || rSub || rDiv || rAdd )==true)
        {
            if(temp1==0){
                temp1= Float.parseFloat(e1.getText()+"");
                e1.setText("6");
                temp2=6;
            /*calculate();
            e1.setText(res);
            temp1=temp2=0;*/
            }else
            {
                e1.setText(e1.getText() + "6");
                temp2= Float.parseFloat((e1.getText()+""));
            }
        }
        else{

            e1.setText(e1.getText() + "6");
        }
    }
    //*************************************************************
    public void five(View view) {
        if((rMod || rMul || rSub || rDiv || rAdd )==true)
        {
            if(temp1==0){
                temp1= Float.parseFloat(e1.getText()+"");
                e1.setText("5");
                temp2=5;
            /*calculate();
            e1.setText(res);
            temp1=temp2=0;*/
            }else
            {
                e1.setText(e1.getText() + "5");
                temp2= Float.parseFloat((e1.getText()+""));
            }
        }
        else{

            e1.setText(e1.getText() + "5");
        }
    }
    //*************************************************************
    public void four(View view) {
        if((rMod || rMul || rSub || rDiv || rAdd )==true)
        {
            if(temp1==0){
                temp1= Float.parseFloat(e1.getText()+"");
                e1.setText("4");
                temp2=4;
            /*calculate();
            e1.setText(res);
            temp1=temp2=0;*/
            }else
            {
                e1.setText(e1.getText() + "4");
                temp2= Float.parseFloat((e1.getText()+""));
            }
        }
        else{

            e1.setText(e1.getText() + "4");
        }
   }
   //*************************************************************
    public void three(View view) {
        if((rMod || rMul || rSub || rDiv || rAdd )==true)
        {
            if(temp1==0){
                temp1= Float.parseFloat(e1.getText()+"");
                e1.setText("3");
                temp2=3;
            /*calculate();
            e1.setText(res);
            temp1=temp2=0;*/
            }else
            {
                e1.setText(e1.getText() + "3");
                temp2= Float.parseFloat((e1.getText()+""));
            }
        }
        else{

            e1.setText(e1.getText() + "3");
        }
   }
//**************************************************************
    public void two(View view) {
        if((rMod || rMul || rSub || rDiv || rAdd )==true)
        {
            if(temp1==0){
            temp1= Float.parseFloat(e1.getText()+"");
            e1.setText("2");
            temp2=2;
            /*calculate();
            e1.setText(res);
            temp1=temp2=0;*/
              }else
            {
                e1.setText(e1.getText() + "2");
                temp2= Float.parseFloat((e1.getText()+""));
            }
        }
        else{

            e1.setText(e1.getText() + "2");
        }}
//**********************************************************************
    public void one(View view) {
       if((rMod || rMul || rSub || rDiv || rAdd )==true)
    {
        if(temp1==0){
            temp1= Float.parseFloat(e1.getText()+"");
            e1.setText("1");
            temp2=1;
            /*calculate();
            e1.setText(res);
            temp1=temp2=0;*/
        }else
        {
            e1.setText(e1.getText() + "1");
            temp2= Float.parseFloat((e1.getText()+""));
        }
    }
    else{

        e1.setText(e1.getText() + "1");
    }}

//******************************************************************************
    public void zero(View view) {
        if((rMod || rMul || rSub || rDiv || rAdd )==true)
        {
            if(temp1==0){
                temp1= Float.parseFloat(e1.getText()+"");
                e1.setText("0");
                temp2=0;
            /*calculate();
            e1.setText(res);
            temp1=temp2=0;*/
            }else
            {
                e1.setText(e1.getText() + "0");
                temp2= Float.parseFloat((e1.getText()+""));
            }
        }
        else{

            e1.setText(e1.getText() + "0");
        }
   }
}

