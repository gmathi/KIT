package io.github.gmathi.kit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.github.gmathi.kit.ui.main.CategoryFragment

class CategoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.category_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, CategoryFragment.newInstance())
                .commitNow()
        }
    }
}