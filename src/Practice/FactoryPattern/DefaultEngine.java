package Practice.FactoryPattern;

import Practice.FactoryPattern.implementation.DialectEngine;
import Practice.FactoryPattern.implementation.GermanDialectEngine;

public class DefaultEngine {

    public String convert(String english){
        DialectEngine dialect = getDialect();
        return dialect.convert(english);
    }

    protected DialectEngine getDialect(){
        return new GermanDialectEngine();
    }

}
