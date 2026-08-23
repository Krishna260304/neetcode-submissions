class Solution(object):
    def isAnagram(self, s, t):
        if len(s) != len(t):
            return False
        map = {}
        for i in s:
            map[i] = map.get(i, 0) + 1
        for j in t:
            if j not in map:
                return False
            map[j] -= 1
            if map[j] < 0:
                return False
        return True