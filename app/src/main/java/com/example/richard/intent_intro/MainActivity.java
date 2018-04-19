package com.example.richard.intent_intro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void LifeCycle(View view){
        ComponentName comp = new ComponentName(getBaseContext(),lifecycleActivity.class);
        Intent intent=new Intent();
        intent.setComponent(comp);
        intent.setAction("android.intent.action.VIEW");
        startActivity(intent);
    }


    public void UserName(View view) {
        ComponentName comp = new ComponentName(this,"com.example.richard.intent_intro.usernameActivity");
        Intent intent=new Intent();
        intent.setComponent(comp);
        intent.setAction("android.intent.action.VIEW");
        startActivity(intent);
    }

    public void Layout(View view) {
        ComponentName comp = new ComponentName(this,LayoutActivity.class);
        Intent intent=new Intent();
        intent.setComponent(comp);
        intent.setAction("android.intent.action.VIEW");
        startActivity(intent);
    }

    public void Btn_Design(View view) {
        ComponentName comp = new ComponentName(this,button.class);
        Intent intent=new Intent();
        intent.setComponent(comp);
        intent.setAction("android.intent.action.VIEW");
        startActivity(intent);
    }

    public void Btn_Toast(View view) {
        ComponentName comp = new ComponentName(this,buttontoast.class);
        Intent intent=new Intent();
        intent.setComponent(comp);
        intent.setAction("android.intent.action.VIEW");
        startActivity(intent);
    }

    public void Btn_Inten(View view) {
    }

    public void Btn_SA(View view) {
    }

    public void ImageBtn(View view) {

    }

    public void EditText(View view) {

    }

    public void Radio_lis(View view) {

    }

    public void Radio_clk(View view) {

    }

    public void listview(View view) {

    }

    public void GetColor(View view) {

    }

    public void Bkground(View view) {

    }

    public void ImpIntent(View view) {

    }

    public void Wea_Des(View view) {

    }

    public void Listview(View view) {

    }

    public void ListCus(View view) {

    }

    public void Audio(View view) {

    }

    public void DB(View view) {

    }

    public void Fragment(View view) {

    }

    public void webview(View view) {

    }

    public void Service(View view) {

    }

    public void Finger(View view) {

    }

    public void PriDirect(View view) {

    }

    public void Assets(View view) {

    }

    public void IntentEX(View view) {

    }
}





