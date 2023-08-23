package com.trybe.acc.java;

/**
 * Método principal.
 */

public abstract class VeiculoBase implements Veiculo {

  /**
   * Atributos.
   */
  private String marca;
  private String modelo;
  private int ano;
  private String tipoCombustivel;
  private int capacidadeTanque;

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

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public String getTipoCombustivel() {
    return tipoCombustivel;
  }

  public void setTipoCombustivel(String tipoCombustivel) {
    this.tipoCombustivel = tipoCombustivel;
  }

  public int getCapacidadeTanque() {
    return capacidadeTanque;
  }

  public void setCapacidadeTanque(int capacidadeTanque) {
    this.capacidadeTanque = capacidadeTanque;
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
