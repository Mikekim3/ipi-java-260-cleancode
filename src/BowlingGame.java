public class BowlingGame {

		private int score;

		public int getScore() {
			return score;
		}

		public void setScore(int score) {
			this.score = score;
		}


		private int quelLancer = 1;

		public int getQuelLancer() {
			return quelLancer;
		}

		public void setQuelLancer(int quelLancer) {
			this.quelLancer = quelLancer;
		}


		private int premierStrike = 0;

		public int getPremierStrike() {
			return premierStrike;
		}

		public void setPremierStrike(int premierStrike) {
			this.premierStrike = premierStrike;
		}


		private int deuxiemeStrike = 0;

		public int getDeuxiemeStrike() {
			return deuxiemeStrike;
		}

		public void setDeuxiemeStrike(int deuxiemeStrike) {
			this.deuxiemeStrike = deuxiemeStrike;
		}


		private int lancer1 = 0;

		public int getLancer1() {
			return lancer1;
		}

		public void setLancer1(int lancer1) {
			this.lancer1 = lancer1;
		}


		private int lancer2 = 0;

		public int getLancer2() {
			return lancer2;
		}

		public void setLancer2(int lancer2) {
			this.lancer2 = lancer2;
		}


		private int lancer3 = 0;

		public int getLancer3(){ return lancer3; }

		public void setLancer3(int lancer3){
			this.lancer3 = lancer3;
		}

			private int lancer4 = 0;

		public int getLancer4(){
			return  lancer4;
		}

		public void setLancer4(int lancer4){
			this.lancer4 = lancer4;
		}

		private int nbQuilles;



	private boolean isStrike1 = false;
	//si true premierStrike = nbQuilles;
	private boolean isStrike2 = false;
	//si true deuxiemeStrike = nbQuilles


	public void roll(int nbQuilles) {
		//premier Strike
		if (getQuelLancer() % 2 == 1) { // Si premier lancer
			if (getQuelLancer() == 10 && isStrike1 == false) { //Premier lancer vaut 10 et pas eu de strike avant
				isStrike1 = true;
				setPremierStrike(nbQuilles); // On sauvegarde le strike
				// Comme strike, on ne fait pas le 2e lancer
				// on veut les deux lancers du tour suivant
				setLancer3(getQuelLancer() + 2);
				setLancer4(getQuelLancer() + 3);

				 //setScore(getScore() + getPremierStrike() + getLancer3() + getLancer4());
				score += getPremierStrike() + getLancer3() + getLancer4();
				//deux strikes de suite
			} else if (getQuelLancer() == 10 && isStrike1 == true) {
				isStrike2 = true;
				setDeuxiemeStrike(nbQuilles); // On stocke le 2e strike.
				//score = setScore(getScore() + (nbQuilles * 2));
				//on a 3 strikes de suite
			} else if (getQuelLancer() == 10 && isStrike2 == true) {
				 setScore(getScore() + (nbQuilles * 3));
				//Spare
			} else if ((getQuelLancer() < 10) && ((getQuelLancer() + (getQuelLancer() + 1)) == 10)) {
				setLancer1(getQuelLancer()); // On sauvegarde les lancers du spare
				setLancer2(getQuelLancer() + 1);
				setLancer3(getQuelLancer() + 2);
				setLancer4(getQuelLancer() + 3);
				//setQuelLancer(getQuelLancer() + 2); // on incremente le compteur de lancer pour récuperer le lancer suivant le strike

				setScore(getScore() + getLancer1() + getLancer2() + getLancer3());
			}
		}else {
			//ni strike, ni spare
				setScore(getScore() + getLancer1() + getLancer2());

		}
	}

}





