package CalculadoraJava;
public class Calculos implements CalculosInterface{
    private double num1;
    private double num2;
    private int operador;
    
    public Calculos(double num1, double num2, int operador){
        this.num1 = num1;
        this.num2 = num2;
        this.operador = operador;
    }
    
    public double getNum1(){
        return num1;
    }
    
    public void setNum1(double num1){
        this.num1 = num1;
    }
    
    public double getNum2(){
        return num2;
    }
    
    public void setNum2(double num2){
        this.num2 = num2;
    }
    
    public int getOperador(){
        return operador;
    }
    
    public void setOperador(int operador){
        this.operador = operador;
    }
    
    @Override
    public double Calcular(){
        
    }
}
