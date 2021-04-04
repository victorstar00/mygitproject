package mygitpackage;

public class GitHupKurulum {

	05 Nisan 2021 Guncelleme
    
    CMD'nin size yazdiklarini okuyarak ilerleyin, bir hata yaptiginizda cmd size zaten bunu soyleyecektir. Hata almiyorsaniz devam. 
    
    Bir projeyi github.com'a nasil yukleriz ?
    1) GitHub.com'a giris yapiniz :
     github.com'a giris yaptik -> Repositories'in saginda ki NEW'e tikliyoruz. 
    NEW yoksa sag ustten kendinize tiklayin -> your repositories'e tikladiginizda acilan sayfada NEW oluyor.
    Repository Name kismina projenin ismini yazacagiz, burasi icin mygitproject yaziyorum . 
    Description kismina istege bagli bir aciklama yazabilir.
     Public -> Herkese acik
     Private -> Sadece bana ve izin verdigim kisilere acik.
     Create repository diyip olusturuyoruz.
    Olusturduktan sonra hicbir seye ellemeyerek eclipse'imizi aciyoruz (Hangi ide'yi kullaniyorsaniz).
     
    2) Path bulmak :
     Cmd ekranina projemizim path'i yapistirmamiz gerekmektedir . Path yol anlamina gelmektedir ve bilgisayarimizi projemizin oldugu dosyaya
    yonlendirmemiz gerekmektedir. Projemizin pathini nerede bulacagiz ? Yuklemek istediginiz projeye (package degil, class degil, PROJEYE)
    ,sol taraftaki project explorer'dan, sag klik yapiyoruz -> Show In -> System Explorer'i seciyoruz . Onumuze bir dosya acilacak .
    Acilan dosyada git'te hangi proje uzerinde islem yapacaksak onu aciyoruz. Suan mygitproject'de oldugumuz icin o klasoru acalim.
    Yukarida Bu Bilgisayar > Yerel Disk (C:) > Kullanicilar > nihat > eclipse-workspace > mygitproject tarzi bir sey yaziyor .
    Bu kismina sag kisminda bos bir yere tikliyorum ve soyle birseye donusecek C:\Users\nihat\eclipse-workspace\mygitproject
    Bunu kopyaliyorum . Bu dosyaya ulasmak icin path'im oluyor.
    CMD ekranina     cd C:\Users\nihat\eclipse-workspace\mygitproject seklinde yapistiriyorum basina cd yazmamiz gerekmektedir.
    
    3) Ilk defa bir projeyi GitHub.com'a yuklemek icin gerekli adimlar : 
    
     Cmd'ye path'imizi (cd C:\Users\nihat\eclipse-workspace\mygitproject basinda cd unutmayalim) yapistirip enterladiktan sonra ,
     
     git init yazip enter'a basiyorum. Initialized empty yazisini gorduysek , (Burada username ve passwodu isterse siteye giris yaptigimiz
     username ve password'u yazmamiz gerekmektedir)
     
     git add . yazarak tum kodlari Stating Area'ya eklemis oluyoruz . Stating Area nedir ? 
      Gecici bolum anlamina gelir, Git yapilan degisiklikleri gecici bir hafizaya ekler(git'in icinde), GitHub'a gitmez.
      Burdaki kodlari local repositry'e ekledigimizde kodlar temizlenir. 
      
     git commit -m "mesaj" -> burada tirnak icine yazdigimiz mesaj, site icerisinde projede degisiklik yaptigimiz zaman gozuken mesajdir.
     Mesajimizi ona gore yazmaya ozen gosteriyoruz ozellikle grup calismalarinda .
     
     Bu 4 adimi cmd'ye yazdiktan sonra sitede olusturdugumuz repository'de 
     git remote add origin https://github.com/nihattekiner/replit.git kismini kopyalayip yapistiriyoruz .
     
     CMD burada hicbir sey demeyerek alt satira inecektir dogru yoldayiz demektir hemen siteden ,
     git push -u origin main'i kopyaliyoruz AMA DIKKAT main'i master olarak degistiyoruz ve CMD ekranina
     git push -u origin master 'i yapistiriyoruz . Bunu yaptiktan sonra tamamen CMD'yi bekliyoruz Proje boyutu ne kadar buyukse bu sure
     uzayacaktir . CMD bize neler add ettigini gosterecektir ve hepsinde %100 yaziyorsa sorun yok dogru sekilde yapmisiz demektir.
     
     Sitedeki sayfanizi refresh yaptiginizda artik projeniz siteye yuklenmis halde gorebilmektesinizdir tebrikler.
     
     3. ADIM ILK DEFA PROJE OLUSTURDUGUM ZAMAN IZLEYECEGIM YOLDUR .
     
     4) Var olan bir projeyi nasil guncellerim : 
      Diyelim ki proje ile isiniz bitti her seyi sifirdan aciyorsunuz eclipse,CMD'yi ve projenizde yaptiginiz degisiklikleri github.com'da
     guncel hale getireceksiniz .
     
     CMD'yi acalim ve path'imizi yapistiralim boylece bilgisayar o klasor icinde islem yapilacagini bilir 
     cd C:\Users\nihat\eclipse-workspace\mygitproject (BASINA cd YAZMAMIZ GEREKMEKTEDIR)
     
     Daha sonra git status yazarak kirmizi yazilar aliyorsam projede degisiklikler vardir guncellemem gerekmektedir.
     git add . ile bunlari ekliyorum 
     
     git status yazdigim zaman yazilar yesile donmus durumdadir. Push ile siteye aktariyorum.
     
     git push ve siteden kontrol ettigim zaman guncellenmis oldugunu gormekteyim.
   
   */
	
	
	
}
