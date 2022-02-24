class Transportadora {

    constructor(
        telefone: String,
        cnpj: String,
        endereco: Endereco,
        nome: String,
    ){
        this.endereco = endereco
        this.cnpj = cnpj
        this.telefone = telefone
        this.nome = nome
    }


    var endereco:Endereco? = null
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