import escola.Funcionario;
import escola.Diretora;
import escola.Porteiro;
import escola.Professor;


public class App {
    public static void main(String[] args)  {
        Funcionario funcionario1 = new Funcionario("Funcionario", 0, 0000000);
        funcionario1.trabalhando();
        funcionario1.descanso();

        System.out.println();

        Diretora diretora = new Diretora("joelma", 45 , 01321332, "10");

        diretora.trabalhando();

        diretora.Supervisionar();
        diretora.descanso();

        System.out.println();

        Porteiro porteiro1 = new Porteiro("mateus", 35, 123213456, 5);

        porteiro1.trabalhando();
        porteiro1.vigiando();
        porteiro1.descanso();

        System.out.println();

        Professor prof = new Professor("Paulo", 28, 121312321, 18);

        prof.trabalhando();
        prof.aula();
        prof.descanso();

        System.out.println();


        
    }
}
