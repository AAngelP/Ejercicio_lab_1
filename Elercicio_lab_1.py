import os
def Division():
    a = int (input (f"ingrese el valor del dividendo: "))
    b = int (input (f"ingrese el valor del divisor: "))
    c=0
    d=a
    while a>=b:
        a-=b
        c+=1
    print (f"la division de {d} / {b} es: {c}")

def Multiplicacion():
    print (f"ingrese los valores")
    a = int (input ())
    b = int (input ())
    d = a 
    for c in range (1,b):
        a += d
    print (f"la multiplicacion de {d} x {b} es: {a}")

def Factorial():
    print(f"Ingrese un numero: ")
    a = int(input ())
    c = a
    for i in range (1,a):
        c*=i
    print(f"El factorial de {a} es: {c}")

b = 1
while b==1:
    print (f"   Menu")
    print (f"1.- Division.")
    print (f"2.- Multiplicacion.")
    print (f"3.- Factorial.")
    print (f"4.- Salir.")
    print (f"Seleccione una opcion")
    a = int(input())
    if a==1:
        Division()
        print (f"Presione enter para continuar")
        a = input()
        os.system ("cls")
    elif a==2:
        Multiplicacion()
        print (f"Presione enter para continuar")
        a = input()
        os.system ("cls")
    elif a==3:
        Factorial()
        print (f"Presione enter para continuar")
        a = input()
        os.system ("cls")
    elif a==4:
        b = 0
    else:
        print(f"El valor no es valido") 
    


