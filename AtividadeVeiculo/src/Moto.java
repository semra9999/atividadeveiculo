public class Moto extends Veiculo{

    private int cilindradas;


    public int GetCilindradas(){
        return cilindradas;
    }

    public void SetCilindradas(int numeroCilindradas){
        cilindradas = numeroCilindradas;
    }
    @Override
    public double calcularAluguel(int dias) {
        double valorBase = super.calcularAluguel(dias);
        return valorBase - (valorBase * 0.05);
    }

}
