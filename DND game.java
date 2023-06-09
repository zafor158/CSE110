import java.util.Random;

public abstract class Character implements Race {
    private String name;
    private int level;
    private int strength, dexterity, constitution, intelligence, wisdom, charisma;
    private int strengthMod, dexterityMod, constitutionMod, intelligenceMod, wisdomMod, charismaMod;
    private int strengthInc, dexterityInc, constitutionInc, intelligenceInc, wisdomInc, charismaInc;
    private int proficiencyMod;
    private int health;
    private boolean isDead = false;

    public Character(String name, int seed) {
        this.name=name;
        this.level=1;
        health=5;
        int Dice[]= new int[6];
        for(int i=0;i<6;i++){
            Dice[i]=DiceRoll(seed);
            strength = Dice[0];
            dexterity = Dice[1];
            constitution = Dice[2];
            intelligence=Dice[3];
            wisdom=Dice[4];
            charisma=Dice[5];
            if(Race.HUMAN==0){
                strengthInc +=1;
                dexterityInc +=1;
                constitutionInc +=1;
                intelligenceInc +=1;
                wisdomInc +=1;
                charismaInc +=1;
            }
            if(Race.HALFLING==2){
                dexterityInc +=2;
            }
            if(Race.ELF==1){
                dexterityInc+=2;
            }
            if(Race.DWARF==3){
                constitutionInc +=2;
            }

           if(strengthMod>=2 && strengthMod<=3 ){
               strengthMod -=4;
           }
            if(strengthMod>=12 && strengthMod <=13){
                strengthMod +=1;

            }
            if(dexterityMod>=4 && dexterityMod<=5){
                dexterityMod -=3;
            }
            if(dexterityMod>=14 && dexterityMod<=15){
                dexterityMod +=2;
            }

           if(constitutionMod>=6 && constitutionMod<=7){
               constitutionMod -=2;
           }
           if(constitutionMod>=16 && constitutionMod<=17){
               constitutionMod+=3;
           }
           if(intelligenceMod>=8 && intelligenceMod <=9){
               intelligenceMod -=1;
           }
               if(intelligenceMod>=18 && intelligenceMod<=19){
                   intelligenceMod+=4;
               }
               if(wisdomMod>=10 && wisdomMod<=11){
                   wisdomMod =0;
               }
               if(wisdomMod>=20 && wisdomMod<=21){
                   wisdomMod +=5;
               }
                  if(charismaMod>=10 && charismaMod<=11){
                      charismaMod=0;
                  }
                  if(charismaMod>=20 && charismaMod<=21){
                      charismaMod+=5;
                  }
        }
    }
    public  Character(String name, int level, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, int proficiencyMod, int health, boolean isDead,int strengthMod,int dexterityMod,int constitutionMod,int intelligenceMod, int wisdomMod, int charismaMod,int strengthInc,int dexterityInc,int constitutionInc,int intelligenceInc,int wisdomInc,int charismaInc) {
        this.level=1;
        this.health=5*level;
        if(this.health<0){
            this.isDead=true;
            this.health=0;
        }
        this.proficiencyMod=2;
        this.name=name;
        this.level=level;
        this.strength=strength;
        this.dexterity=dexterity;
        this.constitution=constitution;
        this.intelligence=intelligence;
        this.wisdom=wisdom;
        this.charisma=charisma;
        this.proficiencyMod=proficiencyMod;
        this.health=health;
        this.isDead=isDead;
        this.strengthMod=strengthMod;
        this.dexterityMod=dexterityMod;
        this.constitutionMod= constitutionMod;
        this.intelligenceMod=intelligenceMod;
        this.wisdomMod=wisdomMod;
        this.charismaMod=charismaMod;
        this.strengthInc=strengthInc;
        this.dexterityInc=dexterityInc;
        this.constitutionInc=constitutionInc;
        this.intelligenceInc=intelligenceInc;
        this.wisdomInc=wisdomInc;
        this.charismaInc=charismaInc;


    }
    public int DiceRoll(int seed) {
        int c, x, y, z, m;
        int r = 0,l;

       for(l=0;l<5;l++) {
           Random rand = new Random(seed);

           c = (rand.nextInt(6) + 1);
           x = (rand.nextInt(6) + 1);
           y = (rand.nextInt(6) + 1);
           z = (rand.nextInt(6) + 1);
           m = c;
           m = (m < x) ? m : x;
           m = (m < y) ? m : y;
           m = (m < z) ? m : z;
           r = c + x + y + z - m;

       }
        return r;
    }
    public String getName() {

        return name;
    }
    public int getLevel() {

        return level;
    }
    public void setLevel(int level) {
        this.level=level;

    }
    public int getStrength() {

        return strength;
    }
    public void setStrength(int strength) {
        this.strength=strength;
    }
    public int getDexterity() {

        return dexterity;
    }
    public void setDexterity(int dexterity) {
        this.dexterity=dexterity;
    }
    public int getIntelligence() {

        return intelligence;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence=intelligence;
    }
    public int getWisdom() {

        return wisdom;
    }
    public void setWisdom(int wisdom) {
        this.wisdom=wisdom;
    }
    public int getConstitution() {

        return constitution;
    }
    public void setConstitution(int constitution) {
        this.constitution=constitution;
    }
    public int getCharisma() {

        return charisma;
    }
    public void setCharisma(int charisma) {
        this.charisma=charisma;
    }
    public int getHealth() {

        return health;
    }

