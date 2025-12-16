public class Carro extends Veiculo{

    private int numeroPortas;


    public int GetNumeroPortas(){
        return numeroPortas;
    }

    public void SetNumeroPortas(int numeroPtr){
        numeroPortas = numeroPtr;
    }
    @Override
    public double calcularAluguel(int dias) {
        double valorBase = super.calcularAluguel(dias);
        return valorBase + (valorBase * 0.10);
    }
}
