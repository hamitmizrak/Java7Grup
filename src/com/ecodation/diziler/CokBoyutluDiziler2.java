package com.ecodation.diziler;

public class CokBoyutluDiziler2 {

	public static void main(String[] args) {
		
		int[] [] matrix= { {1,2,3},{4,5,6}  };
		
		for (int i = 0; i < matrix.length; i++) {//satır 
			for (int j = 0; j < matrix[i].length; j++) {//sutun 
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
			
		
		}
		
	}
}
