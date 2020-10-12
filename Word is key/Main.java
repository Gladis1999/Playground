l=["break","case","continue","default","defer","else","for","func","goto","if","map","range","return","struct","type","var"]
n=input()
if n in l:
  print(n,"is a keyword")
else:
  print(n,"is not a keyword")