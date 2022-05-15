class Employee():
    c = 0
    ids_list = []

    def __init__(self, uid, name, gender, jobhour, amount):
        self.uid = uid
        self.name = name
        self.gender = gender
        self.jobhour = jobhour
        self.amount = amount
        Employee.c += 1
        self.ids_list.append([uid, name, gender, jobhour, amount])
        self.ids_list = sorted(self.ids_list, key=lambda x: x[3])
        self.ids_list = sorted(self.ids_list, key=lambda x: x[2])
        
        
    def set_uid(self, uid):
        self.uid = uid    
    def set_name(self, name):
        self.name = name
    def set_gender(self, gender):
        self.gender = gender
    def set_jobhour (self, jobhour):
        self.jobhour = jobhour
    def set_amount (self, amount):
        self.amount = amount
        
        
    def get_uid(self):
        return self.uid
    def get_name(self):
        return self.name
    def get_gender(self):
        return self.gender
    def get_jobhour(self):
        return self.jobhour
    def get_amount (self):
        self.amount = amount
    def __str__(self):
        return "\nId: "+ self.uid +"\nName: " +self.name+"\nGender "+self.gender+"\nJob Hour "+self.jobhour +"\nAmount "+self.amount



n = input("How many employees?")
e = []


for i in range(int(n)):
    name = input("Enter employee name")
    uid = input("Enter the ID number")
    gender = input("Enter Gender M/F: ")
    
  
    while True:
            try:
                jobhour = int(input('Enter Job  hours more than 10: '))
                if jobhour < 10:
                    raise ValueError 
                break
            except ValueError:
                print("Invalid integer. The number must be more than 10.")
                
   
    if (gender == "M"):
            
        while True:
            try:
                amount = int(input('Enter amount betwen 100 to 150: '))
                if amount < 100 or amount > 150:
                    raise ValueError 
                break
            except ValueError:
                print("Invalid integer. The number must be in the range of 100-150.")
                
        

    if (gender == "F"):       
        while True:
            try:
                amount = int(input('Enter amount betwen 70 to 120: '))
                if amount < 70 or amount > 120:
                    raise ValueError 
                break
            except ValueError:
                print("Invalid integer. The number must be in the range of 70-120.")
                
    entry = Employee(name, uid, gender, jobhour, amount)
        
    print(entry.ids_list)
    
   
