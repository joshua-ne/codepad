public static boolean isPrime(int number) { int sqrt = (int) Math.sqrt(number) + 1; for (int i = 2; i < sqrt; i++) { if (number % i == 0) { // number is perfectly divisible - no prime return false; } } return true; }

Read more: http://www.java67.com/2014/01/how-to-check-if-given-number-is-prime.html#ixzz5kMnomjrx