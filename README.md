# Truth-Table-and-Boolean-Function-Generator-for-Karnaugh-Maps
3 ve 4 değişkenli Karnaugh haritalarını analiz etmek için bir simülatör. Program, harita verilerini bir dosyadan okuyarak doğruluk tablosunu oluşturur, Boole fonksiyonunu minterimlerin toplamı ve maksterimlerin çarpımı şeklinde ve tamamlayıcı fonksiyonunu aynı formatta çıktı olarak verir.


1. Uygulama çalıştığında ilk olarak “karnaugh.txt” adındaki dosyayı okumalıdır. “karnaugh.txt” dosyasında bir
karnaugh diyagramına ilişkin bilgiler yer almaktadır. Ödevle birlikte örnek iki dosya sisteme yüklenecektir.
Kendinizin de formata uygun farklı dosyalar oluşturup uygulamanızı test etmenizde yarar vardır.
2. Ödevle birlikte sisteme yüklenecek olan örnek iki dosyayı açıp inceleyerek formatı öğrenebilirsiniz. Ayrıca,
örnek bir dosyanın ekran görüntüsü aşağıda yer almaktadır.
3. Uygulamanız sadece 3-değişkenli ve 4-değişkenli karnaugh diyagramlarını desteklemelidir.
4. Değişkenlerin isimleri tek karakterlidir fakat değişken isimleri değişebilir. Yani uygulamanız bunu
destekleyecek şekilde dinamik olmalıdır.
5. Program şu üç şeyi ekrana çıktı olarak vermelidir:
a. Dosyadaki karnaugh diyagramına karşılık gelen doğruluk tablosu
b. Boole fonksiyonunun minterimlerin toplamı ve maksterimlerin çarpımı şeklindeki ifadesi.
c. Fonksiyonun tümleyeninin minterimlerin toplamı ve maksterimlerin çarpımı şeklindeki ifadesi
(Örnek bir ekran görüntüsü aşağıda verilmiştir. İnceleyiniz.)



Örnek bir ekran görüntüsü aşağıda verilmiştir:
karnaugh.txt dosyası okundu.
doğruluk tablosu:
A B C F
0 0 0 0
0 0 1 1
0 1 0 0
0 1 1 1
1 0 0 1
1 0 1 0
1 1 0 0
1 1 1 1
fonksiyon ifadeleri:
F = A’B’C + A’BC + AB’C’ + ABC
F = (A + B + C).(A + B’ + C).(A’ + B + C’).(A’ + B’ + C)
F’ = A’B’C’ + A’BC’ + AB’C + ABC’
F’ = (A + B + C’).(A + B’ + C’).(A’ + B + C).(A’ + B’ + C’)

![Otomata](https://github.com/user-attachments/assets/529d34e8-091c-456b-99ad-d55cdbc39b2e)



