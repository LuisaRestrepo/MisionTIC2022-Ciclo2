# -*- coding: utf-8 -*-
"""
Created on Tue Jun 22 19:30:20 2021

@author: USUARIO
"""
#https://www.visualtk.com/

from Vehiculo import *
from VehiculoPrincipal import *
from tkinter import *
from tkinter import messagebox
#from VehiculoInterfazLogin import *

p = []
usuarios = { "usuario": ["luisa"],
             "contraseña": ["gato"]
           }

def crearParqueadero():
    try:
        global p
        p = Parqueadero(int(Pisos.get()),int(Espacios.get()),int(Motos.get()),int(Carros.get()))
        x = p.estadoParqueadero()
        resultado2.configure(text=x)
        crear.delete()
        messagebox.showinfo("Parqueadero","Parqueadero creado con éxito")
    except:
        messagebox.showinfo("Parqueadero","Ingrese la información solicitada")
        
def parquear():
    try:
        x = p.parqueaVehiculo(int(ePisos.get()), int(eEspacios.get()), int(seleccionado.get()), ePlaca.get())
        y = p.estadoParqueadero()
        resultado2.configure(text=y)
        messagebox.showinfo("Parqueadero",x)
    except:
        messagebox.showinfo("Parqueadero","Verifique información")
        
def pago():
    y = p.matriz[int(ePisos.get())][int(eEspacios.get())].pago()
    resultado2.configure(text=y)
    
def estado():
        x = p.estadoParqueadero()
        resultado2.configure(text=x)
        
def descargar():
    p.descargarArchivo()
    messagebox.showinfo("Parqueadero","Archivo descargado")
    
def infoVehiculo():
    y = p.matriz[int(ePisos.get())][int(eEspacios.get())].info()
    resultado2.configure(text=y)
    
def mainParqueadero():
    #window = Tk()
    global window
    window = Toplevel(login_screen)##########
    window.title("PARQUEADERO MisionTIC2022")
    window.geometry('800x400')
    #login_screen.destroy()
    ##########
    #FRAMES 
    inicio = Frame(window, bg="CadetBlue2", width=800, height=200)
    inicio.grid(row=0)
    pagina = Frame(window, bg="khaki1", width=800, height=200)
    pagina.grid(row=1)
    #FRAMES DE PAGINA
    menu = Frame(pagina, bg="azure", width=390, height=190,pady=1)
    menu.grid(row=0,column=0)
    info = Frame(pagina, bg="lavender", width=390, height=190,pady=1)
    info.grid(row=0,column=1)
    
    #LABELS DE INICIO
    label1 = Label(inicio,text="Ingrese información del parqueadero:")
    label1.grid(row=0,columnspan=8,padx=20, pady=20)
    
    #SOLICITUD PISOS
    lblPisos = Label(inicio,text="Ingrese pisos:")
    lblPisos.grid(row=1,column=1,padx=5, pady=5)
    global Pisos
    Pisos = Entry(inicio,width=10)
    Pisos.grid(row=2,column=1,padx=5, pady=5)
    #SOLICITUD ESPACIOS
    lblEspacios = Label(inicio,text="Ingrese espacios:")
    lblEspacios.grid(row=1,column=2,padx=5, pady=5)
    global Espacios
    Espacios = Entry(inicio,width=10)
    Espacios.grid(row=2,column=2,padx=5, pady=5)
    #SOLICITUD MOTOS
    lblMotos= Label(inicio,text="Ingrese valor motos:")
    lblMotos.grid(row=1,column=3,padx=5, pady=5)
    global Motos
    Motos = Entry(inicio,width=10)
    Motos.grid(row=2,column=3,padx=5, pady=5)
    #SOLICITUD CARROS
    lblCarros = Label(inicio,text="Ingrese valor carros:")
    lblCarros.grid(row=1,column=4,padx=5, pady=5)
    global Carros
    Carros = Entry(inicio,width=10)
    Carros.grid(row=2,column=4,padx=5, pady=5)
    #Bucle principal encargado de gestionar todos los eventos
    
    #BOTON CREAR PARQUEADERO
    crear2 = Button(inicio, text="Crear Parqueadero", bg="OliveDrab1", command=crearParqueadero)
    crear2.grid(row=2,column=6,padx=5, pady=5)
    #FRAMES LADO IZQUIERDO
    crear = Frame(menu, bg="peach puff", width=400, height=200)
    crear.grid(row=0)
    botones = Frame(menu, bg="khaki1", width=400, height=200)
    botones.grid(row=1)
    
    #SOLICITUD PISOS
    nota = Label(crear,text="Ingrese información del vehiculo a parquear")
    nota.grid(row=0,columnspan=6,padx=5, pady=5)
    
    uPisos = Label(crear,text="Piso")
    uPisos.grid(row=1,column=1,padx=5, pady=5)
    global ePisos
    ePisos = Entry(crear,width=10)
    ePisos.grid(row=2,column=1,padx=5, pady=5)
    uEspacios = Label(crear,text="Espacio")
    uEspacios.grid(row=1,column=2,padx=5, pady=5)
    global eEspacios
    eEspacios = Entry(crear,width=10)
    eEspacios.grid(row=2,column=2,padx=5, pady=5)
    uPlaca = Label(crear,text="Placa")
    uPlaca.grid(row=1,column=3,padx=5, pady=5)
    global ePlaca
    ePlaca = Entry(crear,width=10)
    ePlaca.grid(row=2,column=3,padx=5, pady=5)
    
    frame_radios = Frame(crear)
    global seleccionado
    seleccionado = IntVar()
    rad1 = Radiobutton(frame_radios, text='Carro',  value=1, variable=seleccionado)
    rad2 = Radiobutton(frame_radios, text='Moto', value=2, variable=seleccionado)
    rad1.grid(column=1, row=6)
    rad2.grid(column=1, row=7)
    frame_radios.grid(column=4, row=2,padx=5, pady=5)
    
    
    #BOTONES FRAME BOTONES
    parquear3 = Button(botones, text="Parquear Vehiculo", bg="Orange2", command=parquear)
    parquear3.grid(row=0,column=0,padx=5, pady=5)
    btnPago = Button(botones, text="Pago", bg="Orange2", command=pago)
    btnPago.grid(row=0,column=1,padx=5, pady=5)
    btnEstado = Button(botones, text="Estado Parqueadero", bg="Orange2", command=estado)
    btnEstado.grid(row=1,column=0,padx=5, pady=5)
    btnDescargar = Button(botones, text="Descargar", bg="Orange2", command=descargar)
    btnDescargar.grid(row=1,column=1,padx=5, pady=5)
    btninfoVehiculo = Button(botones, text="Info Vehiculo", bg="Orange2", command=infoVehiculo)
    btninfoVehiculo.grid(row=2,column=1,padx=5, pady=5)
    
    #FRAME LADO DERECHO
    global resultado2
    resultado2 = Label(info,text="Info", font="Helvetica 16 bold italic", justify=LEFT)
    resultado2.grid(row=1,column=0,padx=5, pady=5)
    
    #window.mainloop()
    
    
