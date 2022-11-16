#!/bin/bash
# @author Marcelo Machado Fleury
rm -rf projeto-cpf/target/*
rm -rf projeto-login/target/*

docker rm -f $(docker ps -a | egrep 'applogin|appcpf' | cut -d' ' -f1 | xargs echo)
docker rmi -f $(docker images | egrep 'login|cpf' | awk -F ' ' '{print $3}')

cd projeto-cpf
mvn clean install
cd ../projeto-login

mvn clean install

docker-compose up --build
