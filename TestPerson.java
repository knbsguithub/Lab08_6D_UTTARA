public class TestPerson
{
	public static void main(String[] args)
	{
		Person p=new Person();
		p.setName("Vikrant Rona");
		p.setAge(25);
		System.out.println(p.getAge());
		System.out.println(p.getName());
		p.dance(12);
		p.addPetName("Charlie");
		p.addPetName("soma");
		p.addPetName("coma");
		p.addPetName("pummy");
		p.addPetName("braku");
		p.addPetName("goku");
		System.out.println(p.searchPetName("Charlie"));
		p.sing();
	}
}