#!/bin/bash
test $(curl --silent localhost:8090/sum?a=1\&b=2) -eq 3 || \    # true when it runs on host
test $(curl --silent $(docker network inspect -f '{{range .IPAM.Config}}{{.Gateway}}{{end}}' bridge):8090/sum?a=1\&b=2) -eq 3  # true on docker
