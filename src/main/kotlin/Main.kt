fun main() {
    println("Кол-во  идущих подряд одинаковых символов в данной строке: " + pervaya(readln()))
}
fun pervaya(string: String): String {
    var result = ""
    var count = 1
    var a = string[0]
    for (item in string.substring(1)) {
        if (a != item) {
            if (count > 1) {
                result += "$a$count"
            } else {
                result += a
            }
            count = 1
            a = item
        } else {
            count++
        }
    }
    if (count > 1) {
        result += "$a$count"
    } else {
        result += a
    }
    return result
}