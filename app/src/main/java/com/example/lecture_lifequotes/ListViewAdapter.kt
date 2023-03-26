package com.example.lecture_lifequotes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter (val List: MutableList<String>) : BaseAdapter() {
    override fun getCount(): Int {
        //SentenceAcitivy에서 넘어온 데이터 값의 개수 만큼 List의 크기를 지정해라
        // 3개의 데이터가 넘어왔다면 List의 크기도 3?
        return List.size
    }

    override fun getItem(position: Int): Any {
        //각각의 item을 저장?
        return List[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        //Adapter로 넘어온 데이터(a,b,c)를 listview_item.xml에 넣어서
        // Activity_sentence.xml의 listview로 넘겨준다.

        var convertView = convertView

        if(convertView == null) {
            convertView = LayoutInflater.from(parent?.context).inflate(R.layout.listview_item, parent, false)
        }

        val listviewText = convertView?.findViewById<TextView>(R.id.listViewTextArea)
        listviewText!!.text = List[position]

        return convertView!!

    }


}