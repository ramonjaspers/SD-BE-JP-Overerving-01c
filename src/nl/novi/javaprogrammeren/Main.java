package nl.novi.javaprogrammeren;

import nl.novi.javaprogrammeren.overerving.FalconRocket;
import nl.novi.javaprogrammeren.overerving.Rocket;

public class Main {
    /*
    Bekijk onderstaande code. Er zijn twee klasse, twee objecten.
    FalconRocket extends Rocket.

    Deze opdracht bestaat uit twee elementen. Het eerste element is om te oefenen. Het tweede element is een uitdagende
    opdracht.

    Element 1:
    De FalconRocket heeft reserve brandstof (extraFuel). Wanneer de raket niet genoeg fuel lijkt te hebben, moet er
    gekeken worden of er genoeg fuel is in extraFuel om het tekort op te vangen. Als dat zo is, moet er alsnog `true`
    geretourneerd worden.

    Element 2 (Uitdaging):
    Nadat er extra fuel gebruikt is, moet deze natuurlijk ook verminderd worden. Voeg dit toe aan de code.

     */

    public static void main(String[] args) {
        Rocket genericAssRocket = new Rocket(100);
        FalconRocket falconRocket = new FalconRocket(100);

        while (genericAssRocket.currentFuel > 0){
            genericAssRocket.fly(10);
            System.out.println(genericAssRocket.toString());
        }

        while(falconRocket.currentFuel > 0){
            falconRocket.fly(10);
            System.out.println(falconRocket.toString());
        }

    }
}
