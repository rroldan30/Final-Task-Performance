/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.htmltree;

import java.awt.List;
import java.util.Collection;
import java.util.Collections;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author RZ Roldan
 */
public class HtmlTree {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("JTree Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("HTML");
        DefaultMutableTreeNode head = new DefaultMutableTreeNode("Head");
        DefaultMutableTreeNode body = new DefaultMutableTreeNode("Body");
        DefaultMutableTreeNode meta = new DefaultMutableTreeNode("Meta");
        DefaultMutableTreeNode title = new DefaultMutableTreeNode("Title");
        DefaultMutableTreeNode ul = new DefaultMutableTreeNode("UL");
        DefaultMutableTreeNode h1 = new DefaultMutableTreeNode("H1");
        DefaultMutableTreeNode h2 = new DefaultMutableTreeNode("H2");
        DefaultMutableTreeNode li1 = new DefaultMutableTreeNode("LI");
        DefaultMutableTreeNode li2 = new DefaultMutableTreeNode("LI");
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");

        root.add(head);
        root.add(body);
        head.add(meta);
        head.add(title);
        body.add(ul);
        body.add(h1);
        body.add(h2);
        ul.add(li1);
        ul.add(li2);
        h2.add(a);
        

        JTree tree = new JTree(root);
        JScrollPane scrollPane = new JScrollPane(tree);
        frame.add(scrollPane);
        frame.setVisible(true);
        
        
       System.out.println("ROOT NODE: " + root.getRoot());
       System.out.println("PARENT NODES: " + root.getParent());
       System.out.println("SIBLINGS: " + root.getSiblingCount());
       System.out.println("ONE-LEVEL SUBTREES: " + root.getLevel());
       System.out.println("NODES PER LEVEL: " + root.getLeafCount());
       System.out.println("DEPTH: " + root.getDepth());
       System.out.println("DEGREE OF EACH ONE-LEVEL SUBTREE: " + root.getChildCount());
       System.out.println("NODE BASED ON BREADTH-FIRST: " + Collections.list(root.breadthFirstEnumeration()));
       System.out.println("NODE BASED ON PRE-ORDER: " + Collections.list(root.preorderEnumeration()));
       System.out.println("NODE BASED ON POST-ORDER: " + Collections.list(root.postorderEnumeration()));
        
    }   
}
