b = "Hello, World!"
print(b[2:5])
#İlk karakterin indeksi 0'dır.

b = "Merhaba, Dünya!"
print(b[:5])

# 2.karakterden itibaren hepsini yazdır demektir
b = "Merhaba, Dünya!"
print(b[2:])

#geriye doğru say:)
b = "Merhaba, Dünya!"
print(b[-5:-2])

#büyük harfe çevirir..
b = "Merhaba, Dünya!"
print(b.upper())

#küçük harfe çevirir...
b = "MERHABA, DÜNYA!"
print(b.lower())

# başında veya sonunda herhangi bir boşluk varsa kaldırır.
b = "    Merhaba Ben Serap!    "
print(b.strip())

# başka bir dizeyle dize yerine geçer
b = "Merhaba Ben Serap!"
print(b.replace("B", "S"))

#belirtilen ayırıcı arasındaki metin 
# liste öğeleri haline gelen bir listesini döndürür.
a = "Hello, World!"
print(a.split(",")) 

#değişken birleştirme
a = "Hello"
b = "World"
c = a + b
print(c)
#yukardakine bu şekilde çift tırnak bırakarak boşluk bırakabiliriz.
a = "Hello"
b = "World"
c = a + " " + b
print(c)
#sayı ve metin birleştirmeyi bu şekilde yapabiliriz. 
age = 22
txt = "Merhaba benim adım Serap,ve ben  {} yaşındayım."
print(txt.format(age))

#sınırsız sayıda argüman alır ve ilgili ver tutuculara yerleştirilir
Ürünmiktari =3
ÜrünNumarasi=567
Ürünfiyati=49.95
rapor ="{} dolara ürün miktarı {} olan {} numaralı üründen istiyorum! "
print(rapor.format(Ürünfiyati, Ürünmiktari, ÜrünNumarasi ))

#doğru yerleştirildiğinden emin olmaz için dizin numaraları kullanabilirsiniz.
Ürünmiktari =3
ÜrünNumarasi=567
Ürünfiyati=49.95
rapor ="{0} dolara ürün miktarı {1} olan {2} numaralı üründen istiyorum! "
print(rapor.format(Ürünfiyati, Ürünmiktari, ÜrünNumarasi ))

#çift tırnak içinde çift tırnak kullandığımızda hata  verir ama 
#bu sorunu çözmek için kaçış karakterini kullanın \" 
txt = "Kod, espiri gibidir. \"Açıklamak\" zorundaysanız kötüdür!"
print(txt)

#Bu örnek bir karakteri siler(geri al)
txt = "Hello \bWorld!"
print(txt) 

txt = 'It\'s alright.'
print(txt) 

txt = "This will insert one \\ (backslash)."
print(txt) 

# alt satıra geçme özelliği vardir
txt = "Hello\nWorld!"
print(txt) 

# alt satıra geçme özelliği vardir
txt = "Hello\rWorld!"
print(txt)

#boşluk bırakır 
txt = "Hello\tWorld!"
print(txt) 

#bir ters eğik çizgi ve ardından üç tam sayı, sekizlik bir değerle sonuçlanır
txt = "\110\145\154\154\157"
print(txt) 

# bir ters eğik çizgi ve ardından bir 'x' ve bir onaltılık sayı,
#bir onaltılık değeri temsil eder
txt = "\x48\x65\x6c\x6c\x6f"
print(txt)
# true ve false cevaplarını yazıcaktır ekrana 
print(10 > 9)
print(10 == 9)
print(10 < 9)

#Koşulun True veya olup olmadığına bağlı 
# olarak bir mesaj yazdırın False
a = 200
b = 33
if b > a:
  print("b a 'dan büyüktür")
else:
  print("b a 'dan büyük değildir")

#Bir dizeyi ve bir sayıyı değerlendirir
print(bool("Hello"))
print(bool(15))

#İki değişkeni değerlendirir
x = "Hello"
y = 15

print(bool(x))
print(bool(y))
"""
True Boş dizeler dışında herhangi bir dizedir .
Herhangi bir sayı True, 0(sıfır) hariçtir .
True Boş olanlar hariç herhangi bir liste, demet, küme ve sözlük .
"""
"""
None false zero (sıfır değeri) boş diziler ,
boş parantez ,köşeli, süslü parantezler bunların değeri false dır.
"""
print(bool(False))
print(bool(None))
print(bool(0))
print(bool(""))
print(bool(()))
print(bool([]))
print(bool({}))

#false
class myclass():
  def __len__(self):
    return 0

myobj = myclass()
print(bool(myobj))

#Fonksiyonlar Boolean Döndürebilir
def myFunction() :
  return True

print(myFunction())

#EVET! Yazdır işlev True döndürürse,
#  aksi takdirde "NO!" yazdırın:
def myFunction() :
  return True

if myFunction():
  print("YES!")
else:
  print("NO!")
  
  #EVET!" Yazdır işlev True döndürürse, 
  # aksi takdirde "NO!" yazdırın:
x = 500
print(isinstance(x, int))

#aritmetik operatörler
print(10 + 5)
print(10 - 5)
print(10 / 5)
print(10 * 5)

#Listeler köşeli parantezler kullanılarak oluşturulur:
thislist = ["elma", "muz", "kiraz"]
print(thislist)

#Listeler, yinelenen değerlere izin verir
#Listedeki öğelerin sayısını yazdırın
thislist = ["elma", "muz", "kiraz", "elma ", "kiraz"]
print(thislist)
print(len(thislist))

#Dize, int ve boolean veri türleri
list1 = ["apple", "banana", "cherry"]
list2 = [1, 5, 7, 9, 3]
list3 = [True, False, False]

#Dizeler, tam sayılar ve boole değerleri içeren bir liste
list1 = ["abc", 34, True, 40, "male"]

#Bir listenin veri türünü belirler
mylist = ["apple", "banana", "cherry"]
print(type(mylist))

#çift ​​yuvarlak parantezlere dikkat edin
thislist = list(("apple", "banana", "cherry"))
print(thislist)

#İlk öğenin indeksi 0'dır.
#Listenin birinci öğesini yazdırın:
thislist = ["apple", "banana", "cherry"]
print(thislist[0])

thislist = ["apple", "banana", "cherry"]
print(thislist[-2])

# Arama, dizin 2'de (dahil) başlar 
# ve dizin 5'te (dahil değildir) biter.
thislist = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"]
print(thislist[2:5])

#Bu örnek, öğeleri baştan sona döndürür, 
# ancak "kivi" dahil DEĞİLDİR:
thislist = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"]
print(thislist[:4])

#Bu örnek, "kiraz" dan sona kadar olan öğeleri döndürür:
thislist = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"]
print(thislist[2:])
#Bu örnek, "turuncu"dan (-4)'e kadar olan öğeleri döndürür, 
# ancak "mango" (-1) dahil DEĞİLDİR:
thislist = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"]
print(thislist[-4:-1])

# listede elma olup olmadığını kontrol edeceğiz

thislist = ["elma", "muz", "kiraz"]
if "elma" in thislist:
  print("Evet 'elma' bu listede var")