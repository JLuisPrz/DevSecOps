from Cajero import Cajero

cajero = Cajero()
flag = True

print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
print("~~~~~~~~~~~~~ Bienvenid@ ~~~~~~~~~~~~ ")
print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")

# Inicio de sesión
# Delimitar el número de inicios de sesión a 3 intentos
print("Ingrese su nombre:")
nombre = input()

for i in range(1, 4):
    print("Por favor ingrese su PIN:")
    pass_ = input()

    # Verificar la PIN
    if pass_ == "1235":
        flag = True
        break
    else:
        if i <= 2:
            print("El PIN es incorrecto, aun tienes " + str(3-i) + " intentos")
        else:
            print("Ha superado el limite de intentos")
            exit()
            flag = False

if flag:
    print("Bienvenido ", nombre)

    respuesta = 's'
    while respuesta == 's':
        print("Selecciona la opción que desee")
        print("1. Consultar saldo")
        print("2. Retirar Saldo")
        print("3. Histórico de movimientos")

        opcion = int(input())

        if opcion == 1:
            print("~~~~~~~~ Consultar ~~~~~~~~")
            cajero.consultar()
        elif opcion == 2:
            print("~~~~~~~~ Retirar ~~~~~~~~")
            cajero.retirar()
        elif opcion == 3:
            print("~~~~~~~~ Histórico de movimientos ~~~~~~~~")
            cajero.historico()
        else:
            print("La opción que eligio no es correcta")
        
        print("Continuar: s/n")
        respuesta = input()
    
    print("Gracias por su preferencia")
