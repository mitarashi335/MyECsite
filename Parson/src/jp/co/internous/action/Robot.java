package jp.co.internous.action;

public class Robot {
	public String name=null;

	public void talk(){
		System.out.println(name+"が喋った");
	}
	public void walk(){
		System.out.println(name+"が歩いた");
	}
	public void run(){
		System.out.println(name+"が走った");
	}

}
