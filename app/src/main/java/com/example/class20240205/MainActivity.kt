package com.example.class20240205

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.SearchView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar))



        // 뒤로 가기 버튼 코드로 나오게 하기
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    // 뒤로 가기 버튼 클릭 시 자동으로 호출되는 함수 재정의
    override fun onSupportNavigateUp(): Boolean {
        Log.d("test", "뒤로 가기 버튼 누른 다음 실행됩니다.")
//        onBackPressed()
        return super.onSupportNavigateUp()
    }

    // 옵션 메뉴 나오게 하는 함수 재정의
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        val menuItem1: MenuItem? = menu?.add(0,0,0,"메뉴1")
//        val menuItem2: MenuItem? = menu?.add(0,1,0,"메뉴2")
//        val menuItem3: MenuItem? = menu?.add(0,2,0,"메뉴3")
//        val menu1 = findViewById<View>(R.id.menu1)
//        menuInflater.inflate(R.menu.menu_main, menu)

        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        val menuItem = menu?.findItem(R.id.menu_search)

        // searchView 검색 이벤트 처리
        val searchView = menuItem?.actionView as SearchView
        searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextChange(newText: String?): Boolean {
                // 검색어 변경 이벤트
                return true
            }

            override fun onQueryTextSubmit(query: String?): Boolean {
                // 키보드의 검색 버튼을 클릭한 순간의 이벤트
                Log.d("test", query.toString())
                return true
            }
        })
//        return super.onCreateOptionsMenu(menu)
        return true
    }

    // 옵션 메뉴 클릭시 이벤트 함수 재정의
    override fun onOptionsItemSelected(item: MenuItem): Boolean  = when(item.itemId){
        0 -> {
            Toast.makeText(this, "메뉴1을 클릭했습니다.", Toast.LENGTH_SHORT).show()
            true
        }
        1 -> {
            Toast.makeText(this, "메뉴2을 클릭했습니다.", Toast.LENGTH_SHORT).show()
            true
        }
        2 -> {
            Toast.makeText(this, "메뉴3을 클릭했습니다.", Toast.LENGTH_SHORT).show()
            true
        }
        else -> super.onOptionsItemSelected(item)
    }
}