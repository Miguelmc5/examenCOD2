fun main(){
    var park1=Parking()
    println(park1)
    //Pone en la variable park1 un objeto de tipo Parking con los valores por defecto y luego lo muestra por pantalla

    var car1=Car()
    println(car1)
    //Pone en la variable car1 un objeto de tipo Car con los valores por defecto y luego lo muestra por pantalla

    var gar1=Garage(Parking(),Car())
    println(gar1)
    //Pone en la variable gar1 un objeto de tipo Garage con los valores por defecto y luego lo muestra por pantalla

    var gar2=Garage(Parking(),Car("A 2345 BC",18.30F,23.45F))
    println(gar2)
    //Pone en la variable gar2 un objeto de tipo Garage con los valores de aparcamiento por defecto y otros concretos en Car


}