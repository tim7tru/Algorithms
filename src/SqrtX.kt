class SqrtX
{
    private fun mySqrt(x: Int): Int
    {
        if (x < 2) return x

        var left = 0

        var right = x

        var mid = 0

        while (left < right)
        {
            mid = (left + right) / 2

            when {
                x / mid == mid -> return mid

                x / mid > mid -> {
                    if (x / (mid + 1) < mid + 1) return mid
                    left = mid
                }

                else -> right = mid

            }
        }
        return x
    }

    fun test(): Boolean
    {
        val testOne = 8
        val testOneAns = 2

        val testTwo = 16
        val testTwoAns = 4

        val testThree = 0
        val testThreeAns = 0

        val testFour = 101
        val testFourAns = 10

        return mySqrt(testOne) == testOneAns &&
                mySqrt(testTwo) == testTwoAns &&
                mySqrt(testThree) == testThreeAns &&
                mySqrt(testFour) == testFourAns
    }
}

fun main()
{
    val sqrtX = SqrtX()
    if (sqrtX.test()) println("Success") else println("Mission Failed")
}