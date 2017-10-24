package org.develnext.jphp.ext.math.classes;

import php.runtime.env.Environment;
import php.runtime.ext.java.JavaException;
import php.runtime.reflection.ClassEntity;

public class ArithmeticExceptionWrapper extends JavaException
{
	public ArithmeticExceptionWrapper(Environment env, Throwable throwable)
	{
		super(env, throwable);
	}
	public ArithmeticExceptionWrapper(Environment env, ClassEntity clazz)
	{
		super(env, clazz);
	}
}