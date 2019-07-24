package com.muhammad.trie;

public class TrieTest {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insertWord("car");
        trie.insertWord("card");
        trie.insertWord("chip");
        trie.insertWord("trie");
        trie.insertWord("try");
        
        
       System.out.println("Check if cat is a prefix: " + trie.isPrefixValid("cat"));
       System.out.println("Check if car is a prefix: " + trie.isPrefixValid("car"));
       System.out.println("Check if tr is a prefix: " + trie.isPrefixValid("tr"));
       System.out.println("Check if chi is a prefix: " + trie.isPrefixValid("chi"));
       
       System.out.println("check for word \n");
       
       System.out.println("Check if cat is a word: " + trie.isWordValid("cat"));
       System.out.println("Check if car is a word: " + trie.isWordValid("car"));
       System.out.println("Check if tr is a word: " + trie.isWordValid("tr"));
       System.out.println("Check if chi is a word: " + trie.isWordValid("chi"));
       System.out.println("Check if chip is a word: " + trie.isWordValid("chip"));
       System.out.println("Check if card is a word: " + trie.isWordValid("card"));
       System.out.println("Check if trie is a word: " + trie.isWordValid("trie"));
       System.out.println("Check if try is a word: " + trie.isWordValid("try"));
       
       System.out.println("\n all the keys in the Trie");
       
       trie.printAllKeys();
       
    }
}
