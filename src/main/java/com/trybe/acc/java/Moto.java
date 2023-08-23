package com.trybe.acc.java;

/**
 * Método principal.
 */

public class Moto extends VeiculoBase {

  /**
   * Atributos e Métodos.
   */

  private String tipo;

  public Moto(
      String marca,
      String modelo,
      int ano,
      String tipoCombustivel,
      int capacidadeTanque,
      String tipo
  ) {
    super(marca, modelo, ano, tipoCombustivel, capacidadeTanque);
  }

  @Override
  public double calcularConsumoCombustivel(double distancia) {
    return distancia / 18.0;
  }

  @Override
  public void exibirInformacoes() {
    System.out.println("Marca: " + super.getMarca());
    System.out.println("Modelo: " + super.getModelo());
    System.out.println("Ano: " + super.getAno());
    System.out.println("Tipo de combustivel: " + super.getTipoCombustivel());
    System.out.println("Capacidade do Tanque: " + super.getCapacidadeTanque());
  }

}
