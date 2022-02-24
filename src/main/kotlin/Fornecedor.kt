class Fornecedor {

    constructor(
        telefone: String,
        nome: String,
        idVendedor: Vendedor,
        endereco: Endereco,
        estoque: String,
        cnpj: String,
    ){
        this.endereco = endereco
        this.cnpj = cnpj
        this.estoque = estoque
        this.idVendedor = idVendedor
        this.nome = nome
        this.telefone = telefone
    }

    var endereco:Endereco? = null

        set(value) {
            if (value != null) {
                field = value
            }
        }

    var idVendedor:Vendedor? = null
        set(value) {
            if (value != null) {
                field = value
            }
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

    var telefone: String? = null
        get() = if (field.isNullOrEmpty()) "Telefone não informado" else field
        set(value) {
            field = if (value?.length == 11) value else null
        }

    var cnpj: String? = null
        get() = if (field.isNullOrEmpty()) "CNPJ não informado" else field
        set(value) {
            field = if (value?.length == 11) value else null
        }
}