    public void setHealth(int health) {
        this.health=health;
    }
    public boolean isDead() {
        return isDead;
    }
    public void setDead(boolean isDead) {
        this.isDead = isDead;
    }

    public int  getStrengthMod(){
        return strengthMod;
    }
    public void setStrengthMod(int strengthMod){
        this.strengthMod=strengthMod;
    }
    public int getDexterityMod(){
        return dexterityMod;
    }
    public void setDexterityMod(int dexterityMod){
        this.dexterityMod=dexterityMod;
    }

    public int getConstitutionMod(){
        return constitutionMod;
    }
    public void setConstitutionMod(int constitutionMod){
        this.constitutionMod=constitutionMod;
    }
    public int getIntelligenceMod(){
        return intelligenceMod;
    }
    public void setIntelligenceMod(int intelligenceMod){
        this.intelligenceMod=intelligenceMod;
    }
    public int getWisdomMod(){
        return wisdomMod;
    }
    public void setWisdomMod(int WisdomMod){
        this.wisdomMod=wisdomMod;
    }
    public int getCharismaMod(){
        return charismaMod;

    }
    public void setCharismaMod(int charismaMod){
        this.charismaMod=charismaMod;
    }
    public int getProficiencyMod(){
        return proficiencyMod;
    }
    public int getStrengthInc(){
        return strengthInc;
    }
    public void setStrengthInc(int strengthInc){
        this.strengthInc=strengthInc;
    }
    public int getDexterityInc(){
        return dexterityInc;
    }
    public void setDexterityInc(int dexterityInc){
        this.dexterityInc=dexterityInc;
    }
    public int getConstitutionInc(){
        return  constitutionInc;
    }
    public void setConstitutionInc(int constitutionInc){
        this.constitutionInc=constitutionInc;
    }
    public int getIntelligenceInc(){
        return intelligenceInc;
    }
    public void setIntelligenceInc(int intelligenceInc){
        this.intelligenceInc=intelligenceInc;
    }
    public int getWisdomInc(){
        return wisdomInc;
    }
    public void setWisdomInc(int WisdomInc){
        this.wisdomInc=wisdomInc;
    }
    public int getCharismaInc(){
        return  charismaInc;
    }
    public void setCharismaInc(int  charismaInc){
        this.charismaInc=charismaInc;
    }

    public abstract void levelUp();
    public abstract void attack(Character c);
    public abstract String toString();
}
 interface Race {
    public int HUMAN = 0;
    public int ELF = 1;
    public int HALFLING = 2;
    public int DWARF = 3;
}
class Fighter extends Character implements Race {


