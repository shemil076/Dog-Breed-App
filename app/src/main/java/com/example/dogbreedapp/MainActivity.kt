package com.example.dogbreedapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*
import java.util.Collections.shuffle

class MainActivity : AppCompatActivity() {
    var Affenpinscher = mutableListOf<Int>()
    var WalkerHound = mutableListOf<Int>()
    var Appenzeller = mutableListOf<Int>()
    var Chow = mutableListOf<Int>()
    var EskimoDog = mutableListOf<Int>()
    var GermanShepherd = mutableListOf<Int>()
    var GoldenRetriever = mutableListOf<Int>()
    var Keeshond = mutableListOf<Int>()
    var Labrador = mutableListOf<Int>()
    var Rottwiler = mutableListOf<Int>()
    var round = 1

    var count = 0
    var breeds = mutableListOf(
        Affenpinscher,
        WalkerHound,
        Appenzeller,
        Chow,
        EskimoDog,
        GermanShepherd,
        GoldenRetriever,
        Keeshond,
        Labrador,
        Rottwiler
    )

    val listOfImages = mutableListOf(
        listOf("img1", "img2", "img3", "img4", "img5", "img6", "img7", "img8", "img9"),
        listOf("img10", "img11", "img12", "img13", "img14", "img15", "img16", "img17", "img18"),
        listOf("img19", "img20", "img21", "img22", "img23", "img24", "img25", "img26", "img27"),
        listOf("img28", "img29", "img30", "img31", "img32", "img33", "img34", "img35", "img36"),
        listOf("img37", "img38", "img39", "img40", "img41", "img42", "img43", "img44", "img45"),
        listOf("img46", "img47", "img48", "img49", "img50", "img51", "img52", "img53", "img54"),
        listOf("img55", "img56", "img57", "img58", "img59", "img60", "img61", "img62", "img63"),
        listOf("img64", "img65", "img66", "img67", "img68", "img69", "img70", "img71", "img72"),
        listOf("img73", "img74", "img75", "img76", "img77", "img78", "img79", "img80", "img81"),
        listOf("img82", "img83", "img84", "img85", "img86", "img87", "img88", "img89", "img90"),
    )
    var breedNumber = mutableListOf<Int>()
    var gen: Random = Random()
    var dog1: Int? = 0
    var dog2: Int? = 0
    var dog3: Int? = 0

    var dogbreed1: String? = null
    var dogbreed2: String? = null
    var dogbreed3: String? = null
    var displayBreedName = mutableListOf<String>()

    var randomBreed: String? = null
    var clickCount = 0
    var goNext = false
    var correctCount = 0
    var incorrectCount = 0


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1 = findViewById<ImageView>(R.id.imageView1)
        val image2 = findViewById<ImageView>(R.id.imageView2)
        val image3 = findViewById<ImageView>(R.id.imageView3)
        val lblMain = findViewById<TextView>(R.id.lbl_main)
        val lblRound = findViewById<TextView>(R.id.round)
        val result = findViewById<TextView>(R.id.lbl_result)
        val nextDogBtn = findViewById<Button>(R.id.btn_next)
        val finishBtn = findViewById<Button>(R.id.btnFinish)
        val dogs = findViewById<ImageView>(R.id.dogs)
        val logo = findViewById<ImageView>(R.id.logo)
        loadDogs(lblMain, image1, image2, image3, lblRound, result)

        lblMain.setTextColor(Color.BLACK)
        nextDogBtn.setOnClickListener {
            if (goNext) {
                loadDogs(lblMain, image1, image2, image3, lblRound, result)

            } else {
                result.text = "⚠️Select a image before proceeding️"
            }
        }

        image1.setOnClickListener {

            dogbreed1?.let { it1 -> check(it1, result) }
        }
        image2.setOnClickListener {

            dogbreed2?.let { it1 -> check(it1, result) }
        }
        image3.setOnClickListener {

            dogbreed3?.let { it1 -> check(it1, result) }
        }

        finishBtn.setOnClickListener {
            val secondActivityIntent = Intent(this, SecondActivity::class.java)
            secondActivityIntent.putExtra("correct", correctCount)
            secondActivityIntent.putExtra("wrong", incorrectCount)
            Toast.makeText(this, "Moving on...", Toast.LENGTH_SHORT).show()
            startActivity(secondActivityIntent)
        }

