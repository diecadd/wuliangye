package demo;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo { 
	
	public static void main(String[] args) {
		Set<Object> s;
		String str;
		Properties c = new Properties();
		c.put("�й�", "����");
		c.put("����˹", "Ī˹��");
		c.put("�ձ�", "����");
		c.put("����", "����");
		c.put("Ӣ��", "�׶�");
		
		s = c.keySet();//����һ������Set����
		Iterator<Object> i = s.iterator();
		
		while(i.hasNext()){
			str = (String)i.next();
			System.out.println(str + c.getProperty(str));
		}
		System.out.println();
		
		//������������ü������ڣ��򷵻�Ĭ��ֵ
		str = c.getProperty("����", "û�з���");
		System.out.println(str);
	}
}
