package com.davidotero;


public class ListaTareas {
    
    private String name;
    private int tareaPendente;


    public void agregarTarea(String name){
        this.name = name;
        this.tareaPendente = 1;
    }


    public int obtenerNumeroTareasPendientes(){
        return this.tareaPendente;
    }

    public void marcarTareaComoCompletada(int entrada){
        this.tareaPendente = entrada;
    }


}
