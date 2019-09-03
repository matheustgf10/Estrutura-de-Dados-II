package buscaBinaria;

import javax.print.attribute.standard.PrinterLocation;

public class bscBinaria {

	static final int n = 1000;
	
	public static void main(String[] args) {
		
		int vet [] ;
		vet = new int[n];
		
		for(int i=0;i<vet.length;i++) {
			vet[i] = i;
		}
		
		int x = 999;		
		System.out.println(buscaBinaria(vet,x));
		
	}
	
	public static int buscaBinaria(int vet [], int x) {
		int ini = 0;
		int fim = vet.length - 1;
		int meio;
		
		while(ini<=fim) {
			System.out.println("|");
			meio = (int)(ini+fim)/2;
			
			if(vet[meio]==x) {
				return meio;
				
			}else if(vet[meio]>x) {
				fim = meio-1;
				
			}else if(vet[meio]<x) {
				ini = meio+1;
			}
		}
				
		return -1;
	}
	
}