import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AlunosEscola {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Aluno> listaAlunos = new ArrayList<>();

        // Geração de ID

        Random idAleatorio = new Random();

        // Cadastro de Alunos

        System.out.println("Digite o numero de alunos a serem cadastrados");
        int numAlunos = entrada.nextInt();
        entrada.nextLine();
        console.clear();

        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Cadastro do Aluno " + (i + 1));
        }

        System.out.println("Nome do Aluno: ");
        String nome = entrada.nextLine();

        System.out.println("Nota primeiro semestre: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Nota segundo semestre: ");
        double nota2 = entrada.nextDouble();

        System.out.println("Nota terceiro semestre: ");
        double nota 3 = entrada.nextDouble();
        entrada.nextLine();
        console.clear();

        System.out.println("Em qual semestre o aluno esta?");
        int semestre = entrada.nextInt();
        entrada.nextLine();
        console.clear();

        System.out.println("Em qual turno o alunos esta?);
        System.out.println("[1] Manha);
        System.out.println("[2] Tarde);
        System.out.println("[3] Noite");
        int escolhaTurno = 0

        while (escolhaTurno ==0) {
            switch (escolhaTurno) {
                case 1-> String turno = Manha;
            case 2-> String turno = Tarde;
            case 3-> String turno = Noite;
            default = System.out.println("Escolha a opcao [1], [2] ou [3]");
            escolhaTurno == 0
            }
        }

        int idAluno = gerarIdUnico(listaAlunos, random);

        listaAlunos.add(new.Aluno(nome, nota1, nota2, nota3, semestre, turno));

        // Sistema para Listar os Alunos que Foram cadastrados

        System.out.println("Lista de Alunos: ");
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }

        // Sistema de Localizar o ID do Aluno

        System.out.println("Digite o ID do Aluno que Deseja Localizar);
        int idBuscado = entrada.nextInt();

        for (Aluno aluno : listaAlunos) {
            if (aluno.getIdAluno() == idBuscado) {
                System.out.println("O aluno encontrado pelo ID é: " +aluno);
                break;
            }
        }

        entrada.close();

        // Método para Gerar o ID

        public static int gerarIdUnico(ArrayList<Aluno> listaAluno, Random random) {
            int id;
            boolean idExistente;

            // Criando ID Random de 5 Dígitos (de 00000 até 99999)

            do {
            id = 00001 + random.nextInt(99998);
            idExistente = false;

            // Verificar se o ID Existe

            for (Aluno aluno : listaAlunos) {
                if (aluno.getIdAluno() ==id) {
                    idExistente = true;
                    break;
                }
            }
            }
        } while (idExistente); 
        return id;