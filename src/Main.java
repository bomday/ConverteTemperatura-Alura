// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Conversão de Temperatura: Celsius -> Fahrenheit
        double celsius;
        celsius = 28;

        double fahrenheit;
        fahrenheit = (celsius * 1.8) + 32;
        String mensagemConversaoTemperaturas = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", celsius, fahrenheit);
        System.out.println(mensagemConversaoTemperaturas);

        int fahrenheitInteira = (int) fahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + fahrenheitInteira);
    }
}