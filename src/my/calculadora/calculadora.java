
package my.calculadora;



public class calculadora {
   //atributos
    float dato1,dato2,dato3,resultado;
    //metodo constructor para incializar
    public calculadora()
    {
        dato1=0;
        dato2=0;
        dato3=0;
        resultado=0;
    }
     public calculadora(float d1,float d2, float d3, float r)
    {
        dato1=d1;
        dato2=d2;
        dato3=d3;
        resultado=r;
    }
    public float suma(float d1,float d2)
    {
        resultado=d1+d2;
        return resultado;
    }
    public float resta(float d1,float d2)
    {
       resultado=d1-d2;
       return resultado;
    }
    public float mult(float d1,float d2)
    {
       resultado=d1*d2;
        return resultado;
    }
    public float div(float d1,float d2)
    {
       resultado=d1/d2;
        return resultado;
    }
    public float sin(float d1)
    {
        resultado= (float) Math.sin(d1);
        return resultado;
    }
    public float cos(float d1)
    {
        resultado=(float) Math.cos(d1);
        return resultado;
    }
    public float tan(float d1)
    {
        resultado=(float)Math.tan(d1);
        return resultado;
    }
    public float pot(float d1,float d2)
    {
        resultado=(float)Math.pow(d1, d2);
        return resultado;
    }
    public float raiz(float d1, float d2)
    {
        resultado=(float)Math.pow(d1,1.0/d2);
        return resultado;
    }
    public float iva(float d1)
    {
        resultado=(float)(d1*0.19);
        return resultado;
    }
}

