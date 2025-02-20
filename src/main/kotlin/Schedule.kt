package scheduler
import java.time.LocalDateTime

data class Shift(val name: String, val start: LocalDateTime, val end: LocalDateTime)

class Schedule(val names: List<String>, val start: LocalDateTime, val interval: Int) {

    fun override(name: String, start: LocalDateTime, end: LocalDateTime) {
        TODO()
    }
}