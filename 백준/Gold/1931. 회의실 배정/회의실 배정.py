N = int(input())
M = []
answer = 0

for _ in range(N):
    x, y = map(int, input().split())
    M.append((x, y))

M.sort(key=lambda x: (x[1], x[0]))

start_time = 0

for i in range(N):
    a, b = M[i]
    if a >= start_time:
        start_time = b
        answer += 1

print(answer)