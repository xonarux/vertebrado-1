public class GeneradorVertebrados {
    public static Vertebrado[] generarArrayVertebrados() {
        Vertebrado[] miVertebrados = new Vertebrado[4];
        miVertebrados[0] = new Vertebrado("Camello", "Mamifero");
        miVertebrados[1] = new Vertebrado("Vaca", "Mamifero");
        miVertebrados[2] = new Vertebrado("Perro", "Pez");
        miVertebrados[3] = new Vertebrado("Tigre", "Mamifero");

        return miVertebrados;
    }
}
