import kotlin.math.roundToInt

fun main(){
    val constant: Boolean = true
    var amount: Int = 1002

    var discount: Int = if(amount<=1000) 0
        else if(amount in 1001..10000) 100
        else (amount.toDouble()/20.00).roundToInt()
    println("Скидка от суммы составила $discount руб.")
    amount -= discount

    discount = if(!constant) 0 else (amount.toDouble()/100.00).roundToInt()
    println("Скидка постоянному покупателю составила $discount руб.")
    amount -= discount
    println("Стоимость со скидкой составила $amount руб.")
}