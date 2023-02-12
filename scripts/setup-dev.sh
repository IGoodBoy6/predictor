#!/usr/bin/env sh
set -e
docker run --name predictor.db -p 21010:27017 -d mongo.latest
