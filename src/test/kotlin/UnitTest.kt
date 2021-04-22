import org.junit.Assert
import org.junit.Test

class UnitTest {
    @Test
    fun `3 points all in the Quadrant I case 1`() {
        val demoInput = listOf(intArrayOf(1, 4), intArrayOf(3, 4), intArrayOf(3, 10)).toTypedArray()
        val result4 = solution(demoInput)

        Assert.assertArrayEquals(intArrayOf(1, 10), result4)
    }

    @Test
    fun `3 points all in the Quadrant I case 2`() {
        val demoInput2 = listOf(intArrayOf(1, 1), intArrayOf(2, 2), intArrayOf(1, 2)).toTypedArray()
        val result4 = solution(demoInput2)

        Assert.assertArrayEquals(intArrayOf(2, 1), result4)
    }

    @Test
    fun `2 points all in the Quadrant I and 1 point in the Quadrant II`() {
        val demoInput3 = listOf(intArrayOf(2, 6), intArrayOf(2, 1), intArrayOf(-3, 1)).toTypedArray()
        val result4 = solution(demoInput3)

        Assert.assertArrayEquals(intArrayOf(-3, 6), result4)
    }

    @Test
    fun `3 points all in the Quadrant II`() {
        val demoInput4 = listOf(intArrayOf(-4, 5), intArrayOf(-4, 2), intArrayOf(-2, 5)).toTypedArray()
        val result4 = solution(demoInput4)

        Assert.assertArrayEquals(intArrayOf(-2, 2), result4)
    }

    @Test
    fun `3 points all in the Quadrant III`() {
        val demoInput4 = listOf(intArrayOf(-4, -2), intArrayOf(-4, -4), intArrayOf(-6, -4)).toTypedArray()
        val result4 = solution(demoInput4)

        Assert.assertArrayEquals(intArrayOf(-6, -2), result4)
    }

    @Test
    fun `3 points all in the Quadrant IV`() {
        val demoInput4 = listOf(intArrayOf(3, -3), intArrayOf(3, -5), intArrayOf(6, -3)).toTypedArray()
        val result4 = solution(demoInput4)

        Assert.assertArrayEquals(intArrayOf(6, -5), result4)
    }

    @Test
    fun `3 points in every Quadrant`() {
        val demoInput4 = listOf(intArrayOf(-3, 4), intArrayOf(-3, -6), intArrayOf(4, -6)).toTypedArray()
        val result4 = solution(demoInput4)

        Assert.assertArrayEquals(intArrayOf(4, 4), result4)
    }
}