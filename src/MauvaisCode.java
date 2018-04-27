
int AGE = 15;
Integer age = 12; 

while (age == 12)
{
	AGE ++;
}
//Exemple pour éviter la boucle infinie

while (age == 12 && AGE < 40)
{
	AGE++;
}

//Du n'importe quoi avec true/false
boolean false = true;
boolean true = false;

public void trueFalse()
{
If(false == true)
{
	return "true";
}else if (true == false)
{
	return "false";
}

//DRY !!!!!!

public void justeUneQuille() {
	game.roll(0);
	game.roll(0);
	game.roll(0);
	game.roll(0);
	game.roll(0);
	game.roll(0);
	game.roll(0);
	game.roll(0);
	game.roll(0);
	game.roll(0);
	game.roll(0);
	game.roll(0);
	game.roll(0);
	game.roll(0);
	game.roll(0);
	game.roll(0);
	game.roll(0);
	game.roll(0);
	game.roll(0);
	game.roll(0);
	assertEquals(0, game.score());
}


// nom incomprehensible même pour celui qui code.
public void tUQPAZ() {
	game.roll(1);
	rollMany(19, 0);
	assertEquals(1, game.score());
}
