// Usando funciones  que regresan valores
// y funciones que no regresan los valores

fun main(){
    val numero1 = 12;
    val numero2 = 40;

    borde("=",20);
    var resultado = suma(numero1, numero2);
    println (resultado);
    borde("*", 35);

    //Ejemplo 1 de funcion anonima
    val slogan = { r : Int -> println("Tu puedes con $resultado problemas y mas") };

    //invocar funcion anonima - forma 1
    slogan(resultado);

//resta
    val resta = { n1 : Int,n2 : Int -> n1 - n2};
    println("Resta: ${resta(12,18)}");

//tarea
//funcion anonima que encuentre el mayor de tres numeros
    val max = { n1: Int, n2: Int, n3: Int }
    println("Valor maximo:");

    //funcion anonima que calcule el promedio de tres numeros
    val promedio = {};
    println("Promedio");
//tarea
  
}





fun borde(caracter : String, veces : Int ){
    for (i in 1..veces){
        print(caracter);
    }
    println();
}
fun suma(n1: Int, n2:Int):Int{
    return n1 + n2;
}