    public Fighter(String name, int level, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, int prociencyMod, int health, boolean isDead,int strengthMod,int dexterityMod,int constitutionMod,int intelligenceMod, int wisdomMod, int charismaMod,int strengthInc,int dexterityInc,int constitutionInc, int intelligenceInc, int wisdomInc, int charismaInc) {
        super(name, level, strength, dexterity, constitution, intelligence, wisdom, charisma, prociencyMod, health, isDead,strengthMod, dexterityMod, constitutionMod, intelligenceMod, wisdomMod, charismaMod,strengthInc, dexterityInc, constitutionInc, intelligenceInc, wisdomInc, charismaInc);
    }

    public Fighter(String name, int seed) {
        super(name, seed);
    }

    public void attack(Character c){

        if(c.isDead() == true) {
            System.out.println("Cannot attack a dead character");

        }
        setHealth(getHealth() - 10);
        setStrength(getStrength() - 10);
    }

    public void levelUp(){
        setLevel(getLevel()+1);
        setHealth(getLevel()*5);
        setStrength(getStrength()+2);
        setDexterity(getDexterity() + 1);
        setConstitution(getConstitution() + 1);
        setIntelligence(getIntelligence() + 1);
        setWisdom(getWisdom() + 1);
        setCharisma(getCharisma() + 1);
    }
    public String toString() {

        return ("Level=" + getLevel() + " Fighter named " + getName() + " with " + getStrength() + " strength, " + getDexterity() + " dexterity, " + getConstitution() + " constitution, " + getIntelligence() + " intelligence, " + getWisdom() + " wisdom and " + getCharisma() + " charisma"+getStrengthMod()+" strengthMod,"+ getDexterityMod()+" dexterityMod,"+ getConstitutionMod()+" constitutionMod,"+ getIntelligenceMod()+" intelligenceMod," + getWisdomMod()+" wisdomMod,"+ getCharismaMod()+" charismaMod,"+getProficiencyMod()+" proficiencyMod,"+getStrengthInc()+" strengthInc,"+ getDexterityInc()+" dexterityInc," + getConstitutionInc()+" constitutionInc,"+getIntelligenceInc()+ " intelligenceInc,"+ getWisdomInc()+" wisdomInc,"+ getCharismaInc()+" CharismaInc,");
    }

}
class Rogue extends Character implements Race {

    public Rogue(String name, int level, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, int prociencyMod, int health, boolean isDead,int strengthMod,int dexterityMod,int constitutionMod,int intelligenceMod, int wisdomMod, int charismaMod,int strengthInc,int dexterityInc,int constitutionInc, int intelligenceInc, int wisdomInc, int charismaInc) {
        super(name, level, strength, dexterity, constitution, intelligence, wisdom, charisma, prociencyMod, health, isDead,strengthMod, dexterityMod, constitutionMod, intelligenceMod, wisdomMod, charismaMod,strengthInc, dexterityInc, constitutionInc, intelligenceInc, wisdomInc, charismaInc);
    }

    public Rogue(String name, int seed) {
        super(name, seed);

    }


    public void levelUp() {
        setLevel(getLevel()+1);
        setHealth(5*getLevel());
        setDexterity(getDexterity()+3);
        setCharisma(getCharisma()+2);
        setConstitution(getConstitution()+2);
        setIntelligence(getIntelligence()+2);
        setStrength(getStrength()+2);
        setWisdom(getWisdom()+2);
    }


    public void attack(Character c) {
        if(c.isDead()) {
            System.out.println("Cannot attack a dead character");
            return;
        }
        int health=c.getHealth()-6+getDexterity();
        c.setHealth(health);
    }


