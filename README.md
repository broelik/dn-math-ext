## dn-math-ext
Пакет для выполнения математических операций. Также добавляет классы для работы с большими числами.
По вопросам - https://vk.com/dn_extension или https://vk.com/broelik.
## Скачать
Последняя версия - https://github.com/broelik/dn-math-ext/releases/latest
## Пример кода
BigInteger:
```php
$a = new BigInteger('ff', 16); // ff - число, 16 - система счисления
$b = $a->add(new BigInteger('1', 2)); // прибавить 1 в двоичной системе счисления
$c = $b->multiply($a); // умножить $a на $b
$d = $c->substract(new BigInteger('1280', 10)); // отнять 1280
$e = $d->divide(BigInteger::ofValue(256)); // Разделить на 256
var_dump($e->toString(1)); // 250
```
BigDecimal:
```php
$a = new BigDecimal(new BigInteger('77', 8));
$b = $a->divide(BigDecimal::ofInt(2), 'HALF_UP'); // разделить на 2
$c = $b->multiply(BigDecimal::ofDouble(0.2)); // разделить на 0.2
$d = $c->movePointRight(10); // передвинуть точку на 10 вправо
var_dump((string)$d); // 64000000000.00000355271367880050092935562133789062500000
```
Пример использования:
https://hub.develnext.org/project/SAmRamPboQkp
