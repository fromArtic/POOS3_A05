package model;

/**
 *
 * @author Jv Loreti
 */

import java.util.Random;

public abstract class Professor{
    private String nome;
    private String codigo;
    private int c;
    
    public Professor(String n){
        this.nome = n;
        this.c = new Random().nextInt(90000 + 10000); //Códigos de 5 dígitos
        this.codigo = String.valueOf(c);
    }
    
    public abstract double calcularSalarioMensal();
    
    @Override
    public String toString(){
        return nome + " [" + codigo + "]";
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
}
