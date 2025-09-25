class Solution:
    def intToRoman(self, num: int) -> str:
        values = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
        symbols = ["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]

        res_parts = []
        for val, sym in zip(values, symbols):
            count = num // val
            if count:
                res_parts.append(sym * count)
                num -= val * count
        return "".join(res_parts)


# Example usage / quick test
if __name__ == "__main__":
    print(Solution().intToRoman(3749))  # MMMDCCXLIX
    print(Solution().intToRoman(58))    # LVIII
    print(Solution().intToRoman(1994))  # MCMXCIV
