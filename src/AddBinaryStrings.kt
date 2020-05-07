class AddBinaryStrings
{
    private fun addBinary(a: String, b: String): String
    {
        var lastIndexA = a.length - 1

        var lastIndexB = b.length - 1

        var answer = ""

        var carry = 0

        var result = 0

        var digitSum = 0

        while (lastIndexA >= 0 || lastIndexB >= 0 || carry > 0)
        {
            digitSum = 0

            if (lastIndexA >= 0) digitSum += a[lastIndexA] - '0'

            if (lastIndexB >= 0) digitSum += b[lastIndexB] - '0'

            digitSum += carry

            result = digitSum % 2

            carry = digitSum / 2

            answer += result

            lastIndexA--

            lastIndexB--
        }
        return answer.reversed()
    }

    fun test(): Boolean
    {
        val testOne = arrayOf("1011", "0010")
        val testOneAns = "1101"

        val testTwo = arrayOf("1001", "11010")
        val testTwoAns = "100011"

        val testThree = arrayOf("", "100")
        val testThreeAns = "100"

        val testFour = arrayOf("101", "")
        val testFourAns = "101"

        val testFive = arrayOf("", "")
        val testFiveAns = ""

        return addBinary(testOne[0], testOne[1]) == testOneAns &&
                addBinary(testTwo[0], testTwo[1]) == testTwoAns &&
                addBinary(testThree[0], testThree[1]) == testThreeAns &&
                addBinary(testFour[0], testFour[1]) == testFourAns &&
                addBinary(testFive[0], testFive[1]) == testFiveAns

    }
}

fun main()
{
    val addBinaryStrings = AddBinaryStrings()
    if (addBinaryStrings.test()) println("Success") else println("Mission Failed")
}