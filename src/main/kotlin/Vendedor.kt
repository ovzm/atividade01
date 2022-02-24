class Vendedor {

    constructor(
        endereco: Endereco,
        idVendedor: Vendedor,
        nome: String,
        telefone: String,
        cpf: String,

        )

    var endereco:Endereco? = null
        set(value) {
            if (value != null) {
                field = value
            }
        }

    var idVendedor: String? = null
        get() = if (field.isNullOrEmpty()) "Id não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
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