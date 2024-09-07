#!/bin/bash
set -eu

mvn clean package

podman pull payara/server-full

podman run -p 8080:8080 -v $(pwd)/target/learning-java-ee.war:/opt/payara/deployments -d payara/server-full