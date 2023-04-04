"""
class Student:
    def __init__(self,name):  #constructor is created...self is used to say that this method belongs to current  class
        self.name=name   #assigning self. to variable 'name' means that u r declaring it as class variable
    def say_hello(self):  
        print(self.name)  #in this method even if name variable isn't declared in method say_hello
                            #as we referred as self.name it becomes class variable like name=""

ob1= Student("pragna")
ob1.say_hello()

"""

"""a=[1,2,3]
b=a
b[0]=100
print(b)
print(a)"""
#here we get both a,b=[100,2,3] this is mechanism is called "deep copy"
#to avoid this and preserve list a values we use ".copy() method"
"""a=[1,2,3]
b=a.copy()
b[0]=100
print(b)
print(a)""" #a=[1,2,3]  b=[10,2,3]


"""
class Student:
    arr=[] #if we create arr like this without self(line 31,32)...deep copy occurs and changes made in any object of this class will be reflected in all other methods too...bcas its being accessed from resource pool
    def __init__(self):
        self.arr=[]  #using this prevents deep copy bcas object is restricted to current class only
    def add_ele(self,value):
        self.arr.append(value)
    def printarr(self):
        print(self.arr)

ob=Student()
ob.add_ele(3)
ob.add_ele(5)
ob.add_ele(6)
ob.printarr()
ob1=Student()
ob1.add_ele(100)
ob1.printarr()
"""

class Bike:
    def __init__(self,name,mil,price):
        self.name=name
        self.mil=mil
        self.price=price
    def getBike(self):
        return (
            "mileage"=self.mil
            "price"=self.price
            "name"=self.name 
        )

            
class Manager:
    def __init__(self):
        self.bike=[] #this object is used to store objects of Bike
    def add_bike(self,name,mil,price):
        bike=Bike(name,mil,price)
        self.bike.append(bike)
    def show_bike(self,name):
        for bike in self.bike:
            if bike.name==name:
                print(bike.getBike())
                return
        return None 
    #remove the bike from array after purchasing it
    def buy_bike(self,bike_name):
        for bike in self.bike:
            if bike.name==bike_name:
                self.bike.remove(bike)
    
    def print_Array(self):
        for bike in self.bike:
            print(bike.getBike())



