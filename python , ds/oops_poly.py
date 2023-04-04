#method overloading(compile time polymorphism)
class A:
    def message(self):
        print("message")
    def message(self,data):
        print("message with data")    
ob=A()
ob.message() #it accepts the latest definition of method (in java it accepts base on arguements passed)

#run time polymorpshism is same as in java