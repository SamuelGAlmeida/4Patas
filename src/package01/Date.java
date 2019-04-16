package package01;
import enums.Meses;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Classe que representa a estrutura de uma Data
 * </p>
 */

public class Date {

    /**
     * Identificador do dia
     */
    private int day;
    /**
     * Identificador do mês
     */
    private Meses mes;
    /**
     * Identificador do ano
     */
    private int year;
    
    /**
     * Método construtor para a criação de uma instância de .
     * {@link Date data}
     *
     * @param day Identificador do dia
     * @param month{@link Meses} Identificador do mês
     * @param year Identificador do ano
     */
    Date(int day, Meses month, int year) {

        if (verificarDia(day, month)) {
            this.mes = month;
            this.year = year;
        }
        this.day = 1;
        this.mes = Meses.JAN;
        this.year = 2000;

    }

    private boolean verificarDia(int dia, Meses mes) {
        if (dia < 32 && dia > 0) {

            //Se o mês for Fevereiro os dias são entre 1-29
            if (mes == Meses.FEV) {
                if (dia >= 0 && dia <= 29) {
                    return true;
                }
            }

            //Se forem os meses Abril, Junho, Setembro, Novembro
            //os dias têm de ser entre 1-30
            if (mes == Meses.ABR || mes == Meses.JUN
                    || mes == Meses.SET || mes == Meses.NOV) {
                if (dia > 0 && dia <= 30) {
                    return true;
                }
            }
            return true;
        } else {
            return false;
        }

    }

    /**
     * Método getter para a variável de instância {@link Date#day day}
     *
     * @return o {@link Date#day day} de uma data
     */
    public int getDay() {
        return day;
    }

    /**
     * Método setter para a variável de instância {@link Date#day day}
     *
     * @param day {@link Date#day day} de uma data
     */
    public void setDay(int day) {
        if (verificarDia(day, this.mes)) {
            this.day = day;
        }
        System.out.println("Dia inválido para o mês selecionado");
    }

    /**
     * Método getter para a variável de instância {@link Date#mes mes}
     *
     * @return o {@link Date#mes mes} de uma data
     */
    public Meses getMes() {
        return mes;
    }

    /**
     * Método setter para a variável de instância {@link Date#mes mes}
     *
     * @param mes {@link Date#mes mes} de uma data
     */
    public void setMes(Meses mes) {
        if (verificarDia(this.day, mes)) {
            this.mes = mes;
        }
        System.out.println("Mês inválido para o dia selecionado");
    }

    /**
     * Método getter para a variável de instância {@link Date#year year}
     *
     * @return o {@link Date#year year} de uma data
     */
    public int getYear() {
        return year;
    }

    /**
     * Método setter para a variável de instância {@link Date#year year}
     *
     * @param year {@link Date#year year} de uma data
     */
    public void setYear(int year) {
        this.year = year;
    }
}
