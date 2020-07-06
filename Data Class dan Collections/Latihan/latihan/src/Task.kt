/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah kode yang sudah ada.
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */
fun main() {

    // TODO 1
    val vehicle = mapOf<String, String>(
            "type" to "Motorcycle",
            "maxSpeed" to "230Km/s",
            "minTank" to "10Ltr"
    )

    // TODO 2
    val type = vehicle.getValue("type")
    val maxSpeed = vehicle.getValue("maxSpeed")
    val minTank = vehicle.getValue("minTank")

    // TODO 3
//    println("Vehicle")
//    println("Type: $type")
//    println("Maximal Speed: $maxSpeed")
//    println("Maximal Tank: $minTank")

    println("""Vehicle
        |Type: $type
        |Maximal Speed: $maxSpeed
        |Maximal Tank: $minTank
    """.trimMargin())

}