package org.develnext.jphp.ext.math.classes;

import java.math.BigInteger;
import java.nio.charset.Charset;

import org.develnext.jphp.ext.math.MathExtension;

import php.runtime.Memory;
import php.runtime.memory.*;
import php.runtime.annotation.Reflection.*;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;


@Namespace(MathExtension.NS)
@Name("BigInteger")
public class BigIntegerWrapper extends BaseWrapper<BigInteger>
{
	public BigIntegerWrapper(Environment env, ClassEntity clazz)
	{
		super(env, clazz);
	}
	public BigIntegerWrapper(Environment env, BigInteger wrappedObject)
	{
		super(env, wrappedObject);
	}
	
	
	@Signature
	public void __construct(String hex)
	{
		__wrappedObject = new BigInteger(hex);
	}
	@Signature
	public void __construct(String hex, int radix)
	{
		__wrappedObject = new BigInteger(hex, radix);
	}
	
	@Signature
	public BigIntegerWrapper abs(Environment env)
	{
		return new BigIntegerWrapper(env, getWrappedObject().abs());
	}
	@Signature
	public BigIntegerWrapper add(Environment env, BigIntegerWrapper val)
	{
		return new BigIntegerWrapper(env, getWrappedObject().add(val.getWrappedObject()));
	}
	@Signature
	public BigIntegerWrapper and(Environment env, BigIntegerWrapper val)
	{
		return new BigIntegerWrapper(env, getWrappedObject().and(val.getWrappedObject()));
	}
	@Signature
	public BigIntegerWrapper andNot(Environment env, BigIntegerWrapper val)
	{
		return new BigIntegerWrapper(env, getWrappedObject().andNot(val.getWrappedObject()));
	}
	@Signature
	public Memory bitCount()
	{
		return LongMemory.valueOf(getWrappedObject().bitCount());
	}
	@Signature
	public Memory bitLength()
	{
		return LongMemory.valueOf(getWrappedObject().bitLength());
	}
	@Signature
	public BigIntegerWrapper clearBit(Environment env, int n)
	{
		return new BigIntegerWrapper(env, getWrappedObject().clearBit(n));
	}
	@Signature
	public Memory compareTo(BigInteger val)
	{
		return LongMemory.valueOf(getWrappedObject().compareTo(val));
	}
	@Signature
	public BigIntegerWrapper divide(Environment env, BigIntegerWrapper val)
	{
		return new BigIntegerWrapper(env, getWrappedObject().divide(val.getWrappedObject()));
	}
	@Signature
	public ArrayMemory divideAndRemainder(Environment env, BigIntegerWrapper val)
	{
		ArrayMemory res = new ArrayMemory();
		for(BigInteger i : getWrappedObject().divideAndRemainder(val.getWrappedObject()))
			res.add(new BigIntegerWrapper(env, i));
		return res;
	}
	@Signature
	public Memory doubleValue()
	{
		return DoubleMemory.valueOf(getWrappedObject().doubleValue());
	}
	@Signature
	public BigIntegerWrapper flipBit(Environment env, int n)
	{
		return new BigIntegerWrapper(env, getWrappedObject().flipBit(n));
	}
	@Signature
	public BigIntegerWrapper gcd(Environment env, BigIntegerWrapper val)
	{
		return new BigIntegerWrapper(env, getWrappedObject().gcd(val.getWrappedObject()));
	}
	@Signature
	public Memory getLowestBit()
	{
		return LongMemory.valueOf(getWrappedObject().getLowestSetBit());
	}
	@Signature
	public Memory intValue()
	{
		return LongMemory.valueOf(getWrappedObject().intValue());
	}
	@Signature
	public Memory isProbablePrime(int certainty)
	{
		return getWrappedObject().isProbablePrime(certainty) ? Memory.TRUE : Memory.FALSE;
	}
	@Signature
	public BigIntegerWrapper max(Environment env, BigIntegerWrapper val)
	{
		return new BigIntegerWrapper(env, getWrappedObject().max(val.getWrappedObject()));
	}
	@Signature
	public BigIntegerWrapper min(Environment env, BigIntegerWrapper val)
	{
		return new BigIntegerWrapper(env, getWrappedObject().min(val.getWrappedObject()));
	}
	@Signature
	public BigIntegerWrapper mod(Environment env, BigIntegerWrapper val)
	{
		return new BigIntegerWrapper(env, getWrappedObject().mod(val.getWrappedObject()));
	}
	@Signature
	public BigIntegerWrapper modInverse(Environment env, BigIntegerWrapper val)
	{
		return new BigIntegerWrapper(env, getWrappedObject().modInverse(val.getWrappedObject()));
	}
	@Signature
	public BigIntegerWrapper modPow(Environment env, BigIntegerWrapper exp, BigIntegerWrapper mod)
	{
		return new BigIntegerWrapper(env, getWrappedObject().modPow(exp.getWrappedObject(), mod.getWrappedObject()));
	}
	@Signature
	public BigIntegerWrapper multiply(Environment env, BigIntegerWrapper val)
	{
		return new BigIntegerWrapper(env, getWrappedObject().multiply(val.getWrappedObject()));
	}
	@Signature
	public BigIntegerWrapper negate(Environment env)
	{
		return new BigIntegerWrapper(env, getWrappedObject().negate());
	}
	@Signature
	public BigIntegerWrapper nextProbablePrime(Environment env)
	{
		return new BigIntegerWrapper(env, getWrappedObject().nextProbablePrime());
	}
	@Signature
	public BigIntegerWrapper not(Environment env)
	{
		return new BigIntegerWrapper(env, getWrappedObject().not());
	}
	@Signature
	public BigIntegerWrapper or(Environment env, BigIntegerWrapper val)
	{
		return new BigIntegerWrapper(env, getWrappedObject().or(val.getWrappedObject()));
	}
	@Signature
	public BigIntegerWrapper pow(Environment env, int exp)
	{
		return new BigIntegerWrapper(env, getWrappedObject().pow(exp));
	}
	@Signature
	public BigIntegerWrapper remainder(Environment env, BigIntegerWrapper val)
	{
		return new BigIntegerWrapper(env, getWrappedObject().remainder(val.getWrappedObject()));
	}
	@Signature
	public BigIntegerWrapper setBit(Environment env, int n)
	{
		return new BigIntegerWrapper(env, getWrappedObject().setBit(n));
	}
	@Signature
	public BigIntegerWrapper shiftLeft(Environment env, int n)
	{
		return new BigIntegerWrapper(env, getWrappedObject().shiftLeft(n));
	}
	@Signature
	public BigIntegerWrapper shiftRight(Environment env, int n)
	{
		return new BigIntegerWrapper(env, getWrappedObject().shiftRight(n));
	}
	@Signature
	public Memory signum()
	{
		return LongMemory.valueOf(getWrappedObject().signum());
	}
	@Signature
	public BigIntegerWrapper substract(Environment env, BigIntegerWrapper val)
	{
		return new BigIntegerWrapper(env, getWrappedObject().subtract(val.getWrappedObject()));
	}
	@Signature
	public Memory testBit(int n)
	{
		return getWrappedObject().testBit(n) ? Memory.TRUE : Memory.FALSE;
	}
	@Signature
	public Memory toString(int radix)
	{
		return StringMemory.valueOf(getWrappedObject().toString(radix));
	}
	@Signature
	public BigIntegerWrapper xor(Environment env, BigIntegerWrapper val)
	{
		return new BigIntegerWrapper(env, getWrappedObject().xor(val.getWrappedObject()));
	}
	@Signature
	public static BigIntegerWrapper ofValue(Environment env, long val)
	{
		return new BigIntegerWrapper(env, BigInteger.valueOf(val));
	}
}