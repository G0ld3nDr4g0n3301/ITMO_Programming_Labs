#!/bin/bash
cd src
javac -d ../bin -cp .:interfaces/:beds:misc:watering:shorties Main.java */*.java
cd ../bin
jar -cfm ../lab3.jar ../META-INF/manifest.mf Main.class */*.class

