@echo off
call gradlew clean build
cls
call gradlew run -Pargs="%1 %2"