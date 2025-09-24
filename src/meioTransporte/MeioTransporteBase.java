package meioTransporte;

public abstract class MeioTransporteBase implements IMeioTransporte {
    protected int velocidade;
    protected final int limiteVelocidade;
    protected final int incrementoVelocidade;

    public MeioTransporteBase(int limiteVelocidade, int incrementoVelocidade) {
        this.velocidade = 0;
        this.limiteVelocidade = limiteVelocidade;
        this.incrementoVelocidade = incrementoVelocidade;
    }

    @Override
    public void acelerar() {
        if (this.velocidade + incrementoVelocidade <= limiteVelocidade) {
            this.velocidade += incrementoVelocidade;
            System.out.println(getClass().getSimpleName() + " acelerando, velocidade atual: " + this.velocidade);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " no limite de velocidade!");
        }
    }

    @Override
    public void frear() {
        if (this.velocidade > 0) {
            this.velocidade -= incrementoVelocidade;
            System.out.println(getClass().getSimpleName() + " freando, velocidade atual: " + this.velocidade);
        } else {
            throw new IllegalStateException("Não é possível frear mais. Veículo parado!");
        }
    }
}
