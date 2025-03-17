import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Exercicio 4. Deséxase xestionar as notas de estudantes dun curso mediante matrices en Java. O exercicio consiste en almacenar as notas de varios estudantes en diferentes módulos.

        // Primeiro indicaranse o número de estudantes.

        // A continuación indicarase o número de módulos.

        // A continuación engadiranse as notas de cada estudante módulo a módulo.

        // Unha vez introducidos as notas do alumnado mostrarase o seguinte menú utilizando a estrutura switch:

            // a) Media dun alumno/a: pedirase o índice do alumno e calcularase a media das súas notas.
            // b) Porcentaxe de aprobados: calcularase a porcentaxe de aprobados do módulo do que se introduza o índice.


        Scanner scanner = new Scanner(System.in);

        // Pedimos número de estudantes
        System.out.println("Porfavor introduza o número de estudantes: ");
        int alumnos = scanner.nextInt();

        // Pedimos número de modulos
        System.out.println("Porfavor introduza o número de módulos: ");
        int modulos = scanner.nextInt();

        //Creamos a matriz 
        double [][] matriz = new double [alumnos][modulos];

        // Introducimos os valores modulo a modulo

        for (int y = 0; y < modulos; y++){ // Recorremos el eje y (Alumnos)
            for (int x = 0; x < alumnos; x ++){ // Recorremos eje x (Modulos)
                boolean valido = false;
                while (!valido) {
                    System.out.print("Introduce o valor para a posición [" + x + "][" + y + "]: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar el buffer porque me daba error (PRGUNTAR DUDA; PORQUE A VECES LO TENGO QUE USAR Y OTRA NO!!)


                    if (valor >= 0 && valor <= 10){
                        matriz[x][y] = valor;
                        valido = true;
                    }

                    else{
                        System.out.println("Introduza un valor entre 0 e 10");
                    }
                }
            }
        }
        

        boolean continuar = true;

        while (continuar){

        System.out.println("Porfavor seleccione algunha das seguintes opcions: ");
        System.out.println("    a) Media dun alumno/a");
        System.out.println("    b) Porcentaxe de aprobados dun módulo");
        System.out.println("    c) Saír!");

        String entrada = scanner.nextLine();

        switch (entrada) {
            case "a":
                double sumaNotas = 0; // Inicializamos suma das notas
                System.out.println("Introduzca o índice do alumno: ");
                int indiceAl = scanner.nextInt(); // Pedimos indice de alumno a eliminar
                scanner.nextLine(); // Limpiar el buffer
 

                // Verificamos si el índice está dentro del rango de alumnos
                if (indiceAl >= 0 && indiceAl < alumnos) {
                    // Recorremos los módulos del alumno
                    for (int x = 0; x < modulos; x++) {
                        sumaNotas += matriz[indiceAl][x];
                    }

                    double media = sumaNotas / modulos; // Calculamos la media
                    System.out.println("La media del alumno " + indiceAl + " es " + media);
                } else {
                    System.out.println("Índice de alumno inválido.");
                }
                break;
                
            case "b":
                System.out.println("Introduzca o índice do modulo: ");
                int indiceMo = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                int aprobados = 0; 

                if (indiceMo >= 0 && indiceMo < modulos) {
                    // Recorremos los alumnos para contar los aprobados en el módulo
                    for (int y = 0; y < alumnos; y++) {
                        if (matriz[y][indiceMo] >= 5) {
                            aprobados++;
                        }
                    }
  
                double reAprobados = (aprobados/alumnos)*100;

                System.out.println("O porcentaxe de aprobados do módulo " + indiceMo + " é " + reAprobados + "%");
                
                }

                else {
                    System.out.println("Índice de módulo inválido.");
                }

                break;


            case "c":
                System.out.println("Saíndo do programa...!");
                continuar = false;
                scanner.close();
                break;
            
            default:
                System.out.println("Porfavor introduza un índice válido...!");
                break;
        }
        
    }
    
    }
}
