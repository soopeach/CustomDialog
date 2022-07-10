package com.example.customdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.customdialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            CustomDialog()
        }
    }

    fun CustomDialog() {

        val dialogView = layoutInflater.inflate(R.layout.login_dialog, null)
        val id = dialogView.findViewById<EditText>(R.id.id)
        val password = dialogView.findViewById<EditText>(R.id.password)
        val btnLogin = dialogView.findViewById<Button>(R.id.btnLogin)

        val builder = AlertDialog.Builder(this)
            .setView(dialogView)
            .create()



        btnLogin.setOnClickListener {
            Toast.makeText(
                this,
                "아이디는 ${id.text.toString()} 비밀번호는 ${password.text.toString()}",
                Toast.LENGTH_LONG
            ).show()
            builder.dismiss()
        }

        builder.show()

    }

}