package org.develnext.jphp.ext.math.classes;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.develnext.jphp.ext.math.MathExtension;

import php.runtime.Memory;
import php.runtime.memory.*;
import php.runtime.annotation.Reflection.*;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;


@Namespace(MathExtension.NS)
@Name("BigDecimal")
public class BigDecimalWrapper extends BaseWrapper<BigDecimal>
{
	public BigDecimalWrapper(Environment env, ClassEntity clazz)
	{
		super(env, clazz);
	}
	public BigDecimalWrapper(Environment env, BigDecimal wrappedObject)
	{
		super(env, wrappedObject);
	}
	
	
	@Signature
	public void __construct(BigIntegerWrapper val)
	{
		__wrappedObject = new BigDecimal(val.getWrappedObject());
	}
	@Signature
	public void __construct(BigIntegerWrapper val, MathContextWrapper context)
	{
		__wrappedObject = new BigDecimal(val.getWrappedObject(), context.getWrappedObject());
	}
	@Signature
	public BigDecimalWrapper abs(Environment env)
	{
		return new BigDecimalWrapper(env, getWrappedObject().abs());
	}
	@Signature
	public BigDecimalWrapper abs(Environment env, MathContextWrapper context)
	{
		return new BigDecimalWrapper(env, getWrappedObject().abs(context.getWrappedObject()));
	}
	@Signature
	public BigDecimalWrapper add(Environment env, BigDecimalWrapper val)
	{
		return new BigDecimalWrapper(env, getWrappedObject().add(val.getWrappedObject()));
	}
	@Signature
	public BigDecimalWrapper add(Environment env, BigDecimalWrapper val, MathContextWrapper context)
	{
		return new BigDecimalWrapper(env, getWrappedObject().add(val.getWrappedObject(), context.getWrappedObject()));
	}
	@Signature
	public Memory compareTo(BigDecimalWrapper val)
	{
		return LongMemory.valueOf(getWrappedObject().compareTo(val.getWrappedObject()));
	}
	@Signature
	public BigDecimalWrapper divide(Environment env, BigDecimalWrapper val)
	{
		return new BigDecimalWrapper(env, getWrappedObject().divide(val.getWrappedObject()));
	}
	@Signature
	public BigDecimalWrapper divide(Environment env, BigDecimalWrapper val, String roundingMode)
	{
		return new BigDecimalWrapper(env, getWrappedObject().divide(val.getWrappedObject(), RoundingMode.valueOf(roundingMode)));
	}
	@Signature
	public BigDecimalWrapper divide(Environment env, BigDecimalWrapper val, String roundingMode, int scale)
	{
		return new BigDecimalWrapper(env, getWrappedObject().divide(val.getWrappedObject(), scale, RoundingMode.valueOf(roundingMode)));
	}
	@Signature
	public BigDecimalWrapper divideMathContext(Environment env, BigDecimalWrapper val, MathContextWrapper context)
	{
		return new BigDecimalWrapper(env, getWrappedObject().divide(val.getWrappedObject(), context.getWrappedObject()));
	}
	@Signature
	public Memory divideAndRemainder(Environment env, BigDecimalWrapper val)
	{
		ArrayMemory res = new ArrayMemory();
		for(BigDecimal v : getWrappedObject().divideAndRemainder(val.getWrappedObject()))
			res.add(new BigDecimalWrapper(env, v));
		return res;
	}
	@Signature
	public Memory divideAndRemainder(Environment env, BigDecimalWrapper val, MathContextWrapper context)
	{
		ArrayMemory res = new ArrayMemory();
		for(BigDecimal v : getWrappedObject().divideAndRemainder(val.getWrappedObject(), context.getWrappedObject()))
			res.add(new BigDecimalWrapper(env, v));
		return res;
	}
	@Signature
	public BigDecimalWrapper divideToIntegralValue(Environment env, BigDecimalWrapper val)
	{
		return new BigDecimalWrapper(env, getWrappedObject().divideToIntegralValue(val.getWrappedObject()));
	}
	@Signature
	public BigDecimalWrapper divideToIntegralValue(Environment env, BigDecimalWrapper val, MathContextWrapper context)
	{
		return new BigDecimalWrapper(env, getWrappedObject().divideToIntegralValue(val.getWrappedObject(), context.getWrappedObject()));
	}
	@Signature
	public Memory floatValue()
	{
		return DoubleMemory.valueOf(getWrappedObject().floatValue());
	}
	@Signature
	public Memory intValue()
	{
		return LongMemory.valueOf(getWrappedObject().intValue());
	}
	@Signature
	public Memory intValueExact()
	{
		return LongMemory.valueOf(getWrappedObject().intValueExact());
	}
	@Signature
	public BigDecimalWrapper max(Environment env, BigDecimalWrapper val)
	{
		return new BigDecimalWrapper(env, getWrappedObject().max(val.getWrappedObject()));
	}
	@Signature
	public BigDecimalWrapper min(Environment env, BigDecimalWrapper val)
	{
		return new BigDecimalWrapper(env, getWrappedObject().min(val.getWrappedObject()));
	}
	@Signature
	public BigDecimalWrapper movePointLeft(Environment env, int n)
	{
		return new BigDecimalWrapper(env, getWrappedObject().movePointLeft(n));
	}
	@Signature
	public BigDecimalWrapper movePointRight(Environment env, int n)
	{
		return new BigDecimalWrapper(env, getWrappedObject().movePointRight(n));
	}
	@Signature
	public BigDecimalWrapper multiply(Environment env, BigDecimalWrapper val)
	{
		return new BigDecimalWrapper(env, getWrappedObject().multiply(val.getWrappedObject()));
	}
	@Signature
	public BigDecimalWrapper multiply(Environment env, BigDecimalWrapper val, MathContextWrapper context)
	{
		return new BigDecimalWrapper(env, getWrappedObject().multiply(val.getWrappedObject(), context.getWrappedObject()));
	}
	@Signature
	public BigDecimalWrapper negate(Environment env)
	{
		return new BigDecimalWrapper(env, getWrappedObject().negate());
	}
	@Signature
	public BigDecimalWrapper negate(Environment env, MathContextWrapper context)
	{
		return new BigDecimalWrapper(env, getWrappedObject().negate(context.getWrappedObject()));
	}
	@Signature
	public BigDecimalWrapper plus(Environment env)
	{
		return new BigDecimalWrapper(env, getWrappedObject().plus());
	}
	@Signature
	public BigDecimalWrapper plus(Environment env, MathContextWrapper context)
	{
		return new BigDecimalWrapper(env, getWrappedObject().plus(context.getWrappedObject()));
	}
	@Signature
	public BigDecimalWrapper pow(Environment env, int n)
	{
		return new BigDecimalWrapper(env, getWrappedObject().pow(n));
	}
	@Signature
	public BigDecimalWrapper pow(Environment env, int n, MathContextWrapper context)
	{
		return new BigDecimalWrapper(env, getWrappedObject().pow(n, context.getWrappedObject()));
	}
	@Signature
	public Memory precision()
	{
		return LongMemory.valueOf(getWrappedObject().precision());
	}
	@Signature
	public BigDecimalWrapper remainder(Environment env, BigDecimalWrapper val)
	{
		return new BigDecimalWrapper(env, getWrappedObject().remainder(val.getWrappedObject()));
	}
	@Signature
	public BigDecimalWrapper remainder(Environment env, BigDecimalWrapper val, MathContextWrapper context)
	{
		return new BigDecimalWrapper(env, getWrappedObject().remainder(val.getWrappedObject(), context.getWrappedObject()));
	}
	@Signature
	public BigDecimalWrapper round(Environment env, MathContextWrapper context)
	{
		return new BigDecimalWrapper(env, getWrappedObject().round(context.getWrappedObject()));
	}
	@Signature
	public Memory scale()
	{
		return LongMemory.valueOf(getWrappedObject().scale());
	}
	@Signature
	public BigDecimalWrapper scaleByPowerOfTen(Environment env, int n)
	{
		return new BigDecimalWrapper(env, getWrappedObject().scaleByPowerOfTen(n));
	}
	@Signature
	public BigDecimalWrapper setScale(Environment env, int n)
	{
		return new BigDecimalWrapper(env, getWrappedObject().setScale(n));
	}
	@Signature
	public BigDecimalWrapper setScale(Environment env, int n, String roundingMode)
	{
		return new BigDecimalWrapper(env, getWrappedObject().setScale(n, RoundingMode.valueOf(roundingMode)));
	}
	@Signature
	public Memory signum()
	{
		return LongMemory.valueOf(getWrappedObject().signum());
	}
	@Signature
	public BigDecimalWrapper stripTrailingZeros(Environment env)
	{
		return new BigDecimalWrapper(env, getWrappedObject().stripTrailingZeros());
	}
	@Signature
	public BigDecimalWrapper substract(Environment env, BigDecimalWrapper val)
	{
		return new BigDecimalWrapper(env, getWrappedObject().	subtract(val.getWrappedObject()));
	}
	@Signature
	public BigDecimalWrapper substract(Environment env, BigDecimalWrapper val, MathContextWrapper context)
	{
		return new BigDecimalWrapper(env, getWrappedObject().	subtract(val.getWrappedObject(), context.getWrappedObject()));
	}
	@Signature
	public BigIntegerWrapper toBigInteger(Environment env)
	{
		return new BigIntegerWrapper(env, getWrappedObject().toBigInteger());
	}
	@Signature
	public BigIntegerWrapper toBigIntegerExact(Environment env)
	{
		return new BigIntegerWrapper(env, getWrappedObject().toBigInteger());
	}
	@Signature
	public Memory toEngineeringString()
	{
		return StringMemory.valueOf(getWrappedObject().toEngineeringString());
	}
	@Signature
	public Memory toPlainString()
	{
		return StringMemory.valueOf(getWrappedObject().toEngineeringString());
	}
	@Signature
	public Memory __toString()
	{
		return StringMemory.valueOf(getWrappedObject().toEngineeringString());
	}
	@Signature
	public BigDecimalWrapper ulp(Environment env)
	{
		return new BigDecimalWrapper(env, getWrappedObject().ulp());
	}
	@Signature
	public BigIntegerWrapper unscaledValue(Environment env)
	{
		return new BigIntegerWrapper(env, getWrappedObject().unscaledValue());
	}
	

