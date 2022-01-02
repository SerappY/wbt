print("Hello, World!")

if 5 > 2 :
    print("Five is greater than two!") # en az bir boşluk bırakmamız gerekiyor yoksa hata verir.

  #  if 5 > 2 :
  # print("Five is greater than two!") bu şekilde hata veirir.

#Değişkenler
    x = 5
    y = "Hello, World!"

    # bu bir yorum satırıdır.
    # birden fazla yorum satırı da yapabiliriz.

    """
    yorumlarımızı burda istediğimiz kadar 
    # karakteri  kullanmadan da yapabiliriz.
    çok satırlı dizeler için kullanılır.

    ''' 
    bu şekilde de yapabiliriz...

    '''

    """
x = 5 # x  int türünde 
y = "john" # y string türünde 
print(x)
print(y)


x = 4 # int 
x = "Sally" # string
print (x)

# veri tipini belirleme 
x = str(3)
y = int(3)
z = float(3) 

    # type() fonksiyon ile bir değişkenin veri tipini alabilirsiniz.
    #komut satırında class int ve class str yazıcaktır bu şekilde 
    # veri türlerini bilebiliriz.

x = 5 
y = "john" 
print(type(x))
print(type(y))

# değişkenlere tek veya çift tırnak kullanılabilir.
#ve bu şekilde değişkene dize atayabiliriz.
x = "Serap"
x = 'Serap'
print(x)

# değişken isimleri büyük/küçük harf duyarlıdır.
a = 4
A = "Sally"
print(a)
print(A)

# yasal değişken adları:

myvar = "john"
my_var = "john"
_my_var = "john"
myVar = "john"
MYVAR = "john"
myvar2 = "john"

"""geçersiz değişken adları:
 
 2myvar ="john"
 my-var = "john"
 my var = "john"

 """
 # DEVE KILIFI 
 # ilki hariç her kelime büyük harfle başlar.
myVariableName = "john"

# PASCAL VAKASI
#her kelime büyük harfle başlar
MyVariableName = "john"

#YILAN KILIFI
# her kelime bir alt çizgi karakteri ile ayrılır
my_variable_name = "john"


# bir satırda birden çok değişkene değer atamanıza izin verir
x, y, z = "Orange","Banana", "Cherry"
print(x)
print(y)
print(z)

# ve aynı değeri bir satırda birden çok değişkene atayabilirsiniz
x = y = z = "orange"
print(x)
print(y)
print(z)

fruits = ["apple", "banana", "cherry"]
x, y, z = fruits
print(x)
print(y)
print(z)

# hem metin hem değişken birleştirmek için + karakteri kullanılır
x = "harika"
print("python " + x)

# + Karakteri başka bir değişkene 
# bir değişken eklemek için de kullanabilirsiniz
x = "python is "
y = "awesome"
z = x + y
print(z)

# Sayılar için + karakter
#  matematiksel bir operatör olarak çalışır

x = 5 
y = 10
print(x + y)

"""
x = 5
y = "john"
print(x + y)
 bir dizgeyi ve bir sayıyı birleştirmeye çalışırsanz hata verir.

"""

#! Bir fonksiyonun dışında oluşturulan değişkenler
# ( yukarıdaki örneklerin  hepsi) global değişkenler olarak bilinir.

x = "Harika"

def myfunc():

  print("python " + x)

myfunc()

# bir fonksiyon içinde aynı isimde bir değişken oluşturursanız,
#  bu değişken yerel olur ! ve sadece fonksiyon içinde kullanılabilir

#aynı ada sahip global değişken, oldugu gibi ,global ve orjinal değerde kalacaktır.

x = "Harika"
def myfunc():
    x = "fantastik"

    print("python " + x)

myfunc()

print("python " + x)

#globalAnahtar kelimeyi kullanırsanız, değişken genel kapsama aittir:
def myfunc():

    global x 
    x = "fantastik"
myfunc()

print("python " + x)    

# Bir fonksiyon içindeki global bir değişkenin 
# değerini değiştirmek için,
#  globalanahtar kelimeyi kullanarak değişkene bakın
x = "harika"

def myfunc():

  global x
  x = "fantastik"

myfunc()

print("Python " + x)

# python da üç sayısal tür vardır 
#int , float, complex

x = 1
y = 2.8
z = 1j
print(type(x))
print(type(y))
print(type(z))

# int 
x = 7
y = 356562225978966
z = -19

print(type(x))
print(type(y))
print(type(z))

#float
x = 3.14
y = 1.0
z = -12.99

print(type(x))
print(type(y))
print(type(z))

x = 5e5
y = 12E77
z = -87.7e100

print(type(x))
print(type(y))
print(type(z))

#complex
u = 3+5j
o = 5j
k = -5j

print(type(u))
print(type(o))
print(type(k))

x = 6    # int
y = 3.8  # float
z = 8j   # complex

#int den float' a çeviriyoruz
a = float(x)

#floattan int' a çeviriyoruz
b = int(y)

# int den complex' e çeviriyoruz
c = complex(x)

print(a)
print(b)
print(c)

print(type(a))
print(type(b))
print(type(c))

#rastgele sayı 

import random
print(random.randrange(1, 20))

#int
x = int(1)           
y = int(2.8) 
z = int("3") 

print(x)
print(y)
print(z)

#float
x = float(1) 
y = float(2.8)   
z = float("3")   
w = float("4.2") 

print(x)
print(y)
print(z)

#string
x = str("s1") 
y = str(2)    
z = str(3.0)

print(x)
print(y)
print(z)

# 7. sıradaki karakteri alır.indis sıfır(0) dan başlar.

a = "Merhaba, Dünya!"
print(a[7])

#"Kiraz" kelimesindeki harfler arasında dolaşır
for x in "Kiraz":
  print(x)

#len()İşlevi, bir dizenin uzunluğunu döndürür
a = "Merhaba, Python!"
print(len(a))
#Aşağıdaki metinde "espiri" ifadesinin olup olmadığını kontrol eder
txt = "Kod, espiri gibidir. Açıklamak zorundaysanız kötüdür!"
print("espiri" in txt)
#Yalnızca "kötüdür!" varsa yazdırın:
txt = "Kod, espiri gibidir. Açıklamak zorundaysanız kötüdür!"
if "kötüdür!" in txt:
  print("Ewet, 'kötüdür!' mevcut.")
#Aşağıdaki metinde "pahalı" ifadesinin OLMADIĞINI kontrol eder
txt = "Hayattaki en güzel şeyler bedavadır!"
print("pahalı" not in txt)

txt = "Hayattaki en güzel şeyler bedavadır!"
if "pahalı" not in txt:
 print("Hayır, 'pahalı' mevcut değildir.")
