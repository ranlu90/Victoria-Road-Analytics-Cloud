package com.traffic.entity;

import javax.jdo.annotations.IdGeneratorStrategy; import javax.jdo.annotations.IdentityType; import javax.jdo.annotations.PersistenceCapable; import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
@PersistenceCapable(identityType = IdentityType.APPLICATION) public class Record {
@PrimaryKey
@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) Long id;
@Persistent String time; @Persistent String area;@Persistent int age;@Persistent String type;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}