        dogs.setImageResource(R.drawable.dogs)
        logo.setImageResource(R.drawable.scoob)

    }


    fun loadDogs(
        lblMain: TextView,
        image1: ImageView,
        image2: ImageView,
        image3: ImageView,
        lblRound: TextView,
        result: TextView
    ) {

        result.setTextColor(Color.parseColor("#FF000000"))
        result.text = ""
        goNext = false
        displayBreedName.clear()
        breedNumber.clear()

        if ((Affenpinscher.size == 8) || (WalkerHound.size == 8) || (Appenzeller.size == 8) || (Chow.size == 8) || (EskimoDog.size == 8) || (GermanShepherd.size == 8) || (GoldenRetriever.size == 8) || (Keeshond.size == 8) || (Labrador.size == 8) || (Rottwiler.size == 8)) {
            Toast.makeText(this, "Round $round completed!", Toast.LENGTH_SHORT).show()
            round += 1

            breedNumber.clear()
            Affenpinscher.clear()
            WalkerHound.clear()
            Appenzeller.clear()
            Chow.clear()
            EskimoDog.clear()
            GermanShepherd.clear()
            GoldenRetriever.clear()
            Keeshond.clear()
            Labrador.clear()
            Rottwiler.clear()
            lblRound.text = "Round $round"

        }


        var breed1 = 0 + gen.nextInt(8)

        while (breedNumber.contains(breed1)) {
            breed1 = 0 + gen.nextInt(8)
        }
        breedNumber.add(breed1)


        var breed2 = 0 + gen.nextInt(8)

        while (breedNumber.contains(breed2)) {
            breed2 = 0 + gen.nextInt(8)
        }
        breedNumber.add(breed2)


        var breed3 = 0 + gen.nextInt(8)

        while (breedNumber.contains(breed3)) {
            breed3 = 0 + gen.nextInt(8)
        }
        breedNumber.add(breed3)



        dog1 = 0 + gen.nextInt(8)
        while (breeds[breed1].contains(dog1)) {
            dog1 = 0 + gen.nextInt(8)
        }
        breeds[breed1].add(dog1!!)

        dog2 = 0 + gen.nextInt(8)
        while (breeds[breed2].contains(dog2)) {
            dog2 = 0 + gen.nextInt(8)
        }
        breeds[breed2].add(dog2!!)

        dog3 = 0 + gen.nextInt(8)
        while (breeds[breed3].contains(dog3)) {
            dog3 = 0 + gen.nextInt(8)
        }
        breeds[breed3].add(dog3!!)


        dogbreed1 = getBreedName(breed1)
        if (dogbreed1 != null) {
            displayBreedName.add(dogbreed1!!)
        }

        if (dogbreed1 != null) {
            Log.d("test breed 1 ", dogbreed1!!)
            var resource: String = listOfImages[breed1][dog1!!]
            var resID1 = resources.getIdentifier(resource, "drawable", packageName)
            image1.setImageResource(resID1)

        }

        dogbreed2 = getBreedName(breed2)
        if (dogbreed2 != null) {
            displayBreedName.add(dogbreed2!!)
        }

        if (dogbreed2 != null) {
            Log.d("test breed 2 ", dogbreed2!!)
            var resource: String = listOfImages[breed2][dog2!!]
            var resID1 = resources.getIdentifier(resource, "drawable", packageName)
            image2.setImageResource(resID1)
        }

        dogbreed3 = getBreedName(breed3)
        if (dogbreed3 != null) {
            displayBreedName.add(dogbreed3!!)
        }

        if (dogbreed3 != null) {

            var size1 = Affenpinscher.size
            var size2 = WalkerHound.size
            var size3 = Appenzeller.size
            var size4 = Chow.size
            var size5 = EskimoDog.size
            var size6 = GermanShepherd.size
            var size7 = GoldenRetriever.size
            var size8 = Labrador.size
            var size9 = Keeshond.size

            Log.d("test breed 3 ", dogbreed3!!)
            var resource: String = listOfImages[breed3][dog3!!]
            var resID1 = resources.getIdentifier(resource, "drawable", packageName)
            image3.setImageResource(resID1)

            Log.d(" ", size1.toString())
            Log.d(" ", size2.toString())
            Log.d(" ", size3.toString())
            Log.d(" ", size4.toString())
            Log.d(" ", size5.toString())
            Log.d(" ", size6.toString())
            Log.d(" ", size7.toString())
            Log.d(" ", size8.toString())
            Log.d(" ", size9.toString())
            Log.d(" ", "")
        }

        shuffle(displayBreedName)
        randomBreed = displayBreedName[0]

        lblMain.text = "Select the image of $randomBreed"
        count += 1
        Log.d("LoadDog method ran", count.toString())
        clickCount = 0


    }

    fun getBreedName(breed: Int): String? {
        var breedName: String? = null
        when (breed) {
            0 -> breedName = "Affenpinscher"
            1 -> breedName = "WalkerHound"
            2 -> breedName = "Appenzeller"
            3 -> breedName = "Chow"
            4 -> breedName = "EskimoDog"
            5 -> breedName = "GermanShepherd"
            6 -> breedName = "GoldenRetriever"
            7 -> breedName = "Keeshond"
            8 -> breedName = "Labrador"
        }
        return breedName

    }

    fun check(name: String, result: TextView) {

        clickCount += 1
        if (clickCount <= 1) {
            if (displayBreedName[0].equals(name)) {
                result.text = "CORRECT"
                result.setTextColor(Color.GREEN)
                correctCount +=1

            } else {
                result.text = "WRONG"
                result.setTextColor(Color.RED)
                incorrectCount +=1
            }
        }
        goNext = true;

    }
}