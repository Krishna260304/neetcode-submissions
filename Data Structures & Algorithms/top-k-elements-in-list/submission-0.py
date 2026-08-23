class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = [[] for i in range(len(nums) + 1)]
        map = {}
        for num in nums:
            map[num] = map.get(num, 0) + 1
        for n, c in map.items():
            freq[c].append(n)
        arr = []
        for i in range(len(freq) - 1, 0, -1):
            for n in freq[i]:
                arr.append(n)
                if len(arr) == k:
                    return arr
        
    