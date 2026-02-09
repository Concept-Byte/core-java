class FindPalindrome {
    public static void main(String[] args) {
        System.out.println("The Palindrome Number between 1000 to 5000.");
        int n;
        for (n = 1000; n <= 5000; n++) {
            findPalindrome(n);

        }
    }

    public static void findPalindrome(int n) {
        int sum = 0;
        int rem = 0;
        while (n > 0) {
            rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
        }
        if (sum == n) {
        }
        System.out.print(sum + " ");
    }
}