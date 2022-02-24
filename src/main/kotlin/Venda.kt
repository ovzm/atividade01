class Venda {

    constructor(
        idVendedor: Vendedor,
        produto: Produto,
        preco: String
    ) {
        this.idVendedor = idVendedor
        this.produto = produto
        this.preco = preco
    }

    var idVendedor:Vendedor? = null
        get() = if (field == null) Vendedor() else field
        set(value) {
            if (value != null) {
                field = value
            }
        }

    var produto:Produto? = null
        set(value) {
            if (value != null) {
                field = value
            }
        }

    var preco: String? = null
        get() = if (field.isNullOrEmpty()) "Preço não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
}

