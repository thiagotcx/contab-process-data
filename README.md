# Contab

1. Catalogo de produtos / categorias
2. Entradas de notas fiscais
3. Saídas a partir de vendas de produtos
4. Saídas a partir de baixas de estoque (produtos vencidos)

```
tb_products

- productId
- categoryId
- description MARTELO BX32
- barcode
- price
- isActive
- isDeleted
- createdAt
```

``` 
tb_category

- categoryId
- description 
- isActive
- isDeleted
- createdAt
```

```
tb_orders

- orderId
- document
- company
- total
- status (CREATED, FINISHED, CANCELLED, INVALID)
- createdAt (DateTime)
- statusUpdatedAt (DateTime)

Regras de negócio:
- Ordem de pedido só pode ser deletada quando no status CREATED
- Status FINISHED, CANCELLED, INVALID são status finais
```

```
tb_order_products

- orderProductId
- orderId
- description
- barcode
- amount
- price
- subTotal
- isDeleted
- createdAt

Regras de negócio:
- Calculo: subTotal = amount * price
- Imutabilidade nos dados do produto
- Ao chegar uma nova nota fiscal, a partir do codigo de barras vai ser atualizado os dados do produto
- Ao incluir uma nota fiscal, caso o produto não esteja na base, precisa ser incluido
```
