package com.trybe.acc.java;

/**
 * Método principal.
 */

public class Carro extends VeiculoBase {

  private final int numeroDePassageiros;

  public Carro(
      String marca,
      String modelo,
      int ano,
      String tipoCombustivel,
      int capacidadeTanque,
      int numeroDePassageiros
  ) {
    super(marca, modelo, ano, tipoCombustivel, capacidadeTanque);
    this.numeroDePassageiros = numeroDePassageiros;
  }

  @Override
  public double calcularConsumoCombustivel(double distancia) {
    return distancia / 10;
  }

  @Override
  public void exibirInformacoes() {
    System.out.println("Marca: " + super.getMarca());
    System.out.println("Modelo: " + super.getModelo());
    System.out.println("Ano: " + super.getAno());
    System.out.println("Tipo de combustivel: " + super.getTipoCombustivel());
    System.out.println("Capacidade do Tanque: " + super.getCapacidadeTanque());
    System.out.println("Número de Passageiros: " + this.numeroDePassageiros);
  }

}
