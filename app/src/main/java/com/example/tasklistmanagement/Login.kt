package com.example.tasklistmanagement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
//        var moeys_logos = findViewById<ImageView>(R.id.logo_moeys) as ImageView
//        var finance_dept_txt = findViewById<TextView>(R.id.finance_depart_txt) as TextView
//        var task_list = findViewById<TextView>(R.id.app_names_txt)
        var user_name = findViewById<EditText>(R.id.edt_username)
        var pass_wordss = findViewById<EditText>(R.id.pw_edt)
        var login_button = findViewById<Button>(R.id.bt_login)

        login_button.setOnClickListener{

            val username = user_name.text.toString()
            val password = pass_wordss.text.toString()

            // Handler code here.
            val intent = Intent(this@Login, MainActivity::class.java);
            intent.putExtra("Username",username)
            intent.putExtra("Password",password)
            startActivity(intent);

        }
    }
}
