class Mage(name:String): Human(name){
    override val mana: Boolean = true //q6
    override fun attack() { //q5
        println("$name use Fireball!")
    }

    override fun check() { //q6
        super.check()
    }
}
fun main(){
    val rainy = Mage("Rainy")
    rainy.attack()
}