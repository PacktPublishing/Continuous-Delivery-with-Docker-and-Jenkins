#!/bin/bash
echo "Running acceptance test..."
CALCULATOR_PORT=$(ssh -o StrictHostKeychecking=no ubuntu@$@ "docker-compose port calculator 8080 | cut -d: -f2")
echo "Host: $@:$CALCULATOR_PORT"
./gradlew acceptanceTest -Dcalculator.url=http://$@:$CALCULATOR_PORT
