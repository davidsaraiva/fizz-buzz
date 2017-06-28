#!/bin/sh
clear
gradlew clean build
clear
gradlew run -Pargs="%1 %2"