import java.util.Scanner
fun main(){
    val read = Scanner(System.`in`)
    val robo = Robot("FRIDAY","ASHU")

    println("Enter which function you done by FRIDAY")
    println("1.Ring the alarm\n2.Make coffee\n3.Heat the water\n4.Pack your bag\n5.Cook breakfast and lunch\n6.Iron the clothes")
    val choose = read.nextInt()
    when(choose){
        1->{
            robo.ringalarm("6:00 AM")
            println()
        }
        2->{
            robo.coffee(Coffee(blackcoffee = true, sugar = 3))
            println()
        }
        3->{
            robo.waterheat(35)
            println()
        }
        4->{
            robo.bagpack(4)
            println()
        }
        5->{
            robo.food()
            println()
        }
        6->{
            robo.ironcloth("blue","brown")
        }
        else->{
            println("Enter a valid choose")
        }
    }
}