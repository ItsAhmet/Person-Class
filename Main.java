public class Main {
	public static void main(String[] args) {
		Person ww= new Person("Willy Wonka", 67);
    
    System.out.println(ww.getName());
    System.out.println(ww.getAge());
    System.out.println(ww.tofAdult() + "\n");

    System.out.println(ww.setName("Willy Not Wonka"));
    System.out.println(ww.setAge(20));

    System.out.println(ww.inform());
  }

}
