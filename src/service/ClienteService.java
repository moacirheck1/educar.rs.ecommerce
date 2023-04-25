
package service;

import entity.Cliente;
import repository.ClienteRepository;

public class ClienteService {
    private ClienteRepository clienteRepository=new ClienteRepository();
   public Cliente salvarCliente(Cliente cliente){
       return clienteRepository.salvarCliente(cliente);
   }
   public Cliente validarCliente(Cliente cliente){
       return clienteRepository.validarLogin(cliente);
   }
}
