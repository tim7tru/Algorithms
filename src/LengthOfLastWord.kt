class LengthOfLastWord
{
    private fun lengthOfLastWord(s: String): Int
    {
        val lengthOfString = s.length

        var length = 0

        for(index in lengthOfString - 1 downTo 0)
        {
            if (s[index].isWhitespace() && length > 0)
            {
                break
            }
            else if (!s[index].isWhitespace())
            {
                length++
            }
        }

        return length
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