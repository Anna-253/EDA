package selectionsort;

import java.util.Arrays;

import interfaceOrdenacao.*;

public class SelectionSort implements AlgoritmoOrdenacao {

	@Override
	public void ordenar(int[] v) {
		
		for (int i = 0; i < v.length -1; i++) {
			int indice = i;
			for (int j = 0; j < v.length; j++)
				if (v[j] < v[indice])
					indice = j;
			int menorNumero = v[indice];
			v[indice] = v[i];
			v[i] = menorNumero;	
		}
		
	}

	public static void main(String[] args) {
		
		SelectionSort selection = new SelectionSort();
		
		int[] v = {30,7,12,90,22,1,0,4,7,3,77};
		
		selection.ordenar(v);
		
		System.out.println(Arrays.toString(v));
	}
}