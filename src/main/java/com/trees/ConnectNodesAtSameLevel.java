package com.trees;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectNodesAtSameLevel {


    void connectNodes(Node root) {
        Queue<NodeWithHeight> queue = new LinkedList<>();
        queue.add(new NodeWithHeight(root,0));

        while (!queue.isEmpty()) {

            NodeWithHeight tempNode = queue.poll();

            if(!queue.isEmpty() && tempNode.height == queue.peek().height){

                tempNode.node.connectRight = queue.peek().node;

            }


            if (tempNode.node.left != null) {
                queue.add(new NodeWithHeight(tempNode.node.left,tempNode.height +1));
            }


            if (tempNode.node.right != null) {
                queue.add(new NodeWithHeight(tempNode.node.right,tempNode.height +1));
            }
        }

    }

}
