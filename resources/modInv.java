    static void modInv(long a, int m)
    {
        // (a^(m-2)) % m
        return pow(a, m - 2, m);
    }