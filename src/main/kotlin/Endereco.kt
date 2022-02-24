class Endereco {

    constructor(
        cep: String,
        estado: String,
        numero: String,
        cidade: String,
    ){
        this.cep = cep
        this.estado = estado
        this.numero = numero
        this.cidade = cidade
    }


    var cidade: String? = null
        get() = if (field.isNullOrEmpty()) "Cidade não informada" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var estado: String? = null
        get() = if (field.isNullOrEmpty()) "Estado não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var cep: String? = null
        get() = if (field.isNullOrEmpty()) "CEP não informado" else field
        set(value) {
            field = if (value?.length == 8) value else null
        }

    var numero: String? = null
        get() = if (field.isNullOrEmpty()) "Numero não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
}