object CaesarCipher extends App{
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val Encript = (c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
  val Decript = (c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size)
  val cipher =(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))

  val s = "ASSIGNMENT" //input string
  val cipertext=cipher(Encript,s,5,alphabet)
  val plaintext=cipher(Decript,cipertext,5,alphabet)
  println("Text : " + s)
  println("Encripted text : " + cipertext)
  println("Decripted text : "+ plaintext)

}