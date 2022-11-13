package Aps.Cliente;

import Aps.equipamentos_.trocadeEquipamento;

public abstract class cliente {
    
    private static final String Assinante3 = "Samuel - Assinante 3";
    protected String Nome;
    protected String Ass;// assinante
    trocadeEquipamento equipamentos;
    protected String CPF;
    protected String tipodeCliente;

    public String getNome() {
        System.out.println("Assinante: "+Nome);
        return null;
    }

    public String getCpf() {
        System.out.println("Meu CPF: "+CPF);
        return null;
    }
    public void setEquipamento(trocadeEquipamento equipamentos) {
        System.out.println("-----------------Troca de Equipamento------------------");
        System.out.println(Assinante3+" acabou de Trocar de Equipamento");
        this.equipamentos = equipamentos;
    }
    public trocadeEquipamento getEquipamentos() {
        return equipamentos;
    }

    public void apresentar(){
        System.out.printf("Assinante: %s \nCPF: %s \nAssinatura: %s \n",Nome,CPF,tipodeCliente);
    }

    public abstract void usarEquipamento();

    public void setAssinante(String string) {
    }
}