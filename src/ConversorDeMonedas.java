import java.util.Scanner;

public class ConversorDeMonedas {
    public static void main(String[] args) {
        // Tasas de cambio obtenidas de la API
        double rateARS = 350.25; // Tasa USD a ARS
        double rateBOB = 6.92;   // Tasa USD a BOB
        double rateBRL = 5.31;   // Tasa USD a BRL
        double rateCLP = 870.15; // Tasa USD a CLP
        double rateCOP = 3915.50; // Tasa USD a COP
        double rateUSD = 1.00;    // Tasa USD a USD (constante)

        // Crear un escáner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            // Mostrar el menú de opciones
            System.out.println("\n--- Conversor de Monedas ---");
            System.out.println("Selecciona una opción:");
            System.out.println("1. Convertir USD a ARS (Peso Argentino)");
            System.out.println("2. Convertir USD a BOB (Boliviano)");
            System.out.println("3. Convertir USD a BRL (Real Brasileño)");
            System.out.println("4. Convertir USD a CLP (Peso Chileno)");
            System.out.println("5. Convertir USD a COP (Peso Colombiano)");
            System.out.println("6. Convertir entre otras monedas (ej. ARS a BRL)");
            System.out.println("7. Salir");
            System.out.print("Elige una opción (1-7): ");

            // Leer la elección del usuario
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Convertir USD a ARS
                    System.out.print("Introduce la cantidad en USD: ");
                    double amountInUSD = scanner.nextDouble();
                    double convertedToARS = amountInUSD * rateARS;
                    System.out.println("El monto en USD convertido a ARS: " + convertedToARS);
                    break;
                case 2:
                    // Convertir USD a BOB
                    System.out.print("Introduce la cantidad en USD: ");
                    amountInUSD = scanner.nextDouble();
                    double convertedToBOB = amountInUSD * rateBOB;
                    System.out.println("El monto en USD convertido a BOB: " + convertedToBOB);
                    break;
                case 3:
                    // Convertir USD a BRL
                    System.out.print("Introduce la cantidad en USD: ");
                    amountInUSD = scanner.nextDouble();
                    double convertedToBRL = amountInUSD * rateBRL;
                    System.out.println("El monto en USD convertido a BRL: " + convertedToBRL);
                    break;
                case 4:
                    // Convertir USD a CLP
                    System.out.print("Introduce la cantidad en USD: ");
                    amountInUSD = scanner.nextDouble();
                    double convertedToCLP = amountInUSD * rateCLP;
                    System.out.println("El monto en USD convertido a CLP: " + convertedToCLP);
                    break;
                case 5:
                    // Convertir USD a COP
                    System.out.print("Introduce la cantidad en USD: ");
                    amountInUSD = scanner.nextDouble();
                    double convertedToCOP = amountInUSD * rateCOP;
                    System.out.println("El monto en USD convertido a COP: " + convertedToCOP);
                    break;
                case 6:
                    // Convertir entre otras monedas (ejemplo ARS a BRL)
                    System.out.print("Introduce la cantidad en ARS: ");
                    double amountInARS = scanner.nextDouble();
                    // Convertir ARS a USD, luego USD a BRL
                    double arsToBRL = (amountInARS / rateARS) * rateBRL;
                    System.out.println("El monto en ARS convertido a BRL: " + arsToBRL);
                    break;
                case 7:
                    // Salir del programa
                    System.out.println("Saliendo del programa...");
                    exit = true;
                    break;
                default:
                    // Opción no válida
                    System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 7.");
            }
        }

        // Cerrar el escáner
        scanner.close();
    }
}
