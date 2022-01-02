#Belirli bir öğenin değerini değiştirmek için
#  dizin numarasına bakın
thislist = ["elma", "muz", "kiraz"]
thislist[1] = "Üzüm"
print(thislist)

#"Muz" ve "kiraz" değerlerini "üzüm" ve 
# "karpuz" değerleriyle değiştirin

thislist = ["elma", "muz", "kiraz", "portakal", "kiwi", "mango"]
thislist[1:3] = ["üzüm", "karpuz"]
print(thislist)

#İkinci değeri iki yeni değerle değiştirerek değiştirin 
thislist = ["elma", "muz", "kiraz"]
thislist[1:2] = ["üzüm", "karpuz"]
print(thislist)

#Üçüncü öğe olarak "karpuz" ekleyin:

thislist = ["elma", "muz", "kiraz"]
thislist.insert(2, "karpuz")
print(thislist)
#Yukarıdaki örneğin bir sonucu olarak, 
# liste artık 4 öğe içerecektir.

#append()Bir öğe eklemek için yöntemi kullanma
thislist = ["apple", "banana", "cherry"]
thislist.append("orange")
print(thislist)

#Geçerli listeye başka bir 
# listeden öğeler eklemek için extend()yöntemi kullanın .
thislist = ["apple", "banana", "cherry"]
tropical = ["mango", "pineapple", "papaya"]
thislist.extend(tropical)
print(thislist)


thislist = ["apple", "banana", "cherry"]
thistuple = ("kiwi", "orange")
thislist.extend(thistuple)
print(thislist)

#remove()Yöntem, belirtilen öğeyi kaldırır.
thislist = ["apple", "banana", "cherry"]
thislist.remove("banana")
print(thislist)

#pop()Yöntem, belirtilen indeks kaldırır.
thislist = ["apple", "banana", "cherry"]
thislist.pop(1)
print(thislist)

#Dizini belirtmezssek, pop yöntemi son öğeyi kaldırır.

#del Anahtar kelime de belirtilen indeksi kaldırır
thislist = ["apple", "banana", "cherry"]
del thislist[2]
print(thislist)

#tüm listeyi silmek için:
thislist = ["apple", "banana", "cherry"]
del thislist


#Liste hala duruyor, ancak içeriği yok.
thislist = ["apple", "banana", "cherry"]
thislist.clear()
print(thislist)

#Listedeki tüm öğeleri tek tek yazdırmak için for döngüsünü kullanıyoruz.
thislist = ["apple", "banana", "cherry"]
for x in thislist:
  print(x)

thislist = ["apple", "banana", "cherry"]
i = 0
while i < len(thislist):
  print(thislist[i])
  i = i + 1

#Bir meyve listesinde , sadece adında 
# "a" harfi olan
#  meyveleri içeren yeni bir liste oluşturyoruz.
fruits = ["apple", "banana", "cherry", "kiwi", "mango"]
newlist = []

for x in fruits:
  if "a" in x:
    newlist.append(x)
print(newlist)

#Liste kavrama ile tüm bunları yalnızca bir 
# kod satırıyla yapabilirsiniz

fruits = ["apple", "banana", "cherry", "kiwi", "mango"]

newlist = [x for x in fruits if "a" in x]

print(newlist)

newlist = [x for x in range(30)]
print(newlist)

newlist = [x for x in range(10) if x < 5]
print(newlist)

#6'dan küçük olduğu sürece i'yi yazdırır
i = 1
while i < 6:
  print(i)
  i += 1


#3 olduğumda döngüden çıkın:
i = 1
while i < 6:
  print(i)
  if i == 3:
    break
  i += 1



#x"muz" olduğunda döngüden çıkın 
fruits = ["elma", "muz", "kiraz"]
for x in fruits:
  print(x)
  if x == "muz":
    break


#Muz yazdırmayın
fruits = ["elma", "muz", "kiraz"]
for x in fruits:
  if x == "muz":
    continue
  print(x)

#0'dan 5'e kadar olan tüm sayıları 
# yazdırır ve döngü bittiğinde bir mesaj yazar
for x in range(6):
  print(x)
else:
  print("Sonunda Bitti!")



#Bir işlevi çağırmak için işlev adını ve 
# ardından parantez kullanın:
def my_function():
  print("Hello from a function")

my_function()

#işlev  çağrıldığında, işlevin içinde tam adı yazdırmak
#  için kullanılan bir ad iletiyoruz
def my_function(fname):
  print(fname + " Refsnes")

my_function("Emil")
my_function("Tobias")
my_function("Linus")




#Argümana 10 ekleyin a ve sonucu döndürür
x = lambda a : a + 10
print(x(5))

#a ile b yi çarp 5 ve 6 ya sırayla değerleri ata
x = lambda a, b : a * b
print(x(5, 6))

def myfunc(n):
  return lambda a : a * n

mydoubler = myfunc(2)

print(mydoubler(11))


#araba adlarını içeren bir dizi oluşturduk
cars = ["Ford", "Volvo", "BMW"]
car1 = "Ford"
car2 = "Volvo"
car3 = "BMW"
#Dizideki eleman sayısını cars döndür
x = len(cars)
#Dizideki her öğeyi yazdırır
for x in cars:
  print(x)

cars.append("Honda")# diziye bir eleman ekleme

cars.pop(1)#carsDizinin ikinci öğesini siler

cars.remove("BMW") # BMW değerine sahip öğeyi siiilin
print(cars)