package com.sist.main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
 * 	1.이벤트 처리
 * 	  ----------
 * 	  제공하는 메소드 => 구현이 안됨 
 * 						 ------------ 인터페이스
 * 	  = ActionListener
 * 		: 버튼 클릭 ,메뉴 클릭 , text엣 엔터
 * 		=> actionPerformed() => 구현해서 사용
 * 	  = MouserListener / MouserMotionListener 
 * 	  = KeyListener 
 * 
 * => 문제 발생
 * 		=> 입력창에서 정수 입력	
 * 					  -------- 예외처리
 * */
public class 숫자야구게임 extends JFrame implements ActionListener{
	JTextArea ta; //힌트 출력
	JTextField tf;
	JButton b1,b2;
	//멤버변수 사용 => 클래스전체에서 사용이 가능
	int[] com = new int[3];
	int[] user = new int[3];
	
	// 초기화 => 생성자 
	public 숫자야구게임() {
		// JTextPane : word , JTextArea:메모장
		ta = new JTextArea();
		JScrollPane js = new JScrollPane(ta); // 가로 세로 스크롤 생성 
		ta.setEditable(false); // 편집 방지 
		tf = new JTextField(10);
		tf.setEnabled(false); // 비활성화
		b1= new JButton("시작");
		b2= new JButton("종료");
		
		//배치
		JPanel p = new JPanel();
		p.add(tf);
		p.add(b1);
		p.add(b2);
		
		add("Center",js);
		add("South",p);
		
		setSize(350,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//이벤트 등록 
		b1.addActionListener(this);
		// 자신 가지고 있는 actionPerformed();
		b2.addActionListener(this);
		tf.addActionListener(this);
	}
	
	
	public static void main(String[] args) {
		new 숫자야구게임();
	}
	
	
	// 난수 발생 => 3자리 => 중복없이 발생
	public void getRand() {
		for (int i = 0; i < com.length; i++) {
			com[i]=(int)(Math.random()*9)+1; //1~9까지 난수 
			
			for (int j = 0; j <i; j++) {
				if(com[i] == com[j]) {
					i--;
					break; // 중복체크 
				}
			} 
		}
	}
	// 버튼처리 
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b2) { // b2버튼을 클릭했다면
		  int sel = JOptionPane.showConfirmDialog(this,"종료할까요?","종료",JOptionPane.YES_NO_OPTION); // 재차 확인
			if(sel == JOptionPane.YES_OPTION) {
			System.exit(0); //종료
			}
		
		}else if(e.getSource() == b1){
			getRand();
			tf.setEnabled(true);
			tf.requestFocus();
			b1.setEnabled(false);
		}else if(e.getSource() == tf) {
			try {
				
				String str = tf.getText();
				int input = Integer.parseInt(str);
				
				user[0]=input/100;
				user[1]=(input%100)/10;
				user[2]=input%10;
				
				if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2]) { 
					JOptionPane.showConfirmDialog(this,"중복 수는 불가능");
					return;
				}
				if(user[0]==0||user[1]==0||user[0]==0) {
					JOptionPane.showConfirmDialog(this,"0은 사용 불가능");
					tf.setText("");
					tf.requestFocus();
					return;
				}
				
				int s=0,b=0;
				for(int i=0;i<3;i++) {
					for (int j = 0; j < 3; j++) {
						if(com[i]==user[j]) {
							if(i ==j) {
								s++;
							}else {
								b++;
							}
						}
					}
				}
				String hint="Input Number"+input+",Result: "+s+"S"+b+"B";
				ta.append(hint);
				
			} catch (NumberFormatException ex) {
				JOptionPane.showConfirmDialog(this, "세자리 정수만 입력!!");
				tf.setText("");
				tf.requestFocus();
				// 예외복구
			}
		}
		
	}

}
