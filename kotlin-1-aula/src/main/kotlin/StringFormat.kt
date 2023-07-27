fun main() {
    val nome = "Tony"
    val sobrenome = "Stark"
    println("Olá, " + nome + " " + sobrenome)

    println("Olá, $nome $sobrenome")

    println("$nome tem ${nome.length} letras" +
            "\n$sobrenome tem ${sobrenome.length}")
}