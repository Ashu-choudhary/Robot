class Robot(val name:String, val owner:String) {
    init {
        println("Hii $owner, I'am $name Your personal robot")
    }

    fun ringalarm(time:String){
        println("\nWake up $owner It's time $time to wake up ")
    }

    fun coffee(c:Coffee){
        if(c.blackcoffee){
            println("Here's your Black Coffee with ${c.sugar} table spoon of Sugar")
        }
        else{
            println("Here's your Milk Coffee with ${c.sugar} table spoon of Sugar")
        }
        println("Done your Coffee is ready")
    }

    fun waterheat(temp:Int){
        println("Your water is ready to bath with $temp%C Temperature")
    }

    fun bagpack(day:Int){
        val sub = arrayListOf("JAVA","SQL","PYTHON","KOTLIN","HTML","RUBY")

        val bag = mutableListOf<String>()

        when(day){
            1-> {
                bag.add(sub[0])
                bag.add(sub[1])
            }
            2-> {
                bag.add(sub[2])
                bag.add(sub[0])
            }
            3-> {
                bag.add(sub[5])
                bag.add(sub[3])
            }
            4-> {
                bag.add(sub[4])
                bag.add(sub[1])
            }
            5-> {
                bag.add(sub[5])
                bag.add(sub[2])
            }
            6-> {
                bag.add(sub[1])
                bag.add(sub[4])
            }
            else->{
                println("It's Sunday ")
                return
            }
        }
        println("Your backpack is ready with $bag")
    }

    fun food(){
        val breakfast = listOf("Fruits", "CornFlakes", "Oats", "Cereals", "Eggs & Banana")
        val lunch = listOf("Rice And Potato", "Rice and Spinach", "Chappati and Corn", "Butter Chicken", "Biryani")

        println("Your today's BreakFast is ${breakfast.random()} and Lunch is ${lunch.random()}")
    }

    fun ironcloth(shirt:String,pants:String){
        val shirtcolor = listOf("white", "blue", "black", "pink")
        val pantcolor = listOf("black","brown","offwhite","grey")

        if(shirtcolor.contains(shirt) && pantcolor.contains(pants)){
            println("Your $shirt color shirt and $pants color is ready")
        }
        else if (shirtcolor.contains(shirt)){
            println("You don't have $pants color of pant")
        }
        else{
            println("You don't have $shirt color of shirt")
        }
    }
}