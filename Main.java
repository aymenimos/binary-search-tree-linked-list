



public class Main {
public static void main(String[] args) {
    
    tree tree=new tree();
    tree.insert(20);
    tree.insert(26);
    tree.insert(18); 
    tree.insert(30);
    tree.insert(15);
    tree.insert(16);
    tree.insert(17);
    tree.search(56);
Node help=tree.help();
System.out.print(" inorder:-");
tree.inorder(help);
System.out.print(" postorder:-");
tree.postorder(help);
System.out.print(" preorder:-");
tree.preorder(help);
}
    
}