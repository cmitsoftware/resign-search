package org.resign.repo;

import java.util.Date;
import java.util.List;

import org.resign.embedded.ResourceTag;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Resource {

	public static final Integer STATUS_DRAFT = 1;
	public static final Integer STATUS_APPROVED = 2;
	public static final Integer STATUS_REJECTED = 3;
	public static final Integer STATUS_DELETED = 4;
	
	@Id
    private String id;

	private Integer type;
	private Integer status;
    private String name;
    private String surname;
    private String desc;
    private String owner;
    private Date visibleFrom;
    private Date visibleTo;
    private Date creation;
    private Date activation;
    private List<ResourceTag> tags;

    public Resource() {}
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Date getVisibleFrom() {
		return visibleFrom;
	}
	public void setVisibleFrom(Date visibleFrom) {
		this.visibleFrom = visibleFrom;
	}
	public Date getVisibleTo() {
		return visibleTo;
	}
	public void setVisibleTo(Date visibleTo) {
		this.visibleTo = visibleTo;
	}
	public Date getCreation() {
		return creation;
	}
	public void setCreation(Date creation) {
		this.creation = creation;
	}
	public Date getActivation() {
		return activation;
	}
	public void setActivation(Date activation) {
		this.activation = activation;
	}
	public List<ResourceTag> getTags() {
		return tags;
	}
	public void setTags(List<ResourceTag> tags) {
		this.tags = tags;
	}
}