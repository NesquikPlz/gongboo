package testProject;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		TransportationWalk trs = new TransportationWalk();
//		trs.move();
//		스프링 컨테이너에 bean을 생성해놨으므로 이제 기존의 자바 객체 생성방법을 쓰지 않아도 된다		
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		//이렇게 xml파일로부터 컨테이너를 가져왔다
		
		TransportationWalk tw = ctx.getBean("tWalk", TransportationWalk.class);
		//컨테이너에서 bean을 가져오자
		
		tw.move();
		
		ctx.close();
		//반환 잊지말기
	}

}
