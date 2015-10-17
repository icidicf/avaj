#!/bin/bash

mvn package 
cd  ./target
java -jar OTV_SpringRMIProject-0.0.1-SNAPSHOT.jar
