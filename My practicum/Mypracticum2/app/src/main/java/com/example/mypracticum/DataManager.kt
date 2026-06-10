package com.example.mypracticum

// Student number: ST10473990
// Full names: Lufuno Ratshitaka
object DataManager {

    val itemNames = ArrayList<String>()
    val categories = ArrayList<String>()
    val quantities = ArrayList<Int>()
    val comments = ArrayList<String>()

    init {
        itemNames.add("Tent")
        categories.add("Shelter")
        quantities.add(1)
        comments.add("4-person waterproof")

        itemNames.add("Marshmallows")
        categories.add("Food")
        quantities.add(3)
        comments.add("For S'mores Mega Size")

        itemNames.add("Flashlight")
        categories.add("Safety")
        quantities.add(2)
        comments.add("Check batteries")
    }

    fun calculateTotalItems(): Int {
        var total = 0
        for (quantity in quantities) {
            total += quantity
        }
        return total
    }
}

// References
//
//Anon., 2026. DeepSeek. [Online]
//Available at: https://www.DeepSeek.com
//[Accessed 10 June 2026].
//Anon., 2026. W3Schools. [Online]
//Available at: https://www.w3schools.com
//[Accessed 10 June 2026].
//Anon., 2026. IMAD5112 Module manual. [Online]
//Available at: https://www.Rosebank College.com
//[Accessed 10 June 2026].
//Anon., 2026. IMAD5112 Learn Module Outline. [Online]
//Available at: https://www.Rosebank College.com
//[Accessed 10 June 2026].
//
//Creating multiple pages in android app| moving between. 2020. [Film] Directed by @tonnydennis6286. s.l.: tonnydennis6286.
