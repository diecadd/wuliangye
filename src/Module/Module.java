package Module;

import java.util.Scanner;

public class Module {
	public static Scanner sc=new Scanner(System.in);
	protected static int nun;
	public static int a[]=new int[] {7,9,13,1,15,11,17,19};
	public static int b[]=new int[5];
	public static int[] c = new int[a.length + 5];

public Module() {
	
	for(int i=0;i<b.length;i++) {
		System.out.println("�����볤��Ϊ5������"+(i+1)+"�±�����b����:");
		int num=sc.nextInt();
		b[i]=num;
	}
 System.out.print("��������뵽�����λ��:");
		int nun=sc.nextInt();
		if(nun>8||nun<0) {
			System.out.println("����������,����������0-8������");
			nun=sc.nextInt();
		}
		
		for(int j=0;j<a.length;j++) {//a�������c������
			c[j]=a[j];
		}
		for(int k=c.length-1;k>=nun+5;k--) {//������������5����λ5=b����ĳ���
			c[k]=c[k-5];
		}

		for(int j=0;j<b.length;j++) {//b�������c����
			c[j+nun]=b[j];

		}
	}
}

