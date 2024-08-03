def add(num1,num2):
    return num1+num2

def sub(num1,num2):
    return num1-num2

def divide(num1,num2):
    return num1/num2

def multiply(num1,num2):
    return num1*num2

def calculator():
    print("select an operation")
    print("1. add")
    print("2. subtract")
    print("3. multiply")
    print("4. divide")

    q = int(input())
    if (q<1 or q>4):
        print("invalid ")
        return 
    
    num1 = int(input("enter first number: "))
    num2 = int(input("enter second number: "))
    if(q==1):
        print(add(num1,num2))
    elif(q==2):
        print(sub(num1,num2))
    elif(q==3):
        print(multiply(num1,num2))
    elif(q==4):
        print(divide(num1,num2))
    else:
        print("invalid")

if __name__=="__main__":
    calculator()