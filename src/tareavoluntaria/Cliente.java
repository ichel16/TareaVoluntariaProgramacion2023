/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareavoluntaria;

/**
 *
 * @author ichel
 */
public class Cliente {
    
    private String nif;
    private boolean personaFisica;
    private String denominacion;
    private float kilosAceitunas;
    private float rendimiento;

    public Cliente() {
    }

    public Cliente(String nif, boolean personaFisica, String denominacion) {
        this.nif = nif;
        this.personaFisica = personaFisica;
        this.denominacion = denominacion;
        this.kilosAceitunas = 0;
        this.rendimiento = 0;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public boolean isPersonaFisica() {
        return personaFisica;
    }

    public void setPersonaFisica(boolean personaFisica) {
        this.personaFisica = personaFisica;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public float getKilosAceitunas() {
        return kilosAceitunas;
    }

    public void setKilosAceitunas(float kilosAceitunas) {
        this.kilosAceitunas = kilosAceitunas;
    }

    public float getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(float rendimiento) {
        this.rendimiento = rendimiento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nif=" + nif + ", personaFisica=" + personaFisica + ", denominacion=" + denominacion + ", kilosAceitunas=" + kilosAceitunas + ", rendimiento=" + rendimiento + '}';
    }

    //Método para registrar la entrega, indicamos dos valores y actualizamos
    //Los valores del objeto cliente.
    public void registrarEntrega(float kilosAceitunas, float rendimiento){
        this.kilosAceitunas = kilosAceitunas;
        this.rendimiento = rendimiento;
    }
    
    //Calculamos los kilos de aceite que produce el cliente con los valores
    //que obtenemos de sus atributos, devolvemos el valor en tipo float.
    public float calcularKilosAceite(){
        float aceiteProducido;
        
        aceiteProducido = kilosAceitunas * rendimiento;
        
        return aceiteProducido;
    }
    
    
}
