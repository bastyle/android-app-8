package ca.centennial.comp304.bastianbastias.comp304lab1_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ca.centennial.comp304.bastianbastias.comp304lab1_1.databinding.ActivitySecondBinding

class SecondActivity:AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val extras = intent.extras
        //val text = if (extras != null) extras.get(MainActivity.MSG_KEY) as String else ""
        val text = if (extras != null) extras.getString(MainActivity.MSG_KEY, "") as String else ""
        setContentView(binding.root)
        binding.textView1.text = text
    }
}