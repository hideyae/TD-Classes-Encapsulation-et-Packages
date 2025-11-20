# TD-Classes-Encapsulation-et-Packages

**## Bloc 1 : Classes et Objets (bases)**

Exercice 1 : Classe Rectangle simple
Objectif : déclarer une classe, créer des objets, manipuler des champs.
- Créez une classe Rectangle avec deux attributs publics width et height de type double.
- Créez une classe Main avec la méthode main() qui crée deux rectangles, modifie leurs dimensions et affiche leurs aires.
Bonus : que se passe-t-il si width ou height n'est pas initialisé ?

Exercice 2 : Rectangle avec encapsulation
Objectif : introduire private, getters et setters.
- Rendre width et height privés.
- Ajouter getters et setters avec validation (refuser les valeurs négatives).
- Ajouter une méthode area() qui retourne l’aire.
- Modifier Main pour utiliser getters/setters/area().

Exercice 3 : Classe User minimale
Objectif : manipuler les références et toString().
- Création d’une classe User avec username et email privés, un constructeur, et un toString().
- Dans main : créer deux users, les afficher, tester u2 = u1 puis afficher (u1 == u2).

----

**##Bloc 2 : Constructeurs et surcharge**
Exercice 4 : Classe Point
- Attributs privés x et y.
- Constructeur vide appelant this(0,0).
- Constructeur (x,y).
- Méthode translate(dx,dy).
- Tester dans main.

Exercice 5 : Classe Temperature
- Attribut privé value (Celsius).
- Constructeur refusant < -273.15.
- Getter + setter avec même validation.
- Tester valeurs valides et invalides dans main.

----

**##Bloc 3 : Encapsulation avancée et immuabilité**

Exercice 6 : BankAccount
- Attributs privés iban, balanceInCents.
- Constructor avec validations.
- deposit() et withdraw() avec validations.
- getBalanceInCents() et getFormattedBalance().

Exercice 7 : Classe immuable Email
- Attribut private final value.
- Constructeur validant null et absence de "@"
- Aucun setter.
- Méthode getValue().

Exercice 8 : Playlist
- Attributs privés name et List<String> tracks.
- Constructeur initialisant tracks = new ArrayList<>().
- addTrack(), size().
- getTracks() retournant copie ou liste non modifiable.

----

**##Bloc 4 : static, constantes, utilitaires**

Exercice 9 : IdGenerator
- Attribut static long next.
- Méthode nextId() incrémentant et retournant next.
- Variante synchronized.

Exercice 10 : MathUtil
- Classe finale avec constructeur privé.
- Méthode static clamp(value, min, max).

----

##**Bloc 5 : Packages et mini-projet**

Exercice 11 : library
- Packages : model, service, app.
- Classes Book, Member, LibraryService, Main.
- Ajouter livres/membres et les afficher.

Exercice 12 : Amélioration library
- Book et Member immuables.
- Copies/non-modifiable lists dans getters.
- Méthode findBooksByAuthor().
