//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

Carro toyota = new Carro();
toyota.SetModelo("Supra");
toyota.SetMarca("Toyota");
toyota.valorDiaria = 10.5;
double valorALuguelToyota = toyota.calcularAluguel(5);
    System.out.println(valorALuguelToyota);

}
