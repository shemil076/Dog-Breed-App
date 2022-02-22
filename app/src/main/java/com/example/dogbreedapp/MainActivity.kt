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
    var breeds = listOf<String>("Affenpinscher", "WalkerHound", "Appenzeller", "Chow", "EskimoDog", "GermanShepherd", "GoldenRetriever","Groenendael", "Keeshond")


//    var images = listOf<String>("img1", "img2","img3", "img4", "img5", "img6", "img7", "img8", "img9","img10","img11", "img12","img13", "img14", "img15", "img16", "img17", "img18", "img19")
    val listOfImages = listOf(listOf("img1", "img2","img3", "img4", "img5", "img6", "img7", "img8", "img9"),
                                listOf("img10", "img11","img12","img13","img14","img15","img16","img17","img18"),
                                listOf("img19","img20","img21","img22","img23","img24","img25","img26","img27"),
                                listOf("img28","img29","img30","img31","img32","img33","img34","img35","img36"),
                                listOf("img37","img38","img39","img40","img41","img42","img43","img44","img45"),
                                listOf("img46","img47","img48","img49","img50","img51","img52","img53","img54"),
                                listOf("img55","img56","img57","img58","img59","img60","img61","img62","img63"),
                                listOf("img64","img65","img66","img67","img68","img69","img70","img71","img72"),
                                listOf("img73","img74","img75","img76","img77","img78","img79","img80","img81"),
                                listOf("img82","img83","img84","img85","img86","img87","img88","img89","img90"),
                                listOf("img91","img92","img93","img94","img95","img96","img97","img98","img99")
                            )
    var breedNumber = mutableListOf<Int>()

    var Affenpinscher = mutableListOf<Int>()
    var WalkerHound = mutableListOf<Int>()
    var Appenzeller = mutableListOf<Int>()
    var Chow = mutableListOf<Int>()
    var EskimoDog = mutableListOf<Int>()
    var GermanShepherd = mutableListOf<Int>()
    var GoldenRetriever = mutableListOf<Int>()
    var Groenendael = mutableListOf<Int>()
    var Keeshond = mutableListOf<Int>()



    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1 = findViewById<ImageView>(R.id.imageView1)
        val image2 = findViewById<ImageView>(R.id.imageView2)
        val image3 = findViewById<ImageView>(R.id.imageView3)
        val lblMain = findViewById<TextView>(R.id.lbl_main)
        val nextDogBtn = findViewById<Button>(R.id.btn_next)




//        nextDogBtn.setOnClickListener {
//            loadDogs()
//        }






    }

    fun loadDogs(image1:ImageView, image2:ImageView, image3:ImageView, lblMain: TextView) {
        Log.d("find run", "LoadDogs ran")
//        var resource: String = dogs.get(0).toString()
//        var resID1 = resources.getIdentifier(resource, "drawable", packageName)

//        lblMain.text = "Select the correct image of  $resource"
//        image1.setImageResource(resID1)
//        image2.setImageResource(resID1)
//        image3.setImageResource(resID1)


    }


}