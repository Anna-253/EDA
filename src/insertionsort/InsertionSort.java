package insertionsort;

import interfaceOrdenacao.*;

public class InsertionSort implements AlgoritmoOrdenacao {

	@Override
	public void ordenar(int[] v) {
		for (int i = 0; i < v.length; i++) {
            int auxiliar = v[i];  
            for (int j = i - 1; j >= 0 && v[j] > auxiliar; j--) {  
                v[j + 1] = v[j];  
                v[j] = auxiliar;  
            }
        }  
	}
}