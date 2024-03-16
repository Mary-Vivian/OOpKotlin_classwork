fun main() {
    var car=Car("Toyota","prado","KDD 123",0)
    var  car2=Car("Mazda","cx-5","Kck 544",30)
//    println(car.make)
    car.start()
//    println(car2.accelerate(8))
    println(car.speed)
    car.accelerate(40)
    println(car.speed)
    car.accelerate(80)
    car.decelerate(20)
    println(car.speed)
    car.hoot()
    println(car.speed)
    car.stop()
    println(car.speed)
    var myBook=Book("Tell me lies","Teresa Dirsco",329,)
    println(myBook.author)
    println(myBook.pages)
    println(myBook.title)



}
class Car (var make:String, var model:String,var registration:String,var speed:Int){
    fun start(){
        println("chogiogiogio, vuvuuuumuu")

    }
    fun accelerate(acceleration:Int):Int{
        speed+=acceleration
        return speed


    }
    fun decelerate(deceleration:Int):Int{
        speed-=deceleration
        return speed
    }
    fun hoot(){
        println("prrrrrrrr")
    }
    fun stop(){
        speed=0
    }



}
data class Book(
    var title:String,
    var author:String,
    var pages:Int,


)
data class ageStart(
    var minAge:Int,
    var maxAge:Int,
    var average:Double,
    var total:Int
)
fun calculateAgestats(ages:Array<Int>):ageStart{
    val min=ages.minOrNull()!!
    val max=ages.maxOrNull()!!
    val avg=ages.average()
    val total=ages.sum()
    val result =ageStart(min,max,avg,total)
    return result


}


