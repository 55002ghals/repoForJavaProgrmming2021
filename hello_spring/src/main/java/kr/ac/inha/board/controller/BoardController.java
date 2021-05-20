package kr.ac.inha.board.controller;
//1. 관습적으로 controller역할을 하는 클래스는 이름을 controller로 끝낸다.
//2. 같은 패키지내에서의 RequestMapping annotation으로 지정해준 PATH는 이름 중복시 mapping이 안된다.
//즉, 항상 path명을 달리해야한다.
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//ctrl + shift + o : 사용하지 않는 불필요한 import를 삭제해주는 단축키

@RestController
//controller Annotation(@):
//앞으로 해당 java 코드는 spring framework에서 controller의 역할을 맡기로 함
//	->이번 예제에서는 @controller보다 간편한 restController을 사용
//이걸 안하면 spring에서 mapping을 하지못해서 whitepage error발생
public class BoardController {
	/*
	 * spring framework에서는 main이 필요없다. 이전에는 main함수를 놓음으로써 코드의 흐름을
	 * 제어했지만, 여기는 코드흐름을 spring framework가 지배하므로 main을 만들지 않는다.
	*/
	
	@RequestMapping("/hello")
	public String hello(){
		return "Hello world!";
	}
	
	@RequestMapping("/inha")
	public String inha(String par1) {
		//parameter는 웹에서 get방식으로 전달받으며 parameter의 이름과 get방식으로 받는 파라미터의 이름이 같아야한다.
		return par1+" is parameter that i got";
	}
	
	@RequestMapping("/scriptTest")
	public String inha() {
		//script태그 사용 쌉가능ㅇㅇ
		return "<script>alert(1);</script>";
	}
	
	@RequestMapping("/name")
	public String name(String id) {
		return "your studentID is "+id;
	}
	
	@RequestMapping("/gugudan")
	public String gugudan(int num) {
		String retText="";
		for(int i=1;i<=9;i++) {
			retText+=(Integer.toString(num)+" * "+Integer.toString(i)+" = "+Integer.toString(num*i)+"<br>");
		}
		return retText;
	}
}
