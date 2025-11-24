import heapq

N = int(input())
x = []

for _ in range(N):
    heapq.heappush(x, int(input()))

answer = 0

while len(x) > 1:
    a = heapq.heappop(x)
    b = heapq.heappop(x)
    s = a + b
    heapq.heappush(x, s)
    answer += s

print(answer)