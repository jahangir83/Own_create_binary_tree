package Binary_tree;

class Tree{
    Tree left, right = null;
    int data;

    Tree(int item){
        this.data = item;

    }
}

public class BinaryTree {
    Tree root = null;

    public void tree_insert(int item){
        if(this.root == null){
            this.root = new Tree(item);
        }else{
            Queue2 neQueue = new Queue2();
            neQueue.enqueue(this.root);

            while(true){
                 Tree cheking_node = neQueue.dequeue();

                if(cheking_node.left == null){
                    cheking_node.left = new Tree(item);
                    return;
                }else if(cheking_node.right== null){
                    cheking_node.right = new Tree(item);
                    return;
                }else{
                    neQueue.enqueue(cheking_node.left);
                    neQueue.enqueue(cheking_node.right);
                }
            }
        }
    }


    public void Tree_printer(Tree node){
        Tree rootNode = node;
        if(rootNode != null){
            System.out.println(rootNode.data);
            // System.out.println();
            Tree_printer(rootNode.left);
            Tree_printer(rootNode.right);
        }
    }
}

class RunClass{
    public static void main(String[] args) {
        System.out.println("jahangir");

        BinaryTree tree = new BinaryTree();

        int sum = 10;
        for(int i = 0; i <= 10; i++){
            tree.tree_insert(i);
        }

        tree.Tree_printer(tree.root);
    }
}