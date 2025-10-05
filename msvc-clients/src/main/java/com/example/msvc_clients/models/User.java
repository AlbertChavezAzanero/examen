package com.example.msvc_clients.models;
import java.util.Date;
public class User {
    private Long id;
    private String dni;
    private String nombres;
    private String apellidos;
    private Date nacimiento;
    private int port;
    // Getters y Setters
    public Long getId() { return id; }
    public String getDni() { return dni; }
    public String getNombres() { return nombres; }
    public String getApellidos() { return apellidos; }
    public Date getNacimiento() { return nacimiento; }
    public int getPort() { return port; }
}