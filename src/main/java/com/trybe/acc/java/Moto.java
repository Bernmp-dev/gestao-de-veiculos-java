package com.trybe.acc.java;

/**
 * Método principal.
 */

public class Moto extends VeiculoBase {

  /**
   * Atributos e Métodos.
   */

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

}
