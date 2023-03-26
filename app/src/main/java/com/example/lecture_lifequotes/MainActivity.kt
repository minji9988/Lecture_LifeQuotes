package com.example.lecture_lifequotes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.lecture_lifequotes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //문자열 list들을 sentenceList에 넣는 걸 의미
        val sentenceList = mutableListOf<String>()

        sentenceList.add("검정화면에 대충 한글씨 쓰면 명언같다.")
        sentenceList.add("연탄제 함부로 발로 차지 마라. 너는 단 한번이라도 누군가에게 뜨거웠던 적 있느냐")
        sentenceList.add("주식을 하면서 재무제표를 보지 않는 건 카드 게임을 하면서 본인 패를 보지 않는 것과 같다.")
        sentenceList.add("천제와 광인은 종이 한 장 차이다.")


//        sentenceList에 저장된 명언 중 아무거나 랜덤으로 뽑아오기 - ㅣ
        Log.e("MainActivity", sentenceList.random())

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //버튼 클릭할 때 나타날 동작
        binding.showAllSentenceBtn.setOnClickListener{

            //MainAcitivity에 있는 '전체명언보기' btn 클릭 시 SentenceAcitivy로 이동
            val intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)


        }

        //        sentenceList에 저장된 명언 중 아무거나 랜덤으로 뽑아오기
        binding.goodWordTextArea.setText(sentenceList.random())

    }
}