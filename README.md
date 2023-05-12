Hesap Makinesi Projesi Dökümantasyonu

Bu dökümantasyon, hesap makinesi uygulamasının detaylarını ve bileşenlerini açıklamaktadır. Hesap makinesi, kullanıcının sayılarla temel matematiksel işlemleri gerçekleştirebileceği bir grafiksel kullanıcı arayüzüne sahip bir uygulamadır. Uygulama, Swing kütüphanesini kullanarak geliştirilmiştir.

Proje Bileşenleri

Proje, aşağıdaki bileşenleri içermektedir:

CalculatorModel: Hesap makinesi model sınıfıdır. İşlemlerin gerçekleştirildiği servis sınıfıyla etkileşim sağlar.
CalculatorView: Hesap makinesi görünüm sınıfıdır. Kullanıcı arayüzü bileşenlerini oluşturur ve kullanıcı etkileşimlerini dinler.
CalculatorController: Hesap makinesi denetleyici sınıfıdır. Model ve görünüm sınıfları arasında iletişimi sağlar ve kullanıcı etkileşimlerine yanıt verir.
OperationService: Hesap makinesi işlem servisi arabirimini tanımlar.
OperationServiceImpl: Hesap makinesi işlem servisi uygulamasıdır. Sayı dönüşümleri ve matematiksel işlemleri gerçekleştirir.
NumberConversionService: Sayı dönüşümü servisi arabirimini tanımlar.
NumberConversionServiceImpl: Sayı dönüşümü servisi uygulamasıdır. Metin sayıları sayılara dönüştürür ve sayıları metinlere dönüştürür.

Proje Akışı

Hesap Makinesi uygulaması başlatıldığında, CalculatorMain sınıfı çalıştırılır.
CalculatorMain sınıfı, CalculatorModel, CalculatorView ve CalculatorController nesnelerini oluşturur.
CalculatorModel nesnesi, dil parametresiyle birlikte oluşturulur ve işlem servisiyle iletişim kurar.
CalculatorView nesnesi, kullanıcı arayüzü bileşenlerini oluşturur ve gösterir.
CalculatorController nesnesi, kullanıcı etkileşimlerini dinler ve ilgili işlemleri gerçekleştirir.
Kullanıcı, sayıları ve işlem türünü seçerek hesaplama yapar.
CalculatorController nesnesi, kullanıcının seçimlerine göre ilgili işlem servisi metodunu çağırır.
İşlem servisi, metin sayıları sayılara dönüştürür ve matematiksel işlemi gerçekleştirir.
Sonuç, işlem servisi tarafından hesaplanır ve geri döndürülür.
CalculatorController nesnesi, hesaplama sonucunu CalculatorView'a ileterek görüntülenmesini sağlar.
Kullanıcı, istediği yeni hesaplamaları gerçekleştirebilir.


Dil Seçimi

Hesap makinesi uygulaması, dil seçeneği sunmaktadır. Başlangıçta varsayılan olarak Türkçe dil ayarlanmıştır. Ancak, CalculatorMain sınıfında language değişkeni "eg" olarak değiştirilerek İngilizce dil seçeneği de kullanılabilir hale getirilebilir.


Örnek Kullanım Senaryosu

Hesap makinesi uygulaması başlatılır.
Kullanıcı, sayıları ve işlem türünü belirterek bir hesaplama yapmak için uygun alanları doldurur.
Kullanıcı, "Topla" butonuna tıklar.
CalculatorController nesnesi, add metodunu çağırır.
OperationServiceImpl sınıfı, metin sayıları sayılara dönüştürür ve toplama işlemini gerçekleştirir.
İşlem sonucu hesaplanır ve CalculatorView'a iletilir.
CalculatorView, sonucu ekranda gösterir.
Kullanıcı, istediği yeni hesaplamaları gerçekleştirebilir.


Kaynak Kod Dizin Yapısı

main.java.com.calculator.app: Uygulama kodlarının ana dizini.
model: Hesap makinesi model sınıfını içeren paket.
service: Hesap makinesi servis sınıflarını içeren paket.
view: Hesap makinesi görünüm sınıfını içeren paket.
controller: Hesap makinesi denetleyici sınıfını içeren paket.
main: Uygulamanın başlatıldığı CalculatorMain sınıfını içeren paket.


Bağımlılıklar

Java Swing kütüphanesi kullanılmıştır.
Proje, dil dönüşümü için RuleBasedNumberFormat sınıfını içeren Apache Commons Lang kütüphanesine bağımlıdır.
Bu dökümantasyon, hesap makinesi uygulamasının genel yapısını ve çalışma prensibini açıklamaktadır. Projenin kodu ve bu dökümantasyon, projeyi anlamak ve geliştirmek için temel bir kaynak sağlamaktadır.
