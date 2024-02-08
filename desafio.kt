// Abstraçao das formações da DIO usando a linguagem de programação Kotlin.
// Nesse código foi trabalhado o conceito de Programação Orientada a Objetos (POO).
// Usuários são matriculados nas formações. Depois são imprimidas as características das formações e lista de matriculados. 

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracaoHoras: Int)

data class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) { inscritos.add(usuario) }
        
    fun imprimirCaracteristicas() {
    	println("\n$nome - Nível: $nivel - Quantidade de inscritos: ${inscritos.size}")
    	println("Conteúdos Educacionais:")
    	for (conteudo in conteudos) {
        	println("- ${conteudo.nome} - ${conteudo.duracaoHoras} hrs")
    	}
    }
 
    fun imprimirMatriculados() { 
        for (i in inscritos) { 
            println("- Usuário: ${i.nome} - Formação: $nome") 
        }
    }
}

fun main() {

    val kotlin = Formacao("Desenvolvimento Backend com Kotlin", Nivel.BASICO,
        listOf(ConteudoEducacional("Princípios da Agilidade e Desenvolvimento Colaborativo", 9), 
               ConteudoEducacional("Aprendendo Kotlin na Prática em Sua Documentação Oficial", 13),
               ConteudoEducacional("Praticando sua Lógica de Programação com Kotlin", 6),
               ConteudoEducacional("Explorando Padrões de Projeto em Kotlin", 5),
               ConteudoEducacional("Entendendo Banco de Dados SQL e NoSQL", 6),
               ConteudoEducacional("Kotlin no Backend com Spring Boot 3", 10)));
    
    val cybersecurity = Formacao("Cybersecurity Specialist", Nivel.INTERMEDIARIO,
        listOf(ConteudoEducacional("Conhecendo a Formação de Cibersegurança", 1),
               ConteudoEducacional("Fundamentos de Cibersegurança", 7),
               ConteudoEducacional("Testes de Invasão e Busca Por Vulnerabilidades", 8),
               ConteudoEducacional("Exploração de Vulnerabilidade e Pós-Exploração", 7)));
    
    val machineLearning = Formacao("Machine Learning Specialist", Nivel.AVANCADO,
        listOf(ConteudoEducacional("Introdução ao Machine Learning", 10),
               ConteudoEducacional("Programação para o Machine Learning", 15),
               ConteudoEducacional("Algoritmos de Treinamento em Machine Learning", 10),
               ConteudoEducacional("Teoria do Aprendizado Estatístico", 9),
               ConteudoEducacional("Fundamentos e Práticas de Deep Learning", 11),
               ConteudoEducacional("Frameworks de Deep Learning", 11),
               ConteudoEducacional("Processamento de Imagens com Machine Learning", 16),
               ConteudoEducacional("Visão computacional com Machine Learning", 9)));
  
    val usuario1 = Usuario("Mateus")
    val usuario2 = Usuario("Larissa")
    val usuario3 = Usuario("Rebeca")
    val usuario4 = Usuario("Alexandre")
    val usuario5 = Usuario("Jaqueline")
    val usuario6 = Usuario("João")
    
    kotlin.matricular(usuario1)
    kotlin.matricular(usuario2)
    cybersecurity.matricular(usuario3)
    cybersecurity.matricular(usuario4)
    machineLearning.matricular(usuario5)
    kotlin.matricular(usuario6)
    
    println("FORMAÇÕES DA DIO E SUAS CARACTERÍSTICAS")
    kotlin.imprimirCaracteristicas()
    cybersecurity.imprimirCaracteristicas()
    machineLearning.imprimirCaracteristicas()
    
    println("\nLISTA DE MATRICULADOS\n")
    kotlin.imprimirMatriculados()
    cybersecurity.imprimirMatriculados()
    machineLearning.imprimirMatriculados()
}
