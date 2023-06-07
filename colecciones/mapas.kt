//trabajando con mapas
fun  main() {
    //mapa inmutable
    val ladas : Map<Int, String> = mapOf(
        1 to "USA",
        34 to "España",
        52 to "Mexico",
        233 to "Ghana"
    );
    //imprimiendo el conjuntode pares claves-valor
    println(ladas);

    //imprimiendo el mapa usando un for
    for((key, value) in ladas){
        println("la clave ladas de $value es $key");
    }

    //imprimiendo el mapa usando lamba
    ladas.forEach {(k,v) -> println("$k -> $v")}

    //recuperar un solo elemento del mapa
    println(ladas.get(52));
    println(ladas[52]);

    //recuperar su tamaño, cuantos pares hay en el mapa
    println("Tamaño: ${ladas.size}");
    //recuperar solo las claves
    println("Claves del mapa: ${ladas.keys}");
    //recuperar solo los valores
    println("Valores del mapa: ${ladas.values}");
    //recuperar las entradas
    println ("Entradas del mapa: ${ladas.entries}");
    //recuper un valor si existe, sino, enviael default
    println("Valores de la lada 48: ${ladas.getOrDefault(48,"pais desconocido")}");
    //comprobar si el mapa esta vacio
    println("Mapa vacio: ${ladas.isEmpty()}");
    //comprobar si existe una clave especifica en el mapa
    println("existe la clave lada 86: ${86 in ladas}");
    //comprobar si existe un valor en el mapa
    println("Existe el valor Mexico en el mapa: ${"Mexico" in ladas.values}");

    //mapa mutable
    var nums = mutableMapOf(
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4,
        );

        println ("Mapa de numeros: $nums");
        //eliminar valores del mapa
        nums.remove("two");
        //agregando par al mapa
        nums["six"] = 6;
        println("mapa nuevo de numeros: $nums");


        var sortedNums = nums.toSortedMap();
        println("Mapa ordenado: $sortedNums");

        //reto:
        //crear directorio español - ingles usando un mapa
        // 1. Funcion para Crear o cargar el direccionario
        // 2. Funcion  para consulta, reciba una palabra en español
        // y regrese su traduccion, sino existe traduccion, un valor por default
        // 3. imprimir el diccionario
}