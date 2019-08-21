# Задание Spark & Fun (GridDynamics)

На основе исходных данных /app/airlines.scv, /app/airports.csv, /app/flights.csv (данные пути должны быть указаны в вашем коде, как источники данных) получить DataSet авиакомпаний с максимальным средним временем задержки рейсов сгруппированных по аэропортам (результат должен быть отсортирован: 1. по убыванию по среднему времени задержки, 2. по возрастанию по названию авиалинии, 3. по возрастанию по названию аэропорта). Необходимо учитывать только рейсы с ненулевым значением AIRLINE_DELAY и в результате учитывать только это значение.

Код необходимо представить в виде сслыке на Scala класс Process.scala (прототип которого представлен в данном проекте) в вашем github репозитории. 

Победителем будет обьявлен тот, чья реализация потребует минимального количества cpu time.

Описание исходных данных и сами данные находятся по адресу: https://www.kaggle.com/usdot/flight-delays
