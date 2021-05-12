package com.example.note

import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.MotionEvent
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        val one = MediaPlayer.create(this, R.raw.tedagame__a0)
        findViewById<Button>(R.id.a0).setOnClickListener {
            one.start()
        }
        val two = MediaPlayer.create(this, R.raw.tedagame__a0s)
        findViewById<Button>(R.id.a0S).setOnClickListener{
            two.start()
        }
        val three = MediaPlayer.create(this, R.raw.tedagame__b0)
        findViewById<Button>(R.id.b0).setOnClickListener{
            three.start()
        }
        val four = MediaPlayer.create(this, R.raw.tedagame__c1)
        findViewById<Button>(R.id.c1).setOnClickListener{
            four.start()
        }
        val five = MediaPlayer.create(this, R.raw.tedagame__c1s)
        findViewById<Button>(R.id.c1S).setOnClickListener{
            five.start()
        }
        val six = MediaPlayer.create(this, R.raw.tedagame__d1)
        findViewById<Button>(R.id.d1).setOnClickListener{
            six.start()
        }
        val seven = MediaPlayer.create(this, R.raw.tedagame__d1s)
        findViewById<Button>(R.id.d1S).setOnClickListener{
            seven.start()
        }
        val eight = MediaPlayer.create(this, R.raw.tedagame__e1)
        findViewById<Button>(R.id.e1).setOnClickListener{
            eight.start()
        }
        val nine = MediaPlayer.create(this, R.raw.tedagame__f1)
        findViewById<Button>(R.id.f1).setOnClickListener{
            nine.start()
        }
        val ten = MediaPlayer.create(this, R.raw.tedagame__f1s)
        findViewById<Button>(R.id.f1S).setOnClickListener{
            ten.start()
        }
        val eleven = MediaPlayer.create(this, R.raw.tedagame__g1)
        findViewById<Button>(R.id.g1).setOnClickListener{
            eleven.start()
        }
        val twelve = MediaPlayer.create(this, R.raw.tedagame__g1s)
        findViewById<Button>(R.id.g1S).setOnClickListener{
            twelve.start()
        }
        val thirteen = MediaPlayer.create(this, R.raw.tedagame__a1)
        findViewById<Button>(R.id.a1).setOnClickListener{
            thirteen.start()
        }
        val fourteen = MediaPlayer.create(this, R.raw.tedagame__a1s)
        findViewById<Button>(R.id.a1S).setOnClickListener{
            fourteen.start()
        }
        val fifteen = MediaPlayer.create(this, R.raw.tedagame__b1)
        findViewById<Button>(R.id.b1).setOnClickListener{
            fifteen.start()
        }
        val sixteen = MediaPlayer.create(this, R.raw.tedagame__c2)
        findViewById<Button>(R.id.c2).setOnClickListener{
            sixteen.start()
        }
        val seventeen = MediaPlayer.create(this, R.raw.tedagame__c2s)
        findViewById<Button>(R.id.c2S).setOnClickListener{
            seventeen.start()
        }
        val eighteen = MediaPlayer.create(this, R.raw.tedagame__d2)
        findViewById<Button>(R.id.d2).setOnClickListener{
            eighteen.start()
        }
        val nineteen = MediaPlayer.create(this, R.raw.tedagame__d2s)
        findViewById<Button>(R.id.d2S).setOnClickListener{
            nineteen.start()
        }
        val twenty = MediaPlayer.create(this, R.raw.tedagame__e2)
        findViewById<Button>(R.id.e2).setOnClickListener{
            twenty.start()
        }
        val twentyOne = MediaPlayer.create(this, R.raw.tedagame__f2)
        findViewById<Button>(R.id.f2).setOnClickListener{
            twentyOne.start()
        }
        val twentyTwo = MediaPlayer.create(this, R.raw.tedagame__f2s)
        findViewById<Button>(R.id.f2S).setOnClickListener{
            twentyTwo.start()
        }
        val twentyThree = MediaPlayer.create(this, R.raw.tedagame__g2)
        findViewById<Button>(R.id.g2).setOnClickListener{
            twentyThree.start()
        }
        val twentyFour = MediaPlayer.create(this, R.raw.tedagame__g2s)
        findViewById<Button>(R.id.g2S).setOnClickListener{
            twentyFour.start()
        }
        val twentyFive = MediaPlayer.create(this, R.raw.tedagame__a2)
        findViewById<Button>(R.id.a2).setOnClickListener{
            twentyFive.start()
        }
        val twentySix = MediaPlayer.create(this, R.raw.tedagame__a2s)
        findViewById<Button>(R.id.a2S).setOnClickListener{
            twentySix.start()
        }
        val twentySeven = MediaPlayer.create(this, R.raw.tedagame__b2)
        findViewById<Button>(R.id.b2).setOnClickListener{
            twentySeven.start()
        }
        val twentyEight = MediaPlayer.create(this, R.raw.tedagame__c3)
        findViewById<Button>(R.id.c3).setOnClickListener{
            twentyEight.start()
        }
        val twentyNine = MediaPlayer.create(this, R.raw.tedagame__c3s)
        findViewById<Button>(R.id.c3S).setOnClickListener{
            twentyNine.start()
        }
        val thirty = MediaPlayer.create(this, R.raw.tedagame__d3)
        findViewById<Button>(R.id.d3).setOnClickListener{
            thirty.start()
        }
        val thirtyOne = MediaPlayer.create(this, R.raw.tedagame__d3s)
        findViewById<Button>(R.id.d3S).setOnClickListener{
            thirtyOne.start()
        }
        val thirtyTwo = MediaPlayer.create(this, R.raw.tedagame__e3)
        findViewById<Button>(R.id.e3).setOnClickListener{
            thirtyTwo.start()
        }
        val thirtyThree = MediaPlayer.create(this, R.raw.tedagame__f3)
        findViewById<Button>(R.id.f3).setOnClickListener{
            thirtyThree.start()
        }
        val thirtyFour = MediaPlayer.create(this, R.raw.tedagame__f3s)
        findViewById<Button>(R.id.f3S).setOnClickListener{
            thirtyFour.start()
        }
        val thirtyFive = MediaPlayer.create(this, R.raw.tedagame__g3)
        findViewById<Button>(R.id.g3).setOnClickListener{
            thirtyFive.start()
        }
        val thirtySix = MediaPlayer.create(this, R.raw.tedagame__g3s)
        findViewById<Button>(R.id.g3S).setOnClickListener{
            thirtySix.start()
        }
        val thirtySeven = MediaPlayer.create(this, R.raw.tedagame__a3)
        findViewById<Button>(R.id.a3).setOnClickListener{
            thirtySeven.start()
        }
        val thirtyEight = MediaPlayer.create(this, R.raw.tedagame__a3s)
        findViewById<Button>(R.id.a3S).setOnClickListener{
            thirtyEight.start()
        }
        val thirtyNine = MediaPlayer.create(this, R.raw.tedagame__b3)
        findViewById<Button>(R.id.b3).setOnClickListener{
            thirtyNine.start()
        }
        val forty = MediaPlayer.create(this, R.raw.tedagame__c4)
        findViewById<Button>(R.id.c4).setOnClickListener{
            forty.start()
        }
        val fortyOne = MediaPlayer.create(this, R.raw.tedagame__c4s)
        findViewById<Button>(R.id.c4S).setOnClickListener{
            fortyOne.start()
        }
        val fortyTwo = MediaPlayer.create(this, R.raw.tedagame__d4)
        findViewById<Button>(R.id.d4).setOnClickListener{
            fortyTwo.start()
        }
        val fortyThree = MediaPlayer.create(this, R.raw.tedagame__d4s)
        findViewById<Button>(R.id.d4S).setOnClickListener{
            fortyThree.start()
        }
        val fortyFour = MediaPlayer.create(this, R.raw.tedagame__e4)
        findViewById<Button>(R.id.e4).setOnClickListener{
            fortyFour.start()
        }
        val fortyFive = MediaPlayer.create(this, R.raw.tedagame__f4)
        findViewById<Button>(R.id.f4).setOnClickListener{
            fortyFive.start()
        }
        val fortySix = MediaPlayer.create(this, R.raw.tedagame__f4s)
        findViewById<Button>(R.id.f4S).setOnClickListener{
            fortySix.start()
        }
        val fortySeven = MediaPlayer.create(this, R.raw.tedagame__g4)
        findViewById<Button>(R.id.g4).setOnClickListener{
            fortySeven.start()
        }
        val fortyEight = MediaPlayer.create(this, R.raw.tedagame__g4s)
        findViewById<Button>(R.id.g4S).setOnClickListener{
            fortyEight.start()
        }
        val fortyNine = MediaPlayer.create(this, R.raw.tedagame__a4)
        findViewById<Button>(R.id.a4).setOnClickListener{
            fortyNine.start()
        }
        val fifty = MediaPlayer.create(this, R.raw.tedagame__a4s)
        findViewById<Button>(R.id.a4S).setOnClickListener{
            fifty.start()
        }
        val fiftyOne = MediaPlayer.create(this, R.raw.tedagame__b4)
        findViewById<Button>(R.id.b4).setOnClickListener{
            fiftyOne.start()
        }
        val fiftyTwo = MediaPlayer.create(this, R.raw.tedagame__c5)
        findViewById<Button>(R.id.c5).setOnClickListener{
            fiftyTwo.start()
        }
        val fiftyThree = MediaPlayer.create(this, R.raw.tedagame__c5s)
        findViewById<Button>(R.id.c5S).setOnClickListener{
            fiftyThree.start()
        }
        val fiftyFour = MediaPlayer.create(this, R.raw.tedagame__d5)
        findViewById<Button>(R.id.d5).setOnClickListener{
            fiftyFour.start()
        }
        val fiftyFive = MediaPlayer.create(this, R.raw.tedagame__d5s)
        findViewById<Button>(R.id.d5S).setOnClickListener{
            fiftyFive.start()
        }
        val fiftySix = MediaPlayer.create(this, R.raw.tedagame__e5)
        findViewById<Button>(R.id.e5).setOnClickListener{
            fiftySix.start()
        }
        val fiftySeven = MediaPlayer.create(this, R.raw.tedagame__f5)
        findViewById<Button>(R.id.f5).setOnClickListener{
            fiftySeven.start()
        }
        val fiftyEight = MediaPlayer.create(this, R.raw.tedagame__f5s)
        findViewById<Button>(R.id.f5S).setOnClickListener{
            fiftyEight.start()
        }
        val fiftyNine = MediaPlayer.create(this, R.raw.tedagame__g5)
        findViewById<Button>(R.id.g5).setOnClickListener{
            fiftyNine.start()
        }
        val sixty = MediaPlayer.create(this, R.raw.tedagame__g5s)
        findViewById<Button>(R.id.g5S).setOnClickListener{
            sixty.start()
        }
        val sixtyOne = MediaPlayer.create(this, R.raw.tedagame__a5)
        findViewById<Button>(R.id.a5).setOnClickListener{
            sixtyOne.start()
        }
        val sixtyTwo = MediaPlayer.create(this, R.raw.tedagame__a5s)
        findViewById<Button>(R.id.a5S).setOnClickListener{
            sixtyTwo.start()
        }
        val sixtyThree = MediaPlayer.create(this, R.raw.tedagame__b5)
        findViewById<Button>(R.id.b5).setOnClickListener{
            sixtyThree.start()
        }
        val sixtyFour = MediaPlayer.create(this, R.raw.tedagame__c6)
        findViewById<Button>(R.id.c6).setOnClickListener{
            sixtyFour.start()
        }
        val sixtyFive = MediaPlayer.create(this, R.raw.tedagame__c6s)
        findViewById<Button>(R.id.c6S).setOnClickListener{
            sixtyFive.start()
        }
        val sixtySix = MediaPlayer.create(this, R.raw.tedagame__d6)
        findViewById<Button>(R.id.d6).setOnClickListener{
            sixtySix.start()
        }
        val sixtySeven = MediaPlayer.create(this, R.raw.tedagame__d6s)
        findViewById<Button>(R.id.d6S).setOnClickListener{
            sixtySeven.start()
        }
        val sixtyEight = MediaPlayer.create(this, R.raw.tedagame__e6)
        findViewById<Button>(R.id.e6).setOnClickListener{
            sixtyEight.start()
        }
        val sixtyNine = MediaPlayer.create(this, R.raw.tedagame__f6)
        findViewById<Button>(R.id.f6).setOnClickListener{
            sixtyNine.start()
        }
        val seventy = MediaPlayer.create(this, R.raw.tedagame__f6s)
        findViewById<Button>(R.id.f6S).setOnClickListener{
            seventy.start()
        }
        val seventyOne = MediaPlayer.create(this, R.raw.tedagame__g6)
        findViewById<Button>(R.id.g6).setOnClickListener{
            seventyOne.start()
        }
        val seventyTwo = MediaPlayer.create(this, R.raw.tedagame__g6s)
        findViewById<Button>(R.id.g6S).setOnClickListener{
            seventyTwo.start()
        }
        val seventyThree = MediaPlayer.create(this, R.raw.tedagame__a6)
        findViewById<Button>(R.id.a6).setOnClickListener{
            seventyThree.start()
        }
        val seventyFour = MediaPlayer.create(this, R.raw.tedagame__a6s)
        findViewById<Button>(R.id.a6S).setOnClickListener{
            seventyFour.start()
        }
        val seventyFive = MediaPlayer.create(this, R.raw.tedagame__b6)
        findViewById<Button>(R.id.b6).setOnClickListener{
            seventyFive.start()
        }
        val seventySix = MediaPlayer.create(this, R.raw.tedagame__c7)
        findViewById<Button>(R.id.c7).setOnClickListener{
            seventySix.start()
        }
        val seventySeven = MediaPlayer.create(this, R.raw.tedagame__c7s)
        findViewById<Button>(R.id.c7S).setOnClickListener{
            seventySeven.start()
        }
        val seventyEight = MediaPlayer.create(this, R.raw.tedagame__d7)
        findViewById<Button>(R.id.d7).setOnClickListener{
            seventyEight.start()
        }
        val seventyNine = MediaPlayer.create(this, R.raw.tedagame__d7s)
        findViewById<Button>(R.id.d7S).setOnClickListener{
            seventyNine.start()
        }
        val eighty = MediaPlayer.create(this, R.raw.tedagame__e7)
        findViewById<Button>(R.id.e7).setOnClickListener{
            eighty.start()
        }
        val eightyOne = MediaPlayer.create(this, R.raw.tedagame__f7)
        findViewById<Button>(R.id.f7).setOnClickListener{
            eightyOne.start()
        }
        val eightyTwo = MediaPlayer.create(this, R.raw.tedagame__f7s)
        findViewById<Button>(R.id.f7S).setOnClickListener{
            eightyTwo.start()
        }
        val eightyThree = MediaPlayer.create(this, R.raw.tedagame__g7)
        findViewById<Button>(R.id.g7).setOnClickListener{
            eightyThree.start()
        }
        val eightyFour = MediaPlayer.create(this, R.raw.tedagame__g7s)
        findViewById<Button>(R.id.g7S).setOnClickListener{
            eightyFour.start()
        }
        val eightyFive = MediaPlayer.create(this, R.raw.tedagame__a7)
        findViewById<Button>(R.id.a7).setOnClickListener{
            eightyFive.start()
        }
        val eightySix = MediaPlayer.create(this, R.raw.tedagame__a7s)
        findViewById<Button>(R.id.a7S).setOnClickListener{
            eightySix.start()
        }
        val eightySeven = MediaPlayer.create(this, R.raw.tedagame__b7)
        findViewById<Button>(R.id.b7).setOnClickListener{
            eightySeven.start()
        }
        val eightyEight = MediaPlayer.create(this, R.raw.tedagame__c8)
        findViewById<Button>(R.id.c8).setOnClickListener{
            eightyEight.start()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}