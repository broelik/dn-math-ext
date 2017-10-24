<?php 
namespace php\math;



class MathContext
{
	/**
	 * @readonly
	 * @var int
	 */
	public $precision;
	/**
	 * @readonly
	 * @var string
	 */
	public $roundingMode;
	
	/**
	 * @param int $setPrecision
	 * @param string $setRoundingMode
	 */
	function __construct($setPrecision, $setRoundingMode = null){}

	
	/**
	 * @param string $string
	 * @return MathContext
	 */
	static function ofString($string){}
	/**
	 * @return MathContext
	 */
	static function UNLIMITED(){}
	/**
	 * @return MathContext
	 */
	static function DECIMAL32(){}
	/**
	 * @return MathContext
	 */
	static function DECIMAL64(){}
	/**
	 * @return MathContext
	 */
	static function DECIMAL128(){}
}
?>