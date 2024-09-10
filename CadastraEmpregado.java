import java.util.Scanner;

class CadastraEmpregado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o nome e depois o salário do funcionário");
        Empregado empregado = new Empregado();
        empregado.setNome(scan.next());
        empregado.setSalario(scan.nextDouble());
        System.out.println("Informe Razão Social, CNPJ e o Telefone da empresa");
        Empresa empresa = new Empresa();
        empresa.setRazaoSocial(scan.next());
        empresa.setCnpj(scan.next());
        empresa.setFone(scan.next());
       System.out.println("Seu nome é: " + empregado.getNome() + " Salário = " + empregado.getSalario());
       System.out.println("Razão Social: " + empresa.getRazaoSocial() +  " CNPJ: " + empresa.getCnpj() + " Telefone: " + empresa.getFone());
    }
}
