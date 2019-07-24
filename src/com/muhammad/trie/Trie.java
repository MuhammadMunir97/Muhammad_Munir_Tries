package com.muhammad.trie;

public class Trie {
    public Node root;
    
    public Trie() {
        this.root = new Node();
    }
    
    public void insertWord(String word) {
        // gets the root node;
        Node currentNode = this.root;
        
        // iterates over every character in the word
        for(int i = 0; i < word.length(); i++) {
            // currentLetter is just the character / letter at the iteration
            Character currentLetter = word.charAt(i);
            // ask if the current letter is in the map of the current node
            Node child = currentNode.children.get(currentLetter);
            if(child == null) {
                child = new Node();
                currentNode.children.put(currentLetter, child); 
            } 
            
            currentNode = child;
        }
        currentNode.isCompleteWord = true;
    }
    
    public boolean isPrefixValid(String prefix) {
    	Node current = this.root;
    	
    	for (int i = 0; i < prefix.length(); i++) {
			Character currentLetter = prefix.charAt(i);
			Node child = current.children.get(currentLetter);
			if(child==null) {
				return false;
			}
			current = child;
		}
    	return true;
    }
    
    public boolean isWordValid(String word) {
    	Node current = this.root;
    	
    	for (int i = 0; i < word.length(); i++) {
			Character currentLetter = word.charAt(i);
			Node child = current.children.get(currentLetter);
			if(child==null) {
				return false;
			}
			current = child;
		}
    	if(current.isCompleteWord == true) {
    		return true;
    	} else {
    		return false;
    	}
    	
    	
    }
    
    public void printAllKeys() {
    	recursivePrinting(this.root);
    }

	private void recursivePrinting(Node current) {
    	for (Character key : current.children.keySet()) {  
            System.out.println("key: " + key);
            Node child = current.children.get(key);
            if(child == null) {
               	return;
            }
            recursivePrinting(child);
    	}
	}
    
}