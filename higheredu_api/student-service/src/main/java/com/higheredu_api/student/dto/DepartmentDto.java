package com.higheredu_api.student.dto;



public class DepartmentDto {
    private Long id;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public DepartmentDto(Long id, String departmentName, String departmentAddress, String departmentCode) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.departmentCode = departmentCode;
	}
	public DepartmentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DepartmentDto [id=" + id + ", departmentName=" + departmentName + ", departmentAddress="
				+ departmentAddress + ", departmentCode=" + departmentCode + "]";
	}
    
    
}
