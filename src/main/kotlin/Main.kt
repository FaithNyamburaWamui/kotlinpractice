import java.security.spec.ECGenParameterSpec

fun main() {
    var bank=BankAccount("6987uty",40000.00)
     bank.withDraw(3000.00)

    var savings=SavingAccount("123qwer",9000.00)
    savings.withDraw(2000.00)

    var current=CurrentAccount("qwert678",8000.00)
     current.withDraw(50000.00)


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

    var fruit=Fruit("Pawpaw","Sour")
    fruit.tString()

    var apple=Apple("Apple","Sweet")
    apple.tString()

    var banana=Banana("Banana","Sugary")
    banana.tString()

    var orange=Orange("Orange","Sweet")
    orange.tString()

    var customer=Customer("John","john@gmail.com")
    customer.isProperty()

    var regular=RegularCustomer("Aiden","aiden@gmail.com")
    regular.isProperty()

    var premium=PremiumCustomer("Zara","zara@gmail.com")
    premium.isProperty()


    var person=Person("Ethan",10)
    person.addProperties()

    var student=Student("David",14)
    student.addProperties()

    var teacher=Teacher("Mary",30)
    teacher.addProperties()
}

open class BankAccount(var accountNumber:String,var balance:Double){
     open fun withDraw(amount:Double){
        println("Account ${accountNumber} has a balance of ${balance}")
    }
}
class SavingAccount(accountNumber:String,balance: Double):BankAccount(accountNumber,balance){
    override fun withDraw(amount: Double){
        var minBalance=500.00
        if(balance-amount<minBalance){
            println("Account ${accountNumber} can not go below this amount ${minBalance}")
        }
        else("Can continue with the withdrawal")
    }
}

class CurrentAccount(accountNumber: String,balance: Double):BankAccount(accountNumber,balance){
    override fun withDraw(amount: Double){
        var minBalance=1000.00
        if(balance-amount<minBalance){
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


//Create a base class Fruit with properties name and taste. Derive subclasses like Apple, Banana, and Orange. Override the toString() method in each subclass to display its unique characteristics.
open class Fruit(var name:String,var taste:String){
    open fun tString(){
        println("Fruits are good for your health")
    }
}
class Apple(name: String,taste: String):Fruit(name,taste){
    override fun tString(){
        println("An ${name} a day keeps the doctor away and it is ${taste}")
    }
}
class Banana(name: String,taste: String):Fruit(name,taste){
    override fun tString(){
        println("A ${name} has a ${taste} taste")
    }
}
class Orange(name: String,taste: String):Fruit(name,taste){
    override fun tString(){
        println("The ${name} is very ${taste}")
    }
}


//Design a class Customer with properties name and email. Derive two subclasses RegularCustomer and PremiumCustomer, each with an additional property (loyaltyPoints for RegularCustomer, discountPercentage for PremiumCustomer).
open class Customer(var name:String,var email:String){
    open fun isProperty(){
        println("${name} and ${email}")
    }
}

class RegularCustomer(name: String,email: String):Customer(name,email){
       override fun isProperty(){
        var loyaltyPoints=30
        println("${name} is a SoftWare Developer whose email is ${email} and loyalty points are ${loyaltyPoints}")
    }
}
class PremiumCustomer(name: String,email: String):Customer(name,email){
     override fun isProperty(){
         var discountPercentage = 20
         println("${name} is a SoftWare Developer whose email is ${email} and loyalty points are ${discountPercentage}")
     }
}


//Develop a class Person with properties name and age. Derive two subclasses Student and Teacher. Add properties like grade for Student and subject for Teacher.
open class Person(var name:String,var age:Int){
    open fun addProperties(){
        println("My name is ${name} and l am ${age}")
    }
}
class Student(name: String,age: Int):Person(name,age){
    override fun addProperties(){
        var grade=60
        println("${name} is ${age} years and has scored ${grade}")
    }
}
class Teacher(name: String,age: Int):Person(name,age){
    override fun addProperties(){
        var subject="Science"
        println("${name} is ${age} years and teaches ${subject}")
    }
}

