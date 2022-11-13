package Aps.Cliente;

import Aps.equipamentos_.*;

public class ClienteComAssSemanal extends cliente {
    public ClienteComAssSemanal(){
        equipamentos = new PranchaSurf();
        tipodeCliente = " Possue Assinatura Semanal";
        Nome = "Clara Letícia";
        CPF = "067.804.045-67";

    }
    
    public void usarEquipamento(){
        equipamentos.equipamentos();
    }
}