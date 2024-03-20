package com.example.ben

import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.ben.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mediaNo = MediaPlayer.create(applicationContext, R.raw.benno)
        val mediaYes = MediaPlayer.create(applicationContext, R.raw.benyes)
        val mediaHohoho = MediaPlayer.create(applicationContext, R.raw.benhohoho)
        val mediaBen = MediaPlayer.create(applicationContext, R.raw.benben)

        val delay = 2000L

        binding.buttonBenGod.setOnClickListener{
            binding.defaultBen.alpha = 0F
            binding.noBen.alpha = 1F
            mediaNo.start()

            android.os.Handler().postDelayed({
                binding.defaultBen.alpha = 1F
                binding.noBen.alpha = 0F
            }, delay)

        }
        binding.buttonBenHohoho.setOnClickListener{
            binding.defaultBen.alpha = 0F
            binding.hohohoBen.alpha = 1F
            mediaHohoho.start()

            android.os.Handler().postDelayed({
                binding.defaultBen.alpha = 1F
                binding.hohohoBen.alpha = 0F
            }, delay)

        }
        binding.buttonBenYes.setOnClickListener{
            binding.defaultBen.alpha = 0F
            binding.yesBen.alpha = 1F
            mediaYes.start()

            android.os.Handler().postDelayed({
                binding.defaultBen.alpha = 1F
                binding.yesBen.alpha = 0F
            }, delay)

        }
        binding.buttonBenBen.setOnClickListener{
            binding.defaultBen.alpha = 0F
            binding.benBen.alpha = 1F
            mediaBen.start()

            android.os.Handler().postDelayed({
                binding.defaultBen.alpha = 1F
                binding.benBen.alpha = 0F
            }, delay)

        }

    }
}
