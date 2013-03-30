package education.pattern.creator.builder;

import java.text.MessageFormat;

public class Desert {

    private String source;
    private String top;

    public void setSource(String source) {
        this.source = source;
    }
    public void setTop(String top) {
        this.top = top;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Desert [source={0}, top={1}]", source, top);
    }

}
