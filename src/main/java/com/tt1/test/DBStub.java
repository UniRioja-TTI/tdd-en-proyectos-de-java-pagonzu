package com.tt1.test;

import java.util.List;

public class DBStub {
    private List<ToDo> tareas;
    private List<String> agendaEmails;

    public void insertarTarea(ToDo tarea) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public ToDo buscarTarea(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<ToDo> obtenerTodas() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void agregarEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<String> obtenerEmails() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}