package org.example


fun main() {
    var button = Button()
    button.clickListener = MyListener()
    // bunu yapmamıza gerek yok, interface'yi implement eden bir class oluşturup ondan nesne oluşturup atamamıza gerek yok
    // bunun yerine object kullanarak, anonimys function yaratabiliriz.
    button.click()

    button.clickListener = object : OnClickListener {
        override fun onClick() {
            println("Clicked or whatever")
        }
    }
    button.click()

    // bunu bir fonksiyon aracılığıyla yapmak için setMyListener tanımladım
    button.setMyListener(object : OnClickListener{
        override fun onClick() {
            println("Clicked with help a function")
        }
    })
    button.click()
}

class MyListener : OnClickListener {
    override fun onClick() {
        println("Clicked")
    }
}


interface OnClickListener {
    fun onClick()
}

abstract class View {
    lateinit var clickListener: OnClickListener

    fun click() {
        clickListener.onClick()
    }

    fun setMyListener(clickListener: OnClickListener) {
        this.clickListener = clickListener
    }
}

class Button : View()
class Image : View()
class Map : View()
