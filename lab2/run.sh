#!/bin/bash
cd src
javac -cp libs/Pokemon.jar -d ../ *.java
cd ..
java -cp src/libs/Pokemon.jar:attacks:pokemons:utils:. Main
