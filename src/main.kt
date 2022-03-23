fun main() {
   var person= human("Steave",24,70)
 person.eat(20)
    println(person.weight)
    person.speak("Food is good")
    println(person.age)
    person.birthday(1)
    println(person.age)
    var info=user("Leticia","Wamaitha","leticia@gmail.com","0720145067","Newyork123")
    println(info.firstname)
    println(info.email)











}
class human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
      weight+=foodWeight
      println("I am eating $foodWeight kgs of food ")

    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(newage:Int){
        age+=newage
        println(newage)
    }
}
data class user(var firstname:String,var lastname:String,var email:String,var phonenumber:String,var password:String){

}