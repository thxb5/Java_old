package lby;

public class ArratEx1 {

	public static void main(String[] args) {
		int[] score = new int [5];
		int k =1;
		
		score[0]=50;
		score[1]=60;
//		score[k+1]=70;  -> 배열의 길이가 긴 경우 for문 사용
		score[3]=80;
		score[4]=90;
		
		int tmp=score[k+2] + score[4]; //int tmp = score[3]+score[4]
		
		//for문으로 배열의 모든 요소를 출력한다.
		
		for(int i=0;i<5;i++) {
			System.out.printf("score[%d]:%d%n",i,score[i]);
		}
		
		System.out.printf("tmp:%d", tmp);
//		System.out.printf("score[%d]:%d%n",7,score[7]); -> 에러발생 : 인덱스가 유효한 범위를 넘었음
	}

}
