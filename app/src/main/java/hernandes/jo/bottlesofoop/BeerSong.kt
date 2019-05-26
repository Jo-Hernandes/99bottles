package hernandes.jo.bottlesofoop

object BeerSong {

    fun verses(start: Int, finish: Int): String {
        val verses = mutableListOf<String>()

        for (i in start downTo finish) {
            verses.add(getTopVerse(i) + "\n" + getBottomVerse(i-1))
        }
        return verses.joinToString("\n\n", "", "\n" )
    }

    private fun getTopVerse(quantity: Int) = when(quantity){
        0 -> "No more bottles of beer on the wall, no more bottles of beer."
        1 -> "$quantity bottle of beer on the wall, $quantity bottle of beer."
        else -> "$quantity bottles of beer on the wall, $quantity bottles of beer."
    }

    private fun getBottomVerse(quantity: Int) = when (quantity){
        -1 -> "Go to the store and buy some more, 99 bottles of beer on the wall."
        0 -> "Take it down and pass it around, no more bottles of beer on the wall."
        1 -> "Take one down and pass it around, 1 bottle of beer on the wall."
        else -> "Take one down and pass it around, $quantity bottles of beer on the wall."
    }
}
