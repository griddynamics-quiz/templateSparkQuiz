# Задание Spark & Fun (GridDynamics)

На основе исходных данных /app/airlines.scv, /app/airports.csv, /app/flights.csv (по данным путям будут находиться данные при выполнении вашей реализации; описание исходных данных и сами данные находятся по адресу: https://www.kaggle.com/usdot/flight-delays) получить DataSet авиакомпаний с максимальным средним временем задержки рейсов сгруппированных по аэропортам (результат должен быть отсортирован: 1. по убыванию по среднему времени задержки, 2. по возрастанию по названию авиалинии, 3. по возрастанию по названию аэропорта). Необходимо учитывать только рейсы с ненулевым значением AIRLINE_DELAY и в результате учитывать только это значение.

Прототип scala проекта, который можно использовать при выполнении задания находится в данном репозитории. Код необходимо представить в виде ссылки на Scala класс Process.scala (обьявление которого представлен в данном проекте) с сохранением путей в вашем github репозитории. 

Победителем будет обьявлен тот, чья реализация потребует минимального количества cpu time.
