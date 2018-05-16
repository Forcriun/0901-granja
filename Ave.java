import java.util.Random;

/**
 * Clase que representa a una ave de la granja.
 *
 * @author Didac Fernandez
 * @version 2018/05/15 - 11:40
 */
public abstract class Ave extends Animal
{    
    private static final int PESO_GANADO_POR_COMER_AVE = 1;

    private boolean modificadoGeneticamente;

    /**
     * Constructor de objetos de la clase Ave
     * 
     * @param   pesoInicial              El peso inicial del objeto Ave.
     * @param   sonidoCaracteristico     El sonido caracteristico del objeto Ave.
     * @param   modificadoGeneticamente  Indica si el objeto Ave ha sido modificado geneticamente al nacer.
     */
    public Ave(int pesoInicial,String sonidoCaracteristico, boolean modificadoGeneticamente)
    {
        super(pesoInicial,sonidoCaracteristico);
        this.modificadoGeneticamente = modificadoGeneticamente;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void comer()
    {
        Random r1 = new Random();
        boolean cincuentaPorCientoModifGenetica = r1.nextBoolean();

        if(modificadoGeneticamente){
            if(cincuentaPorCientoModifGenetica)
                super.comer();
        }
        else{
            super.comer();
        }

        incrementarPeso(PESO_GANADO_POR_COMER_AVE);
    }

    public boolean getModificadoGeneticamente()
    {
        return modificadoGeneticamente;
    }
}