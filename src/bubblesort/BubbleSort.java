package bubblesort;

import interfaceOrdenacao.*;

public class BubbleSort implements AlgoritmoOrdenacao {

	@Override
	public void ordenar(int[] v) {
		for(int i = 0; i<v.length/2; i++){
			for(int j = 0; j<4; j++){
				if(v[j] > v[j + 1]){
					int auxiliar = v[j];
					v[j] = v[j+1];
					v[j+1] = auxiliar;
				}
			}
		}
	}
}