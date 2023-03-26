package com.example.lecture_lifequotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)


        //문자열 list들을 sentenceList에 넣는 걸 의미
        val sentenceList = mutableListOf<String>()

        sentenceList.add("검정화면에 대충 한글씨 쓰면 명언같다.")
        sentenceList.add("연탄제 함부로 발로 차지 마라. 너는 단 한번이라도 누군가에게 뜨거웠던 적 있느냐")
        sentenceList.add("주식을 하면서 재무제표를 보지 않는 건 카드 게임을 하면서 본인 패를 보지 않는 것과 같다.")
        sentenceList.add("천제와 광인은 종이 한 장 차이다.")


        //adapter에 sentenceList에 있는 data(명언)들을 넣어줬다.
        val sentenceAdapter = ListViewAdapter(sentenceList)
        //위의 문장을 작성함으로써 SentencActivity에 있는 data를 Adapter에 전달해주게 된다.


        //Adapter 파일에서 listview_item에 data들을 넣어줬다.
        //이제 listview_item 값들을 Activity_sentenc.xml의 listview로 이동시켜주자

        val listview = findViewById<ListView>(R.id.sentenceListView)
        listview.adapter = sentenceAdapter

    }
}