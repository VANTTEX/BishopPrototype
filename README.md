Запуск
1. Запустите Kafka через Docker:
 ```
docker-compose up -d
```
3. Настройте application.yml(BishopPrototype/src/main/resources/applicatiom.yml):
```
weyland:
  audit:
    console-output: true
    kafka-topic:
```
console-output: true - сообщения выводятся в консоль

console-output: false - сообщения не выводятся в консоль

kafka-topic: - если пустой, то Kafka отключена

kafka-topic: audit-topic(можно указать название топика)

3. Запустите Spring Boot приложение

Тестирование:
Отправьте POST-запрос на http://localhost:8080/demo/command
```
{
  "description": "Проверить реактор",
  "priority": "COMMON",
  "author": "Рипли",
  "time": "2025-07-20T10:00:00Z"
}
```
Проверка ошибок:
```
{
  "description": "Проверить реактор",
  "priority": "non-existent priority",
  "author": "Рипли",
  "time": "2025-07-20T10:00:00Z"
}
```
