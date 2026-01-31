package com.musauyumaz.uiarchitecture

//Yaşam döngüsüne genel bakış
//Durumu yönetme dokümanlarında belirtildiği gibi, bir Composation, uygulamanızın kullanıcı arayüzünü tanımlar ve composable'lar çalıştırılarak oluşturulur. Composition, kullanıcı arayüzünüzü tanımlayan composable'ların ağaç yapısıdır.
//Jetpack Compose, ilk Composation sırasında composable'larınızı ilk kez çalıştırdığında, bir kompozisyonda kullanıcı arayüzünüzü tanımlamak için çağırdığınız composable'ları takip eder. Ardından, uygulamanızın durumu değiştiğinde Jetpack Compose bir yeniden oluşturma planlar. Yeniden oluşturma, Jetpack Compose'un durum değişikliklerine yanıt olarak değişmiş olabilecek composable'ları yeniden yürütmesi ve ardından değişiklikleri yansıtmak için Composition'ı güncellemesidir.
//Bir composable yalnızca ilk Composable ile oluşturulabilir ve yeniden composable yapılarak güncellenebilir. Bir Composation değiştirmenin tek yolu yeniden composation'stır.
