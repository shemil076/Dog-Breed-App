package com.example.dogbreedapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

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

    var count = 0
    var breeds = mutableListOf(Affenpinscher, WalkerHound, Appenzeller, Chow, EskimoDog, GermanShepherd, GoldenRetriever, Keeshond,Labrador,Rottwiler)

    val listOfImages = mutableListOf(listOf("img1", "img2","img3", "img4", "img5", "img6", "img7", "img8", "img9"),
                                listOf("img10", "img11","img12","img13","img14","img15","img16","img17","img18"),
                                listOf("img19","img20","img21","img22","img23","img24","img25","img26","img27"),
                                listOf("img28","img29","img30","img31","img32","img33","img34","img35","img36"),
                                listOf("img37","img38","img39","img40","img41","img42","img43","img44","img45"),
                                listOf("img46","img47","img48","img49","img50","img51","img52","img53","img54"),
                                listOf("img55","img56","img57","img58","img59","img60","img61","img62","img63"),
                                listOf("img64","img65","img66","img67","img68","img69","img70","img71","img72"),
                                listOf("img73","img74","img75","img76","img77","img78","img79","img80","img81"),
                                listOf("img82","img83","img84","img85","img86","img87","img88","img89","img90"),
                            )
    var breedNumber = mutableListOf<Int>()
    var gen: Random = Random()
    var dog1 : Int? =0
    var dog2 : Int? =0
    var dog3 : Int? =0




    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1 = findViewById<ImageView>(R.id.imageView1)
        val image2 = findViewById<ImageView>(R.id.imageView2)
        val image3 = findViewById<ImageView>(R.id.imageView3)
        val lblMain = findViewById<TextView>(R.id.lbl_main)
        val nextDogBtn = findViewById<Button>(R.id.btn_next)



        nextDogBtn.setOnClickListener {
            loadDogs(lblMain,image1, image2, image3)
        }

    }


    fun loadDogs( lblMain: TextView,image1:ImageView, image2:ImageView, image3:ImageView) {

        if ((Affenpinscher.size == 8) || (WalkerHound.size == 8) || (Appenzeller.size == 8) || (Chow.size == 8) || (EskimoDog.size == 8) || (GermanShepherd.size == 8) || (GoldenRetriever.size == 8) || (Keeshond.size == 8) || (Labrador.size == 8)||(Rottwiler.size == 8)){
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
        }

        var breedName: String? = null
        breedNumber.clear()

        var breed1 = 0 + gen.nextInt(8)

        while(breedNumber.contains(breed1)){
            breed1 = 0 + gen.nextInt(8)
        }
        breedNumber.add(breed1)


        var breed2 = 0 + gen.nextInt(8)

        while(breedNumber.contains(breed2)){
            breed2 = 0 + gen.nextInt(8)
        }
        breedNumber.add(breed2)


        var breed3 = 0 + gen.nextInt(8)

        while(breedNumber.contains(breed3)){
            breed3 = 0 + gen.nextInt(8)
        }
        breedNumber.add(breed3)




        dog1 = 0 + gen.nextInt(8)
        while(breeds[breed1].contains(dog1)){
            dog1 = 0 + gen.nextInt(8)
        }
        breeds[breed1].add(dog1!!)

        dog2 = 0 + gen.nextInt(8)
        while(breeds[breed2].contains(dog2)){
            dog2 = 0 + gen.nextInt(8)
        }
        breeds[breed2].add(dog2!!)

        dog3 = 0 + gen.nextInt(8)
        while(breeds[breed3].contains(dog3)){
            dog3 = 0 + gen.nextInt(8)
        }
        breeds[breed3].add(dog3!!)

        var tempbreed1 = breeds[breed1]
        var tempbreed2 = breeds[breed2]
        var tempbreed3 = breeds[breed3]

        var tempDog1 = "$tempbreed1  $dog1"
        var tempDog2 = "$tempbreed2  $dog2"
        var tempDog3 = "$tempbreed3  $dog3"

        lblMain.text =""
        lblMain.text = "$tempDog1 $tempDog2 $tempDog3"

        var dogbreed1 = getBreedName(breed1)

        if (dogbreed1 != null) {
            Log.d("test breed 1 ", dogbreed1)
          var resource: String = listOfImages[breed1][dog1!!]
          var resID1 = resources.getIdentifier(resource, "drawable", packageName)
          image1.setImageResource(resID1)

        }

        var dogbreed2 = getBreedName(breed2)

        if (dogbreed2 != null) {
            Log.d("test breed 2 ", dogbreed2)
            var resource: String = listOfImages[breed2][dog2!!]
            var resID1 = resources.getIdentifier(resource, "drawable", packageName)
            image2.setImageResource(resID1)
        }

        var dogbreed3 = getBreedName(breed3)

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

            Log.d("test breed 3 ", dogbreed3)
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

        count += 1
        Log.d("LoadDog method ran", count.toString())
    }

    fun getBreedName(breed: Int): String? {
        var breedName: String? = null
        when (breed){
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


}