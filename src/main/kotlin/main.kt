fun main() {
    val user1Time = 5
    val user2Time = 256
    val user3Time = 60670
    val user4Time = 109700
    val user5Time = 210034
    val user6Time = 999999

    println(countTimeDisconnect(user1Time))
    println(countTimeDisconnect(user2Time))
    println(countTimeDisconnect(user3Time))
    println(countTimeDisconnect(user4Time))
    println(countTimeDisconnect(user5Time))
    println(countTimeDisconnect(user6Time))
}

fun countTimeDisconnect(timeCount: Int) = when {
    timeCount <= 60 -> "Был(а) в сети только что"
    timeCount <= 3600 -> "Был(а) в сети ${minutesToString(timeCount)} назад"
    timeCount <= 86400 -> "Был(а) в сети ${hoursToString(timeCount)} назад"
    timeCount <= 172800 -> "Был(а) в сети сегодня"
    timeCount <= 259200 -> "Был(а) в сети вчера"
    else -> "Был(а) в сети давно"
}

fun minutesToString(countSeconds: Int): String {
    val countMinutes = countSeconds / 60

    return if (countMinutes % 10 == 1 && countMinutes != 11) {
        "$countMinutes минуту"
    } else if (countMinutes % 10 >= 2 && countMinutes % 10 <= 4) {
        "$countMinutes минуты"
    } else {
        "$countMinutes минут"
    }
}

fun hoursToString(countSeconds: Int): String {
    val countHours = countSeconds / 3600

    return if (countHours % 10 == 1 && countHours != 11) {
        "$countHours час"
    } else if (countHours % 10 >= 5 && countHours % 10 <= 9) {
        "$countHours часов"
    } else {
        "$countHours часа"
    }
}