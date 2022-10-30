# Simple Java Program Having Tight coupling

- In this example the class Address and Employee is tightly coupled, lets say you want to take present address some time and permanet address of a employee in some other case. so you would need to update the Address class.
- Instead we can create a address interface and make PermenantAddress and TempAddress to implement Address class.