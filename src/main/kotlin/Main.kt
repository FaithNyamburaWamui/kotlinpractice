import kotlin.math.E

fun main(args: Array<String>) {
    var bank=BankAccount("6987uty",40000.00)
     bank.withDraw()

    var savings=SavingAccount("123qwer",200.00)
    savings.withDraw()

    var current=CurrentAccount("qwert678",300.00)
     current.withDraw()


    var vehicle=Vehicle("Ford","Juke")
    vehicle.isString()

    var car=Car("Toyota","Mercides")
    car.isString()


    var employ=Employee("John",20000)
    var employ2= Employee("Faith",60000)
    employ.isEmployee()
    employ2.isEmployee()

    var manage=Manager("Eric",70000)
    manage.isEmployee()

    var develop=Developer("dorcus",80000)
   develop.isEmployee()
}

open class BankAccount(var accountNumber:String,var balance:Double){
     open fun withDraw(){
        println("Account ${accountNumber} has a balance of ${balance}")
    }
}
class SavingAccount(accountNumber:String,balance: Double):BankAccount(accountNumber,balance){
    override fun withDraw(){
        var minBalance=500.00
        if(balance<minBalance){
            println("Can not go below this amount ${balance}")
        }
        else("Account ${accountNumber} can continue with the withdrawal")
    }
}

class CurrentAccount(accountNumber: String,balance: Double):BankAccount(accountNumber,balance){
    override fun withDraw(){
        var minBalance=1000.00
        if(balance<minBalance){
            println("Account ${accountNumber} can not go below this amount ${minBalance}")
        }
        else{
            println("Can withdraw the asked amount")
        }
    }
}

open class Vehicle(var brand:String,var make:String){
     open fun isString(){
        println("The car is ${brand} and is of ${make}")
    }
}
class Car(brand: String,make: String):Vehicle(brand,make){
    override fun isString(){
        println("The car is ${brand} and is of ${make}")
    }
}

open class Employee(var name:String,var salary:Int){
    open fun isEmployee(){
        println("My name is ${name} and my salary is ${salary}")
    }
}
class Manager(name: String,salary: Int):Employee(name,salary){
    override fun isEmployee(){
        var department = "Management"
        println("${name} is paid ${salary} from ${department} department")
    }
}
class Developer(name: String,salary: Int):Employee(name,salary){
    override fun isEmployee(){
        var language ="Kotlin"
        println("${salary} is paid to ${name} doing ${language}")
    }
}

