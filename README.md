# CS2511
Specific to Debian-based Linux distribtions, specifically amd64 machines. 
Uploading a script to help install Netbeans and antiquated JDK as required for this course.
Add salt to taste.

### Instructions:
1. Download JDK 8 from [this address](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html#license-lightbox).
2. Download the Netbeans binaries from [this address](https://netbeans.apache.org/download/nb123/nb123.html). (current as of Mar 2021; else see [release list](https://netbeans.apache.org/download/index.html)).
3. Download *netbeans_JDK8_install_script.sh*
4. Execute `sudo chmod +x ./netbeans_JDK8_install_script.sh`
5. Execute `sudo ./netbeans_JDK8_install_script.sh`

Tips: 
Compare your system to mine using the command: `uname -a`
For instance, my laptop returns: *Linux pumpkin 5.10.0-4-amd64 #1 SMP Debian 5.10.19-1 (2021-03-02) x86_64 GNU/Linux*
