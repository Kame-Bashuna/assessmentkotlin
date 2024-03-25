fun main() {
println(addiction(10,10,10))
   isPalindrome("madam","amam")
    isPalindrome("dama","maa")
    calculateSphere()
}

//n02
fun addiction(numbers1:Int,numbers2:Int,numbers3:Int):Int{
    var numb= arrayOf(10,10,10)
    var sum=numbers1+numbers2+numbers3
    return(sum)
    var average=(numbers1+numbers2+numbers3)%3
    return(average)
}

//no3
fun isPalindrome(word1:String,word2:String):Boolean {
    if (word1 == "madam")
        println(true)
    else(word2 =="madam grace")

         return (false)

}

//no4
fun calculateSphere(){
    var volume=4/3*3.14*14*14*14
    println(volume)
}
