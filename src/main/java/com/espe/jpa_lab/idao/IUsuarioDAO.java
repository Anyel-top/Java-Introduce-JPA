package com.espe.jpa_lab.idao;

import com.espe.jpa_lab.model.Usuario;

import java.util.List;

public interface IUsuarioDAO {
    void guardar(Usuario usuario);
    void editar(Usuario usuario);
    void eliminar(Usuario usuario);
    Usuario buscarUsuario(int id);
    List<Usuario> ObtenerUsuarios();
}
