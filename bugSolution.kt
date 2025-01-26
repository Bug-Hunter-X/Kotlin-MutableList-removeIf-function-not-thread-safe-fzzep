fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    synchronized(list) {
        list.removeIf { it % 2 == 0 }
    }
    println(list)
}