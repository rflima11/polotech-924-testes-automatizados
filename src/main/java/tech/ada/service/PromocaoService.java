package tech.ada.service;

import tech.ada.model.Cargo;
import tech.ada.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class PromocaoService {


    /*
    * Para que o funcionário seja elegivel a promooção de gerente,
    * deve possuir o cargo de 'Vendedor', deve possuir mais de um ano de empresa
    * e deve ter vendido mais de 20.000 reais
    * */
    public boolean isVendedorElegivelPromocao(Funcionario funcionario) {
        boolean isVendedor = funcionario.getCargo().equals(Cargo.VENDEDOR);
        boolean possuiMaisDeUmAnoDeFirma = funcionario.getDataAdmissao().isBefore(LocalDate.now().minusYears(1));
        boolean vendeuMaisQueVinteMil = funcionario.getVendas() > 20000d;

        return isVendedor && possuiMaisDeUmAnoDeFirma && vendeuMaisQueVinteMil;
    }
}