def login_verify():
    username1 = username_verify.get()
    password1 = password_verify.get()
    username.delete(0, END)
    password.delete(0, END)
    
    if username1 in usuarios['usuario']:
        if password1 in usuarios['contraseña']:  
            mainParqueadero()
        else:
            messagebox.showinfo("Login","Contraseña no reconocida")
    else:
        messagebox.showinfo("Login","No se encuentra el usuario")
 

def loginAccount():
    global login_screen
    login_screen = Tk()
    login_screen.title("Login")
    login_screen.geometry("300x250")
    Label(login_screen, text="Ingrese la información").pack()
    Label(login_screen, text="").pack()
       
    global username_verify
    global password_verify
    username_verify = StringVar()
    password_verify = StringVar()
    global username
    global password
 
    Label(login_screen, text="Usuario * ").pack()
    username = Entry(login_screen, textvariable=username_verify)
    username.pack()
    Label(login_screen, text="").pack()
    Label(login_screen, text="Contraseña * ").pack()
    password = Entry(login_screen, textvariable=password_verify, show= '*')
    password.pack()
    Label(login_screen, text="").pack()
    Button(login_screen, text="Login", width=10, height=1, command = login_verify).pack()
        
    Button(text="Register", height=1, width=10, command=register).pack()#Tarea
    login_screen.mainloop()
    
    
def register():
    global register_screen
    register_screen = Toplevel(login_screen)
    register_screen.title("Registro")
    register_screen.geometry("300x250")
    global username_entry
    global password_entry 
    Label(register_screen, text="Ingrese los detalles", bg="blue").pack()
    Label(register_screen, text="").pack()
    username_lable = Label(register_screen, text="Usuario * ")
    username_lable.pack()
    username_entry = Entry(register_screen, textvariable=username)
    username_entry.pack()
    password_lable = Label(register_screen, text="Contraseña * ")
    password_lable.pack()
    password_entry = Entry(register_screen, textvariable=password, show='*')
    password_entry.pack()
    Label(register_screen, text="").pack()
    Button(register_screen, text="Register", width=10, height=1, bg="blue", command = register_user).pack()
    
def register_user():
    global usuarios
    print(usuarios)
    user = username_entry.get()
    password = password_entry.get()
    usuarios["usuario"].append(user)
    usuarios["contraseña"].append(password)
    print(usuarios)
    username_entry.delete(0, END)
    password_entry.delete(0, END)
 
    Label(register_screen, text="Registration Success", fg="green", font=("calibri", 11)).pack()
    
    
loginAccount()