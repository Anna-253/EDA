package quicksort;

import interfaceOrdenacao.*;
import java.util.Arrays;

/**
 * @author Ana Silva
 */
public class QuickSort implements AlgoritmoOrdenacao {
    
    @Override
    public void ordenar(int[] v) {
        ordenar(v, 0, v.length-1);
    }
    
    /**
     * Método de ordenação propriamente dito, que chama ele mesmo recursivamente de acordo com as condições impostas
     * @param v - Vetor de inteiros a ser ordenado
     * @param inicio - Inteiro que representa o indice do primeiro elemento do vetor
     * @param fim - Inteiro que representa o último elemento do vetor
     */
    public void ordenar(int[] v, int inicio, int fim) {
        if (inicio < fim) {
           int pivo = dividirParaConquistar(v, inicio, fim); //Neste caso, o pivo do quicksort recebe o valor do "f"
           ordenar(v, inicio, pivo - 1);
           ordenar(v, pivo + 1, fim);
        }
     }
  /**
   * Método que é responsável por efetuar todas as trocas no vetor.
   * @param v - Vetor de inteiros a ser ordenado
   * @param inicio - Inteiro que representa a primeira posição do vetor
   * @param fim - Inteiro que representa a última posição do vetor
   * @return O inteiro "f", que vem a ser o principal número do vetor, e provavelmente é o mais inidicado para ser o pivo.
   */
   public int dividirParaConquistar(int[] v, int inicio, int fim) {
      int pivo = v[inicio];
      int i = inicio + 1;
      int f = fim;
      while (i <= f) {
        if (v[i] <= pivo)
            i++;
        else if (pivo < v[f])
            f--;
        else {
            int troca = v[i];
            v[i] = v[f];
            v[f] = troca;
            i++;
            f--;
         }
    }
    v[inicio] = v[f];
    v[f] = pivo;
    return f;
   }
}