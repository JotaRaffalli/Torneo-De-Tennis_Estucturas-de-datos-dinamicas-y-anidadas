package Fuente;

//@author Raffalli Jose Luis,Maldonado Carlos.

public class CNCola_Jugadores extends CNA_Jugador implements java.io.Serializable
{
    private CNCola_Jugadores prox;
    
    public CNCola_Jugadores()
    {
        
    }
    
    public CNCola_Jugadores(String nombre, int edad, int cedula,String sexo)
    {
        super(nombre,edad,cedula,sexo);
        this.prox = null;
    }

    public CNCola_Jugadores getProx() 
    {
        return prox;
    }

    public void setProx(CNCola_Jugadores prox) 
    {
        this.prox = prox;
    }
}
