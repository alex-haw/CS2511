#!/bin/bash

#download JDK (this is an old version, but it's what you need)
sudo mkdir -p /usr/lib/jvm
sudo tar zxvf ~/Downloads/jdk-8u281-linux-x64.tar.gz -C /usr/lib/jvm
#tell your system to use old jdk
sudo update-alternatives --install "/usr/bin/java" "java" "/usr/lib/jvm/jdk1.8.0_281/bin/java" 1
sudo update-alternatives --set java /usr/lib/jvm/jdk1.8.0_version/bin/java

#make netbeans installer executable
sudo chmod +x Apache-NetBeans-12.3-bin-linux-x64.sh
sudo sudo ~/Downloads/Apache-NetBeans-12.3-bin-linux-x64.sh
