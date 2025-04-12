import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Escola {
    private String nomeEscola;
    private String endereco;
    private int salas;
    private ArrayList<Aluno> alunos;

    // Construtor
    public Escola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
        this.alunos = new ArrayList<>();
    }

    // Outro construtor completo, se quiser usar depois
    public Escola(String nomeEscola, String endereco, int salas) {
        this.nomeEscola = nomeEscola;
        this.endereco = endereco;
        this.salas = salas;
        this.alunos = new ArrayList<>();
    }

    // Método para adicionar alunos
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    // Método para listar todos os alunos
    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Não há alunos cadastrados.");
            return;
        }
        System.out.println("--- Lista de Alunos ---");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
        System.out.println("-----------------------");
    }

    // Buscar aluno por ID
    public Aluno buscarAlunoPorId(int id) {
        for (Aluno aluno : alunos) {
            if (aluno.getIdAluno() == id) {
                return aluno;
            }
        }
        System.out.println("Aluno com ID " + id + " não encontrado.");
        return null;
    }

    // Remover aluno por ID
    public void removerAlunoPorId(int id) {
        Aluno alunoRemover = buscarAlunoPorId(id);
        if (alunoRemover != null) {
            alunos.remove(alunoRemover);
            System.out.println("Aluno com ID " + id + " removido com sucesso.");
        }
    }

    // Buscar alunos por nome (parcial ou completo)
    public List<Aluno> buscarAlunosPorNome(String nome) {
        return alunos.stream()
                .filter(aluno -> aluno.getNome().toLowerCase().contains(nome.toLowerCase()))
                .collect(Collectors.toList());
    }

    // Listar alunos em ordem alfabética
    public void listarAlunosEmOrdemAlfabetica() {
        if (alunos.isEmpty()) {
            System.out.println("Não há alunos cadastrados.");
            return;
        }
        System.out.println("--- Lista de Alunos em Ordem Alfabética ---");
        alunos.stream()
                .sorted((a1, a2) -> a1.getNome().compareToIgnoreCase(a2.getNome()))
                .forEach(System.out::println);
        System.out.println("-------------------------------------------");
    }

    // Contar o número total de alunos
    public int contarTotalAlunos() {
        return alunos.size();
    }

    // Verificar se um aluno com um determinado ID existe
    public boolean existeAlunoComId(int id) {
        return alunos.stream().anyMatch(aluno -> aluno.getIdAluno() == id);
    }

    // Getters e Setters
    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getSalas() {
        return salas;
    }

    public void setSalas(int salas) {
        this.salas = salas;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Escola minhaEscola = new Escola("Minha Escola");

        // Exemplo de uso (pode ser removido ou modificado para testes)
        Aluno aluno1 = new Aluno(1, "João Silva", 10, "joao.silva@email.com");
        Aluno aluno2 = new Aluno(2, "Maria Souza", 11, "maria.souza@email.com");
        Aluno aluno3 = new Aluno(3, "Pedro Alves", 9, "pedro.alves@email.com");

        minhaEscola.adicionarAluno(aluno1);
        minhaEscola.adicionarAluno(aluno2);
        minhaEscola.adicionarAluno(aluno3);

        minhaEscola.listarAlunos();

        Aluno alunoEncontrado = minhaEscola.buscarAlunoPorId(2);
        if (alunoEncontrado != null) {
            System.out.println("\nAluno encontrado com ID 2: " + alunoEncontrado);
        }

        List<Aluno> alunosComNome = minhaEscola.buscarAlunosPorNome("silva");
        System.out.println("\nAlunos com nome contendo 'silva': " + alunosComNome);

        minhaEscola.listarAlunosEmOrdemAlfabetica();

        System.out.println("\nTotal de alunos: " + minhaEscola.contarTotalAlunos());

        minhaEscola.removerAlunoPorId(1);
        minhaEscola.listarAlunos();

        System.out.println("\nExiste aluno com ID 1? " + minhaEscola.existeAlunoComId(1));
        System.out.println("Existe aluno com ID 2? " + minhaEscola.existeAlunoComId(2));

        scanner.close();
    }
}