public class Empregado {
    private String nome;
    private double salario;
    private Empresa emp = new Empresa();
    /*public Empregado(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

     */
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalario(double salario){
     this.salario = salario;
    }
    public void setEmpresa(Empresa emp){
        this.emp = emp;
    }
    public String getNome(){
        return nome;
    }
    public double getSalario(){
        return salario;
    }
    public Empresa getEmpresa(){
        return emp;
    }
}
