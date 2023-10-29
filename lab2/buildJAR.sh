#!/bin/bash
cd src
javac -cp libs/Pokemon.jar -d ../ *.java
cd ..
jar -cfm lab.jar META-INF/MANIFEST.mf Main.class attacks/*/* pokemons/* utils/* src/libs/Pokemon.jar
