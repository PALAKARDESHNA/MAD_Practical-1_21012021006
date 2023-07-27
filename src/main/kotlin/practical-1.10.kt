class Car {
    var type: String = ""
    var model: String = ""
    var price: Double = 0.0
    var owner: String = ""
    var milesDrive: Int = 0

    constructor()

    constructor(carType: String, carModel: String, carPrice: Double, carOwner: String, carMilesDrive: Int) {
        type = carType
        model = carModel
        price = carPrice
        owner = carOwner
        milesDrive = carMilesDrive
    }

    fun getCarPrice(): Double {
        return price
    }

    fun displayCarInfo() {
        println("Car Information:")
        println("Type: $type")
        println("Model: $model")
        println("Price: $price")
        println("Owner: $owner")
        println("Miles Driven: $milesDrive")
    }

    fun getOriginalCarPrice(): Double {
        return price
    }

    fun getCurrentCarPrice(depreciationPercentage: Double): Double {
        return price * (1 - depreciationPercentage / 100)
    }

    fun getCarInformation(): Map<String, Any> {
        return mapOf(
            "Type" to type,
            "Model" to model,
            "Price" to price,
            "Owner" to owner,
            "Miles Driven" to milesDrive
        )
    }
}

fun main() {
    // Using the default constructor to create a Car object
    println("ardeshna palak//21012021006")

    val car1 = Car()
    car1.type = "SUV"
    car1.model = "Toyota Highlander"
    car1.price = 35000.0
    car1.owner = "ARDESHNA PALAK"
    car1.milesDrive = 15000

    // Using the parameterized constructor to create another Car object
    val car2 = Car("Sedan", "Honda Civic", 28000.0, "Jane Smith", 10000)

    // Accessing properties and functions of the Car objects
    displayCarInfo(car1)

    // Get the original car price
    val originalPrice = car1.getOriginalCarPrice()
    println("Original Car Price: $originalPrice")

    // Get the current car price with 10% depreciation
    val currentPrice = car1.getCurrentCarPrice(10.0)
    println("Current Car Price (10% depreciation): $currentPrice")

    // Get car information as a map
    val carInfo = car1.getCarInformation()
    println("Car Information as Map: $carInfo")
}

fun displayCarInfo(car: Car) {
    car.displayCarInfo()
}
