package org.develnext.jphp.ext.math.classes;

import java.math.MathContext;
import java.math.RoundingMode;

import org.develnext.jphp.ext.math.MathExtension;

import php.runtime.Memory;
import php.runtime.memory.*;
import php.runtime.annotation.Reflection.*;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

@Namespace(MathExtension.NS)
@Name("MathContext")
public class MathContextWrapper extends BaseWrapper<MathContext>
{
	public MathContextWrapper(Environment env, MathContext wrappedObject)
	{
		super(env, wrappedObject);
	}
	public MathContextWrapper(Environment env, ClassEntity clazz)
	{
		super(env, clazz);
	}
	
	@Signature
	public void __construct(int setPrecision)
	{
		__wrappedObject = new MathContext(setPrecision);
	}
	@Signature
	public void __construct(int setPrecision, String setRoundingMode)
	{
		__wrappedObject = new MathContext(setPrecision, RoundingMode.valueOf("setRoundingMode"));
	}
	
	@Getter
	public Memory getPrecision()
	{
		return LongMemory.valueOf(getWrappedObject().getPrecision());
	}
	@Getter
	public Memory getRoundingMode()
	{
		return StringMemory.valueOf(getWrappedObject().getRoundingMode().toString());
	}
	
	
	@Signature
	public static MathContextWrapper ofString(Environment env, String value)
	{
		return new MathContextWrapper(env, new MathContext(value));
	}
	@Signature
	public static MathContextWrapper UNLIMITED(Environment env)
	{
		return new MathContextWrapper(env, MathContext.UNLIMITED);
	}
	@Signature
	public static MathContextWrapper DECIMAL32(Environment env)
	{
		return new MathContextWrapper(env, MathContext.DECIMAL32);
	}
	@Signature
	public static MathContextWrapper DECIMAL64(Environment env)
	{
		return new MathContextWrapper(env, MathContext.DECIMAL64);
	}
	@Signature
	public static MathContextWrapper DECIMAL128(Environment env)
	{
		return new MathContextWrapper(env, MathContext.DECIMAL128);
	}
}