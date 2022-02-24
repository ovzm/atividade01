class Produto {

    constructor(
        idProduto: String,
        fabricante: String,
        categoria: String,
        descProduto: String,
        nome: String,
        estoque: String,
    ) {
        this.idProduto = idProduto
        this.fabricante = fabricante
        this.categoria = categoria
        this.descProduto = descProduto
        this.nome = nome
        this.estoque = estoque
    }

    var idProduto: String? = null
        get() = if (field.isNullOrEmpty()) "Id não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var fabricante: String? = null
        get() = if (field.isNullOrEmpty()) "Fabricante não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var categoria: String? = null
        get() = if (field.isNullOrEmpty()) "Categoria não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var descProduto: String? = null
        get() = if (field.isNullOrEmpty()) "Descriçao do produto não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }


    var nome: String? = null
        get() = if (field.isNullOrEmpty()) "Nome não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var estoque: String? = null
        get() = if (field.isNullOrEmpty()) "Estoque não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
}

