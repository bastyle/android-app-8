package ca.centennial.comp304.bastianbastias.comp304lab1_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ca.centennial.comp304.bastianbastias.comp304lab1_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    companion object {
        private const val TAG = "MainActivity Lab 1 Exercise 1"
        public const val MSG_KEY="MSG"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.e(TAG, "onCreate")

        binding.button1.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            val data = binding.editText.text.toString()
            intent.putExtra(MSG_KEY, data)
            startActivity(intent)
        }
    }
}