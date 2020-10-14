# xmlverarbeitung-DOM

## Allgemein

* DOM ist eine Entwicklung vom W3C → W3C Standard
* Standard-DOM ist unabhängig von einer Programmiersprache
* Wird von vielen Programmiersprachen unterstützt
* Erzeugt eine strikte Hierarchie
* DOM definiert eine Reihe von Schnittstellen, die durch konkrete Programmiersprachen implementiert werden.
* DOM-Interfaces müssen nicht die gesamte Spezifikation unterstützen, z.B.:
  XML-Parser brauchen keine Unterstützung für die HTML-spezifischen Teile des DOM anbieten.
  
  ***Quelle: Rheinwerk***
  
## Versionierung
#### 1. DOM-Level1

Enthält:
Objektstruktur und wie man diese manipulieren kann.
Enthält nicht:
Wie man Dokument in eine Struktur lädt und wie man Dokument ausgehend von Struktur wiederherstellen kann.

#### 2. DOM-Level2

Views, Events, Style, Traversal, Range

#### 3. DOM-Level 3

Abstrakte Schemas
Laden und Speichern
XPATH
DOM-Erweiterung z.B.: SVG

***Quelle: https://dom.spec.whatwg.org/***

## Infrastruktur
* Bäume
* Geordnete Menge
* Selektoren
* Namespaces

## Zweck
* Zugriff über Objektbaum ermöglicht Veränderung in Struktur
* DOM kann XML Files lesen und schreiben.
* DOM ist für Anwendungen geeignet, die beliebigen Zugriff auf verschiedene Teile eines Dokuments zu unterschiedlichen Zeiten benötigen.
* DOM ist auch für Anwendungen, die die Struktur eines XML-Dokuments zeitgleich ändern müssen

## Vorteile & Herausforderungen

Vorteile (Pro) | Herausforderungen (Con) 
--- | --- 
Geeignet für Anwendungen:  |  Kommt auf Problemstellung an:
 Die beliebigen Zugriff auf verschiedene Teile eines Dokuments zu unterschiedlichen Zeiten benötigen | Dokument muss vollständig gelesen/analysiert werden
 Die die Struktur eines XML-Dokuments zeitgleich ändern müssen | Gesamtes Dokument muss im RAM abgebildet werden
 *null* | Ungeeignet für Anwendungen, bei denen ein XML-Dokument nach und nach gelesen werden sollte, bevor es komplett geparst wird
 *null* | W3C-Datentypen, keine Java-Standards (Collections API) => JDOM
