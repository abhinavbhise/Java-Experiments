mkdir -p out
javac -d out src/greenthumb/*.java
java -cp out greenthumb.Main
