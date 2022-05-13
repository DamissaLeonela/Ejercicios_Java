def Ejercicio_01 () :
    #Definir variables
    examen : float
    entrevista : float
    test : float
    n1 : float
    n2 : float
    n3 : float
    promedio : float
    mensaje : float

    #Datos de entrada
    examen = float (input("Ingrese la nota del examen de conocimiento: "))
    entrevista = float (input("Ingrese la nota de la entrevista personal: ")) 
    test = float (input("Ingrese la nota del test psicologico: "))

    #Proceso
    n1 = examen * 0.40
    n2 = entrevista * 0.35
    n3 = test *  0.25
    promedio = n1 + n2 + n3
    if promedio >= 17 : 
        mensaje = ("Su nivel es 4")
    elif promedio >= 14 and promedio < 17 : 
        mensaje = ("Su nivel es 3") 
    elif promedio >= 11 and promedio < 14 : 
        mensaje = ("Su nivel es 2")   
    else :
        mensaje = ("Su nivel es 1 ya no puede obtener la vacante: ")  

    #Datos de salida
    print(f"La nota final es:{ notafinal }")
    print(mensaje)      



def ejercici_o2 ():
    #Definir variable
    descuento : float
    igv : float
    pbase : float
    monto : float
    pff : float
   
    #Datos de entrada
    pbase = float(input("Ingrese el precio base: "))
    
    #Proceso
    if pbase >= 2000:
        descuento=pbase * 0.10
    elif pbase >= 1000 and pbase <= 2000:
        descuento=pbase*0.5
    elif pbase >= 500 and pbase <1000:
        descuento = pbase * 0.2
    else:
        descuento = pbase * 0
    pfinal = pbase - descuento
    igv = pfinal * 0.18
    pff = pfinal + igv
    
    #Datos de salida
    print(f"El descuento es: {descuento}")
    print(f"El igv es: {igv}")
    print(f"El precio es: {pff}")   



def ejercici_o3 ():
    #Definir variables
    numerouno : float
    numerodos : float
    signo : str 
    total : float
     
    
    #Datos de entrada
    numerouno = float(input("Ingrese el primer numero: "))
    numerodos = float(input("Ingrese el segundo numero: "))
    signo=str(input("Ingrese el signo: "))
    
    #Proceso
    if signo == "+":
        total = numerouno + numerodos
    elif signo == "-":
        total = numerouno-numerodos
    elif signo == "/":
        total = numerouno / numerodos
    elif signo == "*":
        total = numerouno * numerodos
    elif signo == "^":
        total = numerouno ** numerodos
    elif signo == "R":
        total = numerouno ** (dato2**-1)
    else:
        total=9
    
    #Datos de salida
    print(f"El resultado es:{total}")



def ejercici_o4 ():
    #Definir variables
    edad : float
    genero : float
    vacuna : str

    #Datos e entrada
    edad = int (imput("Ingrese la cantidad de años: "))
    genero = int (imput("Ingrese su genero (masculino o femenino): "))

    #Proceso
    if edad > 70 :
        vacuna = (f"su vacuna es de tipo C")
    elif edad > 16 and edad <= 59:
       if genero <= 1:
           vacuna = (f"Su vacuna es de tipo B") 
       elif genero <=2:
           vacuna = (f"Su vacuna es de tipo A")
    elif edad > 16:
        vacuna = (f"vacuna de tipo A")  

    #Datos de salida      
    print (f"{vacuna}")             

    