	@Signature
	public static BigDecimalWrapper ofUnscaled(Environment env, BigIntegerWrapper unscaledVal, int scale)
	{
		return new BigDecimalWrapper(env, new BigDecimal(unscaledVal.getWrappedObject(), scale));
	}
	@Signature
	public static BigDecimalWrapper ofUnscaled(Environment env, BigIntegerWrapper unscaledVal, int scale, MathContextWrapper context)
	{
		return new BigDecimalWrapper(env, new BigDecimal(unscaledVal.getWrappedObject(), scale, context.getWrappedObject()));
	}
	@Signature
	public static BigDecimalWrapper ofDouble(Environment env, double val)
	{
		return new BigDecimalWrapper(env, new BigDecimal(val));
	}
	@Signature
	public static BigDecimalWrapper ofDouble(Environment env, double val, MathContextWrapper context)
	{
		return new BigDecimalWrapper(env, new BigDecimal(val, context.getWrappedObject()));
	}
	@Signature
	public static BigDecimalWrapper ofInt(Environment env, int val)
	{
		return new BigDecimalWrapper(env, new BigDecimal(val));
	}
	@Signature
	public static BigDecimalWrapper ofInt(Environment env, int val, MathContextWrapper context)
	{
		return new BigDecimalWrapper(env, new BigDecimal(val, context.getWrappedObject()));
	}
	@Signature
	public static BigDecimalWrapper ofString(Environment env, String val)
	{
		return new BigDecimalWrapper(env, new BigDecimal(val));
	}
	@Signature
	public static BigDecimalWrapper ofString(Environment env, String val, MathContextWrapper context)
	{
		return new BigDecimalWrapper(env, new BigDecimal(val, context.getWrappedObject()));
	}
}
