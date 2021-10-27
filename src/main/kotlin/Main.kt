fun main(args: Array<String>) {

    var num = 0
    var soma = 0
    var media = 0.0
    var menor = 0
    var maior = 0
    var contNum = 0

    do{
        print("Digite números para fazermos alguns calculos," +
                "e quando quiser parar, digite 0 : ")

        num = readLine()!!.toInt()

        if(contNum == 0){
            menor = num
            maior = num
        }
        if(menor > num && num != 0){
            menor = num
        }
        if(maior < num)
            maior = num
        soma += num
        contNum++
    }while(num != 0)

    media = (soma / (contNum-1)).toDouble()

    println("A soma dos números é igual a: $soma " +
            "\nA média foi: $media " +
            "\nO menor número digitado foi: $menor " +
            "\nO maior número digitado foi: $maior")

}