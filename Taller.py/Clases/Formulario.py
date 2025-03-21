from usuario import Usuario
import tkinter as tk

usuario_obj= Usuario()

ventana = tk.Tk ()

ventana.title = ("Usuarios")

ventana.resizable = (False, False)

ventana.geometry = ("1000 x 1200")

titulo = tk.Label (ventana, text = "nose", font= "Arial", fg = "black").place(x = 650, y = 10)

nombre = tk.Label (ventana, text= "Usuario:").place(x=100, y=60)

txtnombre = tk.Entry (ventana)
txtnombre.place(x=180, y=60)

nickname = tk.Label (ventana, text = "nickname:").place(x=100, y=100)

txtnickname = tk.Entry (ventana)
txtnickname.place(x=180, y=100)

clave = tk.Label (ventana, text= "clave:").place(x=100, y=140)

txtclave = tk.Entry (ventana, show= "*")
txtclave.place(x=180, y=140)

Panel_Usuario = tk.Listbox (ventana, width=50)
Panel_Usuario.place(x=100, y=300)

def guardar():
    nombre = txtnombre.get()
    nickname = txtnickname.get()
    clave = txtclave.get()
    usuario_obj.guardarUsuario(nombre, nickname, clave)
    print("Guardado:", usuario_obj.lista_de_usuarios)

    txtnombre.delete(0, tk.END)
    txtnickname.delete(0, tk.END)
    txtclave.delete(0, tk.END)

def listar():
    print("Listando:", usuario_obj.lista_de_usuarios)
    Panel_Usuario.delete(0,tk.END)
    lista = usuario_obj.listarUsuarios()
    for u in lista:
        Panel_Usuario.insert(tk.END, f"{u['Nombre']} - {u['Nickname']} - {u['Clave']}")

Boton_guardar = tk.Button (ventana, text= "Guardar", command=guardar)
Boton_guardar.place(x=650, y=200)

Boton_listar = tk.Button (ventana, text= "Listar usuarios", command=listar)
Boton_listar.place(x=750, y=200)

ventana.mainloop()