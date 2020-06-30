## Mars Rover Projesi
Template Method ve Factory tasarım kalıpları kullanılarak tasarım yapıldı.
Uygulamada geçersiz komut girdisi veya haritanın dışına çıkacak bir komut geldiğinde
ne yapılacağıyla ilgili yönlendirme bulunmuyordu. Bu kısımlar geçersiz komut olarak değerlendirilip
Rover'ın konumu değiştirilmedi.

#### Uygulama Paketleri
* ***base***    →  __Uygulamada kullanılan yardımcı sınıflar bulunur.__
    * ***Constants*** → Uygulamada  kullanılan sabit değişkenler bulunur.
    * ***Utils***     → Uygulamada validasyon için kullanılan metotlar bulunur.
* ***domain***    →  __Uygulamanın sorumluluklarını yerine getiren ana sınıflar bulunur.__
  * ***Instruction*** →  __Gelen komutlarla ilgili alınması gereken aksiyonların yazıldığı sınıflar bulunur. Oop soyutlama özelliği kullanılarak kod tekrarı önlendi. ilerde herhangi bir alt sınıfta olan değişikliğin etkisi sadece o sınıfı etki edecek şekilde ayrıştırıldı.__
  * ***Map***  → Plato'daki harita bilgisini tutar. Oluşturulan yeni konumun  geçerli olup/olmadğı kontrolu yapar.
  * ***Plateau*** →  Plato nesnesinin oluşturulmasından sorumlu sınıf.
  * ***Position*** →  İzcinin konum bilgisini tutan sınıftır.
  * ***Rover*** → Platoda gezecek izciye karşılık gelir. gelen komut bilgisinide üzerinde tutar. 
  
  
  #### Örnek Çıktılar
  
Gönderilen ödevdeki cıktı

![alt text](case1.png)
 
 
Geçersiz konumda ilerlemeyen örnek

 ![alt text](case2.png)
  
Geçersiz komutta ilerlemeyen örnek
  
   ![alt text](case3.png)