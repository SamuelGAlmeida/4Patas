package enums;

/**
 *
 * @author Samuel Almeida
 */
public enum Gender {

    // 2 Géneros M (Masculino), F (Feminino)
    M, F;

    /**
     * Método para transformar o Género para string
     *
     * @param genero
     * @return
     */
    public static String chesseTypeToString(Gender gender) {

        switch (gender) {
            case M:
                return "Masculino";
            case F:
                return "Feminino";
            default:
                return "Sexo inválido";
        }
    }
}
