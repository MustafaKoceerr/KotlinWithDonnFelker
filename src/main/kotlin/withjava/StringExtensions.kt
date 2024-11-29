@file:JvmName("StringExtensions") // bu satır sayesinde JVM'de oluşturulan dosyanın ismini değiştirebildim.
package org.example.withjava


fun String.initials(): String {
    val values = this.split(' ')
    val firstInitial = values[0].first()
    val lastInitial = values[1].first()
    return "$firstInitial$lastInitial"
}