public class Program {
    public static void main(String[] args) {
        Warrior good = new Warrior.Builder("Archer")
                .warriorAccuracy(23)
                .warriorArmor("Leather Armor")
                .warriorDamage(23)
                .warriorHp(100)
                .warriorIntelligence(21)
                .warriorLevel(5)
                .warriorStr(21)
                .warriorType("archer")
                .warriorWeapon("Arrow")
                .build();

        Warrior noob = new Warrior.Builder("noob")
                .warriorHp(100)
                .warriorType("no TYPE")
                .warriorStr(1)
                .build();

        System.out.println("================ARCHER WARRIOR===================");
        System.out.println(good.toString());
        System.out.println("================NOOB WARRIOR=====================");
        System.out.println(noob.toString());
    }

}
