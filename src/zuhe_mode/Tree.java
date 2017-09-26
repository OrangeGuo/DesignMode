package zuhe_mode;

public class Tree {

	/**
	 * @param args
	 */
	TreeNode rootNode=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Tree tree=new Tree("A");
        TreeNode nodeB=new TreeNode("B");
        TreeNode nodeC=new TreeNode("C");
        nodeB.add(nodeC);
        tree.rootNode.add(nodeB);
        System.out.print("finish the tree");
     }
	public Tree(String name){
		rootNode=new TreeNode(name);
	}

}
