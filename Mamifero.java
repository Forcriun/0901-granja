/**
 * Clase que representa a un mamifero de la granja.
 *
 * @author Didac Fernandez
 * @version 2018/05/15 - 11:40
 */
public abstract class Mamifero extends Animal
{    
    private static final int PESO_GANADO_POR_COMER_MAMIFERO = 2;

    private int calidadRaza;

    /**
     * Constructor de objetos de la clase Mamifero
     * 
     * @param   pesoInicial              El peso inicial del objeto Mamifero.
     * @param   sonidoCaracteristico     El sonido caracteristico del objeto Mamifero.
     * @param   calidadRaza              La calidad de la raza del objeto Mamifero.
     */
    public Mamifero(int pesoInicial,String sonidoCaracteristico, int calidadRaza)
    {
        super(pesoInicial,sonidoCaracteristico);
        this.calidadRaza = calidadRaza;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void comer()
    {
        if(calidadRaza < 5){
            super.comer();
        }
        else{
            int puntosVidaPerdidosPorCalidadRaza = 10 - calidadRaza;
            setPuntosDeVida(getPuntosDeVida() - puntosVidaPerdidosPorCalidadRaza);
        }
        incrementarPeso(PESO_GANADO_POR_COMER_MAMIFERO);
    }
}
