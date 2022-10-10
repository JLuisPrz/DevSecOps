import datetime

class Cajero:

    def __init__(self):
        self.saldo = 1000
        self.movimientos = {}

    def consultar(self):
        if self.saldo > 0:
            print("Su saldo actual es de: " + str(self.saldo))
        else:
            print("No cuenta con fondos")

    def retirar(self):
        if self.saldo > 0:
            print("Ingrese la cantidad de dinero a retirar: ")
            retiro = float(input())
            if retiro > 0:
                if retiro <= self.saldo:
                    self.saldo = self.saldo - retiro
                    self.movimientos["Saldo anterior: " + str(self.saldo + retiro) + " | Retiro: " + str(retiro) + " | Saldo actual: " + str(self.saldo) + " | Fecha: "] = str(datetime.datetime.now())
                    print("Su saldo actual es de: " + str(self.saldo))
                else:
                    print("Saldo insuficiente")
            else:
                print("Ingrese una cantidad correcta")


        else:
            print("No tiene saldo a retirar")

    def historico(self):
        for clave in self.movimientos:
            print(clave, self.movimientos[clave])
