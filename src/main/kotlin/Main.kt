fun main(args: Array<String>) {
    println("Hello World!");println("123123")

    val age: Int
    age = 25
    //age = 26
    var count: Int = 70
    println(count)

    val a: Byte = 10 // -128 to 127
    val b: Short = 45

    val aa: UByte = 10U // 0..255

    val d: Double = 1.78
    val f: Float = 3.14F

    val flag: Boolean = true
    val name: String = "Ivan"

    val text: String =
        """
            sdfsdfgsdfg
            sdfgsdfg
            sdfgsdfg
        """
    println(text)

    val firstName_ = "Ivan"
    val age_ = 30
    val result = "Your name: $firstName_, age: $age_"

    var test123: Any = "asdfgasdf"
    var test111 = "asdfasdfas"

    val x = 11
    val y = 5.0
    val z = x / y // 2.2

    val h: Int = 200
    val k: Double
    k = h.toDouble()

    val m = 'p'
    val n = m in 'a'..'z'

    val a_ = 10
    val b_ = 20
    val c_ = if(a_>b_) {
        println("a>b")
        a_
    }else {
        println("b<a")
        b_
    }
    println(c_)

    val flag_ = true
    when(flag_) {
        false -> println("Off")
        true -> println("On")
        else -> println("111")
    }

    val aaa = 10
    val bbb = 5
    val ccc = 3
    when(aaa) {
        in 10..100 -> println("10...100")
        in 101..500 -> println("101...500")
        bbb - ccc -> println("Error!")
    }

    val sum =1000
    val rate = when(sum) {
        in 1..10 -> 10
        else -> 20
    }

   for(n in 1..9)
        print("${n*n} \t")

    for(i in 1..9) {
        for (j in 1..9) {
            print("${i * j} \t")
        }
        println()
    }

    val range = 1..5  // [1, 2, 3, 4, 5]

    val numbers: Array<Int>
    val nums = arrayOf(1,2,4,5,6)
    val n11 = nums[0]

    val nums_ = Array(3,{5}) // [5,5,5]
    var i = 1
    val nums__ = Array(3, { i++ * 2}) // 2,4,6

    println(4 in nums)
    val doubles = doubleArrayOf(2.4,5.5,7.11)

    val table = Array(3, {Array(3, {0})})
    table[0] = arrayOf(1,2,3)
    table[1] = arrayOf(5,6,3)
    table[2] = arrayOf(6,3,1)

    for(row in table) {
        for(cell in row) {
            print("$cell \t")
        }
    }


    var kkk: Int? = null
    display("Alex")
    display("Olga",30)
    val zzz = sum(100,200)
    val zzzyyy = sum(100.2,200.5)

    val a3 = square(5) // 25
    val a4 = square(6) // 36

    val hello: () -> Unit
    hello = ::hello4
    hello()

    val operation: (Int, Int) -> Int = ::sum
    val res = operation(3,5)
    println(res) // 8

    val hello5 = {println("Hello5")}
    hello5()
    val hello6: () -> Unit = {println("Hello6")}
    hello6()

    val sums = {x: Int, y: Int -> println(x+y)}
    val ggg = sums(5,6) // 11

    val ivan: Person = Person("Ivan")
    println(ivan.age)
    println(ivan.name)

    val olga: Person = Person("Olga", 20)
    val oleg: Person

}

class Person(_name: String) {
    var name: String = "Default"
    var age: Int = 18

    constructor(_name: String, _age: Int) : this(_name) {
        age = _age
    }

    init {
        name = _name
    }

    fun go(l: String) {
        println("Going...to $l")
    }
}




fun hello4() {
    println("Hello4")
}



fun square(x: Int) = x*x


fun display(name: String, age: Int = 18) {
    println("Name: $name, age: $age")
}

fun sum(x: Int, y: Int): Int {
    return x+y
}

fun hello() {
    println("Hello")
}

fun hello2(): Unit {
    println("Hello")
}

val ddd = hello2() // void
val fff = hello()  // void

fun sum(a: Double, b: Double): Double {
    return a+b
}


