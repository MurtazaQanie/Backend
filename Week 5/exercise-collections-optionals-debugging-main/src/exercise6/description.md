# Translation

Create the class `DictionaryOfManyTranslations`. The class maintains translations for words:
* `public void add(String word, String translation)`: add a translation for a word, keep previously added translations
* `public ArrayList<String> translate(String word)`: return all translations for a word
* `public void remove(String word)`: remove a word and all translations from the dictionary

An example:

```java
DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
dictionary.add("taal", "language");
dictionary.add("taal", "langue");

dictionary.add("auto", "car");
dictionary.add("auto", "vehicle");

System.out.println(dictionary.translate("taal"));
dictionary.remove("auto");
System.out.println(dictionary.translate("auto"));
```

returns as output:

```console
[language, langue]
[]
```