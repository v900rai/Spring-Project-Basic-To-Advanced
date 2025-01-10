package com.example.demo;

public class Student {
	 Long id;
	    String name;
	    int age;
	    String standard;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getStandard() {
			return standard;
		}
		public void setStandard(String standard) {
			this.standard = standard;
		}
		public Student(Long id, String name, int age, String standard) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.standard = standard;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", age=" + age + ", standard=" + standard + "]";
		}

	

}