    public String toString() {

        return ("Level=" + getLevel() + " Fighter named " + getName() + " with " + getStrength() + " strength, " + getDexterity() + " dexterity, " + getConstitution() + " constitution, " + getIntelligence() + " intelligence, " + getWisdom() + " wisdom and " + getCharisma() + " charisma"+getStrengthMod()+" strengthMod,"+ getDexterityMod()+" dexterityMod,"+ getConstitutionMod()+" constitutionMod,"+ getIntelligenceMod()+" intelligenceMod," + getWisdomMod()+" wisdomMod,"+ getCharismaMod()+" charismaMod,"+getProficiencyMod()+" proficiencyMod,"+getStrengthInc()+" strengthInc,"+ getDexterityInc()+" dexterityInc," + getConstitutionInc()+" constitutionInc,"+getIntelligenceInc()+ " intelligenceInc,"+ getWisdomInc()+" wisdomInc,"+ getCharismaInc()+" CharismaInc,");
    }
}

class Cleric extends Character implements Race {

    public Cleric(String name, int seed) {
        super(name, seed);
    }

    public Cleric(String name, int level, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, int prociencyMod, int health, boolean isDead,int strengthMod,int dexterityMod,int constitutionMod,int intelligenceMod, int wisdomMod, int charismaMod,int strengthInc,int dexterityInc,int constitutionInc, int intelligenceInc, int wisdomInc, int charismaInc) {
        super(name, level, strength, dexterity, constitution, intelligence, wisdom, charisma, prociencyMod, health, isDead,strengthMod, dexterityMod, constitutionMod, intelligenceMod, wisdomMod, charismaMod,strengthInc, dexterityInc, constitutionInc, intelligenceInc, wisdomInc, charismaInc);
    }
    public void attack(Character c) {
        if (c.isDead() == true) {
            System.out.println("Cannot attack a dead character");
        } else {
            int health=c.getHealth()-(6+getWisdom());
            c.setHealth(health);
        }
    }
    public void levelUp() {
        setLevel(getLevel() + 1);
        setHealth(5 * getLevel());
        setWisdom(getWisdom() + 2);
        setStrength(getStrength() + 1);
        setDexterity(getDexterity() + 1);
        setIntelligence(getIntelligence() + 1);
        setCharisma(getCharisma() + 1);
    }
    public void heal(Character c) {
        if (c.isDead() == true) {
            System.out.println("Cannot heal a dead character");
        } else {
            int health = getHealth() + 6 + getWisdom();
            if (health < 5 * getLevel())
                setHealth(getHealth() + 6 + getWisdom());
            else
                setHealth(5*getLevel());
        }
    }

    public String toString() {

        return ("Level=" + getLevel() + " Fighter named " + getName() + " with " + getStrength() + " strength, " + getDexterity() + " dexterity, " + getConstitution() + " constitution, " + getIntelligence() + " intelligence, " + getWisdom() + " wisdom and " + getCharisma() + " charisma"+getStrengthMod()+" strengthMod,"+ getDexterityMod()+" dexterityMod,"+ getConstitutionMod()+" constitutionMod,"+ getIntelligenceMod()+" intelligenceMod," + getWisdomMod()+" wisdomMod,"+ getCharismaMod()+" charismaMod,"+getProficiencyMod()+" proficiencyMod,"+getStrengthInc()+" strengthInc,"+ getDexterityInc()+" dexterityInc," + getConstitutionInc()+" constitutionInc,"+getIntelligenceInc()+ " intelligenceInc,"+ getWisdomInc()+" wisdomInc,"+ getCharismaInc()+" CharismaInc,");
    }
}
class Wizard extends Character implements Race {

    public Wizard(String name, int seed) {
        super(name, seed);
    }

    public Wizard(String name, int level, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, int prociencyMod, int health, boolean isDead,int strengthMod,int dexterityMod,int constitutionMod,int intelligenceMod, int wisdomMod, int charismaMod,int strengthInc,int dexterityInc,int constitutionInc, int intelligenceInc, int wisdomInc, int charismaInc) {
        super(name, level, strength, dexterity, constitution, intelligence, wisdom, charisma, prociencyMod, health, isDead,strengthMod, dexterityMod, constitutionMod, intelligenceMod, wisdomMod, charismaMod,strengthInc, dexterityInc, constitutionInc, intelligenceInc, wisdomInc, charismaInc);
    }


