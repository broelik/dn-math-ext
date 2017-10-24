package org.develnext.jphp.ext.math;



import java.math.*;

import org.develnext.jphp.ext.math.classes.*;


import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

public class MathExtension extends Extension
{
    public final static String NS = "php\\math";

    @Override
    public Status getStatus()
    {
        return Status.EXPERIMENTAL;
    }
    
    @Override
    public String[] getPackageNames()
    {
        return new String[] {"math"};
    }

    @Override
    public void onRegister(CompileScope scope)
    {
    	registerWrapperClass(scope, BigInteger.class, BigIntegerWrapper.class);
    	registerWrapperClass(scope, MathContext.class, MathContextWrapper.class);
    	registerWrapperClass(scope, BigDecimal.class, BigDecimalWrapper.class);
    	
    	registerClass(scope, MathWrapper.class);
    	
    	registerJavaException(scope, ArithmeticExceptionWrapper.class, ArithmeticException.class);
    }
}