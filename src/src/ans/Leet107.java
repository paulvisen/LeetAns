package ans;


import sun.reflect.generics.tree.Tree;

import java.util.*;



class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){val=x;}

 }

/**
 *
 * 对给定的二叉树进行层序遍历，然后将遍历的结果每一次插入返回的结构的最开头的位置
 *
 * Created by Administrator on 2016-04-28.
 */
public class Leet107 {

    public List<List<Integer>> levelOrderBottom(TreeNode root){

        List<List<Integer>> retList=new LinkedList<List<Integer>>();
        if(root==null)
            return retList;

        Deque<TreeNode> cur=new LinkedList<TreeNode>();
        Deque<TreeNode> nxt=new LinkedList<TreeNode>();
        Deque<TreeNode> exc=new LinkedList<TreeNode>();

        TreeNode temp;

        cur.add(root);
        while (!cur.isEmpty()){
            List<Integer>layout=new ArrayList<Integer>();
            while (!cur.isEmpty())
            {
                temp=cur.remove();

                if(temp.left!=null)
                    nxt.add(temp.left);
                if(temp.right!=null)
                    nxt.add(temp.right);

                layout.add(temp.val);

            }

            exc=cur;
            cur=nxt;
            nxt=exc;

            retList.add(0,layout);
        }




        return retList;
    }


}
