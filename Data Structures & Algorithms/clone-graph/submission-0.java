/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    static Map<Node, Node> map = new HashMap<>();

    public Node dfs(Node node)
    {
        if (map.containsKey(node)) {
            return map.get(node);
        }
        Node cp = new Node(node.val);
        map.put(node, cp);
        for(Node nei : node.neighbors)
        {
            cp.neighbors.add(dfs(nei));
        }
        return cp;
    }

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        return dfs(node);
    }
}