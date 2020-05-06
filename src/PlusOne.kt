class PlusOne
{
    private fun plusOne(digits: IntArray): IntArray
    {
        if (digits.isEmpty())
        {
            return digits
        }

        // Iterate backwords until change is made
        for (index in digits.size - 1 downTo 0)
        {
            val addOne = digits[index] + 1

            if (addOne == 10)
            {
                digits[index] = 0
            }
            else
            {
                digits[index] = addOne
            }
        }

        // If no change was made, new array needed
        if (digits.first() == 0)
        {
            return intArrayOf(1, *digits)
        }

        return digits
    }

    fun test(): Boolean
    {
        val testOne = intArrayOf(1,9,9,9,9,9)
        val testOneAns = intArrayOf(2,0,0,0,0,0)

        val testTwo = intArrayOf(9)
        val testTwoAns = intArrayOf(1,0)

        val testThree = intArrayOf()
        val testThreeAns = intArrayOf()

        val testFour = intArrayOf(1,2,3,4,5,6,7,8,8)
        val testFourAns = intArrayOf(1,2,3,4,5,6,7,8,9)

        return plusOne(testOne).contentEquals(testOneAns) &&
                plusOne(testTwo).contentEquals(testTwoAns) &&
                plusOne(testThree).contentEquals(testThreeAns) &&
                plusOne(testFour).contentEquals(testFourAns)
    }
}

fun main()
{
    val plusOne = PlusOne()
    if (plusOne.test()) println("Success") else println("Mission Failed")
}