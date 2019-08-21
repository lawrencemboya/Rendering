package wcci.Rendering;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private String age;
	private String adress;
	// classroom

	@ManyToOne
	private Room room;
	
	public Student () {
		
	}
	
	
	public Student(Room room, String name, String age, String adress) {
		this.room = room;
		this.name = name;
		this.age = age;
		this.adress = adress;
	}


	public Long getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getAge() {
		return age;
	}


	public String getAdress() {
		return adress;
	}


	public Room getRoom() {
		return room;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
