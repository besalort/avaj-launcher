all:
	javac ./srcs/avaj/*.java > sources.txt

run :
	java -cp srcs avaj.Main

clean:
	rm -rf srcs/avaj/*.class

java :
	mkdir -p ~/java
	cd ~/java

	curl -L -o jdk-21.tar.gz \
	https://api.adoptium.net/v3/binary/latest/21/ga/linux/x64/jdk/hotspot/normal/eclipse

	tar -xzf jdk-21.tar.gz
	rm jdk-21.tar.gz
	mv jdk-21* jdk-21
	mv jdk-21 ~/java

.PHONY :
	all run clean java