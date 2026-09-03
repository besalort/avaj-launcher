# avaj-launcher

This project goal is to discover the JAVA language through the reproduction (in code) of a given UML.

# Installation et utilisation

Ce projet nécessite **Java 21**.

L'installation peut être faite entièrement dans le répertoire utilisateur.

## 1. Télécharger Java 21

Télécharger une distribution **JDK 21** (et non uniquement le JRE). 

Utiliser la commande : 

``` sh
make java
```

Ou par exemple, vous pouvez utiliser **Eclipse Temurin 21**.

Une fois le fichier téléchargé, créer le répertoire Java :

```sh
mkdir -p ~/java
```

Extraire le JDK dans `~/java`.

Le résultat doit être :

```text
~/java/jdk-21/
```

Le dossier doit notamment contenir :

```text
~/java/jdk-21/bin/java
~/java/jdk-21/bin/javac
```

## 2. Configurer Java

Dans le terminal, exécuter :

```sh
export JAVA_HOME="$HOME/java/jdk-21"
export PATH="$JAVA_HOME/bin:$PATH"
```

Vérifier l'installation :

```sh
java -version
javac -version
```

Vous devez obtenir une version **21.x**.

## 3. Lancer le projet

Puis utiliser les commandes `make` indiquées ci-dessous.

### Compiler

```sh
make
```

### Exécuter

```sh
make run
```

### Nettoyer

```sh
make clean
```

## 4. À chaque nouvelle session

La configuration effectuée avec `export` est valable uniquement pour le terminal courant.

Si vous ouvrez un nouveau terminal, exécutez à nouveau :

```sh
export JAVA_HOME="$HOME/java/jdk-21"
export PATH="$JAVA_HOME/bin:$PATH"
```

Aucune installation système et aucun accès `sudo` ne sont nécessaires.
