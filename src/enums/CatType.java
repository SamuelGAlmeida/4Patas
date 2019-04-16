package enums;

/**
 *
 * @author Samuel Almeida
 */
public enum CatType {
   
    /**
     * Tipos de gatos
     */
    HOUSE_CAT, STREET_CAT;

    /**
     * Método toString para imprimir o tamanho do cão
     *
     * @param type
     * @return
     */
    public String BuildToString(CatType type) {
        switch (type) {
            case HOUSE_CAT:
                return "Gato de casa";
            case STREET_CAT:
                return "Gato de rua";
            default:
                return "Inválido";
        }
    }
}
