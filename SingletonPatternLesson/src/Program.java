public class Program {
    public static void main(String[] args) {

        OptionMenu optionMenu = OptionMenu.getInstance();
        OptionMenu sameOptionMenu = OptionMenu.getInstance();

        //Now let's init some fields, and to check this 2 variables of OptionMenu!

        optionMenu.setOption("for Photoshop");
        sameOptionMenu.setColor("Red");

        //let's print color and option for both variables.

        System.out.println("optionMenu color = " + optionMenu.getColor());
        System.out.println("optionMenu option = " + optionMenu.getOption());
        System.out.println("----------------------------------------------");
        System.out.println("sameOptionMenu color = " + sameOptionMenu.getColor());
        System.out.println("sameOptionMenu option = " + sameOptionMenu.getOption());


    }
}
