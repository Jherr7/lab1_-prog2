import java.util.Random;

public class Cronometro {

    private long inicia;
    private long finaliza;

    public Cronometro() {
        inicia = System.currentTimeMillis();
        finaliza = 0;
    }
    public long getInicia() {
        return inicia;
    }
    public long getFinaliza() {
        return finaliza;
    }
    public void inicia() {
        inicia = System.currentTimeMillis();
        finaliza = 0;
    }
    public void detener() {
        finaliza = System.currentTimeMillis();
    }
    public long lapsoDeTiempo() {
        return finaliza - inicia;
    }

    public static void ordenacionSeleccion(int[] lista) {
        int n = lista.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndice = i;
            for (int j = i + 1; j < n; j++) {
                if (lista[j] < lista[minIndice]) {
                    minIndice = j;
                }
            }
            int temp = lista[i];
            lista[i] = lista[minIndice];
            lista[minIndice] = temp;
        }
    }
    public static void main(String[] args) {

        int[] numeros = new int[100000];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(1000000);
        }
        Cronometro cron = new Cronometro();

        // Medir tiempo
        cron.inicia();
        ordenacionSeleccion(numeros);
        cron.detener();

        System.out.println("Tiempo en milisegundos: " + cron.lapsoDeTiempo());
    }
}
