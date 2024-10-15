import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre, sedentarismo, alimentacion, estres, sueno, dolor, estresProlongado, apoyo, economia, trauma;
        int edad, respuestaFisica, respuestaMental, tipofisico, problematicamental, horasActividad, porcionDieta, litrosHidratacion, horasPantalla;

        System.out.println("Bienvenido al cuestionario de salud");
        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();

        System.out.print("¿Cuál es su edad? ");
        edad = sc.nextInt();

        System.out.println("¿Cómo describirías tu estado de salud física?");
        System.out.println("1 - Bueno");
        System.out.println("2 - Malo");
        respuestaFisica = sc.nextInt();

        if (respuestaFisica == 1) {
            System.out.println("Nos alegra que tu salud física esté bien.");
        } else if (respuestaFisica == 2) {
            System.out.println("¿Qué ha estado pasando con tu salud física?");
            System.out.println("1. Sedentarismo");
            System.out.println("2. Mala Alimentación");
            System.out.println("3. Estrés crónico");
            System.out.println("4. Privación del sueño");
            System.out.println("5. Algún tipo de dolor");
            tipofisico = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (tipofisico) {
                case 1:
                    System.out.println("Describe tu situación de sedentarismo:");
                    sedentarismo = sc.nextLine();
                    System.out.println("Te sugerimos intentar hacer cambios positivos en tus hábitos y estilo de vida.");
                    break;
                case 2:
                    System.out.println("Describe tu situación de mala alimentación:");
                    alimentacion = sc.nextLine();
                    System.out.println("Si la situación se debe a problemas económicos, te sugerimos acudir a las oficinas de tu universidad.");
                    break;
                case 3:
                    System.out.println("Describe tu situación de estrés crónico:");
                    estres = sc.nextLine();
                    break;
                case 4:
                    System.out.println("Describe tu situación de privación del sueño:");
                    sueno = sc.nextLine();
                    System.out.println("Consulta el siguiente enlace: https://www.healthy-heart.org/es/mantenga-su-corazon-sano/estres-y-sueno/");
                    break;
                case 5:
                    System.out.println("Describe tu situación de dolor:");
                    dolor = sc.nextLine();
                    System.out.println("Es importante acudir a un médico si el dolor es persistente.");
                    break;
                default:
                    System.out.println("El número ingresado no es válido.");
                    break;
            }
        }

        System.out.println("¿Cómo se encuentra tu salud mental?");
        System.out.println("1. Bien");
        System.out.println("2. Mal");
        respuestaMental = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        if (respuestaMental == 1) {
            System.out.println("Nos alegra que tu salud mental esté bien.");
        } else if (respuestaMental == 2) {
            System.out.println("¿Qué ha estado pasando con tu salud mental?");
            System.out.println("1. Estrés prolongado");
            System.out.println("2. Falta de apoyo social");
            System.out.println("3. Problemas económicos");
            System.out.println("4. Trauma emocional");
            problematicamental = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (problematicamental) {
                case 1:
                    System.out.println("Describe tu situación de estrés prolongado:");
                    estresProlongado = sc.nextLine();
                    System.out.println("Te recomendamos practicar técnicas de relajación y buscar apoyo profesional.");
                    break;
                case 2:
                    System.out.println("Describe tu situación de falta de apoyo social:");
                    apoyo = sc.nextLine();
                    System.out.println("Intenta reconectar con amigos o familiares, o unirte a grupos sociales.");
                    break;
                case 3:
                    System.out.println("Describe tu situación de problemas económicos:");
                    economia = sc.nextLine();
                    System.out.println("Te sugerimos buscar asesoría financiera y explorar recursos comunitarios.");
                    break;
                case 4:
                    System.out.println("Describe tu situación de trauma emocional:");
                    trauma = sc.nextLine();
                    System.out.println("Busca ayuda profesional, como un terapeuta especializado en trauma.");
                    break;
                default:
                    System.out.println("El número ingresado no es válido.");
                    break;
            }
        }

        if (respuestaFisica == 2 && respuestaMental == 2) {
            System.out.println("Parece que estás enfrentando varios desafíos. Considera hablar con un profesional de la salud.");
        }

        System.out.println("Queremos saber más sobre tu salud física.");
        System.out.print("¿Cuántas horas a la semana dedicas a la actividad física? ");
        horasActividad = sc.nextInt();
        if (horasActividad < 2) {
            System.out.println("Se recomienda realizar al menos 120 minutos de actividad física moderada por semana.");
        } else {
            System.out.println("¡Excelente! Mantén tu rutina de actividad física.");
        }

        System.out.println("¿Cómo calificarías la calidad de tu dieta diaria?");
        System.out.println("1. Muy mala");
        System.out.println("2. Mala");
        System.out.println("3. Regular");
        System.out.println("4. Buena");
        System.out.println("5. Excelente");
        porcionDieta = sc.nextInt();

        switch (porcionDieta) {
            case 1:
                System.out.println("Considera consultar a un nutricionista.");
                break;
            case 2:
                System.out.println("Intenta hacer algunos cambios en tu dieta.");
                break;
            case 3:
                System.out.println("Tu dieta es aceptable, pero siempre hay margen para mejorar.");
                break;
            case 4:
                System.out.println("¡Buena dieta! Sigue así.");
                break;
            case 5:
                System.out.println("¡Excelente dieta! Estás haciendo un gran trabajo.");
                break;
            default:
                System.out.println("El número ingresado no es válido.");
                break;
        }

        System.out.print("¿Cuántos litros de agua consumes al día? ");
        litrosHidratacion = sc.nextInt();
        if (litrosHidratacion < 2) {
            System.out.println("Recuerda beber al menos 2 litros de agua al día.");
        } else {
            System.out.println("¡Bien hecho! Mantén una buena hidratación.");
        }

        System.out.print("¿Cuántas horas al día pasas frente a pantallas? ");
        horasPantalla = sc.nextInt();
        if (horasPantalla > 3) {
            System.out.println("Considera reducir el tiempo frente a pantallas y hacer pausas regulares.");
        } else {
            System.out.println("Mantén un equilibrio saludable entre el tiempo frente a pantallas y otras actividades.");
        }

        System.out.println("Gracias por completar el cuestionario, " + nombre + ".");
        System.out.println("Si tienes alguna pregunta o necesitas más información, consulta a un profesional de la salud.");
    }
}
