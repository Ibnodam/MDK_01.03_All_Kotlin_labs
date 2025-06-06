using System;
using System.Collections.Generic;

public class TreeNode
{
    public int Value;
    public List<TreeNode> Children;

    public TreeNode(int value)
    {
        Value = value;
        Children = new List<TreeNode>();
    }
}

public class Program
{
    public static void Main(string[] args)
    {
        // Пример создания дерева
        TreeNode root = new TreeNode(1);
        TreeNode child1 = new TreeNode(2);
        TreeNode child2 = new TreeNode(3);
        root.Children.Add(child1);
        root.Children.Add(child2);
        child1.Children.Add(new TreeNode(4)); 
        child1.Children.Add(new TreeNode(5)); 

 
        AddLeaves(root);

        PrintTree(root, 0);
    }


    public static void AddLeaves(TreeNode node)
    {
 
        if (node.Children.Count == 0)
        {
   
            node.Children.Add(new TreeNode(10));
            node.Children.Add(new TreeNode(11));
        }
        else
        {
          
            foreach (var child in node.Children)
            {
                AddLeaves(child);
            }
        }
    }

 
    public static void PrintTree(TreeNode node, int indent)
    {
        Console.WriteLine(new string(' ', indent) + node.Value);
        foreach (var child in node.Children)
        {
            PrintTree(child, indent + 2);
        }
    }
}