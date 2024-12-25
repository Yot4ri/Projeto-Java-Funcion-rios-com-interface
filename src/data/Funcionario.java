package data;

public class Funcionario {
    //atributos da calsse
    private String matricula;
    private String nome;
    private String cargo;
    private double salario;
    
    //construtor da classe
    
    public Funcionario (){
    }
    
   //Getters:
    public String getMatricula(){
        return matricula;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCargo(){
        return cargo;
    }
    
    public Double getSalario(){
        return salario;
    }
    
   //Setters:
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
}