    public void levelUp() {
        setLevel(getLevel() + 1);
        setHealth(5 * getLevel());
        setIntelligence(getIntelligence() + 2);
        setWisdom(getWisdom() + 1);
        setStrength(getStrength() + 1);
        setDexterity(getDexterity() + 1);
        setCharisma(getCharisma() + 1);
    }


    public void attack(Character c) {
        if (c.isDead() == true) {
            System.out.println("Cannot attack a dead character");
        } else {
            System.out.println("Attack");
            int health=c.getHealth()-(4+getIntelligence());
            c.setHealth(health);
        }
    }
    public void multiAttack(Character[] c) {
        for (Character obj : c) {
            if (obj.isDead()) {
                System.out.println("Cannot damage a dead character");
            } else {
                obj.setHealth(obj.getHealth() - 2 + getIntelligence());
            }
        }
    }
    public String toString() {

        return ("Level=" + getLevel() + " Fighter named " + getName() + " with " + getStrength() + " strength, " + getDexterity() + " dexterity, " + getConstitution() + " constitution, " + getIntelligence() + " intelligence, " + getWisdom() + " wisdom and " + getCharisma() + " charisma"+getStrengthMod()+" strengthMod,"+ getDexterityMod()+" dexterityMod,"+ getConstitutionMod()+" constitutionMod,"+ getIntelligenceMod()+" intelligenceMod," + getWisdomMod()+" wisdomMod,"+ getCharismaMod()+" charismaMod,"+getProficiencyMod()+" proficiencyMod,"+getStrengthInc()+" strengthInc,"+ getDexterityInc()+" dexterityInc," + getConstitutionInc()+" constitutionInc,"+getIntelligenceInc()+ " intelligenceInc,"+ getWisdomInc()+" wisdomInc,"+ getCharismaInc()+" CharismaInc,");
    }
}
class Game {
    public static void main(String[] args) {

        Fighter fighter= new Fighter("Dante",2,2,4,5,6,7,8,9,1,false,6,7,-1,5,7,8,9,0,3,4,7,3);
        Rogue rogue = new Rogue("Human", 5,2,3,5,6,7,8,2,2,true,-1,-4,-5,-3,-1,-2,2,3,2,1,2,1);
        Cleric cleric=new Cleric("Darlf",4,2,3,4,5,6,6,2,5,true,-1,-2,-3,-1,-1,-2,1,2,2,3,2,2);
        Wizard wizard=new Wizard("DWARF ",6);
        fighter.levelUp();
        System.out.println(fighter);
        System.out.println(rogue);
        fighter.levelUp();
        fighter.getHealth();
        System.out.println(fighter);
        fighter.attack(rogue);
        System.out.println("After fight with cleric, fighters Health is= "+fighter.getHealth());
        System.out.println("After fight with fighter, rogues Health is=  "+rogue.getHealth());
        System.out.println("Dead? ="+rogue.isDead());
        cleric.levelUp();
        System.out.println(cleric);
        wizard.levelUp();
        System.out.println(wizard);
        Wizard item2 = new Wizard("Bahubali", 1);
        Wizard item3 = new Wizard ("Candy",4);
        Wizard item4 = new Wizard("Bour", 5);
        Wizard[] items = {item2, item3, item4};
        cleric.attack(item2);
        System.out.println(item2);
        System.out.println("After fight with wizard, clerics Health is= "+cleric.getHealth());
        fighter.attack(cleric);
        System.out.println("After fight with fighter, cleric Health is= "+cleric.getHealth());
        fighter.levelUp();
        System.out.println(fighter);
        System.out.println("rogue health= "+ fighter.getHealth());
        cleric.levelUp();
        System.out.println(cleric);
        System.out.println("cleric health= "+ cleric.getHealth());
        cleric.attack(fighter);
        System.out.println("After fight with cleric , fighter health is= "+ fighter.getHealth());
        System.out.println("Dead?" +fighter.isDead());

    }
}

