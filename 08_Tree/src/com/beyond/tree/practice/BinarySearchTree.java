package com.beyond.tree.practice;
//
//public class BinarySearchTree {
//	
//	private Node root;
//
//	public BinarySearchTree() {
//
//		this.root = null;
//	}
//	
//	public void insert(int value) {
//		
//		this.root = this.insert(this.root,value);
//	}
//	
//	
//	private Node insert(Node node, int value) {
//		if(node == null) {
//			node = new Node(value);
//			return node;
//		}
//		
//		if(node.value > value) {//value가 더 크면 오른쪽에 저장
//			node.right = insert(node.right, value);
//		}else if(value < node.value) {
//			node.left = insert(node.left, value);
//		}
//		return node;
//	}
//	
//	public void order() {
//		// 전위 순회
////		this.preorder(this.root);
//		
////		// 중위 순회
////		this.inorder(this.root);
//
//		// 후위 순회
//		this.postorder(this.root);
//	}
//
//	private void postorder(Node node) {
//		if(node!=null) {
//			preorder(node.left);// 왼쪽
//			preorder(node.right);// 오른쪽
//			System.out.println(node.value + " ");//부모
//		}
//	}
//
//	private void preorder(Node node) {
//		
//		if(node!=null) {
//			System.out.println(node.value + " ");//부모
//			preorder(node.left);// 왼쪽
//			preorder(node.right);// 오른쪽
//		}
//	}
//
//	private void inorder(Node node) {
//
//		if(node!=null) {
//			inorder(node.left);
//			System.out.println(node.value + " ");
//			inorder(node.right);
//		}
//	}
//		
//		
//
//	private static class Node{
//		private int value;
//		private Node left;
//		private Node right;
//		
//		public Node(int value) {
//			
//			this.value = value;
//			this.left = left;
//			this.right = right;
//		
//		}
//	}
//
//
//}


public class BinarySearchTree {
    private Node root;
    public BinarySearchTree() {
        this.root = null;
    }
    public void insert(int value) {
        this.root = this.insert(this.root, value);
    }
    private Node insert(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value > node.value) {
            node.right = insert(node.right, value);
        } else if (value < node.value) {
            node.left = insert(node.left, value);
        }
        return node;
    }

    public void order() {
        // 전위 순회
        this.preorder(this.root);
        System.out.println();
        // 중위 순회
        this.inorder(this.root);
        System.out.println();
        // 후위 순회
        this.postorder(this.root);
    }

    private void preorder(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            inorder(node.left);
            inorder(node.right);
        }
    }

    private void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.value + " ");
            inorder(node.right);
        }
    }

    private void postorder(Node node) {
        if (node != null) {
            inorder(node.left);
            inorder(node.right);
            System.out.print(node.value + " ");
        }
    }
    
	public void delete(int value) {
		this.root = this.delete(this.root,value);
		
	}
	private Node delete(Node node, int value) {
		if(node == null) {
			return node;
		}else if(node.value > value) {
			node.left = delete(node.left, value);
		}else if(node.value < value) {
			node.left = delete(node.right, value);
		}
		else {
			if(node.left == null) {
				return node.right;
			}
			else if(node.right == null) {
				return node.left;
			}
			node.value = this.minValue(node.right);
			node.right = delete(node.right, node.value);
			
		}
		return node;
	}
	
	

    private int minValue(Node node) {
    	int minValue = node.value;
    	
    	while(node.left != null) {
    		minValue = node.left.value;
    		
    		node = node.left;
    	}
    	
    	return 0;
	}



	private static class Node {
        private int value;
        private Node left;
        private Node right;
        private Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

	public boolean search(int value) {
		
		return this.search(root, value) != null; 
	}
	
	private Node search(Node node, int value) {
			
		if(node == null || node.value == value) {
			return node;
		}else if (node.value > value) {
			return search(node.left, value);
		}else {
			return search(node.right, value);
		}
	}

}