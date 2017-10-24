<?php 
namespace php\math;



class BigDecimal
{
	/**
	 * @param BigInteger $val
	 * @param MathContext $mathContext
	 */
	function __construct(BigInteger $val, MathContext $mathContext = null){}
	/**
	 * @param MathContext $mathContext
	 * @return BigDecimal
	 */
	function abs(MathContext $mathContext = null){}
	/**
	 * @param BigInteger $val
	 * @param MathContext $mathContext
	 * @return BigDecimal
	 */
	function add(BigDecimal $val, MathContext $mathContext = null){}
	/**
	 * @param BigDecimal $val
	 * @return int
	 */
	function compareTo(BigDecimal $val){}
	/**
	 * @param BigDecimal $val
	 * @param string $roundingMode
	 * @param int $scale
	 * @return BigDecimal
	 */
	function divide(BigDecimal $val, $roundingMode = null, $scale = null){}
	/**
	 * @param BigDecimal $val
	 * @param MathContext $mathContext
	 * @return BigDecimal
	 */
	function divideMathContext(BigDecimal $val, MathContext $mathContext = null){}
	/**
	 * @param BigDecimal $val
	 * @param MathContext $mathContext
	 * @return BigDecimal[]
	 */
	function divideAndRemainder(BigDecimal $val, MathContext $mathContext){}
	/**
	 * @param BigDecimal $val
	 * @param MathContext $mathContext
	 * @return BigDecimal
	 */
	function divideToIntegralValue(BigDecimal $val, MathContext $mathContext = null){}
	/**
	 * @return float
	 */
	function floatValue(){}
	/**
	 * @return int
	 */
	function intValue(){}
	/**
	 * @return int
	 */
	function intValueExact(){}
	/**
	 * @param BigDecimal $val
	 * @return BigDecimal
	 */
	function max(BigDecimal $val){}
	/**
	 * @param BigDecimal $val
	 * @return BigDecimal
	 */
	function min(BigDecimal $val){}
	/**
	 * @param int $n
	 * @return BigDecimal
	 */
	function movePointLeft($n){}
	/**
	 * @param int $n
	 * @return BigDecimal
	 */
	function movePointRight($n){}
	/**
	 * @param BigDecimal $val
	 * @param MathContext $mathContext
	 * @return BigDecimal
	 */
	function multiply(BigDecimal $val, MathContext $mathContext = null){}
	/**
	 * @param MathContext $mathContext
	 * @return BigDecimal
	 */
	function negate(MathContext $mathContext = null){}
	/**
	 * @param MathContext $mathContext
	 * @return BigDecimal
	 */
	function plus(MathContext $mathContext = null){}
	/**
	 * @param int $n
	 * @param MathContext $mathContext
	 * @return BigDecimal
	 */
	function pow($n, MathContext $mathContext = null){}
	/**
	 * @return int
	 */
	function precision(){}
	/**
	 * @param BigDecimal $val
	 * @param MathContext $mathContext
	 * @return BigDecimal
	 */
	function remainder(BigDecimal $val, MathContext $mathContext = null){}
	/**
	 * @param MathContext $mathContext
	 * @return BigDecimal
	 */
	function round(MathContext $mathContext = null){}
	/**
	 * @return int
	 */
	function scale(){}
	/**
	 * @param int $n
	 * @return BigDecimal
	 */
	function scaleByPowerOfTen($n){}
	/**
	 * @param int $n
	 * @param string $roundingMode
	 * @return BigDecimal
	 */
	function setScale($n, $roundingMode){}
	/**
	 * @return int
	 */
	function signum(){}
	/**
	 * @return BigDecimal
	 */
	function stripTrailingZeros(){}
	/**
	 * @param BigDecimal $val
	 * @param MathContext $mathContext
	 * @return BigDecimal
	 */
	function substract(BigDecimal $val, MathContext $mathContext = null){}
	/**
	 * @return BigInteger
	 */
	function toBigInteger(){}
	/**
	 * @return BigInteger
	 */
	function toBigIntegerExact(){}
	/**
	 * @return String
	 */
	function toEngineeringString(){}
	/**
	 * @return String
	 */
	function toPlainString(){}
	/**
	 * @return BigDecimal
	 */
	function ulp(){}
	/**
	 * @return BigDecimal
	 */
	function unscaledValue(){}

	/**
	 * @param BigInteger $unscaledVal
	 * @param int $scale
	 * @param MathContext $mathContext
	 * @return BigDecimal
	 */
	static function ofUnscaled(BigInteger $unscaledVal, $scale, MathContext $mathContext = null){}
	/**
	 * @param double $value
	 * @param MathContext $mathContext
	 * @return BigDecimal
	 */
	static function ofDouble($value, MathContext $mathContext = null){}
	/**
	 * @param int $value
	 * @param MathContext $mathContext
	 * @return BigDecimal
	 */
	static function ofInt($value, MathContext $mathContext = null){}
	/**
	 * @param string $value
	 * @param MathContext $mathContext
	 * @return BigDecimal
	 */
	static function ofString($value, MathContext $mathContext = null){}
}
?>