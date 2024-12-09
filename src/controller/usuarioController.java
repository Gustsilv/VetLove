package controller;

import java.util.Scanner;

import interfaces.RepositorioUsuarios;
import model.Usuario;

public class usuarioController {
    RepositorioUsuarios usuarios;
    Usuario usuario =  new Usuario();
    Scanner leia = new Scanner(System.in);
    String loginUsuario;
    int id_usuario;
}
