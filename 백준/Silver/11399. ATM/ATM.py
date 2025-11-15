N = int(input())
P = list(map(int, input().split()))
time = 0
answer = 0

P = sorted(P, reverse=False)
for i in range(len(P)):
    time += P[i]
    answer += time

print(answer)