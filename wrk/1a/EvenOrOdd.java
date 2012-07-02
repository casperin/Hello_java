class EvenOrOdd  {
    public static void main(String[] args) {
        String str = args[0];
        int n = Integer.parseInt(str);
        int k = n % 2;
        String msg = (k == 1) ? "Odd" : "Even";
        System.out.println(msg);
    }
}

