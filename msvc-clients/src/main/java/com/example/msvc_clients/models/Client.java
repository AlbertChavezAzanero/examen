package com.example.msvc_clients.models;
public class Client {
    private Long id;
    private String dni;
    private String nombres;
    private String apellidos;
    private String usuario;
    private String contrasenia;
    private int userPort;
    public Client(Long id, String dni, String nombres, String apellidos, String usuario, String contrasenia, int userPort) {
        this.id = id;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.userPort = userPort;
    }
    public Long getId() { return id; }
    public String getDni() { return dni; }
    public String getNombres() { return nombres; }
    public String getApellidos() { return apellidos; }
    public String getUsuario() { return usuario; }
    public String getContrasenia() { return contrasenia; }
    public int getUserPort() { return userPort; }
}