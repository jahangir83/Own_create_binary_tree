package Binary_tree;

public class Queue2 {


    DoubleLinkList2 queue = new DoubleLinkList2();

    public void enqueue(Tree root){
        queue.insert(root);
    }

    public Tree dequeue(){
        Tree data = queue.removeNode();

        return data;
    }
    
}
