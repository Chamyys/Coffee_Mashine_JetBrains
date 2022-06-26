class ChristmasTree(var color: String) {
    fun putTreeTopper(color: String) {
    val put: TreeTopper = TreeTopper(color)
    put.sparkle()
    }
    // create function putTreeTopper()

    inner class TreeTopper(var color: String) {
    fun sparkle() {
        println("The sparkling $color tree topper looks stunning on the ${this@ChristmasTree.color} Christmas tree!")
    }
        // create function sparkle()
    }
}