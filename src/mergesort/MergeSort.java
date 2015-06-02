
package mergesort;

import interfaceOrdenacao.AlgoritmoOrdenacao;

/**
 *
 * @author Ana Silva
 */
public class MergeSort implements AlgoritmoOrdenacao{
    
    @Override
    public void ordenar(int[] v) {
        mergeSort(v, 0, v.length-1);
    }
    
    public void mergeSort(int[] v, int inicio, int fim) {
	if (fim <= inicio) {
		return; //Aqui retorna, porque se o inicio é maior ou igual ao fim significa que o array possui um único elemento, ou esta vazio
	}
	int meio = (inicio + fim) / 2; //A variável meio é a responsável pelas divisões do vetor inicial
	mergeSort(v, inicio, meio); //Merge sort recursivo, part I: Chama ele mesmo, para efetuar a ordenação da primeira metade do vetor
	mergeSort(v, meio + 1, fim); //Merge sort recursivo, part II: Chama ele mesmo, para efetuar a ordenação da 2ª metade do vetor
	int[] A = new int[meio - inicio + 1]; //Vetor auxiliar I, que possui a quantidade exata de elementos entre o inicio+1 e o meio do vetor
	int[] B = new int[fim - meio]; //Vetor auxiliar II, que possui a quantidade exata de elementos entre o meio e o fim do vetor
	for (int i = 0; i <= meio - inicio; i++) {
		A[i] = v[inicio + i];
	}
	for (int i = 0; i <= fim - meio - 1; i++) {
		B[i] = v[meio + 1 + i];
	}
	int i = 0;
	int j = 0;
	for (int k = inicio; k <= fim; k++) {
		if (i < A.length && j < B.length) {
			if (A[i] < B[j]) {
				v[k] = A[i++];
			} else {
				v[k] = B[j++];
			}
		} else if (i < A.length) {
			v[k] = A[i++];
		} else if (j < B.length) {
			v[k] = B[j++];
		}
	}
    }
}
