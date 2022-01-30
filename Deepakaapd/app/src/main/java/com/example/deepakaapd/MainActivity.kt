package com.example.deepakaapd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn:Button=findViewById(R.id.btn_submit)
        btn.setOnClickListener {
        val name:EditText =findViewById(R.id.editText)
            Toast.makeText(this,"hello ${name.text.toString()}",Toast.LENGTH_SHORT)
                .show()
        }
    }
}