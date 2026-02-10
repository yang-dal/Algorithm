from collections import defaultdict

def solve_case(W: str, K: int):
    idx = defaultdict(list)

    for i, ch in enumerate(W):
        idx[ch].append(i)
        
    min_len = float('inf')
    max_len = -1

    for ch, pos in idx.items():
        if len(pos) < K:
            continue

        for j in range(len(pos) - K + 1):
            start = pos[j]
            end = pos[j + K - 1]
            length = end - start + 1

            if length < min_len:
                min_len = length
                
            if length > max_len:
                max_len = length

    if max_len == -1:
        return -1

    return min_len, max_len

T = int(input().strip())

for _ in range(T):
    W = input().strip()
    K = int(input().strip())

    ans = solve_case(W, K)

    if ans == -1:
        print(-1)
    else:
        print(ans[0], ans[1])