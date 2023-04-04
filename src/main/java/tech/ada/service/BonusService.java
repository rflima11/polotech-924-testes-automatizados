package tech.ada.service;

import tech.ada.model.Funcionario;

public class BonusService {

    /*
       Funcionário que vende acima de 20 roupas, recebem 5% de bônus
       Funcionário que vende acima de 30 roupas, recebem 10% de bônus
     */

    public double calcularBonus(Funcionario funcionario, int roupasVendidas) {
        double bonus = 0;
        if (roupasVendidas > 20) {
            bonus = 0.05;
        }

        if (roupasVendidas > 30) {
            bonus = 0.10;
        }

        return funcionario.getSalario() * bonus;
    }
}
