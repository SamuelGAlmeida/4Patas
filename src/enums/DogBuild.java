package enums;

/**
 *
 * @author Samuel Almeida
 */
public enum DogBuild {

    // Tamanhos dos cães
    SMALL, MEDIUM, LARGE;

    /**
     * Método toString para imprimir o tamanho do cão
     *
     * @param size
     * @return
     */
    public String BuildToString(DogBuild size) {
        switch (size) {
            case SMALL:
                return "Pequeno";
            case MEDIUM:
                return "Médio";
            case LARGE:
                return "Grande";
            default:
                return "Inválido";
        }
    }

}
