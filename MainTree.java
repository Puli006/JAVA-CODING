class ClassTree {

    int data;
    ClassTree left;
    ClassTree right;

    public ClassTree(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }    
}

class BinaryTree{
    ClassTree root;

    public BinaryTree(int rootData){
        root = new ClassTree(rootData);
    }

    public ClassTree getRoot() {
        return root;
    }

    public void insert(ClassTree node, int data){
        if(data < node.data){
            if(node.left != null){
                insert(node.left, data);
            }
            else{
                node.left = new ClassTree(data);
            }
        }
        else {
            if(node.right != null){
                insert(node.right, data);
            }
            else{
                node.right = new ClassTree(data);
            }
        }
    }

    public void inOrderTraversal(ClassTree node){
        if(node == null) return;

        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }

    public ClassTree search(ClassTree node, int target){
        if(node == null || node.data == target){
            return node;
        }

        if(target < node.data){
            return search(node.left, target);
        }
        else{
            return search(node.right, target);
        }
    }
}

public class MainTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(10);
        tree.insert(tree.getRoot(), 5);
        tree.insert(tree.getRoot(), 15);
        tree.insert(tree.getRoot(), 3);
        tree.insert(tree.getRoot(), 7);
        tree.insert(tree.getRoot(), 12);
        tree.insert(tree.getRoot(), 18);

        System.out.println("In-order traversal:");
        tree.inOrderTraversal(tree.getRoot());
        System.out.println();

        int target = 7;
        ClassTree foundNode = tree.search(tree.getRoot(), target);
        if(foundNode != null){
            System.out.println("Node with data " + target + " found in the tree");
        }
        else{
            System.out.println("Node with data " + target + " not found in the tree");
        }
    }
}
