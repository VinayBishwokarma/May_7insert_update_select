package com.example.may_7insert_update_select;

public class Student {
    private int id;
    private  String name;
    private  String phone;
    private  String email;

    public static final String TBL_NAME= "students";
    public static final String TBL_QRY= "CREATE TABLE " + TBL_NAME + "(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, phone TEXT,+ email TEXT, image TEXT";

    public Student(int id, String name, String phone, String email, String image) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.image = image;
    }

    private  String image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
