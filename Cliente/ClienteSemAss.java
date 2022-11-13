package Aps.Cliente;

import Aps.equipamentos_.*;

public class ClienteSemAss extends cliente {
    public ClienteSemAss(){
        equipamentos= new Bike();
        tipodeCliente = "Não Possue Nenhuma Assinatura!";
        Nome = "Victória Maria";
        CPF = "225.324.422-42";
       
    }
    public void usarEquipamento(){
        equipamentos.equipamentos();
    }
}