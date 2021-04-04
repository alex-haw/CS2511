#CS2511
This repo is for collaborating with peers while working on prokects for this course. Review the course syllabus for details on collaboration.

##NetBeans Installation Help Script
Try my script to help install Netbeans and legacy JDK for Debian-based OSs.
Add salt to taste.
### Instructions:
1. Download JDK 8 from [this address](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html#license-lightbox).
2. Download the Netbeans binaries from [this address](https://netbeans.apache.org/download/nb123/nb123.html). (current as of Mar 2021; else see [release list](https://netbeans.apache.org/download/index.html)).
3. Download [netbeans_JDK8_install_script.sh](https://github.com/alex-haw/CS2511/blob/main/netbeans_JDK8_install_script.sh).
4. Execute `sudo chmod +x ./netbeans_JDK8_install_script.sh`
5. Execute `sudo ./netbeans_JDK8_install_script.sh`
### Tips: 
1. Your system may require slightly different steps dependion on your configuration. If you modify the script for your own use, consider sharing it on GitHub to help people with similar systems.
2. Enable JavaFX: *Tools > Plugins > Installed > JavaFX 2*, then follow instructions.
3. Use a dark theme if you're not a masochist: *Tools > Options > Appearance > Look and Feel*

