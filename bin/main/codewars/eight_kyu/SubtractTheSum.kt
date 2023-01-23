package codewars.eight_kyu

fun main() {
    subtractSum(100)
}

/** Sums the digits of an Integer and subtracts the sum from the integer.
 * Repeats until the number is less than 100 || greater than 0 and then
 * returns the corresponding fruit from the fruits hashMap.*/
fun subtractSum(n: Int): String {
    var mutableN = n
    var isFruit = false
    var sum = 0
    while (!isFruit) {
        sum = mutableN.sumDigits()
        mutableN -= sum
        if (fruits.containsKey(mutableN)) {
            isFruit = true
        }
    }
    return fruits[mutableN]!!
}

fun Int.sumDigits(): Int = toString().map { it.toString().toInt() }.sum()

private val fruits = hashMapOf(
    1 to "kiwi",
    2 to "pear",
    3 to "kiwi",
    4 to "banana",
    5 to "melon",
    6 to "banana",
    7 to "melon",
    8 to "pineapple",
    9 to "apple",
    10 to "pineapple",
    11 to "cucumber",
    12 to "pineapple",
    13 to "cucumber",
    14 to "orange",
    15 to "grape",
    16 to "orange",
    17 to "grape",
    18 to "apple",
    19 to "grape",
    20 to "cherry",
    21 to "pear",
    22 to "cherry",
    23 to "pear",
    24 to "kiwi",
    25 to "banana",
    26 to "kiwi",
    27 to "apple",
    28 to "melon",
    29 to "banana",
    30 to "melon",
    31 to "pineapple",
    32 to "melon",
    33 to "pineapple",
    34 to "cucumber",
    35 to "orange",
    36 to "apple",
    37 to "orange",
    38 to "grape",
    39 to "orange",
    40 to "grape",
    41 to "cherry",
    42 to "pear",
    43 to "cherry",
    44 to "pear",
    45 to "apple",
    46 to "pear",
    47 to "kiwi",
    48 to "banana",
    49 to "kiwi",
    50 to "banana",
    51 to "melon",
    52 to "pineapple",
    53 to "melon",
    54 to "apple",
    55 to "cucumber",
    56 to "pineapple",
    57 to "cucumber",
    58 to "orange",
    59 to "cucumber",
    60 to "orange",
    61 to "grape",
    62 to "cherry",
    63 to "apple",
    64 to "cherry",
    65 to "pear",
    66 to "cherry",
    67 to "pear",
    68 to "kiwi",
    69 to "pear",
    70 to "kiwi",
    71 to "banana",
    72 to "apple",
    73 to "banana",
    74 to "melon",
    75 to "pineapple",
    76 to "melon",
    77 to "pineapple",
    78 to "cucumber",
    79 to "pineapple",
    80 to "cucumber",
    81 to "apple",
    82 to "grape",
    83 to "orange",
    84 to "grape",
    85 to "cherry",
    86 to "grape",
    87 to "cherry",
    88 to "pear",
    89 to "cherry",
    90 to "apple",
    91 to "kiwi",
    92 to "banana",
    93 to "kiwi",
    94 to "banana",
    95 to "melon",
    96 to "banana",
    97 to "melon",
    98 to "pineapple",
    99 to "apple",
    100 to "pineapple",
)
/*
function SubtractSum(n){
  let sum = 0;
  let notInFruits = true;
  while (notInFruits) {
    for (const dig of n.toString().split("')) {
      sum += +dig;
    }
    n = n - sum;
    console.log(fruits[n]);
    if (n > 0 && n <= 100) {
      notInFruits = false;
    }
  }
  let fruit = fruits[n];
  return fruit;

*/