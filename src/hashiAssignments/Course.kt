package hashiAssignments

data class Course( val courseCode: String, val noOfUnits: Int, val score: Int){
    private fun getGradeScore(score: Int): Int {
        return when {
            (score in 70..100) -> 5
            (score in 60..69) -> 4
            (score in 50..59) -> 3
            (score in 45..49) -> 2
            (score in 40..44) -> 1
            else -> 0
        }
    }

    fun getPoint() = noOfUnits * getGradeScore(score)
    fun getTotalUnits() = noOfUnits
}

