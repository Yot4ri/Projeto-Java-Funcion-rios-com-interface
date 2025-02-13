package data;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FuncionarioDao {
    
    private Connection conn;
    private PreparedStatement st;
    private ResultSet rs;
    
    public boolean conectar(){
        String url = "jdbc:mysql://localhost:3306/exemplo_senac";
        String usuario = "root";
        String senha = ""; //Substitua pela senha correta;
        
        try{
            conn = DriverManager.getConnection(url,usuario,senha);
            return true;
        }catch (SQLException ex){
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return false;
        }
    }
    
    public int salvar (Funcionario func){
        int status;
        try{
            st = conn.prepareStatement("INSERT INTO funcionarios VALUES (?,?,?,?)");
            st.setString(1, func.getMatricula());
            st.setString(2, func.getNome());
            st.setString(3, func.getCargo());
            st.setDouble(4, func.getSalario());
            status = st.executeUpdate();
            return status; //retornar 1
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
            
    }
    
    public Funcionario consultar (String matricula){
        
        try{
            Funcionario funcionario = new Funcionario(); 
            st = conn.prepareStatement("SELECT * from funcionarios WHERE matricula = ?");
            st.setString(1,matricula);
            rs = st.executeQuery();
            //verificar se a consulta encontrou o funcionário com a matrícula informada
            if(rs.next()){ //se encontrou o funcionário, vamos carregar os dados
            
                funcionario.setMatricula(rs.getString("matricula"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setSalario(rs.getDouble("salario"));
                return funcionario;
            }else{
                return null; //No caso de não encontrar o funcionário, não haverá retorno de dados
            }
        }catch (SQLException ex){
            System.out.println("Erro ao contectar: " + ex.getMessage());
            return null;
        }
    }
        
        public boolean excluir (String matricula){
            try{
                st = conn.prepareStatement("DELETE FROM funcionarios WHERE matricula = ?");
                st.setString(1, matricula);
                st.executeUpdate();
                return true;
            } catch (SQLException ex) {
                return false;
        }
    }   
        
    public int atualizar (Funcionario func){
        int status;
        try{
            st = conn.prepareStatement("UPDATE funcionarios SET nome = ?, cargo = ?, salario = ? where matricula = ?");
            st.setString(1,func.getNome());
            st.setString(2,func.getCargo());
            st.setDouble(3,func.getSalario());
            st.setString(4,func.getMatricula());
            status = st.executeUpdate();
                    return status; //retornar 1
        } catch (SQLException ex){
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }
    }
    
    public void desconectar (){
        try{
            conn.close();
        } catch (SQLException ex){
            //Pode-se deixar vazio para evitar uma mensagem de erro desnecessária ao usuário
        }
    }
}
