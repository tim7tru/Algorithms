class ClimbingStairs
{
    private fun climbingStairs(n: Int): Int
    {
        val array = IntArray(n + 1)

        return numberOfWays(array, n)
    }

    private fun numberOfWays(array: IntArray, n: Int): Int
    {
        if (n <= 2) return n

        if (array[n] == 0) array[n] = numberOfWays(array, n - 1) + numberOfWays(array,n - 2)

        return array[n]
    }

    fun test(): Boolean
    {
        val testOne = 6
        val testOneAns = 13

        return climbingStairs(testOne) == testOneAns
    }
}

fun main()
{
    val climbingStairs = ClimbingStairs()

    if (climbingStairs.test()) println("Success") else println("Mission Failed")
}