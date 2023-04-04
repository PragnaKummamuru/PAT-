#single inheritance
class A:
    def msg_a(self):
        print("In class A")
class B(A): # B inheritts A
    def msg_b(self):
        print("In class B")


#multilevel inheritance
class C(B): # if we give class C(A) its "heirerchial inheritence"
    def msg_c(self):
        print("In class C")

x=B()
x.msg_a()


#multiple inheritance
class parent_one:
    def msg(self):
        print("in class 1")
class parent_two:
    def msg(self):
        print("in class 2")
class child(parent_one,parent_two): #parent_one is passed first so method of that class is  only implemented when both parents r given same method names
    pass
ch=child()
ch.msg()  
# here to invoke method of parent class first and then child class method when object for child is created:
#METHOD 1:
class parent_one:
    def msg(self):
        print("in class 1")
class parent_two:
    def msg(self):
        parent_one.msg()
        print("in class 2")
class child(parent_one,parent_two): 
    def msg(self):
        print("IN child")
ch=child()
ch.msg()  
#METHOD 2:
class parent_one:
    def msg(self):
        print("in class 1")
class parent_two:
    def msg(self):
        parent_one.msg()
        print("in class 2")
class child(parent_one,parent_two): 
    def msg(self):
        super(parent_one).msg() #i.e., super(PARENT NAME).METHOD_NAME()
        print("In child class")
ch=child()
ch.msg()  


#hybrid inheritance =multiple + hierarchial
class parent_one:
    def msg1(self):
        print("in class 1")
class parent_two:
    def msg2(self):
        print("in class 2")
class child(parent_one,parent_two):
    def msg3(self):
        print("child cls with 2 parents")
class c1(child):
    def msg4(self):
        print("first kid of child class")
class c2(child):
    def msg5(self):
        print("second kid of child class")

obj=c1()
obj.msg4()