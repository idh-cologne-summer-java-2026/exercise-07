Programmierung 2

# Übung 7


Klonen Sie dieses Repository direkt in Eclipse und importieren Sie das Projekt. Legen Sie einen neuen Branch an, den Sie nach Ihrem GitHub-Benutzernamen benennen.

## Aufgabe 1


Wir wenden unser neu gewonnenes Wissen über Iteratoren jetzt auf die Kontos unserer einer fiktiven Bank an (mit der Kombination aus Geldautomat und Konto haben wir uns in einer vorherigen Übung ja schon beschäftigt). Bisher waren die Konten in einem Array gespeichert, und das Array wurde durchsucht. 

Fügen Sie eine neue Klasse `AccountIterator implements Iterator<Account>` hinzu, der über die Konten iteriert. Diese Iterator-Klasse kann eine normale Klasse sein, die neben `Account` und `ATM` liegt, sie kann aber auch als [inner class](https://dh-cologne.github.io/java-wegweiser/articles/Innere-und-anonyme-Klassen.html) von `ATM` realisiert werden. Implementieren Sie auch den Zugriff auf das Konto über eine `while`-Schleife mithilfe des Iterators.	

## Aufgabe 2

Dass die Konten innerhalb des Geldautomaten gespeichert sind, ist ja keine sehr realistische Annahme. Ändern Sie den Code daher wie folgt:

1. Fügen Sie eine neue Klasse `Bank` hinzu, die eine Anzahl an Konten speichern kann. Ein Geldautomat speichert dann eine Referenz auf eine Bank, anstelle der einzelnen Konten. Welcher Bank ein Geldautomat gehört, bekommt der Konstruktor des Geldautomaten übergeben. 
2. Machen Sie die Bank nun `Iterable<Account>` und verwenden Sie innerhalb des Geldautomaten die `for`-Schleife mit Doppelpunkt (`for (Account account : bank) { ... }`) um das Konto zu suchen. Auch hier können Sie die Iterator-Klasse wieder als inner class realisieren. 

----

Committen Sie alle Ihre Änderungen am Quellcode, und pushen Sie den neuen Branch auf das remote namens `origin` (= GitHub). 