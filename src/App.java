public class App {
    public static void main(String[] args) throws Exception {
        CursoPreparacao curso = new CursoPreparacao();

        curso.setCiclo(new CicloIntermediario());

        curso.realizar();
    }
}
