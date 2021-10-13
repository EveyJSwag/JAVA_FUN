JAVA_FILES := application/Application.java application/MainWindow.java application/ApplicationManager.java application/Swingable.java
CLASS_FILES := application/Application.class application/MainWindow.class application/ApplicationManager.class application/Swingable.class

JAR_FILE = App.jar

$(JAR_FILE) : $(CLASS_FILES)
	jar cmvf META-INF/MANIFEST.MF $(JAR_FILE) $(CLASS_FILES)

%.class : %.java
	javac $<

.PHONY: clean
clean:
	rm application/*class
	rm *jar
