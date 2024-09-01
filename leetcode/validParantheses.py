class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        closeToOpen = {')': '(', ']': '[', '}': '{'}
        
        for char in s:
            if char in closeToOpen:
               if stack and stack[-1] == closeToOpen[char]:
                  stack.pop()
               else:
                    return False
            else:
                stack.append(char)

        return True if not stack else False   

solution = Solution()   


test_cases = ["()","(){}[]","(]","([{}])"]
# check = "{]}"
for i, test in enumerate(test_cases):
    result = solution.isValid(test)
    print(f"Test case {i+1}: {test} -> {result}")

    # or directly print the simple solution one by one
    # print(solution.isValid(check))