import os

BASE_DIR = os.path.dirname(os.path.dirname(__file__))
PATTERNS = ["sliding-window", "two-pointers", "binary-search", "backtracking", "bfs-dfs"]
TOPICS = ["array", "string", "graph", "tree", "dynamic-programming", "heap"]

def ensure_dirs():
    for p in PATTERNS:
        os.makedirs(os.path.join(BASE_DIR, "patterns", p), exist_ok=True)
    for t in TOPICS:
        os.makedirs(os.path.join(BASE_DIR, "topics", t), exist_ok=True)

def add_problem():
    title = input("Problem Title (e.g., Two Sum): ").strip()
    file_name = title.lower().replace(" ", "-") + ".py"
    leetcode_link = input("LeetCode Link: ").strip()
    pattern = input(f"Pattern ({', '.join(PATTERNS)}): ").strip()
    topic = input(f"Topic ({', '.join(TOPICS)}): ").strip()

    code_template = f