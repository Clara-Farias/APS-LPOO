package Aps.Cliente;

import Aps.equipamentos_.*;

public class ClienteComAssAnual extends cliente {
    public ClienteComAssAnual(){
        equipamentos = new Skate();
        tipodeCliente = "Possue Assinatura Anual";
        Nome = "Maria Eduarda";
        CPF = "790.830.237-44";
       
    }

    public void usarEquipamento(){
        equipamentos.equipamentos();
    }
}
