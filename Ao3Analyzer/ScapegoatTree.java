package Ao3Analyzer;

import java.io.*;
import java.util.*;

/*
Notes from Katie:
    - How can we structure the application to take advantage of the scapegoat tree's extremely fast search times?
*/

public class ScapegoatTree<Key, Value> implements SymbolTable<Key, Value>{
	
	private Node root;
	private int size;
    private int maxSize;
    private Node scapegoat;

	public ScapegoatTree(){
		this.size = 0;
	}

	private class Node{
        // DONE!
        private Key key;
        private Value val;
        private Node left;
        private Node right;
        private int size;
        private boolean isScapegoat;

        private Node(Key key, Value val, Node left, Node right, int size, boolean isScapegoat){
            this.key = key;
            this.val = val;
            this.left = left;
            this.right = right;
            this.size = size;
            this.isScapegoat = isScapegoat;
        } 
    }

    public boolean isEmpty(){
        // To do
        return false;
    }

    // Returns the number of keys 
    public int size(){
        // To do
        return 0;
    }

    // Puts the key-value pair into the table 
    // The comparator is used to compare keys
    public void put(Key key, Value val, Comparator<Key> comparator){
        // To do
        System.out.println("Not implemented yet");
    } 

    // Returns the value paired with the key 
    // Returns null if the key is not in the table
    // The comparator is used to compare keys
    // "Search operation" 
    public Value get(Key key, Comparator<Key> comparator){
		// it's like the regular BST
        return getHelper(root, key, comparator);
    }

	private Value getHelper(Node current, Key key, Comparator comparator) {
		// base case: search miss
		if (current == null) return null;

		// now compare
		int c = comparator.compare(key, current.key);

		// check if search hit, otherwise recurse
		if (c == 0) return current.val;
		// go left
		else if (c < 0) return getHelper(current.left, key, comparator);
		// go right
		else if (c > 0) return getHelper(current.right, key, comparator);
		// if we get out here there is a problem
		throw new RuntimeException("comparator is throwing null??");
	}

    // Returns true or false if the given key is/is not in the table
    public boolean contains(Key key, Comparator<Key> comparator){
        // To do
        return false;
    }

    // Given a key, deletes its corresponding node and value from the table
    // Prints an error if the key is not in the table 
    // The comparator is used to compare keys
    public void delete(Key key, Comparator<Key> comparator){
        // To do
        System.out.println("Not implemented yet");
    }

    public static void main(String[] args) {

    }
}