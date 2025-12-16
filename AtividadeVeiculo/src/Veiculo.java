public class Veiculo {

    private String marca;
    private String modelo;
    protected double valorDiaria;

    public String GetMarca(){
        return marca;
    }

    public void SetMarca(String marcaValue){
        marca = marcaValue;
    }

    public String GetModelo(){
        return modelo;
    }

    public void SetModelo(String modeloValue){
        modelo = modeloValue;
    }

    public double GetValorDiaria(){
        return valorDiaria;
    }

    public void SetValorDiaria(double valorDaDiaria){
        valorDiaria = valorDaDiaria;
    }

    public double calcularAluguel(int dias){
        return valorDiaria * dias;
    }
}
