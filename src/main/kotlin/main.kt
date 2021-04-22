fun main(args: Array<String>) {
    print(
        "answer1:${
            solution(
                listOf(
                    intArrayOf(1, 4),
                    intArrayOf(3, 4),
                    intArrayOf(3, 10)
                ).toTypedArray()
            ).contentToString()
        }\n"
    )
    print(
        "answer2:${
            solution(
                listOf(
                    intArrayOf(1, 1),
                    intArrayOf(2, 2),
                    intArrayOf(1, 2)
                ).toTypedArray()
            ).contentToString()
        }"
    )
}

/**
 * Follow direction from pointA to pointB
 */
fun getVector(pointA: IntArray, pointB: IntArray): IntArray = intArrayOf(pointB[0] - pointA[0], pointB[1] - pointA[1])

fun dotProduct(vectorA: IntArray, vectorB: IntArray): Int = vectorA[0] * vectorB[0] + vectorA[1] * vectorB[1]

/**
 * Use vector to calculate the fourth  point.
 * There is 2 problem need to be addressed
 * 1. define 2 vectors make the angle
 * 2. define the last point.
 * E.g:
 * Have rectangle ABCD: AB and BC combine to a angle at B when: vectorAB dotProduct vectorBC = 0
 * So B is the angle point --> vectorBA = vectorCD hence we can get D point (fourth  point)
 */
fun solution(v: Array<IntArray>): IntArray {

    if (v.size != 3) {
        throw Exception("Illegal parameter")
    }

    val length = v.size

    for (i in 0..length) {

        val subV = v.withIndex().filter { (j) -> j != i }.map { (j, value) -> value }

        val pA = v[i]
        val pB = subV[0]
        val pC = subV[1]

        val vectorAB = getVector(pA, pB)
        val vectorAC = getVector(pA, pC)
        val vectorBA = getVector(pB, pA)

        if (dotProduct(vectorAB, vectorAC) == 0) {
            val xD = pC[0] - vectorBA[0]
            val yD = pC[1] - vectorBA[1]
            return intArrayOf(xD, yD)
        }

    }
    throw Exception("Not found")
}