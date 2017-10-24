package org.develnext.jphp.ext.math.classes;

import org.develnext.jphp.ext.math.MathExtension;

import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseObject;
import php.runtime.memory.*;
import php.runtime.reflection.ClassEntity;


@Namespace(MathExtension.NS)
@Name("Math")
public class MathWrapper extends BaseObject
{
	public MathWrapper(Environment env, ClassEntity clazz)
	{
		super(env, clazz);
	}
	
	public static final double PI = Math.PI;
	public static final double E = Math.E;
	
	@Signature
	public static Memory abs(double a)
	{
		return DoubleMemory.valueOf(Math.abs(a));
	}
	@Signature
	public static Memory acos(double a)
	{
		return DoubleMemory.valueOf(Math.abs(a));
	}
	@Signature
	public static Memory addExact(long x, long y)
	{
		return LongMemory.valueOf(Math.addExact(x, y));
	}
	@Signature
	public static Memory asin(double a)
	{
		return DoubleMemory.valueOf(Math.asin(a));
	}
	@Signature
	public static Memory atan(double a)
	{
		return DoubleMemory.valueOf(Math.atan(a));
	}
	@Signature
	public static Memory atan2(double x, double y)
	{
		return DoubleMemory.valueOf(Math.atan2(x, y));
	}
	@Signature
	public static Memory cbrt(double a)
	{
		return DoubleMemory.valueOf(Math.cbrt(a));
	}
	@Signature
	public static Memory ceil(double a)
	{
		return DoubleMemory.valueOf(Math.ceil(a));
	}
	@Signature
	public static Memory copySign(double magnitude, double sign)
	{
		return DoubleMemory.valueOf(Math.copySign(magnitude, sign));
	}
	@Signature
	public static Memory cos(double a)
	{
		return DoubleMemory.valueOf(Math.cos(a));
	}
	@Signature
	public static Memory cosh(double a)
	{
		return DoubleMemory.valueOf(Math.cosh(a));
	}
	@Signature
	public static Memory decrementExact(long a)
	{
		return LongMemory.valueOf(Math.decrementExact(a));
	}
	@Signature
	public static Memory exp(double a)
	{
		return DoubleMemory.valueOf(Math.exp(a));
	}
	@Signature
	public static Memory expm1(double a)
	{
		return DoubleMemory.valueOf(Math.expm1(a));
	}
	@Signature
	public static Memory floor(double a)
	{
		return DoubleMemory.valueOf(Math.floor(a));
	}
	@Signature
	public static Memory floorDiv(long x, long y)
	{
		return LongMemory.valueOf(Math.floorDiv(x, y));
	}
	@Signature
	public static Memory floorMod(long x, long y)
	{
		return LongMemory.valueOf(Math.floorDiv(x, y));
	}
	@Signature
	public static Memory getExponent(double a)
	{
		return LongMemory.valueOf(Math.getExponent(a));
	}
	@Signature
	public static Memory hypot(long x, long y)
	{
		return DoubleMemory.valueOf(Math.hypot(x, y));
	}
	@Signature
	public static Memory IEEEremainder(long f1, long f2)
	{
		return DoubleMemory.valueOf(Math.IEEEremainder(f1, f2));
	}
	@Signature
	public static Memory incrementExact(long a)
	{
		return LongMemory.valueOf(Math.incrementExact(a));
	}
	@Signature
	public static Memory log(double a)
	{
		return DoubleMemory.valueOf(Math.log(a));
	}
	@Signature
	public static Memory log10(double a)
	{
		return DoubleMemory.valueOf(Math.log10(a));
	}
	@Signature
	public static Memory log1p(double a)
	{
		return DoubleMemory.valueOf(Math.log1p(a));
	}
	@Signature
	public static Memory max(double a, double b)
	{
		return DoubleMemory.valueOf(Math.max(a, b));
	}
	@Signature
	public static Memory min(double a, double b)
	{
		return DoubleMemory.valueOf(Math.min(a, b));
	}
	@Signature
	public static Memory multiplyExact(long x, long y)
	{
		return LongMemory.valueOf(Math.multiplyExact(x, y));
	}
	@Signature
	public static Memory negateExact(long a)
	{
		return LongMemory.valueOf(Math.negateExact(a));
	}
	@Signature
	public static Memory nextAfter(double a, double b)
	{
		return DoubleMemory.valueOf(Math.nextAfter(a, b));
	}
	@Signature
	public static Memory nextDown(double a)
	{
		return DoubleMemory.valueOf(Math.nextDown(a));
	}
	@Signature
	public static Memory nextUp(double a)
	{
		return DoubleMemory.valueOf(Math.nextUp(a));
	}
	@Signature
	public static Memory pow(double a, double b)
	{
		return DoubleMemory.valueOf(Math.pow(a, b));
	}
	@Signature
	public static Memory random()
	{
		return DoubleMemory.valueOf(Math.random());
	}
	@Signature
	public static Memory rint(double a)
	{
		return DoubleMemory.valueOf(Math.rint(a));
	}
	@Signature
	public static Memory round(double a)
	{
		return LongMemory.valueOf(Math.round(a));
	}
	@Signature
	public static Memory scalb(double a, int scaleFactor)
	{
		return DoubleMemory.valueOf(Math.scalb(a, scaleFactor));
	}
	@Signature
	public static Memory signum(double a)
	{
		return DoubleMemory.valueOf(Math.signum(a));
	}
	@Signature
	public static Memory sin(double a)
	{
		return DoubleMemory.valueOf(Math.sin(a));
	}
	@Signature
	public static Memory sinh(double a)
	{
		return DoubleMemory.valueOf(Math.sinh(a));
	}
	@Signature
	public static Memory sqrt(double a)
	{
		return DoubleMemory.valueOf(Math.sqrt(a));
	}
	@Signature
	public static Memory subtractExact(long x, long y)
	{
		return LongMemory.valueOf(Math.subtractExact(x, y));
	}
	@Signature
	public static Memory tan(double a)
	{
		return DoubleMemory.valueOf(Math.tan(a));
	}
	@Signature
	public static Memory tanh(double a)
	{
		return DoubleMemory.valueOf(Math.tanh(a));
	}
	@Signature
	public static Memory toDegrees(double a)
	{
		return DoubleMemory.valueOf(Math.toDegrees(a));
	}
	@Signature
	public static Memory toIntExact(long a)
	{
		return LongMemory.valueOf(Math.toIntExact(a));
	}
	@Signature
	public static Memory toRadians(double a)
	{
		return DoubleMemory.valueOf(Math.toRadians(a));
	}
	@Signature
	public static Memory ulp(double a)
	{
		return DoubleMemory.valueOf(Math.ulp(a));
	}
}