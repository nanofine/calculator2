#!/bin/bash
test $(curl --silent localhost:8090/sum?a=1\&b=2) -eq 3 || \    # true when it runs on host
test $(curl --silent $(docker network inspect -f '{{range .IPAM.Config}}{{.Gateway}}{{end}}' bridge):8090/sum?a=1\&b=2) -eq 3  # true on docker
CALCULATOR_PORT=$(docker-compose prot calculator 8090 | cut -d: -f2)
echo $CALCULATOR_PORT
test $(curl --silent 210.125.29.97:$CALCULATOR_PORT/sum?a=1\b=2) -eq 3
