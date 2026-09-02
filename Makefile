all:
	javac ./srcs/avaj/*.java > sources.txt
	java -cp srcs avaj.Main

clean:
	rm -rf srcs/avaj/*.class