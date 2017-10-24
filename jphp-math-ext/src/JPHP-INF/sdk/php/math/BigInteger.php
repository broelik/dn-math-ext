<?php 
namespace php\math;



class BigInteger
{
	/**
	 * @param string $hex
	 * @param int $radix
	 */
	function __construct($hex, $radix = null){}
	/**
	 * @return BigInteger
	 */
	function abs(){}
	/**
	 * @param BigInteger $val
	 * @return BigInteger
	 */
	function add(BigInteger $val){}
	/**
	 * @param BigInteger $val
	 * @return BigInteger
	 */
	function and(BigInteger $val){}
	/**
	 * @param BigInteger $val
	 * @return BigInteger
	 */
	function andNot(BigInteger $val){}
	/**
	 * @return int
	 */
	function bitCount(){}
	/**
	 * @return int
	 */
	function bitLength(){}
	/**
	 * @param int $n
	 * @return BigInteger
	 */
	function clearBit($n){}
	/**
	 * @param BigInteger $val
	 * @return BigInteger
	 */
	function compareTo(BigInteger $val){}
	/**
	 * @param BigInteger $val
	 * @return BigInteger
	 */
	function divide(BigInteger $val){}
	/**
	 * @param BigInteger $val
	 * @return BigInteger[]
	 */
	function divideAndRemainder(BigInteger $val){}
	/**
	 * @return double
	 */
	function doubleValue(){}
	/**
	 * @param int $n
	 * @return BigInteger
	 */
	function flipBit($n){}
	/**
	 * @param BigInteger $val
	 * @return BigInteger
	 */
	function gcd(BigInteger $val){}
	/**
	 * @return int
	 */
	function getLowestBit(){}
	/**
	 * @return int
	 */
	function intValue(){}
	/**
	 * @param int $n
	 * @return boolean
	 */
	function isProbablePrime($n){}
	/**
	 * @param BigInteger $val
	 * @return BigInteger
	 */
	function max(BigInteger $val){}
	/**
	 * @param BigInteger $val
	 * @return BigInteger
	 */
	function min(BigInteger $val){}
	/**
	 * @param BigInteger $val
	 * @return BigInteger
	 */
	function mod(BigInteger $val){}
	/**
	 * @param BigInteger $val
	 * @return BigInteger
	 */
	function modInverse(BigInteger $val){}
	/**
	 * @param BigInteger $val
	 * @return BigInteger
	 */
	function modPow(BigInteger $val){}
	/**
	 * @param BigInteger $val
	 * @return BigInteger
	 */
	function multiply(BigInteger $val){}
	/**
	 * @return BigInteger
	 */
	function negate(){}
	/**
	 * @return BigInteger
	 */
	function nextProbablePrime(){}
	/**
	 * @return BigInteger
	 */
	function not(){}
	/**
	 * @param BigInteger $val
	 * @return BigInteger
	 */
	function or(BigInteger $val){}
	/**
	 * @param int $exp
	 * @return BigInteger
	 */
	function pow($exp){}
	/**
	 * @param BigInteger $val
	 * @return BigInteger
	 */
	function remainder(BigInteger $val){}
	/**
	 * @param int $n
	 * @return BigInteger
	 */
	function setBit($n){}
	/**
	 * @param int $n
	 * @return BigInteger
	 */
	function shiftLeft($n){}
	/**
	 * @param int $n
	 * @return BigInteger
	 */
	function shiftRight($n){}
	/**
	 * @return int
	 */
	function signum(){}
	/**
	 * @param BigInteger $val
	 * @return BigInteger
	 */
	function substract(BigInteger $val){}
	/**
	 * @param int $n
	 * @return bool
	 */
	function testBit($n){}
	/**
	 * @param int $radix
	 * @return string
	 */
	function toString($radix){}
	/**
	 * @param BigInteger $val
	 * @return BigInteger
	 */
	function xor(BigInteger $val){}
	/**
	 * @param int $val
	 * @return BigInteger
	 */
	static function ofValue($val){}
}
?>