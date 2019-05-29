package jp.co.internous.action;

public class Test {
	public static void main(String[]args){
Person taro = new Person();
taro.name="山田太郎";
taro.age=20;
taro.phoneNumber="090-1111-1111";
taro.address="東京";

Person jiro = new Person();
jiro.name="木村次郎";
jiro.age=18;
jiro.phoneNumber="090-1111-1112";
jiro.address="群馬";

Person hanako = new Person();
hanako.name="鈴木花子";
hanako.age=16;
hanako.phoneNumber="090-1111-1113";
hanako.address="石川";

Person misaki = new Person();
misaki.name="笹子岬";
misaki.age=26;
misaki.phoneNumber="090-1111-1114";
misaki.address="神奈川";

Robot aibo = new Robot();
aibo.name="AIBO";

Robot asimo = new Robot();
asimo.name="ASIMO";

Robot pepper = new Robot();
pepper.name="PEPPER";

System.out.println(taro.name);
System.out.println(taro.age);
System.out.println(taro.phoneNumber);
System.out.println(taro.address);

System.out.println(jiro.name);
System.out.println(jiro.age);
System.out.println(jiro.phoneNumber);
System.out.println(jiro.address);

System.out.println(hanako.name);
System.out.println(hanako.age);
System.out.println(hanako.phoneNumber);
System.out.println(hanako.address);

System.out.println(misaki.name);
System.out.println(misaki.age);
System.out.println(misaki.phoneNumber);
System.out.println(misaki.address);

taro.talk();
taro.walk();
taro.run();

jiro.talk();
jiro.walk();
jiro.run();

hanako.talk();
hanako.walk();
hanako.run();

misaki.talk();
misaki.walk();
misaki.run();

aibo.talk();
aibo.walk();
aibo.run();

asimo.talk();
asimo.walk();
asimo.run();

pepper.talk();
pepper.walk();
pepper.run();
	}
}
