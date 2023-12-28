#/bin/bash

cd src
javac -d ../bin -cp .:interfaces/:beds:misc:watering:shorties:exceptions Main.java */*.java
cd ../bin/
jar -cfm ../lab4.jar ../META-INF/manifest.mf Main.class */*.class


