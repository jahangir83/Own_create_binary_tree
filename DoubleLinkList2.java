package Binary_tree;


class Node{
    Node Prev, Next = null;
    Tree data;


    public Node(){

    }
    Node(Tree node){
        this.data = node;
    }
}


public class DoubleLinkList2 {
    
    Node head, tall = null;
    int size = 0;

    public void insert(Tree node){

        Node newNode = new Node(node);
        if(head == null){
            this.head = newNode;
            this.tall = newNode;
            this.size += 1;
        }else{
            this.tall.Next = newNode;
            newNode.Prev = this.tall;
            this.tall = newNode;
        }
        this.size += 1;
    }


    // public __remove(Node node){

    // }

    // public void re(){
    //     this.removeNode()
    // }

    public Tree removeNode( ){

       Tree head = this.head.data;
        this.head = this.head.Next;
        // this.head.Next.Prev = this.head.Prev;
        this.size -= 1;

        return head;
    }


}


class Listt{
    public static void main(String[] args) {
        DoubleLinkList2 list = new DoubleLinkList2();

        
    }
}