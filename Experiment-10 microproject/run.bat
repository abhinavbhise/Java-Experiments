@echo off
if not exist out mkdir out
javac -d out src\greenthumb\*.java
java -cp out greenthumb.Main
pause
