package com.example.demorslibrary;

import android.content.Context;
import android.widget.Toast;

public class DisplayToast {
    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
