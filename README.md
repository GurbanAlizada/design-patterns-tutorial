# Design Pattern
 
 
  Design Pattern proqramlaşdırma mühitinde tez-tez ortaya çıxan problemlerə ümumi həll üsuludur . Bu üsullar proqramlaşdırma dillərindən müstəqil olaraq problemin həlli üçün ümumi bir logic olaraq inkişaf etmişdir

# Factory Pattern
    Bir class yaratmaq isdədikdə  hansı alt classın lazım olduğunu bilmədikdə factory pattern-dən istifadə edirik . Factory Pattern-in köməyi ilə biz yazdığımız kodda SOLID-ın qanunlarınada riyayət etmiş oluruq . Loosly couple kod yazmış oluruq beləliklədə yazdığımız kodun həm oxunması həmde baxımi asand olur . 


# Abstract Factory Pattern!
    Abstract Factory Pattern prinsip etibari ilə factory pattern-dən əhəmiyyətli dərəcədə fərqlənmir . Buradakı başlıca fərq isə digər fabrikaları yaradan super fabrikin olmasıdır . Bu fabrikə fabriklər fabrikidə deyirlər . Qalan logic isə factory pattern ilə tamamilə eynidir.
Aşağıda proyekt içersindəki kodun sxemi verilmişdir . Buna əsasən deyə bilərikki əvvəlce Factory-dən  Bank Factory yaranir sonraki addımda isə Bank Factoryden Bank yaranir .
![image](https://user-images.githubusercontent.com/88265011/185763724-143b5dfa-690c-4fc7-9494-f772af5d9ce4.png)

# Singleton Pattern
 Singleton Pattern ən çox istifadə olunan patternlərdən biridir . Burada əsas məqsəd bir classın obyektinin yalnız bir dəfə yaradılmasına icazə verməkdir . Bunun üçün isə classın constructor-unu private edib class içində static bir methodda həmin classın obyektini yaratmaqdır . Və  obyekt yaratmaq lazım olduqda isə həmin static methodu çağırmaq kifayətdir . Burada class-ı final elan edərək onnan başqa classaların extends etmesini əngəlləyə bilərik və beləliklədə classımız immutable olur.
 
# Builder Pattern

    Creational pattern-lərin bir növü olan bu patterndə çox geniş şəkildə istifadə olunur . Burada əsas məqsəd class yaratdığımızda constuctor-ları doldurduqda daha asan şəkildə seçim etməkdir . Nümunə olaraq 2 fərqli kod nümunəsi göstərmişəm . Builder istifədə edərək constructor-da yalnız isdədiyimiz field-ları doldururuq boş  fieldlar isə default qiymət alır.
Builder pattern-dən istifadə üçün lombok kitabxanası bizim üçün köməklik edir . Proyektlərimizin pom.xml hissəsindən lombok kitabxanasını əlavə edib pojo classımızın başına @Builer annotation-nı əlavə etsək həmin class-ın obyektini builder pattern üsulu ilə yarada bilərik . Bu isə bizə bir çox avantajlar verir.
Bunun isə işləmə məntiqi bəsitdir deməli JVM arxada @Builer annotation-nı əlavə edilmiş classın bənzəri bir classı yaradır(Bizim nümunəmizdəki EvBuilder kimi ) və ona builder özəlliyini verir. Biz isə bunlardan xəbərsiz sadəcə obyektlərnən işliyirik
Bu isə kodumuzda yer alan biraz daha fərqli bir builder pattern istifədəsidir 
![image](https://user-images.githubusercontent.com/88265011/185784213-cc24a0b3-aea9-44e2-ac50-3481feb29173.png)

#Prototype Pattern
    Prototype pattern-də creational pattern-lərin bir növüdür . Buradakı strategiya isə bir pojo class-nı Cloneable interface-indən implements etməkdir.Bundan sonra isə clone() methodunu override edirik və casting prosesini yerindəcə aparırıq . Ondan sonra isə obyekt yaratmaq lazım olduqda bu methodu clone etmək isdədiyimiz referansı istifadə edərək çağırırıq . Neticədə yaratdığımız yeni obyekt digər obyektin dəyərlərini daşıyacaq . 
Prototip Pattern deyir ki, yenisini yaratmaq əvəzinə mövcud obyektin klonlanması və tələbə uyğun olaraq da fərdiləşdirilə bilər.
Yeni obyektin yaradılmasının dəyəri bahalı və resurs tələb edirsə prototype pattern-dən istifadə edirik.

