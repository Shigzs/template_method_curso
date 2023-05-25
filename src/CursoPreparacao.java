public class CursoPreparacao {
    public CicloEstudo ciclo;

    public void realizar(){
        this.ciclo.passo_1();
        this.ciclo.passo_2();
        this.ciclo.passo_3();
    }

    public void setCiclo(CicloEstudo ciclo) {
        this.ciclo = ciclo;
    }
}
