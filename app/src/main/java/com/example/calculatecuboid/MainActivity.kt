package com.example.calculatecuboid

import android.icu.number.IntegerWidth
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_length.setOnClickListener {
            if (et_volume.text.isNotEmpty()&&et_width.text.isNotEmpty() &&et_height.text.isNotEmpty()) {
                var width = Integer.valueOf(et_width.text.toString())
                var height = Integer.valueOf(et_height.text.toString())
                var volume = Integer.valueOf(et_volume.text.toString())
                var length = volume / width / height
                et_length.setText(length.toString())
            } else {
                Toast.makeText(applicationContext, "Ada Kolom yang Kosong!!! ", Toast.LENGTH_SHORT).show()
            }
        }
        btn_width.setOnClickListener {
            if (et_volume.text.isNotEmpty()&&et_length.text.isNotEmpty() &&et_height.text.isNotEmpty()) {
                var length = Integer.valueOf(et_width.text.toString())
                var height = Integer.valueOf(et_height.text.toString())
                var volume = Integer.valueOf(et_volume.text.toString())
                var width = volume / length / height
                et_width.setText(width.toString())
            } else {
                Toast.makeText(applicationContext, "Ada Kolom yang Kosong!!! ", Toast.LENGTH_SHORT).show()
            }
        }
        btn_height.setOnClickListener {
            if (et_volume.text.isNotEmpty()&&et_width.text.isNotEmpty() &&et_length.text.isNotEmpty()) {
                var length = Integer.valueOf(et_length.text.toString())
                var width = Integer.valueOf(et_width.text.toString())
                var volume = Integer.valueOf(et_volume.text.toString())
                var height = volume / length / width
                et_height.setText(height.toString())
            } else {
                Toast.makeText(applicationContext, "Ada Kolom yang Kosong!!! ", Toast.LENGTH_SHORT).show()
            }
        }
        btn_volume.setOnClickListener {
            if (et_length.text.isNotEmpty()&&et_width.text.isNotEmpty() &&et_height.text.isNotEmpty()) {
                var length = Integer.valueOf(et_length.text.toString())
                var width = Integer.valueOf(et_width.text.toString())
                var height = Integer.valueOf(et_height.text.toString())
                var volume = width * length * height
                et_volume.setText(volume.toString())
            } else {
                Toast.makeText(applicationContext, "Ada Kolom yang Kosong!!! ", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
