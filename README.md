# Design Pattern
 
 
  Design Pattern proqramlaşdırma mühitinde tez-tez ortaya çıxan problemlerə ümumi həll üsuludur . Bu üsullar proqramlaşdırma dillərindən müstəqil olaraq problemin həlli üçün ümumi bir logic olaraq inkişaf etmişdir

# Factory Pattern
 Bir class yaratmaq isdədikdə  hansı alt classın lazım olduğunu bilmədikdə factory pattern-dən istifadə edirik . Factory Pattern-in köməyi ilə biz yazdığımız kodda SOLID-ın qanunlarınada riyayət etmiş oluruq . Loosly couple kod yazmış oluruq beləliklədə yazdığımız kodun həm oxunması həmde baxımi asand olur . 


# Abstract Factory Pattern!
Abstract Factory Pattern prinsip etibari ilə factory pattern-dən əhəmiyyətli dərəcədə fərqlənmir . Buradakı başlıca fərq isə digər fabrikaları yaradan super fabrikin olmasıdır . Bu fabrikə fabriklər fabrikidə deyirlər . Qalan logic isə factory pattern ilə tamamilə eynidir.
Aşağıda proyekt içersindəki kodun sxemi verilmişdir . Buna əsasən deyə bilərikki əvvəlce Factory-dən  Bank Factory yaranir sonraki addımda isə Bank Factoryden Bank yaranir .
![image](https://user-images.githubusercontent.com/88265011/185763724-143b5dfa-690c-4fc7-9494-f772af5d9ce4.png)

# Singleton Pattern

