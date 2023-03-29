fun main() {
    val names= listOf("Juan","Julian","Marvel","Shon","Liam","Duke","Miles")

    val person1 =personObjects("Glenn",20,14, 50)
    val person2 =personObjects("Jane",20, 17, 49)
    val person3 =personObjects("Mary",19, 11, 60)
    val person4 =personObjects("Liam",21, 15, 51)
    var person= listOf<personObjects>(person1,person2,person3,person4)
    var pple=person.sortedByDescending {person->person.age}
    println(pple)
    var a = Vehicles("KDA880K", 55)
    var b = Vehicles("KBM230G",40)
    var c  =Vehicles("KCF343P",60)
    var d = Vehicles("KFD343V",90)
    var allVehicles= listOf(a,b,c,d)
    println(vehicleList(allVehicles))


}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun  listOfStrings(string:List<String>):List<String> {
    string.forEachIndexed { index, s ->
        if (index % 2 == 0) {
            println(s)
        }
    }
    return string
}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height (2 points)
fun peoplesHeightMeters(){
    var height= mutableListOf(4.8,8.0,7.8,6.5)
        println(height.average())
        println(height.sum())

    }
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age (2 points)
class personObjects(var name:String,var age:Int,var height:Int,var weight:Int)






// Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//(1 points)
fun addpeople(topple:List<personObjects>):List<Any> {
    return listOf()


}

//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Vehicles(var registration:String, var mileage:Int)
fun vehicleList(vehicle:List<Vehicles>):Int {
    var avg = 0
    vehicle.forEach { car ->
        car.mileage
        avg += car.mileage
    }
    var totalAvg = vehicle.count()
    return totalAvg
}