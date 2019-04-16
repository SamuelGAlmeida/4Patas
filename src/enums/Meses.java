package enums;

/**
 *
 * @author Samuel Almeida
 */
public enum Meses {
    
    //Meses 
    JAN, FEV, MAR, ABR, MAIO, JUN, JUL,
    AGO, SET, OUT, NOV, DEZ;
    
    /**
     * Método toString para imprimir o tamanho do cão
     *
     * @param mes
     * @return
     */
    
     public String MesToString(Meses mes) {
        switch (mes) {
            case JAN:
                return "Janeiro";
            case FEV:
                return "Fevereiro";
            case MAR:
                return "Março";
                case ABR:
                return "Abril";
                case MAIO:
                return "Maio";
                case JUN:
                return "Junho";
                case JUL:
                return "Julho";
                case AGO:
                return "Agosto";
                case SET:
                return "Setembro";
                case OUT:
                return "Outubro";
                case NOV:
                return "Novembro";
                case DEZ:
                return "Dezembro";
            default:
                return "Mês Inválido";
        }
    }
    
}
