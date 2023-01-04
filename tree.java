class Node {

  int data;
  Node left;
  Node right;
}

public class tree {

  Node root;
  Node left;
  Node right;

  public Node help() {
    return root;
  }

  public void helper(Node dis) {
    System.out.println(dis.data);
  }

  public Node insert(int number) {
    Node newnode = new Node();
    newnode.data = number;
    if (root == null) {
      root = newnode;
    } else {
      Node pointer = root;
      while (pointer != null) {
        if (newnode.data < pointer.data) {
          if (pointer.left != null) {
            pointer = pointer.left;
          } else {
            pointer.left = newnode;
            break;
          }
        }
        if (newnode.data > pointer.data) {
          if (pointer.right != null) {
            pointer = pointer.right;
          } else {
            pointer.right = newnode;
            break;
          }
        }
      }
    }
    return root;
  }
  public int search(int number) {
    Node pointer = root;
    int count = 0;
    while (pointer != null) {
      if (pointer.data == number) {
        System.out.println("we found " + number);
        break;
      } else if (pointer.data > number) {
        count++;
        pointer = pointer.left;
        System.out.println("we found " + number);
        System.out.println("after going " + count + " to left");

        break;
      } else if(pointer.data<number) {
        pointer = pointer.right;
        count++;
        System.out.println("we found " + number);
        System.out.println("after going " + count + " to right");

        break;
      }
    }
    return number;
  }

  public void inorder(Node node) {
    if (node == null) {
      return;
    }
    inorder(node.left);
    System.out.print(node.data + " ");
    inorder(node.right);
  }

  public void preorder(Node node) {
    if (node == null) {
      return;
    }
    System.out.print(node.data + " ");
    preorder(node.left);
    preorder(node.right);
  }

  public void postorder(Node node) {
    if (node == null) {
      return;
    }

    postorder(node.left);
    postorder(node.right);
    System.out.print(node.data + " ");
  }
}
