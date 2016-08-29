package ssa;

import java.util.*;

public class Student {
	
	String id;
	String firstName;
	String lastName;
	String eyeColor;
	int monthsEmployed;
	
	static ArrayList<Student> students = new ArrayList<Student>();
	
	static HashMap<String, String> studentsDB = new HashMap<String ,String>();
	
	public void setStudent(String id, String firstName, String lastName, String eyeColor, int monthsEmployed){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eyeColor = eyeColor;
		this.monthsEmployed = monthsEmployed;
		
	}
	
	public String getId(Student s){
		
		return this.id;
		
	}
	public String getStudent(Student s){
		
		return (this.id + "\t" + this.firstName + "\t" + this.lastName + "\t" + this.eyeColor + "\t\t" + String.format("%2d",this.monthsEmployed) );
	}
	
	
	public void buildRoster(){
		
		Student s1 = new Student();
		s1.setStudent("006789","Arun      ","Soma      ","Brown",2);
		students.add(s1);
		Student s2 = new Student();
		s2.setStudent("001122","Michael   ","Clair     ","Other",12);
		students.add(s2);
		Student s3 = new Student();
		s3.setStudent("001212","Stephen   ","Rook      ","Brown",11);
		students.add(s3);
		Student s4 = new Student();
		s4.setStudent("474143","Jonathan  ","Stafford  ","Brown",13);
		students.add(s4);
		Student s5 = new Student();
		s5.setStudent("005295","Kyle      ","Deen      ","Blue",2);
		students.add(s5);
		Student s6 = new Student();
		s6.setStudent("004400","Kevin     ","Tran      ","Other",12);
		students.add(s6);
		Student s7 = new Student();
		s7.setStudent("132617","Reuben    ","Truener   ","Blue",12);
		students.add(s7);
		Student s8 = new Student();
		s8.setStudent("306700","Li        ","Lui       ","Brown",12);
		students.add(s8);
		Student s9 = new Student();
		s9.setStudent("215296","Joshua    ","Franey    ","Other",27);
		students.add(s9);
		Student s10 = new Student();
		s10.setStudent("523420","Gabriel  ","Hamilton  ","Other",10);
		students.add(s10);
		Student s11 = new Student();
		s11.setStudent("004014","Aisha    ","Covington ","Brown",10);
		students.add(s11);
		Student s12 = new Student();
		s12.setStudent("009999","Steve    ","Ellwood   ","Other",2);
		students.add(s12);
		Student s13 = new Student();
		s13.setStudent("343769","Shaquil  ","Timmons   ","Brown",11);
		students.add(s13);
		Student s14 = new Student();
		s14.setStudent("001449","Karen    ","Reiter    ","Blue",10);
		students.add(s14);
		Student s15 = new Student();
		s15.setStudent("267252","Dax      ","Richards  ","Brown",12);
		students.add(s15);
		Student s16 = new Student();
		s16.setStudent("229949","Mike     ","Sykes     ","Brown",13);
		students.add(s16);
		Student s17 = new Student();
		s17.setStudent("772223","Daniel   ","Kiros     ","Brown",3);
		students.add(s17);
		Student s18 = new Student();
		s18.setStudent("004444","Peter    ","Choi      ","Brown",2);
		students.add(s18);
		Student s19 = new Student();
		s19.setStudent("005255","Joe      ","Hill      ","Brown",13);
		students.add(s19);
		Student s20 = new Student();
		s10.setStudent("008888","Evan     ","Tizard    ","Brown",12);
		students.add(s10);
		
	}
	
	public void buildHashDB(){
		String lowkey = " ", highkey = "999999";
		for(Student s: students){
			studentsDB.put(s.getId(s), s.getStudent(s));
		}
		
	//	Set keyset = studentsDB.keySet();
		
		for(String key : studentsDB.keySet()) {
		
			int result = key.compareTo("006789");  
			if(result < 0) {
		    	if(key.compareTo(lowkey) > 0)
		        lowkey = key;  
		    	else ;
			}
		   if(result > 0)
		   {
		    	if(key.compareTo(highkey) < 0)
			        highkey = key; 
		    	else ;
		   }
			 
		}
		
	
		System.out.println("Empl Id	First Name  \tLast Name \tEye Color    Months at SSA");
		System.out.println("======= ==========  \t========= \t=========    =============");
		System.out.println(studentsDB.get("006789"));
		System.out.println(studentsDB.get(lowkey));
		System.out.println(studentsDB.get(highkey));
		
	}
	
	public void printClassRoster(){
		
		buildRoster();
		
		Collections.sort(students, new Comparator<Student>(){
			@Override
			public int compare(Student student1, Student student2){
				return student1.firstName.compareTo(student2.firstName);
			}					
		});
		
		System.out.println("Empl Id	First Name  \tLast Name \tEye Color    Months at SSA");
		System.out.println("======= ==========  \t========= \t=========    =============");
		for(Student s: students){
			System.out.println(s.getStudent(s));
		}
		
		buildHashDB();
	}

public static void main(String args[]){
		
	Student s = new Student();
	
		s.printClassRoster();
	//	s.buildHashDB();
		
	}
}
