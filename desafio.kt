package main
enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String, val email: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableSetOf<Usuario>()
    
    fun matricular(usuario: Usuario) : String {

        return if (inscritos.add(usuario)) {
            "${usuario.nome} matriculado com sucesso em $nome!"
        } else {
            "${usuario.nome} já é aluno desta formação ($nome)!"
        }
    }
    fun cancelarMatricula(usuario: Usuario): String {
        return if (inscritos.remove(usuario)) {
            "${usuario.nome} cancelou sua matricula em $nome!"
        } else {
            "${usuario.nome} não está matriculado em ($nome) !"
        }
    }

    fun montarRelatorio() : String {
        return  "---------------------------------------------------------------------------\n" +
                "Formação:               $nome - Nível: $nivel \n " +
               "Usuários matriculados: " + inscritos.joinToString(separator = "\n\t\t\t\t") { usuario -> usuario.nome }
    }
}

