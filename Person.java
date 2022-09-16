public class Person {

String name;
int age;
boolean isAdult;

public Person(String name, int ag){
this.name = name;
age = ag;
}

public boolean tofAdult() {
isAdult = true;
System.out.println(age >= 18);
return age >= 18;
}

public String getName() {
return name;
}

public int getAge() {
return age;
}

public String setName(String inputN) {
this.name = inputN;
return inputN;
}

public int setAge(int inputA) {
age = inputA;
return inputA;
}

public String inform(){
String sentence;

if (age >= 18) {
sentence = name + " is "+ age +" years old. " + name + " is an adult.";
} else {
sentence = name + " is "+ age +" years old. " + name + " is not an adult.";
}

return sentence;
}

}
