package br.com.sptech.modelo.banco.jdbc.modelo;

import br.com.sptech.modelo.banco.jdbc.dao.UsuarioDao;

public class ModelFuncionario extends ModelUsuario {

    public ModelFuncionario() {
    }

    public ModelFuncionario(Integer idUsuario, String nome, String email, String senha, String fraseSeguranca, String area, String cargo, Integer fkEmpresa, Integer fkTipoUsuario) {
        super(idUsuario, nome, email, senha, fraseSeguranca, area, cargo, fkEmpresa, fkTipoUsuario);
    }

    @Override
    public String toString() {
        return "FuncionarioModel{}";
    }
}

