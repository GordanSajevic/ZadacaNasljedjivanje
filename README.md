ZadacaNasljedjivanje
====================
Postavka

Prije nego počnete, pročitajte zadatak do kraja, možda ćete si odgovoriti na neka pitanja. Ako ipak imate pitanja, pitajte u komentarima na zadatak :)

Sve spomenute klase se nalaze na GitHub-u, link je priložen.

1. Napraviti klasu FedExPackage koja, kao i DHLPackage ima metodu `getDimensionalWeight()`, ali se za FedEx pakete, dimenziona težina računa po formuli (w*h*l)/6000

2. Napišite klasu DimensionalWeightPackage koja nasljeđuje klasu Package, te implementira metode `getDimensionalWeight()`, `getWeight()` i `getFactor()`. Metoda `getDimensionalWeight()` treba da računa dimenzionu težinu po formuli `(width * height * length) / getFactor()`. Shodno tome, metoda `getFactor` treba da vraća vrijednost tipa double (nije bitno koja je konkretna vrijednost).

3. Promijenite klase DHLPackage i FedExPackage tako da nasljeđuju klasu `DimensionalWeightPackage`. Koje metode sada možete slobodno izbrisati ako override-ate metodu `getFactor()` tako da za DHLPackage vraća 5000, a za FedExPackage 6000?

4. Promijenite klasu `UnifiedPrompt` tako da omogućava kreiranje i FedEx paketa.
