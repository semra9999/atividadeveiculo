public class Carro extends Veiculo{

    @Override
    public double calcularAluguel(int dias) {
        double valorBase = super.calcularAluguel(dias);
        return valorBase + (valorBase * 0.10); 
    }
}
