package Q02;

public class IngressoVip extends Ingresso{
    float valorAdicional;
    public IngressoVip(float valor, float valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }
    public float ImprimeValorTotal(){
        return this.valor+this.valorAdicional;
    }

    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}
