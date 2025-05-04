# Nginx-Java Application

## Описание проекта

Данный проект представляет собой простое Java-приложение, интегрированное с веб-сервером Nginx. Основная цель проекта - продемонстрировать базовую конфигурацию и работу Nginx в качестве обратного прокси-сервера для Java-приложения.

## Структура проекта
```
project/
├── nginx.conf
├── src/
│   └── main/
│       └── java/
│           └── com/ludoed/
│                ├── controller/
│                │   └── UserController.java
│                ├── model/
│                │   └── User.java
│                ├── service/
│                │   └── UserService.java
│                └── NginxApp.java
├── Dockerfile
├── pom.xml
└── docker-compose.yml
```

## Основные компоненты

- UserController.java - REST контроллер для работы с пользователями
- User.java - Модель пользователя
- UserService.java - Сервисный слой для бизнес-логики
- NginxApp.java - Основной класс приложения
- nginx.conf - Конфигурация Nginx для проксирования запросов

---

## Запуск проекта

1. Клонируйте репозиторий:

    ``` git clone https://github.com/LudoEd112/NginxTest.git ```
2. Запустите приложение: ```docker-compose up```

## API эндпоинты

- POST /users - Создание нового пользователя
- GET /users/{id} - Получение пользователя по ID
- DELETE /users/{id} - Удаление пользователя

## Docker-compose сервисы

- nginx-app - Java приложение
- nginx - Nginx прокси-сервер

## Конфигурация Nginx
### Nginx настроен как обратный прокси-сервер, который:

- Передает запросы на Java-приложение
- Обрабатывает статический контент
- Обеспечивает базовую безопасность

## Тестирование
 Для тестирования можно использовать любой HTTP-клиент (например, curl или Postman):
    
``` curl http://localhost/nginx-app/users ```

## Авторы
- Такмаков Дмитрий - Основной разработчик