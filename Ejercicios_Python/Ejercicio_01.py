def Ejercicio_01 () :
    
    print("Calcular el area del triángulo")

    #Entrada
    base = float(input("base: "))
    altura = float(input("altura: "))
    #Proceso
    area=(base*altura)/2
    #Salida
    print(f"El area del triángulo es:",area)


def Ejercicio_02 () :

    print("Adquisición de dolares") 
     
    #Definir datos
    dolar:float =3.77
    soles:float
    cambio:float
    #Datos de entrada
    soles=float(input("Ingrese cantidad de soles: "))
    #Proceso
    cambio=soles/dolar
    #Datos de salida
    print(f"Usted recibira la cantida de: {cambio}") 


def Ejercicio_03 () :

    print("Hallar la edad")

    #Definir datos
    añoActual: float = 2022
    año: float
    mes: float
    dia: float
    #Entrada
    año = float(input("Ingrese su año de nacimiento: "))
    mes = float(input("Ingrese su mes de nacimiento: "))
    dia = float(input("Ingrese su dia de nacimiento: "))
    #Proceso
    edad = (añoActual-año)
    #Salida
    print(f"tu edad es:",edad)


    print("Edad de trabajadores")

    #Entrada
    añoActual = float(input("Ingrese el año actual: "))
    año = float(input("Ingrese su año de nacimiento: "))
    #Proceso
    edad = (añoActual-año)
    #Salida
    print(f"La edad del trabajador es:",edad)


def Ejercicio_04 () :

    print("Cobro de estacionamiento")

    #Definir datos
    precio: float = 7.5
    horas: float
    cobro: float
    #Entrada
    horas = float(input("Horas de estacionamiento: "))
    #Proceso
    cobro = precio*horas
    #Salida
    print(f"El cobro por el estacionamiento es: $",cobro)


def Ejercicio_05 () :

    print("Cobro por trabajos de pintura")

    #Definir datos
    precio: float = 20
    pinturas: float
    cobro: float
    #Entrada
    pinturas = float(input("Total de trabajos de pintura: "))
    #Proceso
    cobro = (precio**pinturas)
    #Salida
    print(f"Cobro por trabajos de pintura es: ",cobro)

    
def Ejercicio_06 () :

    print("Determinar la hipotenusa de un triángulo rectángulo")

    #Definir datos
    cateto_a: float
    cateto_b: float
    hipotenusa: float
    #Entrada
    cateto_a = float(input("Ingrese el cateto_a: "))
    cateto_b = float(input("Ingrese el cateto_b: "))
    #Proceso
    hipotenusa = (cateto_a**2 + cateto_b**2)
    #Salida
    print(f"La hipotenusa es: ",hipotenusa)


def Ejercicio_07 () :

    print("Costo de boleto de un viaje")

    #Entrada
    kilómetros = float(input("Escribe los kilómetros a recorrer: "))
    precio = float(input("Escribe el precio por kilómetro: "))
    #Proceso
    total = kilómetros*precio
    #Salida
    print("El total a pagar por ",kilómetros, "kilómetros es: ",total)


def Ejercicio_08 () :

    print("Hallar la distancia que tarda una persona")

    #Definir datos
    tiempo: float
    distancia: float
    velocidad: float
    #Entrada
    distancia = float(input("Escribe la distancia recorrida en kilómetros: "))
    velocidad = float(input("Escribe la velocidad en kilómetros por hora: "))
    #Proceso
    tiempo = distancia/velocidad
    #Salida
    print(f"El tiempo por ",distancia, "kilómetros recorridos es: ",tiempo, "horas") 


def Ejercicio_09 () :

    print("Detreminar el costo de una llamada")

    #Definir datos
    minutos: float
    precio: float
    total: float
    #Entrada
    minutos = float(input("Escribe el tiempo de la llamada en minutos: "))
    precio = float(input("Escribe el precio por minuto de la llamada: "))
    #Proceso
    total = minutos*precio
    #Salida
    print(f"El total a pagar por ",minutos, "minutos de la llamada es: ",total)


def Ejercicio_10 () :

    print("Calcular el area de un trapecio")

    #Definir datos
    basemayor: float
    basemenor: float
    altura: float
    #Entrada
    basemayor = float(input("Ingrese la basemayor: "))
    basemenor = float(input("Ingrese la basemenor: "))
    altura  = float(input("Ingrese la altura del trapecio: "))
    #Proceso
    area = ((basemayor + basemenor )* altura ) / 2
    #Salida
    print("El area del trapecio es: ",area)


    


