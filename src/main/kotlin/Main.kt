fun main() {
    println("Кол-во  идущих подряд одинаковых символов в данной строке: " + pervaya(readln()))
}
fun pervaya(string: String): String {
    var result = ""
    var count = 1
    var s = string[0]
    for (item in string.substring(1)) {
        if (s != item) {
            if (count > 1) {
                result += "$s$count"
            } else {
                result += s
            }
            count = 1
            s = item
        } else {
            count++
        }
    }
    if (count > 1) {
        result += "$s$count"
    } else {
        result += s
    }
    return result
}