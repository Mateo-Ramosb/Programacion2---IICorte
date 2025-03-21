class Usuario:

    def __init__(self):
        self.lista_de_usuarios = [] 

    def guardarUsuario(self, Nombre, Nickname, Clave):
        self.lista_de_usuarios.append({
            "Nombre": Nombre,
            "Nickname": Nickname,
            "Clave": Clave
        })

    def listarUsuarios(self):
        return self.lista_de_usuarios
        
        
