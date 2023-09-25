package Practice.FactoryPattern;

import Practice.FactoryPattern.implementation.DialectEngine;
import Practice.FactoryPattern.implementation.FrenchDialectEngine;

public class FrenchEngine extends DefaultEngine {
    @Override
    protected DialectEngine getDialect(){
        return new FrenchDialectEngine();
    }

}
