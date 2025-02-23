JAVAC=javac
SRC=src
BIN=bin

all: compile

compile:
	mkdir -p $(BIN)
	$(JAVAC) -d $(BIN) $(SRC)/*.java

clean:
	rm -rf $(BIN)/*
