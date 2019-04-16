package package01;

import enums.Meses;

public class Date {

    public int day;
    public Meses mes;
    public int year;

    Date(int day, Meses month, int year) {

        this.mes = month;

        if (day < 32 && day > 0) {

            if (mes == Meses.FEV) {
                if (day >= 0 && day <= 29) {
                    this.day = day;
                }
            }

            if (mes == Meses.ABR || mes == Meses.JUN || mes == Meses.SET || mes == Meses.NOV) {
                if (day > 0 && day <= 30) {
                    this.day = day;
                }
            }

            this.day = day;
        } else {
            System.out.println("Número de dia inválido");
        }

        this.year = year;

    }
}
