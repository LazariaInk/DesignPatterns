public class Warrior {

    //Facem constructorul privat sa putem construi obiecte doar cu ajutorul metodei build.
    private Warrior() {
    }

    @Override
    public String toString() {
        return "Warrior:" +
                "\n Name - " + name +
                "\n  level - " + level +
                "\n  type - " + type +
                "\n  hp - " + hp +
                "\n  str - " + str +
                "\n  intelligence - " + intelligence +
                "\n  accuracy - " + accuracy +
                "\n  armor - " + armor +
                "\n  weapon - " + weapon +
                "\n  damage - " + damage;
    }

    private String name;
    private int level;
    private String type;
    private int hp;
    private int str;
    private int intelligence;
    private int accuracy;
    private String armor;
    private String weapon;
    private String damage;


    //Setere pentru a putea crea obiectul in metoda build
    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {this.hp = hp;}

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getDamage() {return damage;}

    public void setDamage(String damage) {
        this.damage = damage;
    }


    //Facem o clasa interna statica, care are toate fieldurile ce le are clasa de baza.
    public static class Builder {
        private String name;
        private int level;
        private String type;
        private int hp;
        private int str;
        private int intelligence;
        private int accuracy;
        private String armor;
        private String weapon;
        private int damage;


        //Facem constructor pentru clasa builder, nu e obligatoriu, si initializam deodata fieldu cu nume din builder, nu cel din clasa de baza
        public Builder(String warriorName) {
            this.name = warriorName;
        }


        //Facem o metoda care returneaza acesti builder doar ca cu un field initializat, si asa pentru fiecare metoda unde se returneaza insusi builderu
        public Builder warriorLevel(int warriorLevel) {
            level = warriorLevel;
            return this;
        }

        public Builder warriorType(String warriorType) {
            type = warriorType;
            return this;
        }

        public Builder warriorHp(int warriorHp) {
            hp = warriorHp;
            return this;
        }

        public Builder warriorStr(int warriorStr) {
            str = warriorStr;
            return this;
        }

        public Builder warriorIntelligence(int warriorIntelligence) {
            intelligence = warriorIntelligence;
            return this;
        }

        public Builder warriorAccuracy(int warriorAccuracy) {
            accuracy = warriorAccuracy;
            return this;
        }

        public Builder warriorArmor(String warriorArmor) {
            armor = warriorArmor;
            return this;
        }

        public Builder warriorWeapon(String warriorWeapon) {
            weapon = warriorWeapon;
            return this;
        }

        public Builder warriorDamage(int warriorDamage) {
            damage = warriorDamage;
            return this;
        }


        //Facem o metoda care returneaza in care se returneaza constructorul clasei de baza insa ce primeste ca parametru builderu
        //si fiecare field al obiectului se initializaza in baza fieldurilor clasei interne statice.
        public Warrior build() {
            return new Warrior(this);
        }
    }

    private Warrior(Builder builder) {
        name = builder.name;
        level = builder.level;
        type = builder.type;
        hp = builder.hp;
        str = builder.str;
        intelligence = builder.intelligence;
        accuracy = builder.accuracy;
        armor = builder.armor;
        weapon = builder.weapon;
        damage = builder.armor;
    }
}
