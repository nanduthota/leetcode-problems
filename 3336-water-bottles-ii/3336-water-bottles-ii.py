class Solution:
    def maxBottlesDrunk(self, numBottles: int, numExchange: int) -> int:
        drank = 0
        empty = 0

        while numBottles > 0:
            # Drink all full bottles
            drank += numBottles
            empty += numBottles
            numBottles = 0

            # Exchange if possible
            if empty >= numExchange:
                empty -= numExchange
                numBottles += 1
                numExchange += 1
            else:
                break

        return drank
