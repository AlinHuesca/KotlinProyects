fun main(){
    var nombre : String? = null;
    println("Imprimiendo el valor nulo de nombre:")
    println(nombre);
    //nombre = "Ginger";
    //println(nombre.length);

    //var longitud = nombre?.length ?: 0;
    //println("longitud de nombre:");
    //println (longitud);

    try{
        println("nombre: $nombre");
    } catch(: NullPointerException){
        println("Ha ocurrido un error");
        println(exeption);
    } finally {
        println("Lo que esta en finally, se ejcuta siempre");
    }

var longitud = -1
println("--------try--------");

    try{
        var longitud = nombre.length;
    } catch (error : NullPointerException){
        //hubo un error, no se peuede obtener la longitud del nombre
        var longitud = 0;
        println("Longitud: $longitud");
    } finally {
        //println("valor de longitud: $longitud");
        println("Finally!");
    }
    println("Termina prueba de try");
}
