package main

fun main() {

    // criar conteudos

    val conteudosKotlin = listOf(
        ConteudoEducacional("Controle de fluxo", 30),
        ConteudoEducacional("SpringBoot", 45)
    )

    val conteudosJava = listOf(
        ConteudoEducacional("Controle de fluxo", 30),
        ConteudoEducacional("Poo", 45),
        ConteudoEducacional("SpringBoot", 45)
    )
    val conteudosDevops = listOf(
        ConteudoEducacional("AWS essentials", 30),
        ConteudoEducacional("ElasticBeanstalk", 45),
    )


    val formacaoKotlin = Formacao("Kotlin", conteudosKotlin, Nivel.BASICO)
    val formacaoJava = Formacao("Java", conteudosJava, Nivel.INTERMEDIARIO)
    val formacaoDevops = Formacao("Devops", conteudosDevops, Nivel.DIFICIL)


    // criando formacoes
    println(formacaoKotlin)
    println(formacaoJava)
    println(formacaoDevops)

    // criacao de usuarios
    val usuario1 = Usuario("Joao", "joao@miarroba.com")
    val usuario2 = Usuario("Arlindo", "arlindo@miarroba.com")
    val usuario3 = Usuario("Batriz", "beatriz@miarroba.com")
    val usuario4 = Usuario("Isadora", "isadora@miarroba.com")
    val usuario5 = Usuario("Fernando", "fernando@miarroba.com")
    val usuario6 = Usuario("Nivaldo", "nivaldo@miarroba.com")
    val usuario7 = Usuario("Bonésio", "bonesio@miarroba.com")


    // matricular do 1 ao 3
    println(formacaoKotlin.matricular(usuario1))
    println(formacaoKotlin.matricular(usuario2))
    println(formacaoKotlin.matricular(usuario3))

    // tenta matricular usuario 1 e 2 novamente.
    // esperado que seja exibida a mensagem informando que ele ja esta matriculado na formacao
    println(formacaoKotlin.matricular(usuario1))
    println(formacaoKotlin.matricular(usuario2))


    // realizar as matriculas em outros cursos

    println(formacaoJava.matricular(usuario4))
    println(formacaoJava.matricular(usuario5))


    println(formacaoDevops.matricular(usuario6))
    println(formacaoDevops.matricular(usuario7))


    // remove a matricula do usuario 4 em Java
    // e matricula-o em Kotlin

    println(formacaoJava.cancelarMatricula(usuario4))
    println(formacaoKotlin.matricular(usuario4))


    // remove a matricula do usuario 3 de Devops
    // Espera-se que seja exibida mensagem de erro, pois o usuario 3 nao esta matriculado neste curso
    println(formacaoDevops.cancelarMatricula(usuario3))


    // apresentar resultado final

    println(formacaoKotlin.montarRelatorio())
    println(formacaoJava.montarRelatorio())
    println(formacaoDevops.montarRelatorio())






}
