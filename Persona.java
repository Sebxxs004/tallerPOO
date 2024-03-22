package ejercicioPOO;

import java.lang.Math;
import java.util.Random;
public class Persona {
    private String nombre;
    private String cédula;
    private int edad;
    private int sexo;
    private float peso;
    private float altura;

    public Persona(String nombre, int edad, int sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.cédula = "";
        this.peso = 0;
        this.altura = 0;
    }
    public int calcularIMC(){
        float pesoIdeal = (float) (peso/(Math.pow(altura, 2)));
        if(pesoIdeal < 20){
            return -1;
        } else if(pesoIdeal >= 20 && pesoIdeal <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
    public boolean esMayorDeEdad(){
        if (edad >= 18){
            return true;
        } else {
            return false;
        }
    }
    public char comprobarSexo(char sexo){
        if(sexo == 'H' || sexo == 'M'){
            return sexo;
        } else {
            return sexo = 'H';
        }
    }
    public String generarCedula(){
        Random random = new Random();
        int numeroRandom = random.nextInt(1000000000)+1000000000;
        return numeroRandom + "";
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCédula(String cédula) {
        this.cédula = cédula;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void setSexo(byte sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCédula() {
        return cédula;
    }

    public int getEdad() {
        return edad;
    }

    public int getSexo() {
        return sexo;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }
}
