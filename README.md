# AxLIP-Middleware

## Запуск

Для того чтобы проект корректно запустился, необходимо выполнить следующие шаги:

1. **Собрать образ**:

    ```bash
    docker build -t ax-lip-middleware-app .
    ```

2. **Запустить контейнер**:

    ```bash
    docker run -it -p 9997:9997 --rm --name ax-lip-middleware-app ax-lip-middleware-app
    ```