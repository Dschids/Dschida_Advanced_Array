fun main(args: Array<String>) {

    val ammo = arrayOf("Pistol", "Rifle", "Shotgun", "Sniper Rifle", "Energy Cells")
    var qty = arrayOf("30", "90", "20", "15", "25")
    var combArray = arrayOf<Array<String>>()
    combArray += ammo
    combArray += qty
    println("Ammo Types:")
    for (item in ammo) {
        println(item)
    }
    print("Would you like to see the qty of a specific ammo type? y/n ")
    var specific = readln()!!.toString()
    // while loop so the user can adjust see/adjust values as much as they'd like
    while (specific == "y") {
        // ask user for ammo type they want to see
        print("Please enter the ammo you wish to view: ")
        var type = readln()!!.toString()
        var contained = ammo.contains(type)
        // make sure inputted ammo type is in array ammo
        while (!contained) {
            println("That is not a valid ammo type! (Ammo types are case sensitive)")
            print("Please enter the ammo you wish to view: ")
            type = readln()!!.toString()
            contained = ammo.contains(type)
        }
        // initialize variables for elements at selected index location
        var index = ammo.indexOf(type)
        var itemA = combArray[0][index]
        var itemB = combArray[1][index]
        // print out the selected ammo type and it's quantity
        println("Ammo Type       Qty")
        println("$itemA       $itemB")
        print("Would you like to adust the quantity of this ammo type? y/n ")
        var adjust = readln()!!.toString()
        // if the user wants to change ammo count
        if (adjust == "y"){
            println("Enter the amount you would like to add or subtract." +
            " (enter a positive number to add or a negative to subtract)")
            var change = readln()!!.toInt()
            var new = itemB.toInt() + change
            // check if adjusted qty is less than zero, if yes tell user and set new
            // qty to 0 then display new qty, if not display new qty
            if (new < 0){
                println("Subtracting that amount results in a negative number:" +
                " Setting Qty to zero")
                itemB = "0"
                println("Ammo Type       Qty")
                println("$itemA       $itemB")
            }
            else {
                itemB = new.toString()
                println("Ammo Type       Qty")
                println("$itemA       $itemB")
            }
        }
        // check if user wants to continue checking/adjusting quantity
        println("Would you like to check the quantity of a different ammo type?")
        specific = readln()!!.toString()
    }



}