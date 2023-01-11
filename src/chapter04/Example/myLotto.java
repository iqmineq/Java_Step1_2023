package chapter04.Example;

import java.util.Random;

import javax.swing.JOptionPane;

public class myLotto {

	public static void main(String[] args) {
		int number;
		int cnt=0;
		int[] lotto=new int[6];
	
		System.out.println("=============이번주 로또 예상번호 ===========");
		number = Integer.parseInt(JOptionPane.showInputDialog("원하는 로또 구매횟수를 입력하세요"));
		while (number > cnt) {
			System.out.print("[" + (cnt + 1) + "] :");
			
			outer: for (int i = 0; i < lotto.length;) {
				number = (int) (Math.random() * 45) + 1;
				lotto[i] = new Random().nextInt(45) + 1;

				// 중복값을 비교하는 반복문

				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						continue outer;
					} // if
				} // in for
                    System.out.print(lotto[i]+"  ");
                    i++;
			} // outer for
                     cnt++;
                     System.out.println();
		
		


		} // while
	}//main
}//class
