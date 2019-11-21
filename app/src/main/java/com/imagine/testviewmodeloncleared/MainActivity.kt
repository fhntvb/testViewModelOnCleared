package com.imagine.testviewmodeloncleared

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.imagine.testviewmodeloncleared.ui.main.MainFragment
import com.imagine.testviewmodeloncleared.ui.main.SecondFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commit()
            supportFragmentManager.executePendingTransactions()
        }
    }

    fun replace() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, SecondFragment())
            .addToBackStack(null)
            .commit()
        supportFragmentManager.executePendingTransactions()
    }

}
