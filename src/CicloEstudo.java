public abstract class CicloEstudo {
    public abstract void passo_1();
    public abstract void passo_2();
    public abstract void passo_3();

    public void realizar(){
        this.passo_1();
        this.passo_2();
        this.passo_3();
    }
}
