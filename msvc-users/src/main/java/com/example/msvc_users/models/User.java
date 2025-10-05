package com.example.msvc_users.models;

import java.util.Date;

public class User {
    private Long id;
    private String dni;
    private String nombres;
    private String apellidos;
    private Date nacimiento;
    private int port;


    public User() {
    }

    public User(Long id, String dni, String nombres, String apellidos, Date nacimiento, int port) {
        this.id = id;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nacimiento = nacimiento;
        this.port = port;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }
    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }
    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }
    public Date getNacimiento() { return nacimiento; }
    public void setNacimiento(Date nacimiento) { this.nacimiento = nacimiento; }
    public int getPort() { return port; }
    public void setPort(int port) { this.port = port; }
}