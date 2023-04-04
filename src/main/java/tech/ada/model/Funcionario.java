package tech.ada.model;

import java.nio.DoubleBuffer;
import java.time.LocalDate;

public class Funcionario {

    private String nome;
    private Double salario;
    private LocalDate dataAdmissao;
    private Cargo cargo;
    private Double vendas;

    public Funcionario() {}

    public Funcionario(String nome, Double salario, LocalDate dataAdmissao, Cargo cargo, Double vendas) {
        this.nome = nome;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
        this.vendas = vendas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }
}
