package sistema_de_supermercado;

public class TipoUsuario {

    /**
     * Parâmetros para descrição do nivel de acesso do usuário no sistema
     */
    public static final int USUARIO_FUNCIONARIO_INT = 1;
    public static final int USUARIO_GERENTE_INT = 2;
    public static final int USUARIO_CHEFE_INT = 3;
    
    public static final String USUARIO_FUNCIONARIO_STRING = "funcionario";
    public static final String USUARIO_GERENTE_STRING = "gerente";
    public static final String USUARIO_CHEFE_STRING = "chefe";
    
    public static final String usuarioFuncionarioToString(){
        return "1";
    }
    
    public static final String usuarioGerenteToString(){
        return "2";
    }
    
    public static final String usuarioChefeToString(){
        return "3";
    }
    
    public static String textUsuarioString(String s){
        if(s.toLowerCase().equals(USUARIO_FUNCIONARIO_STRING) || s.equals(usuarioFuncionarioToString())){
            return "1";
        }    
        if(s.toLowerCase().equals(USUARIO_GERENTE_STRING) || s.equals(usuarioGerenteToString())){
            return "2";
        }
        if(s.toLowerCase().equals(USUARIO_CHEFE_STRING) || s.equals(usuarioChefeToString())){
            return "3";
        }
        
        return null;
    }
    
    public static Integer textUsuarioInt(String s){
        if(s.toLowerCase().equals(USUARIO_FUNCIONARIO_STRING) || s.equals(usuarioFuncionarioToString())){
            return USUARIO_FUNCIONARIO_INT;
        }    
        if(s.toLowerCase().equals(USUARIO_GERENTE_STRING) || s.equals(usuarioGerenteToString())){
            return USUARIO_GERENTE_INT;
        }
        if(s.toLowerCase().equals(USUARIO_CHEFE_STRING) || s.equals(usuarioChefeToString())){
            return USUARIO_CHEFE_INT;
        }
        
        return null;
    }
}
