class Cliente {

    constructor(
        endereco: Endereco,
        nome: String,
        telefone: String,
        cpf: String,
    ){
        this.endereco = endereco
        this.nome = nome
        this.telefone = telefone
        this.cpf = cpf
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

    var cpf: String? = null
            get() = if (field.isNullOrEmpty()) "CPF não informado" else field
        set(value) {
            field = if (value?.length == 11) value else null
        }
}