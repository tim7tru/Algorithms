class LengthOfLastWord
{
    private fun lengthOfLastWord(s: String): Int
    {
        return if (s.replace(" ", "").isEmpty()) 0 else s.split(" ").filter { it.isNotEmpty() }.reversed()[0].length
    }

    fun test(): Boolean
    {
        val testOneAns = 5
        val testOne = "Hello Cruel World"

        val testTwoAns = 0
        val testTwo = ""

        val testThreeAns = 3
        val testThree = "dog "

        val testFourAns = 0
        val testFour = "     "

        return lengthOfLastWord(testOne) == testOneAns &&
                lengthOfLastWord(testTwo) == testTwoAns &&
                lengthOfLastWord(testThree) == testThreeAns &&
                lengthOfLastWord(testFour) == testFourAns
    }
}

fun main()
{
    val solution = LengthOfLastWord()

    if (solution.test()) println("Success") else println("Mission Failed")
}