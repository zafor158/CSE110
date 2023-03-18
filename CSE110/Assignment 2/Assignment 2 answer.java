//Character classimport java.util.Random;public abstract class Character implements Race {    private String name;    private int level;    private int strength, dexterity, constitution, intelligence, wisdom, charisma;    private int strengthMod, dexterityMod, constitutionMod, intelligenceMod, wisdomMod, charismaMod;    private int strengthInc, dexterityInc, constitutionInc, intelligenceInc, wisdomInc, charismaInc;    private int proficiencyMod=2;    private int health;    public boolean isDead = false;    int race;    public Character(String name, int seed){        this.name=name;        this.level=1;        this.health=5;        int num = 0;        int min=9999;        int roll = 0;        Random r = new Random();        if(seed>=1) {            for (int i = 1; i <= 4; i++) {                roll = (r.nextInt(seed) %6)+ 1;                num = num + roll;                if (roll < min) {                    min = roll;                }            }            System.out.println(+(num - min));            int min1=9999;            int roll1 = 0;            int num1 = 0;            Random r1 = new Random();            {                for (int i = 1; i <= 4; i++) {                    roll1 = (r1.nextInt(seed)%6) + 1;                    num1 = num1 + roll1;                    if (roll1 < min1) {                        min1 = roll1;                    }                }                System.out.println(+(num1 - min1));            }            int min2=9999;            int num2 = 0;            int roll2 = 0;            Random r2 = new Random();            for (int i = 1; i <= 4; i++) {                roll2 = (r2.nextInt(seed) %6)+ 1;                num2 = num2 + roll2;                if (roll2 < min2) {                    min2 = roll2;                }            }            System.out.println(+(num2 - min2));            int min3=9999;            int num3 = 0;            int roll3 = 0;            Random r3 = new Random();            for (int i = 1; i <= 4; i++) {                roll3 = (r3.nextInt(seed)%6) + 1;                num3 = num3 + roll3;                if (roll3 < min3) {                    min3 = roll3;                }            }            System.out.println(+(num3 - min3));            int min4=9999;            int num4 = 0;            int roll4 = 0;            Random r4 = new Random();            for (int i = 1; i <= 4; i++) {                roll4 = (r4.nextInt(seed)%6) + 1;                num4 = num4 + roll4;                if (roll4 < min4) {                    min4 = roll4;                }            }            System.out.println(+(num4 - min4));            int min5=9999;            int num5=0;            int roll5=0;            Random r5=new Random();            for (int i = 1; i <= 4; i++) {                roll5 = (r5.nextInt(seed)%6) + 1;                num5 = num5 + roll5;                if (roll5 < min5){                    min5 = roll5;                }            }            System.out.println(+(num5 - min5));            int arry[]={(num-min),(num1-min1),(num2-min2),(num3-min3),(num4-min4),(num5-min5)};            int temp;            for(int i=0;i<arry.length;i++){                for(int j =i+1;j<arry.length;j++){                    if(arry[i]<arry[j]){                        temp=arry[i];                        arry[i]=arry[j];                        arry[j]=temp;                    }                }            }            if(name.equals("Fighter")){                this.strength=arry[0];                this.dexterity=arry[1];                this.constitution=arry[2];                this.intelligence=arry[3];                this.wisdom=arry[4];                this.charisma=arry[5];            }            else if(name.equals("Rogue")){                this.strength=arry[3];                this.dexterity=arry[0];                this.constitution=arry[2];                this.intelligence=arry[1];                this.wisdom=arry[4];                this.charisma=arry[5];            }            else if(name.equals("Cleric")){                this.strength=arry[1];                this.dexterity=arry[2];                this.constitution=arry[3];                this.intelligence=arry[4];                this.wisdom=arry[0];                this.charisma=arry[5];            }            else if(name.equals("Wizard")){                this.strength=arry[2];                this.dexterity=arry[1];                this.constitution=arry[3];                this.intelligence=arry[0];                this.wisdom=arry[4];                this.charisma=arry[5];            }        }        else        {            System.out.println("Error seed needs to be from 1");        }    }    public Character (String name, int level, int strength,                      int dexterity, int constitution, int intelligence,                      int wisdom, int charisma, int proficiencyMod,                      int health, boolean isDead,int race) {        this.name=name;        this.level=level;        this.strength=strength;        this.dexterity=dexterity;        this.constitution=constitution;        this.intelligence=intelligence;        this.wisdom=wisdom;        this.charisma=charisma;        this.proficiencyMod=proficiencyMod;        this.health=health;        this.isDead=isDead;        this.race=race;        while(this.health==5*level){            if(health<=0){                this.isDead=true;                health=0;            }        }        //Ability increasing;        if(race==0){            this.strengthInc=strength+1;            this.dexterityInc=dexterity+1;            this.constitutionInc=constitution+1;            this.wisdomInc=wisdom+1;            this.intelligenceInc=intelligence+1;            this.charismaInc=charisma+1;        }        else if(race==1){            this.dexterityInc=dexterity+2;        }        else if(race==2){            this.dexterityInc=dexterity+2;        }        else if(race==3){            this.constitutionInc=constitution+2;        }        //Modifier scores;        if(strength==2||strength==3){            this.strengthMod=-4;        }        else if(strength==4||strength==5){            this.strengthMod=-3;        }        else if(strength==6||strength==7){            this.strengthMod=-2;        }        else if(strength==8||strength==9){            this.strengthMod=-1;        }        else if(strength==10||strength==11){            this.strengthMod=0;        }        else if(strength==12||strength==13){            this.strengthMod=1;        }        else if(strength==14||strength==15){            this.strengthMod=2;        }        else if(strength==16||strength==17){            this.strengthMod=3;        }        else if(strength==18||strength==19){            this.strengthMod=4;        }        else if(strength==20||strength==21){            this.strengthMod=5;        }        if(dexterity==2||dexterity==3){            this.dexterityMod=-4;        }        else if(dexterity==4||dexterity==5){            this.dexterityMod=-3;        }        else if(dexterity==6||dexterity==7){            this.dexterityMod=-2;        }        else if(dexterity==8||dexterity==9){            this.dexterityMod=-1;        }        else if(dexterity==10||dexterity==11){            this.dexterityMod=0;        }        else if(dexterity==12||dexterity==13){            this.dexterityMod=1;        }        else if(dexterity==14||dexterity==15){            this.dexterityMod=2;        }        else if(dexterity==16||dexterity==17){            this.dexterityMod=3;        }        else if(dexterity==18||dexterity==19){            this.dexterityMod=4;        }        else if(dexterity==20||dexterity==21){            this.dexterityMod=5;        }        if(constitution==2||constitution==3){            this.constitutionMod=-4;        }        else if(constitution==4||constitution==5){            this.constitutionMod=-3;        }        else if(constitution==6||constitution==7){            this.constitutionMod=-2;        }        else if(constitution==8||constitution==9){            this.constitutionMod=-1;        }        else if(constitution==10||constitution==11){            this.constitutionMod=0;        }        else if(constitution==12||constitution==13){            this.constitutionMod=1;        }        else if(constitution==14||constitution==15){            this.constitutionMod=2;        }        else if(constitution==16||constitution==17){            this.constitutionMod=3;        }        else if(constitution==18||constitution==19){            this.constitutionMod=4;        }        else if(constitution==20||constitution==21){            this.constitutionMod=5;        }        if(intelligence==2||intelligence==3){            this.intelligenceMod=-4;        }        else if(intelligence==4||intelligence==5){            this.intelligenceMod=-3;        }        else if(intelligence==6||intelligence==7){            this.intelligenceMod=-2;        }        else if(intelligence==8||intelligence==9){            this.intelligenceMod=-1;        }        else if(intelligence==10||intelligence==11){            this.intelligenceMod=0;        }        else if(intelligence==12||intelligence==13){            this.intelligenceMod=1;        }        else if(intelligence==14||intelligence==15){            this.intelligenceMod=2;        }        else if(intelligence==16||intelligence==17){            this.intelligenceMod=3;        }        else if(intelligence==18||intelligence==19){            this.intelligenceMod=4;        }        else if(intelligence==20||intelligence==21) {            this.intelligenceMod = 5;        }        if (wisdom == 2 || wisdom == 3) {            this.wisdomMod = -4;        } else if (wisdom == 4 || wisdom == 5) {            this.wisdomMod = -3;        } else if (wisdom == 6 || wisdom == 7) {            this.wisdomMod = -2;        } else if (wisdom == 8 || wisdom == 9) {            this.wisdomMod = -1;        } else if (wisdom == 10 || wisdom == 11) {            this.wisdomMod = 0;        } else if (wisdom == 12 || wisdom == 13) {            this.wisdomMod = 1;        } else if (wisdom == 14 || wisdom == 15) {            this.wisdomMod = 2;        } else if (wisdom == 16 || wisdom == 17) {            this.wisdomMod = 3;        } else if (wisdom == 18 || wisdom == 19) {            this.wisdomMod = 4;        } else if (wisdom == 20 || wisdom == 21) {            this.wisdomMod = 5;        }        if (charisma == 2 || charisma == 3) {            charismaMod = -4;        } else if (charisma == 4 || charisma == 5) {            charismaMod = -3;        } else if (charisma == 6 || charisma == 7) {            charismaMod = -2;        } else if (charisma == 8 || charisma == 9) {            charismaMod = -1;        } else if (charisma == 10 || charisma == 11) {            charismaMod = 0;        } else if (charisma == 12 || charisma == 13) {            charismaMod = 1;        } else if (charisma == 14 || charisma == 15) {            charismaMod = 2;        } else if (charisma == 16 || charisma == 17) {            charismaMod = 3;        } else if (charisma == 18 || charisma == 19) {            charismaMod = 4;        } else if (charisma == 20 || charisma == 21) {            charismaMod = 5;        }    }    public String getName() {        return name;    }    public int getLevel() {        return level;    }    public void setLevel(int level) {        this.level=level;    }    public int getStrength() {        return strength;    }    public void setStrength(int strength) {        this.strength=strength;    }    public int getDexterity() {        return dexterity;    }    public void setDexterity(int dexterity) {        this.dexterity=dexterity;    }    public int getIntelligence() {        return intelligence;    }    public void setIntelligence(int intelligence) {        this.intelligence=intelligence;    }    public int getWisdom() {        return wisdom;    }    public void setWisdom(int wisdom) {        this.wisdom=wisdom;    }    public int getConstitution() {        return constitution;    }    public void setConstitution(int constitution) {        this.constitution=constitution;    }    public int getCharisma() {        return charisma;    }    public void setCharisma(int charisma) {        this.charisma=charisma;    }    public int getHealth() {        return health;    }    public void setHealth(int health) {        this.health=health;    }    public boolean getIsDead() {        return false;    }    public void setIsDead(boolean isDead) {        this.isDead=isDead;    }    public int getStrengthMod(){        return strengthMod;    }    public abstract void levelUp();    public abstract void attack(Character c);    public abstract String toString();}//Fighter classclass Fighter extends Character implements Race{    public Fighter(String name,int seed){        super(name,seed);    }    public Fighter (String name, int level, int strength,                    int dexterity, int constitution, int intelligence,                    int wisdom, int charisma, int proficiencyMod,                    int health, boolean isDead,int race){        super( name, level,  strength,                dexterity, constitution,  intelligence,                wisdom,  charisma,  proficiencyMod,                health,  isDead, race);    }    public  void levelUp() {        this.setLevel(this.getLevel()+1);        this.setHealth(5*this.getLevel());        this.setStrength(this.getStrength()+2);        this.setDexterity(this.getDexterity()+1);        this.setConstitution(this.getConstitution()+1);        this.setIntelligence(this.getIntelligence()+1);        this.setCharisma(this.getCharisma()+1);        this.setWisdom(getWisdom()+1);    }    public  void attack(Character c){        if (c.getHealth()==0){            System.out.println("Can not attack a dead character");        }        else{            setHealth(c.getHealth()-(10+getStrength()));        }    }    public  String toString(){        return this.getLevel()+","+getName()+","+getStrength()+","+getDexterity()+","+                +getConstitution()+","+getIntelligence()+","+getWisdom()+","+getCharisma();    }}//Interface Racepublic interface Race {    public int HUMAN =0;    public int ELF = 1;    public int HALFLING = 2;    public int DWARF = 3;}//Rogue Classclass Rogue extends Character implements Race {    public Rogue(String name, int seed) {        super(name, seed);    }    public Rogue(String name, int level, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, int health, int proficiencyMod, boolean isDead, int race) {        super(name, level,  strength,                dexterity, constitution,  intelligence,                wisdom,  charisma,  proficiencyMod,                health,  isDead, race);    }    public void levelUp() {        this.setLevel(getLevel()+1);        this.setHealth(5*this.getLevel());        this.setStrength(this.getStrength()+2);        this.setDexterity(this.getDexterity()+3);        this.setConstitution(this.getConstitution()+2);        this.setIntelligence(this.getIntelligence()+2);        this.setCharisma(this.getCharisma()+2);        this.setWisdom(this.getWisdom()+1);    }    public void attack(Character c) {        if (c.getHealth()==0){            System.out.println("Can not attack a dead character");        }        else{            setHealth(c.getHealth()-(6+getDexterity()));        }    }    public String toString() {        return this.getLevel()+","+getName()+","+getStrength()+","+getDexterity()+","+                +getConstitution()+","+getIntelligence()+","+getWisdom()+","+getCharisma();    }}//Clericpublic class Cleric extends Character implements Race {    public Cleric(String name, int seed){        super(name, seed);    }    public Cleric(String name, int level, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, int health, int proficiencyMod, boolean isDead, int race) {        super(name, level, strength,                dexterity, constitution, intelligence,                wisdom, charisma, proficiencyMod,                health, isDead, race);    }    public  void levelUp(){        this.setLevel(this.getLevel()+1);        this.setHealth(5*this.getLevel());        this.setStrength(this.getStrength()+1);        this.setDexterity(this.getDexterity()+1);        this.setConstitution(this.getConstitution()+1);        this.setIntelligence(this.getIntelligence()+1);        this.setCharisma(this.getCharisma()+1);        this.setWisdom(this.getWisdom()+2);    }    public  void attack(Character c){        if (c.getHealth()==0){            System.out.println("Can not attack a dead character");        }        else{            setHealth(c.getHealth()-(6+getWisdom()));        }    }    public void heal(Character c){        if(c.getHealth()==0){            System.out.println("Can not attack a dead character");        }        else{            setHealth(c.getHealth()+(6+getWisdom()));        }    }    public  String toString(){        return this.getLevel()+","+getName()+","+getStrength()+","+getDexterity()+","+                +getConstitution()+","+getIntelligence()+","+getWisdom()+","+getCharisma();    }}//Wizardpublic class Wizard extends Character implements Race{    public Wizard(String name, int seed) {        super(name, seed);    }    public Wizard(String name, int level, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, int health, int proficiencyMod, boolean isDead, int race) {        super(name, level,  strength,                dexterity, constitution,  intelligence,                wisdom,  charisma,  proficiencyMod,                health,  isDead, race);    }    public  void levelUp(){        this.setLevel(this.getLevel()+1);        this.setHealth(5*this.getLevel());        this.setStrength(this.getStrength()+1);        this.setDexterity(this.getDexterity()+1);        this.setConstitution(this.getConstitution()+1);        this.setIntelligence(this.getIntelligence()+2);        this.setCharisma(this.getCharisma()+1);        this.setWisdom(getWisdom()+1);    }    public  void attack(Character c){        if (c.getHealth()!=0){            setHealth(c.getHealth()-(4+getIntelligence()));        }        else{            System.out.println("Can not attack a dead character");        }    }    public void multiAttack(Character[] c) {        for (Character z : c) {            if (z.getHealth()!=0) {                z.setHealth(z.getHealth() - 2 + getIntelligence());            } else {                System.out.println("Can not attack a dead character");            }        }    }    public  String toString(){        return this.getLevel()+","+getName()+","+getStrength()+","+getDexterity()+","+                +getConstitution()+","+getIntelligence()+","+getWisdom()+","+getCharisma();    }}//Tester Classpublic class Tester {    public static void main(String[] args) {        Character Fighter=new Fighter("Fighter",7);        System.out.println(Fighter);        System.out.println("Fighter's Health="+Fighter.getHealth());        System.out.println();        Fighter.levelUp();        System.out.println("Fighter's level="+Fighter.getLevel());        System.out.println();        Character Rogue=new Rogue("Rogue",4);        System.out.println(Rogue);        Rogue.levelUp();        System.out.println("Rogue's level="+Rogue.getLevel());        Rogue.attack(Fighter);        System.out.println();        Character Wizard=new Wizard("Wizard",7);        System.out.println(Wizard);        Wizard.levelUp();        Character []c={Fighter,Rogue};        Wizard.attack(Rogue);        Character Cleric =new Cleric("Cleric",6);        System.out.println(Cleric);        System.out.println("Cleric's level="+Cleric.getLevel());        System.out.println("Cleric's Health="+Cleric.getHealth());        Fighter ob=new Fighter(Fighter.getName(),1,Fighter.getStrength(),Fighter.getDexterity(),                Fighter.getConstitution(),Fighter.getIntelligence(),Fighter.getWisdom(),Fighter.getCharisma(),                2,5,false,3);        System.out.print(ob);        System.out.println();        Rogue ob1=new Rogue(Rogue.getName(),1,Rogue.getStrength(),Rogue.getDexterity(),                Rogue.getConstitution(),Rogue.getIntelligence(),Rogue.getWisdom(),Rogue.getCharisma(),                1,5,false,2);        System.out.print(ob1+",");        System.out.println();        Cleric ob2=new Cleric(Cleric.getName(),1,Cleric.getStrength(),Cleric.getDexterity(),                Cleric.getConstitution(),Cleric.getIntelligence(),Cleric.getWisdom(),Cleric.getCharisma(),                3,5,false,0);        System.out.println(ob2);        System.out.println();        Wizard ob3=new Wizard(Wizard.getName(),1,Wizard.getStrength(),Wizard.getDexterity(),                Wizard.getConstitution(),Wizard.getIntelligence(),Wizard.getWisdom(),Wizard.getCharisma(),                4,5,false,1);        System.out.println(ob3);        System.out.println();    }}