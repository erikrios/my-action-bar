package io.erikrios.github.myactionbar

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import io.erikrios.github.myactionbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.options_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu1 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, MenuFragment())
                    .addToBackStack(null)
                    .commit()
            }
            R.id.menu2 -> {
                val i = Intent(this, MenuActivity::class.java)
                startActivity(i)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}