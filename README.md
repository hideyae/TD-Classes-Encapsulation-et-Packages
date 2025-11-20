# TD : Classes, Encapsulation et Packages

## Sommaire
1. [Bloc 1 : Classes et Objets](#bloc-1--classes-et-objets-bases)  
2. [Bloc 2 : Constructeurs et Surcharge](#bloc-2--constructeurs-et-surcharge)  
3. [Bloc 3 : Encapsulation avancée et Immuabilité](#bloc-3--encapsulation-avancee-et-immuabilite)  
4. [Bloc 4 : Static, constantes et utilitaires](#bloc-4--static-constantes-et-utilitaires)  
5. [Bloc 5 : Packages et mini-projet](#bloc-5--packages-et-mini-projet)  

---

## Bloc 1 : Classes et Objets (bases)

### Exercice 1 : Classe Rectangle simple
**Objectif :** créer une classe, manipuler des champs publics et des objets.  
- Créez une classe `Rectangle` avec deux attributs publics `width` et `height` de type `double`.  
- Créez une classe `Main` avec la méthode `main()` qui crée deux rectangles, modifie leurs dimensions et affiche leurs aires.  
**Bonus :** que se passe-t-il si `width` ou `height` n'est pas initialisé ?

### Exercice 2 : Rectangle avec encapsulation
**Objectif :** introduire `private`, `getters` et `setters`.  
- Rendre `width` et `height` privés.  
- Ajouter getters et setters avec validation (refuser les valeurs négatives).  
- Ajouter une méthode `area()` qui retourne l’aire.  
- Modifier `Main` pour utiliser getters, setters et `area()`.

### Exercice 3 : Classe User minimale
**Objectif :** manipuler les références et `toString()`.  
- Créer une classe `User` avec `username` et `email` privés, un constructeur et un `toString()`.  
- Dans `main()` : créer deux users, les afficher, tester `u2 = u1` puis afficher `(u1 == u2)` et commenter.  

---

## Bloc 2 : Constructeurs et Surcharge

### Exercice 4 : Classe Point
- Attributs privés `x` et `y`.  
- Constructeur vide appelant `this(0,0)`.  
- Constructeur `(x, y)`.  
- Méthode `translate(dx, dy)`.  
- Tester dans `main()`.

### Exercice 5 : Classe Temperature
- Attribut privé `value` (Celsius).  
- Constructeur refusant `< -273.15`.  
- Getter et setter avec validation identique.  
- Tester valeurs valides et invalides dans `main()`.

---

## Bloc 3 : Encapsulation avancée et Immuabilité

### Exercice 6 : BankAccount
- Attributs privés `iban`, `balanceInCents`.  
- Constructeur avec validations.  
- `deposit()` et `withdraw()` avec validations.  
- `getBalanceInCents()` et `getFormattedBalance()`.

### Exercice 7 : Classe immuable Email
- Attribut `private final value`.  
- Constructeur validant `null` et présence de `"@"`.  
- Aucun setter, uniquement `getValue()`.

### Exercice 8 : Playlist
- Attributs privés `name` et `List<String> tracks`.  
- Constructeur initialisant `tracks = new ArrayList<>()`.  
- Méthodes `addTrack()`, `size()`.  
- `getTracks()` retourne une copie ou liste non modifiable.

---

## Bloc 4 : Static, constantes et utilitaires

### Exercice 9 : IdGenerator
- Attribut `static long next`.  
- Méthode `nextId()` incrémentant et retournant `next`.  
- Variante `synchronized` pour le multi-threading.

### Exercice 10 : MathUtil
- Classe finale avec constructeur privé.  
- Méthode statique `clamp(value, min, max)`.

---

## Bloc 5 : Packages et Mini-Projet

### Contexte
Ce bloc modélise une mini-bibliothèque avec gestion de livres et membres.  
Objectifs : classes, encapsulation, immuabilité, packages et collections.

### Arborescence
```
TD-ENCAPSULATION/
 └─ library
    ├───Ex11
    │    ├───app
    │    │    └─ MainApp.java
    │    ├───model
    │    │    ├─ Book.java
    │    │    └─ Member.java
    │    └───service
    │         └─ LibraryService.java
    └───Ex12
         ├───app
         │    └─ MainApp.java
         ├───model
         │    ├─ Book.java
         │    └─ Member.java
         └───service
              └─ LibraryService.java
```

### Packages et Classes

#### model
- `Book` : `isbn`, `title`, `author` (immuable, validation constructeur).  
- `Member` : `id`, `name`, `email` (immuable, validation constructeur).  

#### service
- `LibraryService` : listes de livres et membres, méthodes pour ajouter, accéder et rechercher par auteur.  

#### app
- `MainApp` : test des fonctionnalités, ajout et affichage des livres/membres.

### Compilation
```bash
javac library/model/*.java library/service/*.java library/app/*.java
```

### Exécution
```bash
java library.app.MainApp
```
