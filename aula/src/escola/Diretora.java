package escola;

public class Diretora extends Funcionario {
     private String advertencia;

     public Diretora(String nome, int idade, long cpf, String advertencia){
        super(nome, idade, cpf);
        this.advertencia = advertencia;

     }
     @Override
     public void trabalhando(){
        System.out.println("Diretora esta trabalhando");
     }
     public void Supervisionar(){

        System.out.println("Diretora esta supervisionando os professores");


     }
}