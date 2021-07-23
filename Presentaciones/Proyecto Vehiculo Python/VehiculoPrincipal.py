# -*- coding: utf-8 -*-
"""
Created on Tue Jun 22 19:29:34 2021

@author: USUARIO
"""
import csv
import datetime
from Vehiculo import *

class Parqueadero:
    def __init__(self,pisos,espacios,pCarro,pMoto):
        self.pisos = pisos
        self.espacios = espacios
        self.pCarro = pCarro
        self.pMoto = pMoto
        Carro.precio = pCarro
        Moto.precio = pMoto
        self.matriz = [[0] * espacios for i in range(pisos)]

    def imprimeVacios(self):
        x = ""
        for i in range(len(self.matriz)):
            for j in range(len(self.matriz[0])):
                if(self.matriz[i][j]==0):
                    x = x + f"Piso {i}, Espacio {j} -> Está vacío, \n"
        return x

    def parqueaVehiculo(self,p,e,t,pl):
        try:
            if(self.matriz[p][e] == 0):
                if(t == 1):
                    self.matriz[p][e] = Carro(pl)
                elif(t == 2):
                    self.matriz[p][e] = Moto(pl)
                else:
                    return"Opción desconocida"
            else:
                return"LUGAR NO DISPONIBLE"
        except IndexError:
            return "Piso y Espacio ingresado no existe!!!"
        
    def estadoParqueadero(self):
         x = ""
         for i in range(len(self.matriz)):
            for j in range(len(self.matriz[0])):
                if(self.matriz[i][j]==0):
                    x = x + f"Piso {i}, Espacio {j} -> Está vacío, \n"
                else:
                    x = x + f"Piso {i}, Espacio {j} -> {self.matriz[i][j].info()}, \n"
         return x
     
    def descargarArchivo(self):
        with open('Parqueadero.csv', 'a', newline='') as file: #w: abre en modo escritura
                writer = csv.writer(file)
                for i in range(len(self.matriz)):
                    for j in range(len(self.matriz[0])):
                        if(self.matriz[i][j]==0):
                            writer.writerow([f"Piso {i}, Espacio {j} -> Está vacío, \n"])
                        else:
                            writer.writerow([f"Piso {i}, Espacio {j} -> {self.matriz[i][j].info()}, \n"])
    
# x = Parqueadero(4,3,5000,2000)
# print(x.imprimeVacios())
# x.parqueaVehiculo(1,1,1,"FRT2342")
# x.parqueaVehiculo(0,0,2,"gty432")
# print(x.parqueaVehiculo(0,0,2,"gty432"))
# print(x.estadoParqueadero())
# x.descargarArchivo()

# print(Carro.precio)
# print(Moto.precio)
            
            

