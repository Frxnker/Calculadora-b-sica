class Calculadora {
    
    public static void main(String[] args) {
        
        System.out.println("Entrando a la calculadora");
        System.out.println();
        int respuesta = 0;

        do {
            System.out.println("Que operacion desea realizar?");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");

            int operacion = Integer.parseInt(System.console().readLine());

            int num1 = 0;
            int num2 = 0;

            System.out.println("Introduzca el primer numero");
            num1 = Integer.parseInt(System.console().readLine());
            System.out.println("Introduzca el segundo numero");
            num2 = Integer.parseInt(System.console().readLine());
        
            switch (operacion) {
                case 1:
                    System.out.println("El resultado de la suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicacion es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("El resultado de la division es: " + (num1 / num2));
                    break;
                default:
                    System.out.println("Operacion no valida");
                    break;
            }

            System.out.println("Desea realizar otra operacion? (s/n)");
            respuesta = System.console().readLine().charAt(0);
        } while (respuesta == 's' || respuesta == 'S');

        if (respuesta == 'n' || respuesta == 'N') {
            System.err.println("Hasta la proxima!");
            System.out.println("Saliendo de la calculadora...");
        }
    }
}