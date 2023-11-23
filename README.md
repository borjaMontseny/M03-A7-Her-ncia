# M03 - A7 - Herència

1. Tenint en compte tot el que has aprés sobre l’herència de classes, implementa les classes següents, per tal de tenir la següent estructura.
    
- **Animal**
    - *Aeri*
        - Aliga
    - *Terrestre*
        - Lleona
        - Serp
    - *Aquàtic*
        - Dofi
    
    Les classes han de tenir les propietats i mètodes que creguis oportuns per a cadascuna per tal que, almenys, passin el següent joc de proves (a la classe Tester).
    
    ### Entrada:
    
    ```java
          	Animal gremlin = new Animal("Gizmo",2,1.5);
            Terrestre lleona = new Lleona("Nala", 6, 98.5, "Marró");
            Serp serp = new Serp("Margarida", 4);
            Dofi dofi = new Dofi("Flipper", 8);
            Animal aliga = new Aliga("Thunder", 4);
    
            System.out.println(gremlin);
            System.out.println(gremlin.getPes());
            System.out.println(gremlin.getName());
            System.out.println(gremlin.getAge());
            
            System.out.println();
            
            System.out.println(lleona);
            System.out.println(lleona.getColorPel());
    
            System.out.println();
    
            System.out.println(serp);
            serp.fesSo();
    		    serp.getPes();
            serp.correr();
    
            System.out.println();
    
            System.out.println(dofi);
            dofi.fesSo();
            dofi.nedar();
    
            System.out.println();
    
            System.out.println(aliga);
            aliga.fesSo();
    ```
    
    ### Sortida
    
    ```
    Nom: Gizmo, age: 2, pes:1.5
    1.5
    Gizmo
    2
    
    Nom: Nala, age: 6, pes:98.5, colorPel: Marró
    Marró
    
    Nom: Margarida, age: 4, pes:1.0, colorPel: Sense definir
    Sssssssss!
    L'animal terrestre està  corrent.
    
    Nom: Flipper, age: 8, pes:1.0
    Xiulet de dofí
    L'animal marí està  nedant.
    
    Nom: Thunder, age: 4, pes:1.0
    Crits de l'Àguila!
    ```
    
2. Afegeix-li a la classe ***Aeri*** un mètode anomenat `planejar` que mostri per consola que l’animal està volant i tracta d’executar la següent línia:
    
    ```java
    aliga.planejar();
    ```
    
    Què li afegiries a aquesta línia perquè funcioni?
    
    Afegeix un mètode o atribut propi de la classe ***Lleona*** i intenta cridar-lo o mostrar-lo per pantalla al mètode Tester.
    
3. Fes un **array** amb tots els animals instanciats. A continuació, recorre l’array amb un bucle i crida el mètode **fesSo()** i el paràmetre **edat** de tots els objectes. Podries cridar al mètode **correr()**, **nedar()** o **planejar()**? Per què?
