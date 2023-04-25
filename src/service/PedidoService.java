package service;

import entity.ItemPedido;
import entity.Pedido;
import repository.ItemPedidoRepository;
import repository.PedidoRepository;
import repository.ProdutoRepository;



public class PedidoService {

    private final ItemPedidoRepository itemPedidoRepository = new ItemPedidoRepository();
    private final PedidoRepository pedidoRepository = new PedidoRepository();
    private final ProdutoRepository produtoRepository=new ProdutoRepository();

    public Pedido salvarPedido(Pedido pedido) {
        double valorTotal = 0;
        for (ItemPedido ip : pedido.getItensPedido()) {
            valorTotal += ip.getValor();
        }
        pedido.setValorTotal(valorTotal);
        Pedido pedidoSalvo = pedidoRepository.salvarPedido(pedido);
        for (ItemPedido ip : pedido.getItensPedido()) {
            this.itemPedidoRepository.salvarItemPedido(ip, pedidoSalvo.getId());
          this.produtoRepository.atualizaEstoque(ip.getProduto().getId(),ip.getQuantidade());

        }
        return pedidoSalvo;
    }
}
