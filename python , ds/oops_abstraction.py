#ABSTRACTION

from abc import ABC,abstractmethod  #abc-abstract base class package and ABC - abstract class inside package

class Example(ABC):
    @abstractmethod #to create an abstract method we use this annotation 
    def method_one(self): #it is okay to write definition inside abstract method unlike java
        print("HIIIIII")    #however this method will be over written and is not implemented
class Student(Example):  #extracts abstarct class so that we can access abtract method by creating an object to this 
    def method_one(self):
        print("HELOOOO")                        

obj=Student()
obj.method_one()
