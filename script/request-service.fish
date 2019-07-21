#!/usr/bin/env fish

curl -X GET "http://localhost:8762/greeting"
curl -X GET "http://localhost:8762/greeting?name=shinyay"
curl -X GET "http://localhost:8762/greeting?name="
curl -X POST "http://localhost:8762/greeting"
curl -X POST -d 'name=shinyay' "http://localhost:8762/greeting"
curl -X POST -d 'name=' "http://localhost:8762/greeting"
