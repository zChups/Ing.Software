# Introduzione - Design Pattern

All'interno di questo file troverai i design pattern da sapere
****
# Strategy Pattern
(comportamentale)

**Strategy + Concrete Strategy + Client + Context**

>Utile per separare algoritmo dalla sua implementazione. Consente di cambiare facilmente
> strategia senza dover modificare il codice del client che la utilizza.

x esempio:
- PaymentStrategy -> Strategy Interface
- PayPalPayment -> Concrete Strategy
- CreditCartPayment -> Concrete Strategy
- ShoppingCart -> Client
- Online Payment -> Context
****
# Observer Pattern
(comportamentale)

**Observer + Subject**
>Utile per tenere aggiornati gli oggetti quando accade qualcosa che li riguarda.
> Dipendenza tra oggetti debole e flessibile (basso accoppiamento).

x esempio:

- Observer -> con info dell'observer
- Subject -> con lista di observers e operazioni su essi
****
# Decorator Pattern
(strutturale)

**Component + Decorator** 
>Utile per aggiungere responsabilità in più agli oggetti in maniera dinamica. I decoratori forniscono
> un'alternativa flessibile e dinamica alle sottoclassi per estendere le proprie funzionalità
> e comportamenti.

x esempio:

- Coffee -> component
- CoffeeDecorator -> Interface (extends Coffee)
- MilkDecorator -> Concrete Coffee Decorator (extends CoffeeDecorator)
- SugarDecorator -> Concrete Coffee Decorator (extends CoffeeDecorator)

****
# Factory
(creazionale)

**Product + Factory**
> Utile per incapsulare i dati. Fornisce un'interfaccia per la creazione di un oggetto in una 
> classe madre, ma permette alle sottoclassi di alterare il tipo di oggetto che verrà creato.

x esempio:

- Shape -> Product Interface
- Circle -> Concrete Product
- ShapeFactory -> Factory Interface, con metodo che genera un product
- CircleFactory -> Concrete Factory
****
## Abstract Factory
(creazionale)

**Abstract product + Abstract factory**

> Caso particolare del DP Factory. Fornisce un'interfaccia per creare famiglie di oggetti correlati
> o dipendenti senza specificare le classi concrete.
> 
> Va utilizzato se si desidera fornire una libreria di classi per creare diverse famiglie di oggetti.
****
# Singleton

> Utile per garantire l'esistenza di un'unica istanza di una classe
****
# Command Pattern

**Command + Invoker + Receiver**

x esempio:

- accendi luce -> command
- telecomando -> invoker
- luce -> receiver

> Utile per incapsulare una richiesta come un oggetto, rendendo possibile la parametrizzazione delle richieste
> e supportare il ripristino delle operazioni
****
# Adapter Pattern

(strutturale)

**Target + Adaptee + Adapter + Client**

> Consente a due interfacce incompatibili di lavorare insieme. l'adapter fa da intermediario. 
> La struttura delle due interfacce non viene modificata.

x esempio:

- sensore di temperatura a Fahrenheit-> target (interface)
- sensore di temperatura a Celsius -> adapteee (class)
- convertitore da Celsius a Fahrenheit -> (classe che implementa sensore a Fahrenheit) contiene un'istanza di sensore a Celsius
****
# Facade Pattern

(strutturale)

**Facade + Subsystem**

> Fornisce un'interfaccia semplificata per un sottosistema complesso

x esempio:

- proiettore -> sottosistema 1
- speaker -> sottosistema 2
- home theater -> facade 
****
# Template Pattern

(comportamentale)

**Abstract Class + Concrete Class**

> Utile per definire lo scheletro di un algoritmo nella superclasse, permettendo alle sottoclassi
> di sovrascrivere passi specifici dell'algoritmo senza modificarne la struttura

x esempio:

- AbstractClass -> con metodi abstract step1() e step2() + templateMethod(){step1();step2();}
- ConcreteClass1 -> implementa i metodi step1() e step2() a modo suo
- ConcreteClass2
****
# Iterator Pattern

(comportamentale)

> Permette di nascondere l’implementazione interna delle strutture dati. 
> Si appoggia sull’interfaccia Iterator, 
> la quale ha 3 metodi: hasNext(), next(), remove() (facolattivo).
****
# Composite Pattern

(strutturale)

**Component + Leaf + Composite**

> Permette di creare strutture ad albero 
> dove i clienti possono trattare singoli oggetti (foglie)
> e composizioni di oggetti (nodi) in modo omogeneo.
> 
> Utilizzato nella gestione di alberi di 
> oggetti e per strutture di menu nei programmi GUI
****
# State Pattern

(comportamentale)

**State Interface + Concrete State + Context**

> Utile per gestire gli stati di un dispositivo, 
> con lo State Pattern si crea una classe per ogni stato, 
> e ogni stato sarà un attributo del dispositivo. 
> Ogni metodo permetterà poi di cambiare lo stato sulla base 
> se è avvenuta una certa azione o no

# Proxy Pattern

(strutturale)

**Client + Client Helper + Service Helper(server)**

> Lo utilizziamo quando vogliamo mettere in comunicazione due 
> macchine tra di loro remote, ossia che non condividono la stessa JVM. 
> Serve quindi per gestire la comunicazione tra due VM diverse, 
> ossia quando devo lavorare con oggetti che non sono negli stessi ambienti. 

# Bridge Pattern

(strutturale)

**Abstraction + Implementor Interface+ Concrete Implementor**

> Utiler per separare un'astrazione dalla sua implementazione, 
> consentendo loro di variare indipendentemente.
> 
> Simile allo Strategy Pattern.