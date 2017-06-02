/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class CloneGraph {
    
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) {
             return null;
         }
        HashMap<Integer,UndirectedGraphNode> map = new HashMap<>();
        cloning(node, map);
        return map.get(node.label);
    }
    
    private void cloning(UndirectedGraphNode node,HashMap<Integer,UndirectedGraphNode> map) {
         if (map.containsKey(node.label)) {
             return;
         }
         UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
         map.put(clone.label, clone);
         for (UndirectedGraphNode graphNode : node.neighbors) {
             cloning(graphNode, map);
             clone.neighbors.add(map.get(graphNode.label));
         }
    }
}
