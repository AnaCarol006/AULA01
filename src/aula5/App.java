package aula5;

public class App {
    public static void main(String[] args) {
        //invocando os métodos construtores para criação dos objetos
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        aluno1.id = 10;
        aluno1.nome = "Jonh Doe";
        aluno1.matricula = "20250001";
        aluno1.idade = 40;

        aluno2.id = 11;
        aluno2.nome = "Maria Santos";
        aluno2.matricula = "20250002";
        aluno2.idade = 25;

        aluno3.id = 12;
        aluno3.nome = "José Campos";
        aluno3.matricula = "20250003";
        aluno3.idade = 20;



        //Exemplo para mostrar que dessa foma o aluno4 que não "existe", irá aparecer com as informações do aluno3 ao ser compilado.
        Aluno aluno4 = aluno3;


        
        System.out.println("Aluno 1: " + aluno1);
        System.out.println("ID: " + aluno1.id);
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Matrícula: " + aluno1.matricula);
        System.out.println("Idade: " + aluno1.idade);


        System.out.println("Aluno 2: " + aluno2);
        System.out.println("ID: " + aluno2.id);
        System.out.println("Nome: " + aluno2.nome);
        System.out.println("Matrícula: " + aluno2.matricula);
        System.out.println("Idade: " + aluno2.idade);


        System.out.println("Aluno 3: " + aluno3);
        System.out.println("ID: " + aluno3.id);
        System.out.println("Nome: " + aluno3.nome);
        System.out.println("Matrícula: " + aluno3.matricula);
        System.out.println("Idade: " + aluno3.idade);


        //Resultado do exemplo acima.
        System.out.println("Aluno 4: " + aluno4);
        System.out.println("ID: " + aluno4.id);
        System.out.println("Nome: " + aluno4.nome);
        System.out.println("Matrícula: " + aluno4.matricula);
        System.out.println("Idade: " + aluno4.idade);

    }
    
}
