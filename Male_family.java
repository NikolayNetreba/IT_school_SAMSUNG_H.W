public class Male_family {
    public static void main(String[] args) {
        The_lord_of_the_locker_room Tom = new The_lord_of_the_locker_room();
        Tom.privileges = "make a slave clean up after me.";
        Tom.name = "Tom";
        Tom.i_sey();

        Boss_of_the_gym Jim_Halpert= new Boss_of_the_gym();
        Jim_Halpert.privileges = "make a the lord of the locker room clean up after me.";
        Jim_Halpert.name = "Jim Halpert";
        Jim_Halpert.fans = 300;
        Jim_Halpert.i_sey();

        DUNGEON_MASTER Mr_Ben = new DUNGEON_MASTER();
        Mr_Ben.name = "Mr.Ben";
        Mr_Ben.privileges = "make a boss of the gym clean up after me.";
        Mr_Ben.fans = 1_000_000_000;
        Mr_Ben.stuff = "Road King";
        Mr_Ben.i_sey();


    }
}
