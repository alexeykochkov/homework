package com.example.project3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ProgressBar
import com.example.project3.databinding.ActivityMainBinding
import kotlinx.coroutines.*
import java.util.concurrent.atomic.AtomicBoolean
import kotlin.concurrent.thread

class Model() {
    val MIN = 0
    val MAX = 100

    //  private var counter_: AtomicInteger = 0
    var counter_ = 0
    private val INCRIMENT = 10

    fun counterToString(): String {
        return counter_.toString()
    }

    fun getCounter(): Int {
        return counter_
    }

    fun stopCounting() {
//        counter_ = 0
        setCounter(0)
    }

    fun bigIncrement() {
        if (counter_ < MAX) {
            counter_ += INCRIMENT
        }
    }

    fun setCounter(value: Int) {
        counter_ = value
    }

    fun bigDecrement() {
        if (counter_ > MIN) {
            counter_ -= INCRIMENT
        }
    }

    fun decrement() {
        if (counter_ > MIN) {
            counter_ -= 1
        }
    }
}

class MainActivity : AppCompatActivity() {

    var isStartNow_ = true
    var model_ = Model()
    var thread_: Thread? = null
    var canceledCounting_ = AtomicBoolean(false)

    private fun activateStartButton(binding: ActivityMainBinding, started: Boolean) {
        binding.start.isEnabled = started
        binding.stop.isEnabled = !started
    }

    private fun draw(binding: ActivityMainBinding) {
        val circleProgress = findViewById<ProgressBar>(R.id.progressBarCircle)
        circleProgress.progress = model_.getCounter()
        binding.centerText.text = model_.counterToString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("counter", model_.getCounter())
outState.putInt("slider", model_.counter_)
//        outState.putString("text", model_.counterToString())

        super.onSaveInstanceState(outState)
    }


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        savedInstanceState?.getInt("counter", 0)?.let {
//            binding.slider.value = it.toFloat()
//        }

        binding.slider.valueFrom = model_.MIN.toFloat()
        binding.slider.valueTo = model_.MAX.toFloat()
        binding.slider.stepSize = 1F

        binding.slider.addOnChangeListener { slider, value, fromUser ->
            model_.setCounter(value.toInt())
            draw(binding)
        }

        if (savedInstanceState !=null) {
            model_.counter_ = savedInstanceState.getInt("counter")
            binding.slider.value = savedInstanceState.getInt("slider").toFloat()
        }
//        savedInstanceState?.let { bundle ->
//            bundle.getInt("counter", 0)
//            bundle.getString("text", "zero")
//            draw(binding)
//        }





        binding.centerText.text = model_.counterToString()

        binding.buttonIncriment.setOnClickListener {
            model_.bigIncrement()
            binding.slider.value = model_.getCounter().toFloat()
            draw(binding)
        }

        binding.buttonDecrement.setOnClickListener {
            model_.bigDecrement()
            binding.slider.value = model_.getCounter().toFloat()
            draw(binding)
        }

        binding.start.setOnClickListener {
            if (isStartNow_) {
                activateStartButton(binding, false)
                canceledCounting_.set(false)
                val counter = model_.getCounter() // UI
                thread_ = thread {
                    runBlocking { // thread0
//                  val counter = model_.getCounter() // thread 0 race condition
                        for (i in counter downTo 0) { // thread 0
                            if (canceledCounting_.get()) {
                                break
                            }
                            delay(1000) //thread 0
                            runOnUiThread() { // thred 0
                                model_.decrement() // UI
                                draw(binding) // UI
                            }
                        }
                    }
                }
                //UI
                isStartNow_ = false
                binding.buttonIncriment.isEnabled = false
                binding.buttonDecrement.isEnabled = false
                binding.slider.isEnabled = false
            } else {
//                canceledCounting_.set(true)
//                model_.toZero()
//                draw(binding)
//                activateStartButton(binding, true)
//            thread_?.interrupt(
//                isStartNow_ = true
            }
        }

        binding.stop.setOnClickListener {
            canceledCounting_.set(true)
            model_.stopCounting()
            draw(binding)
            activateStartButton(binding, true)
//          thread_?.interrupt(
            isStartNow_ = true
            model_.stopCounting()
            binding.start.isEnabled = true
            binding.buttonIncriment.isEnabled = true
            binding.buttonDecrement.isEnabled = true
            binding.slider.isEnabled = true
            binding.slider.value = 0F
            draw(binding)
        }
        model_.getCounter()
    }
}