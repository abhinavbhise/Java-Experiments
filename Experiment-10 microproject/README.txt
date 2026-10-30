GreenThumb - Smart Plant Care Manager (Java Micro Project)
Team: Sahil Sathe (05), Shlok Bhosale (07), Abhinav Bhise (13), Sanat Singh (17) | CSE TY

HOW TO RUN (needs JDK 8 or higher)
  Windows : double-click run.bat   (or run the 2 commands below)
  Linux/Mac: sh run.sh
  Manual  : javac -d out src/greenthumb/*.java
            java -cp out greenthumb.Main

OPTIONAL - ENABLE DATABASE (JDBC) SAVE/LOAD
  1. Download sqlite-jdbc jar from https://github.com/xerial/sqlite-jdbc/releases
  2. Put it in this folder (e.g. sqlite-jdbc.jar)
  3. Compile as above, run with:
     Windows : java -cp "out;sqlite-jdbc.jar" greenthumb.Main
     Linux   : java -cp "out:sqlite-jdbc.jar" greenthumb.Main
  Without the jar the project still runs; only options 10 and 11 are disabled.
