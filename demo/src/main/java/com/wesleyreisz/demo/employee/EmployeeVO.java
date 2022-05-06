package com.wesleyreisz.demo.employee;

public class EmployeeVO {
    private int id = 0;
    private String firstName = "";
    private String lastName = "";
    private String email = "";

    public EmployeeVO(){
        this.setId(0);
        this.setFirstName("Not Set");
        this.setLastName("Not Set");
        this.setEmail("Not Set");
    }
    public EmployeeVO(int id) {
        this.setId(id);
    }
    public EmployeeVO(int id, String firstName, String lastName, String email) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass())
            return false;

        EmployeeVO employee = (EmployeeVO)obj;
        if (this.id==employee.getId()){
            return true;
        }else {
            return false;
        }
    }
}
