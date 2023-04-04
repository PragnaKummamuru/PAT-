class node:
    def __init__(self,value):
        self.data=value
        self.left=None
        self.right=None
class tree:
    def add_ele(self,root,value):
        newnode=node(value)
        if value<root.data:
            if root.left==None:
                root.left=newnode
            else:
                self.add_ele(root.left,value)
        else:
            if root.right==None:
                root.right=newnode
            else:
                self.add_ele(root.right,value)
    def inorder(self,root):
        if root.left!=None:
            self.inorder(root.left)
        print(root.data,end=" ")
        if root.right!=None:
            self.inorder(root.right)
    def preorder(self,root):
        print(root.data,end=" ")
        if root.left!=None:
            self.preorder(root.left)
        if root.right!=None:
            self.preorder(root.right)
    def postorder(self,root):
         if root.left!=None:
            self.postorder(root.left)
         if root.right!=None:
            self.postorder(root.right)
         print(root.data,end=" ")
    #queue is used for level order traversal implementation of tree. Steps for level order traversal :
#step1 : remove an element from tree and it to queue 
#step2 : op:print that element 
#step3: remove the left and right of that element(if exists)from tree  and add them to queue and finally remove those elements and orint in op.
#repaeat above steps using while
    def level_order(self,root):
        q=[root]
        while len(q)!=0:
            ele=q.pop(0)
            print(ele.data,end=' ')
            if ele.left!=None:
                q.append(ele.left)
            if ele.right!=None:
                q.append(ele.right)
    def sum(self,root):  #to find sum of elements in left sub tree , right subtree
        res=root.data
        if root.left!=None:     # u can see this function is similar to pre-order 
            res+=self.sum(root.left)
        if root.right!=None:
            res+=self.sum(root.right)
        return res
    def height(self,root):
        if root==None:  #if tree in empty or our root has no children 
            return -1
        left_height = self.height (root.left)
        right_height = self.height(root.right)
        return 1+max(left_height , right_height)
ob=tree()
root=node(10)
ob.add_ele(root,5)
ob.add_ele(root,15)
ob.add_ele(root,2)
ob.add_ele(root,6)
ob.add_ele(root,12)
ob.add_ele(root,17)
ob.inorder(root)
print()
ob.preorder(root)
print()
ob.postorder(root)
print()
ob.level_order(root)
print()
print(ob.sum(root.left)) #gives sum of ele in left subtree
print(ob.sum(root.right))
print(ob.height(root))