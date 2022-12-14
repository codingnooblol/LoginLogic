package com.example.loginlogic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        Login.setOnClickListener {

            val inputID = UserId.text.toString()
            val inputPw = Password.text.toString()
            val name = "Kim"

            if(inputID != "xzsa18@naver.com" && inputPw != "zxas146218" ) {
                Toast.makeText(this, "아이디와 비밀번호 모두 틀렸습니다!", Toast.LENGTH_SHORT).show()
            }

            else if(inputID != "xzsa18@naver.com") {
                Toast.makeText(this, "아이디가 일치하지 않습니다.", Toast.LENGTH_SHORT).show()
            }

            else if(inputPw != "zxas146218") {
                Toast.makeText(this, "비밀번호가 틀렸습니다!", Toast.LENGTH_SHORT).show()
            }

            else {
                Log.d("로그인 확인","로그인이 확인되었음")
                Toast.makeText(this, "${name}님이 로그인에 성공했습니다", Toast.LENGTH_SHORT).show()
            }
        }
    }
}