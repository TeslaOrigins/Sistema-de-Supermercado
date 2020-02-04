package sistema_de_supermercado;

public class TipoUsuario {

    /**
     * Parâmetros para descrição do nivel de acesso do usuário no sistema
     */
    public static final int USUARIO_FUNCIONARIO = 1;
    public static final int USUARIO_GERENTE = 2;
    public static final int USUARIO_CHEFE = 3;
    
    public static final String usuarioFuncionarioToString(){
        return "1";
    }
    
    public static final String usuarioGerenteToString(){
        return "2";
    }
    
    public static final String usuarioChefeToString(){
        return "3";
    }
}
