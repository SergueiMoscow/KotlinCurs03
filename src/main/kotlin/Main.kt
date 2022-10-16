/*
Задача:
Создать пустую коллекцию
Заполнить коллекцию числами от 1 до 10 с помощью циклов
Создать функцию для вывода содержимого коллекции на экран
Вывести на экран содержимое коллекции
*/
fun printList(list: List<Int>)
{
    for(index in list.indices){
        println("Index: $index, value: ${list[index]}")
    }
}
fun main(args: Array<String>) {
    var listNumbers = mutableListOf<Int>()
    for (i in 0..9) listNumbers.add(i, i+1)
    printList(listNumbers)
}