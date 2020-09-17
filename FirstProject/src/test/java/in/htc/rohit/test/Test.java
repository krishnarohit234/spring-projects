package in.htc.rohit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.htc.rohit.bean.Dbconn;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac = 
		   new AnnotationConfigApplicationContext();
		
		ac.scan("in.htc.rohit.bean");
		
		ac.refresh();
		
		Dbconn ob=ac.getBean("con",Dbconn.class);
		
		System.out.println(ob);
	}
}
