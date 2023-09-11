package com.trybe.acc.java;

/**
 * Método principal.
 */

public abstract class VeiculoBase implements Veiculo {

  /**
   * Atributos.
   */
  private final String marca;
  private final String modelo;
  private final int ano;
  private final String tipoCombustivel;
  private final int capacidadeTanque;

  /**
   * Métodos.
   */
  public VeiculoBase(
      String marca,
      String modelo,
      int ano,
      String tipoCombustivel,
      int capacidadeTanque
  ) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.tipoCombustivel = tipoCombustivel;
    this.capacidadeTanque = capacidadeTanque;
  }

  public String getMarca() {
    return marca;
  }

  public String getModelo() {
    return modelo;
  }

  public int getAno() {
    return ano;
  }

  public String getTipoCombustivel() {
    return tipoCombustivel;
  }

  public int getCapacidadeTanque() {
    return capacidadeTanque;
  }

  @Override
  public void exibirInformacoes() {
    System.out.println("Marca: " + this.getMarca());
    System.out.println("Modelo: " + this.getModelo());
    System.out.println("Ano: " + this.getAno());
    System.out.println("Tipo de combustivel: " + this.getTipoCombustivel());
    System.out.println("Capacidade do Tanque: " + this.getCapacidadeTanque());
  }
}
