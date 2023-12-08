# Практическрая работа №7
### Вариант №15: Посуда

## Инструкция по сборке и запуску
Убедитесь, что на вашем компьютере присутствует [JDK](https://www.oracle.com/java/technologies/downloads/#jdk17-windows)

```
git clone https://github.com/waffflezz/rkis-7.git
cd rkis-7
psql -U postgres -h localhost -f create_db.sql
sh mvnw package -Dallow.run=false 
java -jar target/rkis-7-0.0.1-SNAPSHOT.jar -Dallow.run=true
```

Открываем в браузере [страницу localhost](http://127.0.0.1:8080)

Пример работы в браузере:

![image](https://github.com/waffflezz/rkis-7/assets/56751225/fe94a746-b94b-457d-80d4-17707b95b6b3)

Тестовые запросы будут отправлены и выведены после загрузки сервера, после этого можно пользоваться приложение дальше как обычно, а также используя MVC.

_Для сборки необходимо иметь [Maven](https://maven.apache.org/download.cgi) на компьютере_

## Примеры работы REST клиента
1. Запуск сервера:

![image](https://github.com/waffflezz/rkis-7/assets/56751225/11031bab-0e0f-4290-96da-1462c34f9505)

2. После запуска сервера запускается клиент:

![image](https://github.com/waffflezz/rkis-7/assets/56751225/23c8fc80-ece3-4487-a078-3a98c697af05)

3. Пример работы клиента

![image](https://github.com/waffflezz/rkis-7/assets/56751225/e292b1e9-42b8-4ef1-acbb-500000aff08f)
