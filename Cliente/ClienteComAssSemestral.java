package Aps.Cliente;

import Aps.equipamentos_.*;

public class ClienteComAssSemestral extends cliente {
    public ClienteComAssSemestral(){
        equipamentos = new bikeDupla();
        tipodeCliente = "Possue Assinatura Semestral";
        Nome = "Samuel Solon";
        CPF = "874.028.238-77";
        
    }
    public void usarEquipamento(){
        equipamentos.equipamentos();
    }
}
