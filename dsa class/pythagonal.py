#  pythagoras theoram
a, b, c = map(int, input().split())

m = max(a, b, c)

if m == a:
     x = b
     y = c
elif m == b:
    x = a
    y = c
else:
    x = a
    y = b

    if x*x + y*y == m*m:
     print("True")
    else:
     print("False")