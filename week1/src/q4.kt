class Human (var name:String){
    open val mana: Boolean = false; //q6
    open fun attack(){ //q5
        println("$name use First Attack!")
    }
    open fun check(){ //q6
        if(mana)println("$name has mana!")
        else println("$name doesn't have mana!")
    }

}

fun main(){
    val rainy = Human("Rainy")
    rainy.attack()
}