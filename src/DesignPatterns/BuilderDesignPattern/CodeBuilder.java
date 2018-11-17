package DesignPatterns.BuilderDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class CodeBuilder {

    public String className;
    public Map elements = new HashMap<String, String>();
    public static final String newLine = System.lineSeparator();
    public static final String space = " ";

    public CodeBuilder(String className) {
        this.className = className;
    }

    public CodeBuilder addField(String name, String type) {
        elements.put(name, type);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("public class ");
        sb.append(this.className).append(newLine).append("{").append(newLine);

        elements.forEach((k, v) -> sb.append("public ").append(v).append(space).append(k).append(newLine));
        sb.append("}");
        return sb.toString();
    }
}


