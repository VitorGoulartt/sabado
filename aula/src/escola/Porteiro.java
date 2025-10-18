package escola;

public class Porteiro extends Funcionario {
    private int camera;

    public Porteiro(String nome, int idade, long cpf, int camera){
        super(nome, idade, cpf);
        this.camera = camera;
         
    }
    public void trabalhando(){
        System.out.println("Porteiro esta trabalhando");
    }
     public void vigiando(){

        System.out.println("Esta vigiando a escola");
    }


}