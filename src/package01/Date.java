package package01;

import enums.Meses;

public class Date {

    private int day;
    private Meses mes;
    private int year;

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

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (verificarDia(day, this.mes)) {
            this.day = day;
        }
        System.out.println("Dia inválido para o mês selecionado");
    }

    public Meses getMes() {
        return mes;
    }

    public void setMes(Meses mes) {
        if (verificarDia(this.day, mes)) {
            this.mes = mes;
        }
        System.out.println("Mês inválido para o dia selecionado");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
