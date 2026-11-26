# Project 9. Classes and objects

Canvas: https://auk.instructure.com/courses/1274/assignments/33050

## Состав

- `part1_objects.Main`
- `part2_hobby.Main`
- `part3_static.Main`
- `part4_pizza.Main`

## Запуск

Требуется JDK 21. В IntelliJ: открыть проект, выбрать JDK, отметить src как Sources Root. Каждая часть запускается своим main. Рабочая папка — корень этого проекта.

Из PowerShell:

```powershell
$sourceFiles = @(Get-ChildItem src -Recurse -Filter *.java | ForEach-Object FullName)
javac -encoding UTF-8 -d build @sourceFiles
java -cp build part1_objects.Main
java -cp build part2_hobby.Main
java -cp build part3_static.Main
java -cp build part4_pizza.Main
```

## Что показать на защите

Покажи восемь отдельных примеров классов, сообщения конструктора, private/public, getters/setters, два разных объекта Book, static и сортировку пяти пицц.

## Как объяснить

Класс задаёт структуру и поведение, объект — конкретный экземпляр. Конструктор задаёт начальное состояние. private закрывает прямой доступ к полю, а setter может проверить значение. Book объединяет данные книги и вычисление времени чтения. static принадлежит классу, а не отдельному объекту.

## Возможные вопросы

- **Зачем this?** Ссылается на текущий экземпляр и различает поле и одноимённый параметр.
- **Чем static отличается от instance-поля?** Одна общая переменная класса против отдельного значения в каждом объекте.
- **Почему private нельзя вызвать из main другого класса?** Ограничение доступа проверяет компилятор; настоящие примеры ошибок лежат в error_examples.

## Замечания

Тема книг выбрана как пример хобби. Перед защитой лучше заменить книги на действительно знакомые тебе. Необязательные static и Pizza включены.

Файл RUNS.txt содержит настоящие результаты локального запуска с демонстрационным вводом. Это журналы, а не скриншоты IntelliJ. Проверка выполнена 26 ноября 2026. Ошибочные учебные примеры находятся отдельно от src.
