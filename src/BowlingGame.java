
public class BowlingGame {

    int tour[][];
    int nbQuilles = 0;
    int lanceUn = 0;
    int lanceDeux = 0;
    int indexTour;
    int indexLance = 1;
    int lanceBonus;
    int score = 0;

    // methode pour r�cup�rer le score.
    public int scoreAdd() {
	score = score + tour[indexTour][indexLance] + tour[indexTour][indexLance++]; // Valeur que l'on va ajouter à
										     // chaque tour.
	return score;
    }

    // R�cup�rer les bons bonus
    public int bonusQuilles() {

	for (indexTour = 1; indexTour <= 10; indexTour++) {

	    if (nbQuilles == 10) {
		// SPARE
		if (tour[indexTour][indexLance] + tour[indexTour][indexLance++] == 10) { // lancé 1 et lancé 2 de
											 // l'index courant == 10
		    indexTour++; // on incr�mente pour passer au tour suivant et recuperer la valeur du premier
				 // lanc�
		    lanceBonus = tour[indexTour][indexLance]; // premier lance du tour suivant
		} else if (tour[indexTour][indexLance] == 10) {
		    // STRIKE
		    // tour[indexTour][indexLance++] = int.parseInt(toString( ));
		    tour[indexTour][indexLance++] = 0;
		    // essai de conversion de la valeur int en string pour n'avoir rien à afficher
		    indexTour++;
		    lanceBonus = tour[indexTour][indexLance] + tour[indexTour][indexLance++];
		} else {
		    lanceBonus = 0;
		}
		// soit strike soit spare
	    }
	}
	return lanceBonus;
    }
}
/*
 * 10 quilles par tour, 2 lancés par tour si lancé 1 == 10, strike donc bonus
 * strike si lancé 1 + lancé 2 == 10, spare donc bonus spare si lancé 1 +
 * lancé 2 < 10, pas bonus si tour 10 et strike, 2 lancés suppl si tour 10 et
 * spare, 1 lancé suppl
 */